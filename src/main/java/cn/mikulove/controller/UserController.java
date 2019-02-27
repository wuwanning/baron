package cn.mikulove.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cn.mikulove.entities.User;
import cn.mikulove.service.UserService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@GetMapping("/users")
	public String list(Model model){
		log.info("find all users");
		List<User> users = userService.findAllUser();
		model.addAttribute("users", users);
		return "user/list";
	}
	
}
