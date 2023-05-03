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

import com.saracks.model.Item;
import com.saracks.repositories.ItemRepository;

@RestController
@RequestMapping("/item")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemController {
	
	@Autowired 
	private ItemRepository itemRepo;
	
	@GetMapping("/all")
	public List<Item> list() {
		return itemRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Item get(@PathVariable Long id) {
		return itemRepo.getReferenceById(id);
	}
	
	@PostMapping("/add")
	public Item create(@RequestBody final Item item) {
		return itemRepo.saveAndFlush(item);
	}
	
	@PutMapping("/update")
	public Item update(@RequestBody final Item item) {
		return itemRepo.saveAndFlush(item);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		itemRepo.deleteById(id);
	}

}
