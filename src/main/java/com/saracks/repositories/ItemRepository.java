package com.saracks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saracks.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}