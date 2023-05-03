package com.saracks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saracks.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}