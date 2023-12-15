package com.kitchen.story.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kitchen.story.dto.ItemDto;
import com.kitchen.story.entity.Item;
import com.kitchen.story.entity.UserClass;
import com.kitchen.story.repository.UserRepository;
import com.kitchen.story.service.ItemService;
import com.kitchen.story.service.UserService;

@Controller
public class ItemController {

	@Autowired
	private ItemService itemService;
	@Autowired
	private UserService userService;

	@PostMapping("/getAllItems")
	private List<Item> getAllItems(@RequestBody UserClass userClass) {
		return itemService.getAllItems(userClass);
	}

	@GetMapping("/getItems")
	private List<Item> getAllItems() {
		return itemService.getItems();
	}

	@PostMapping("/saveItem")
	private ResponseEntity<String> saveItem(@RequestBody ItemDto itemDto) {
		itemService.saveItem(itemDto);
		return ResponseEntity.ok("Item saved successfully");
	}

	@PutMapping("/editItem")
	private ResponseEntity<String> editItem(@RequestBody ItemDto itemDto) {
		itemService.editItem(itemDto);
		return ResponseEntity.ok("Item edited successfully");
	}

	@GetMapping("/")
	public ModelAndView getAllRequest() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@GetMapping("/getItemsModel")
	public String listEmployee(Model model) {
		List<Item> list = itemService.getItems();
		model.addAttribute("itemsList", list);
		return "item";
	}

}
