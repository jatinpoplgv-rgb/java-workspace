package com.kodewala.Constructorday12;

public class Hotel
{
    String roomSize;
    String roomType;
    int roomNumber;
    int price;

    
    public Hotel(String roomSize, String roomType, int roomNumber, int price) {
		
		this.roomSize = roomSize;
		this.roomType = roomType;
		this.roomNumber = roomNumber;
		this.price = price;
	}


	public Hotel() {
		
		roomSize = "unknown";
		roomType = "unknown";
		roomNumber = 0;
		price = 0;
	}
    
    void displayRoom()
    {
    	System.out.println("ROOM SIZE"+roomSize);
    	System.out.println("ROOM TYPE"+roomType);
    	System.out.println(" AREA"+roomNumber);
    	System.out.println(" PRICE "+price);
    }
  
}
