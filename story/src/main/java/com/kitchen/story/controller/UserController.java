package com.kitchen.story.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kitchen.story.dto.UserDto;
import com.kitchen.story.entity.UserClass;
import com.kitchen.story.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	
	@PutMapping("/updatePassword")
	public ResponseEntity<String> adminChangePassword(@RequestBody UserDto userDto)
	{
		userService.changePassword(userDto.getUserClass(),userDto.getNewPassword());
		return ResponseEntity.ok("password updated successfully");
	}
}
