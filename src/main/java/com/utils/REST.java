package com.utils;

import org.apache.http.client.methods.HttpGet;

public class REST {

	String url;

	public REST(String url) {
		// TODO Auto-generated constructor stub
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static String GET() {

		new HttpGet("");
		return "";
	}

	public static String POST() {

		return "";
	}

	public static String DEL() {

		return "";
	}

}
