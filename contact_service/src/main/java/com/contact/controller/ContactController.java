package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RequestMapping("/contact") //localhost:8888/contact/user/1233
@RestController
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/{userId}")
	public List<Contact> getContact(@PathVariable("userId") Long userId)
	{
		return this.contactService.getContactsOfUsers(userId);
		
	}
}
