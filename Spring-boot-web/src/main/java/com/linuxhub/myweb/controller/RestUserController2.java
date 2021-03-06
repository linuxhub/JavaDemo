package com.linuxhub.myweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linuxhub.myweb.model.User;

@RestController
@RequestMapping("/user2")
public class RestUserController2 {
	
	@RequestMapping("/{id}") 
	public User getUser(@PathVariable Integer id) {
		return new User(id,"泽泽",25,"中国广州");
	}
	
	
	@RequestMapping("/list") 
	public List<User> listUser() {
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i <3; i++) {
			userList.add(new User(i,"泽泽"+i,25+i,"中国广州"));
		}
		
		return userList;
	}
}
