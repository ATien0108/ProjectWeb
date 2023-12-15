package com.test.controllers;

import com.test.IServices.IUserService;
import com.test.entities.UserEntity;
import com.test.models.UserModel;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Date;

@RequestMapping("")
@Controller
public class HomeController {

	@Autowired
	@Qualifier("userServiceImpl")
	IUserService userServce;
	@RequestMapping("/post.html")
	public String post(){
		return "post";
	}
	@RequestMapping("/index.html")
	public String index(ModelMap modelMap, HttpSession httpSession){
		if(httpSession.getAttribute("user") != null){
			UserModel userModel = (UserModel) httpSession.getAttribute("user");
			modelMap.addAttribute("user",userModel);
		}
		return "index";
	}
	@RequestMapping("/profile.html")
	public String profile(ModelMap modelMap,HttpSession session){
		if(session.getAttribute("user") != null){
			UserModel userModel = (UserModel) session.getAttribute("user");
			modelMap.addAttribute("user",userModel);
		}
		return "profile";
	}
	@RequestMapping("/edit_profile.html")
	public String edit_profile(ModelMap modelMap,HttpSession session){
		if(session.getAttribute("user") != null){
			UserModel userModel = (UserModel) session.getAttribute("user");
			modelMap.addAttribute("user",userModel);
		}
		return "edit_profile";
	}
	@RequestMapping("/friend_profile.html")
	public String friend_profile(){
		return "friend_profile";
	}
}
