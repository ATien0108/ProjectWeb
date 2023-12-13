package com.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class HomeController {

	@RequestMapping("/post.html")
	public String post(){
		return "post";
	}
	@RequestMapping("/index.html")
	public String index(){
		return "index";
	}
	@RequestMapping("/profile.html")
	public String profile(){
		return "profile";
	}
	@RequestMapping("/edit_profile.html")
	public String edit_profile(){
		return "edit_profile";
	}
	@RequestMapping("/friend_profile.html")
	public String friend_profile(){
		return "friend_profile";
	}
}
