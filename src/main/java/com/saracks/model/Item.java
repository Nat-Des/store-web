package com.saracks.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private Long itemId;

	private int aisle;

	@Enumerated(EnumType.STRING)
	private ShelfRow shelfRow;

	public Item() {
	}

	public Item(int aisle, ShelfRow shelfRow) {
		this.aisle = aisle;
		this.shelfRow = shelfRow;
	}

	public int getAisle() {
		return aisle;
	}

	public void setAisle(int aisle) {
		this.aisle = aisle;
	}

	public ShelfRow getShelfRow() {
		return shelfRow;
	}

	public void setShelfRow(ShelfRow shelfRow) {
		this.shelfRow = shelfRow;
	}

	public enum ShelfRow {
		TOP, UPPER_MIDDLE, MIDDLE, LOWER_MIDDLE, BOTTOM
	}

}
