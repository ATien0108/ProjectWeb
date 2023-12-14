package com.test.controllers;

import com.test.IServices.IUserServce;
import com.test.entities.User;
import com.test.models.UserModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.expression.ParseException;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@Service
@RequestMapping("")
public class LoginController {
    @Autowired
    @Qualifier("userServiceImpl")
    IUserServce userServce;

    @RequestMapping("/login.html")
    public String home(){
        return "login";
    }

    @RequestMapping("/register.html")
    public String registerForm(ModelMap modelMap){
        return "register";
    }
    @PostMapping("/registerSS")
    public String register(ModelMap modelMap, @Valid @ModelAttribute("user") UserModel user, BindingResult result,
                                 @RequestParam("regiteredat") String datestring
                                 ){
            User entity = new User();
            BeanUtils.copyProperties(user,entity);
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date date = dateFormat.parse(datestring);
                entity.setRegiteredat(date);
            } catch (java.text.ParseException e) {
                throw new RuntimeException(e);
            }
            boolean haveacc = false;
            boolean SSregister = false;
            System.out.print(entity);
            System.out.print(user);
            try {
                userServce.save(entity);
                SSregister = true;
                modelMap.addAttribute("registerok",SSregister);

            }catch (Exception e){
                haveacc = true;
                modelMap.addAttribute("haveacc",haveacc);
                return "register";
            }
        return "login";
    }
    @RequestMapping("/logintohome")
	public ModelAndView logintohome(ModelMap modelMap,
			@RequestParam(name = "passwordHash", required = false) String passwordHash,
			@RequestParam(name = "email", required = false) String email, RedirectAttributes redirectAttributes) {

		if (passwordHash == null || passwordHash.equals("") || email == null || email.equals("")) {
			return new ModelAndView("redirect:/login.html?error=true");
		}

		UserEntity entity = userServce.findByEmail(email);

		if (entity != null && BCrypt.checkpw(passwordHash, entity.getPasswordHash())) {
			return new ModelAndView("redirect:/index.html");
		} else {
			// Add an attribute to indicate login failure
			redirectAttributes.addAttribute("error", true);
			return new ModelAndView("redirect:/login.html");
		}
	}
}
