package com.bhaskar.springbootjdbc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhaskar.springbootjdbc.repository.UserRepository;

@RestController
@RequestMapping(path="/user")
public class UserController {
	
	@Autowired
	UserRepository usRepository;
	
	
	
}
