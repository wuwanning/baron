package cn.mikulove.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.mikulove.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/users")
	public String findAll(){
		return "show all users";
	}
	
	@GetMapping("/users")
	public String findUser(){
		return "";
	}
}
