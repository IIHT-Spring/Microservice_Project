package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService {
	
	
	// fake list of contacts 
	
	List<Contact> list=List.of(
			new Contact(1L,"Amit@gmail.com","Amit", 1311L),
			new Contact(9L,"Roshan@gmail.com","Roshan", 1311L),
			new Contact(2L,"Rakesh@gmail.com","Rakesh", 1312L),
			new Contact(3L,"Sneha@gmail.com","Sneha", 1313L),
			new Contact(4L,"Rohan@gmail.com","Rohan", 1314L),
			new Contact(5L,"Vijay@gmail.com","Vijay", 1315L),
			new Contact(6L,"Koushik@gmail.com","Koushik", 1316L),
			new Contact(7L,"Subham@gmail.com","Subham", 1317L),
			new Contact(8L,"Rohit@gmail.com","Rohit", 1318L)
			
			
			);
	
	@Override
	public List<Contact> getContactsOfUsers(Long userId){
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
		
	}
	

}
