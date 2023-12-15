package com.kitchen.story.dto;

import com.kitchen.story.entity.Item;
import com.kitchen.story.entity.UserClass;

public class ItemDto {
	private UserClass userClass;
	private Item item;

	public ItemDto() {
		super();
	}

	public ItemDto(UserClass userClass, Item item) {
		super();
		this.userClass = userClass;
		this.item = item;
	}

	public UserClass getUserClass() {
		return userClass;
	}

	public void setUserClass(UserClass userClass) {
		this.userClass = userClass;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
