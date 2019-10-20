package com.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/userInfo")
	public String getTest(int id) {
		return id +"= id";
	}

}
