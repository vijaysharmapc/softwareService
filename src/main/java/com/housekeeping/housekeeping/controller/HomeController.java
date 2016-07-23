package com.housekeeping.housekeeping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/")
public String home(){
	return "House keeping, is funnnn";
}
}
