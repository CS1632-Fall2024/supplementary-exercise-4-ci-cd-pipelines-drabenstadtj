package edu.pitt.cs;

public class CatImpl implements Cat {

	// X TODO: Fill in with member variables
	private int id;
	private String name;
	private boolean rented;

	public CatImpl(int id, String name) {
		// X TODO: Fill in
		this.id = id;
		this.name = name;
		this.rented = false;
	}

	public void rentCat() {
		// X TODO: Fill in
		this.rented = true;
	}

	public void returnCat() {
		// X TODO: Fill in
		this.rented = false;
	}

	public void renameCat(String name) {
		// X TODO: Fill in
		this.name = name;
	}

	public String getName() {
		// X TODO: Fill in
		return name;
	}

	public int getId() {
		// X TODO: Fill in
		return id;
	}

	public boolean getRented() {
		// X TODO: Fill in
		return rented;
	}

	public String toString() {
		// X TODO: Fill in
		return "ID " + id + ". " + name; 
	}

}