package com.kitchen.story.dto;

import com.kitchen.story.entity.UserClass;

public class UserDto {
	private UserClass userClass;
	private String newPassword;

	public UserDto() {
		super();
	}

	public UserDto(UserClass userClass, String newPassword) {
		super();
		this.userClass = userClass;
		this.newPassword = newPassword;
	}

	public UserClass getUserClass() {
		return userClass;
	}

	public void setUserClass(UserClass userClass) {
		this.userClass = userClass;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
