package com.user;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(allowedHeaders = "*", maxAge = 1800, origins = "*")
@RestController
public class UserController {

}
