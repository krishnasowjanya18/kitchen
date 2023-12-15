package com.kitchen.story.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitchen.story.entity.UserClass;
import com.kitchen.story.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void changePassword(UserClass userClass,String newpassword) {
		Optional<UserClass> adminClass=userRepository.findById(1);
		UserClass user=adminClass.get();
		
		if(userClass.getUserName().equalsIgnoreCase("admin") && userClass.getPassword().equalsIgnoreCase(user.getPassword()))
		{
			userRepository.updatePassword(newpassword, "admin");
		}
	}

}
