package com.saracks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saracks.model.UserAccount;
import com.saracks.repositories.UserAccountRepository;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserAccountController {
	
	@Autowired 
	private UserAccountRepository userRepo;
	
	@GetMapping("/all")
	public List<UserAccount> list() {
		return userRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public UserAccount get(@PathVariable Long id) {
		return userRepo.getReferenceById(id);
	}
	
	@PostMapping("/add")
	public UserAccount create(@RequestBody final UserAccount user) {
		return userRepo.saveAndFlush(user);
	}
	
	@PutMapping("/update")
	public UserAccount update(@RequestBody final UserAccount user) {
		return userRepo.saveAndFlush(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		userRepo.deleteById(id);
	}

}
