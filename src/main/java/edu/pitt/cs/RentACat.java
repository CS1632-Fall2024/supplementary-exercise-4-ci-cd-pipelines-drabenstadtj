package edu.pitt.cs;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*; 

public interface RentACat {
	public static RentACat createInstance(InstanceType type) {
		switch (type) {
			case IMPL:
				return new RentACatImpl();
			case BUGGY:
				return new RentACatBuggy();
			case SOLUTION:
				return new RentACatSolution();
			case MOCK:
				// X TODO: Return a mock object that emulates the behavior of a real object.
				RentACat mockRentACat = Mockito.mock(RentACat.class); 

				// when returnCat is called, return true if the cat is rented, false otherwise
				when(mockRentACat.returnCat(1)).thenReturn(true);
				when(mockRentACat.returnCat(anyInt())).thenReturn(false);

				// when rentCat is called, return true if the cat is not rented, false otherwise
				when(mockRentACat.rentCat(2)).thenReturn(true);
				when(mockRentACat.rentCat(anyInt())).thenReturn(false);

				// when renameCat is called, return true if the cat exists, false otherwise
				when(mockRentACat.renameCat(eq(1), anyString())).thenReturn(true);
				when(mockRentACat.renameCat(anyInt(), anyString())).thenReturn(false);

				// when listCats is called, return a string of cats
				when(mockRentACat.listCats()).thenReturn("ID 1. Jennyanydots\nID 2. Old Deuteronomy");

				// when addCat is called, do nothing
				doNothing().when(mockRentACat).addCat(any(Cat.class));
				return mockRentACat;
			default:
				assert (false);
				return null;
		}
	}

	// WARNING: You are not allowed to change any part of the interface.
	// That means you cannot add any method nor modify any of these methods.

	public boolean returnCat(int id);

	public boolean rentCat(int id);

	public boolean renameCat(int id, String name);

	public String listCats();

	public void addCat(Cat c);
}
