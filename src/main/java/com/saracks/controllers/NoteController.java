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

import com.saracks.model.Note;
import com.saracks.repositories.NoteRepository;

@RestController
@RequestMapping("/note")
@CrossOrigin(origins = "http://localhost:4200")
public class NoteController {
	
	@Autowired 
	private NoteRepository noteRepo;
	
	@GetMapping("/all")
	public List<Note> list() {
		return noteRepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Note get(@PathVariable Long id) {
		return noteRepo.getReferenceById(id);
	}
	
	@PostMapping("/add")
	public Note create(@RequestBody final Note note) {
		return noteRepo.saveAndFlush(note);
	}
	
	@PutMapping("/update")
	public Note update(@RequestBody final Note note) {
		return noteRepo.saveAndFlush(note);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		noteRepo.deleteById(id);
	}

}
