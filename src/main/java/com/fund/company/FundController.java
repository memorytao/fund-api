package com.fund.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@CrossOrigin(origins = "http://localhost:3000")
public class FundController {

	@Autowired
	Environment env;

	@GetMapping("/api/companies")
	public String getFundCompanies(@RequestHeader Map<String, String> headers) {

		HttpClient client = new DefaultHttpClient();
		
		try {

			HttpGet request = new HttpGet("https://api.sec.or.th/FundFactsheet/fund/amc/");
			request.setHeader("Ocp-Apim-Subscription-Key", env.getProperty("primary-key"));
			HttpResponse response = client.execute(request);

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			return rd.readLine();

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			client.getConnectionManager().shutdown();
		}

		return "";
	}

	@GetMapping("/fund/{fundCode}")
	public String getFundCompanyById(@PathVariable(value = "fundCode") String code) {

		try {

			HttpClient client = new DefaultHttpClient();
			HttpGet request = new HttpGet("https://api.sec.or.th/FundFactsheet/fund/amc/" + code);

			request.setHeader("Ocp-Apim-Subscription-Key", env.getProperty("primary-key"));
			HttpResponse response = client.execute(request);

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			return rd.readLine();

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}
}
