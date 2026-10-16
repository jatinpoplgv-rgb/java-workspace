package com.kodewala.Constructorday12;

public class RoomDriver {

	public static void main(String[] args) 
	
	{
		Hotel h1 = new Hotel("Large", "Deluxe", 101, 5000);

		Room room = new Room();

		room.addRoom(h1);

	}

}
