package com.test.controllers.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.IServices.IUserService;
import com.test.IServices.IUser_messageService;
import com.test.entities.User;
import com.test.entities.User_message;

import jakarta.servlet.http.HttpServletRequest;

import java.util.ArrayList;
import java.util.List;

@Controller
@Service
@RequestMapping("")
public class ChatController {
	@Autowired
	@Qualifier("userServiceImpl")
	IUserService userService;

	@Autowired
	@Qualifier("user_messageServiceImpl")
	IUser_messageService user_messageService;

	@RequestMapping(value = {"/chat/{userid}","/chat/","/chat"})
	public String chat(ModelMap modelMap, HttpServletRequest req,
			@PathVariable(required = false) String userid) {
		
		User user = (User) req.getSession().getAttribute("user");
		modelMap.addAttribute("user", user);
		System.out.println("//////////////////////"+user.getUsername());
		User target;
		if(userid != null)
			target = userService.getUserById(userid);
		else
			target = null;
		modelMap.addAttribute("current_target", target);
		
		
		List<User> listTarget = user_messageService.getAllTargetBySource(user);
		modelMap.addAttribute("listTarget", listTarget);
		System.out.println("//////////////////////"+listTarget.size());
		
		if (target != null) {
			List<User_message> listmsg = user_messageService.getAllBy2User(user, target);
			if(listmsg == null) {
				listmsg = new ArrayList<User_message>();
			}
			
			if(listTarget.stream().anyMatch(u -> u.getId() == target.getId())){}
			else {
				listTarget.add(target);
			}
			
			System.out.println("//////////////////////"+target.getUsername());
			System.out.println("//////////////////////"+listmsg.size());
			modelMap.addAttribute("listmsg",listmsg);
		}
		
		return "messages";
	}
}