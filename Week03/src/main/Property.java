package main;

//this class will contain attributes like the street address, number of rooms and the price per sq. foot
public class Property {

	private String streetName;
	private int streetNum;
	private int numRooms;
	private Room[] rooms = {};
	private double pricePerSquareFoot;
	
	private int totalArea;
	

	public Property() {
		
	}
	
	public Property(String streetName, int streetNum, double price) {
		this.streetName = streetName;
		this.streetNum = streetNum;
		this.pricePerSquareFoot = price;
	}
	
	//getters and setters
	public String getStreetName() {
		return this.streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	public int getStreetNum() {
		return this.streetNum;
	}
	
	public void setStreetNum(int streetNum) {
		this.streetNum = streetNum;
	}
	
	public Room[] getRoomsArray() {
		return this.rooms;
	}
	
	public void setRoomsArray(int length) {
		this.rooms = new Room[length];
	}
	
	public int getNumRooms() {
		return this.numRooms;
	}
	
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}
	
	public void setPricePerSquareFoot(double price) {
		this.pricePerSquareFoot = price;
	}
	
	public double getPricePerSquareFoot() {
		return pricePerSquareFoot;
	}

	public int getTotalArea() {
		return this.totalArea;
	}

	public void setTotalArea(int totalArea) {
		this.totalArea = totalArea;
	}

	public int calculateTotalArea(Room[] rooms) {
		
		for(int currentRoom = 0; currentRoom < rooms.length; currentRoom++) {
			setTotalArea(getTotalArea() + rooms[currentRoom].getArea());
		}
		
		return this.totalArea;
	}
	
	//calculates the property value by multiplying the area of every room combined by the price per square foot
	public double calculateValue(Room[] rooms, double price) {
		
		int totalArea = 0;
		
		for(int i = 0; i < rooms.length; i++) {
			totalArea += rooms[i].getArea();
		}
		
		return totalArea*price;
	}
	
	public void PrintInformation() {
		Room[] rooms = getRoomsArray();
		int lineNumber = 1;
		
		System.out.println(lineNumber++ + ".\tStreet: " + getStreetName() + " # " + getNumRooms());
		System.out.print(lineNumber++ + ".\tTotal Rooms: " + getNumRooms() + " - ");
		
		for(int currentRoom = 0; currentRoom < rooms.length; currentRoom++) {
			System.out.print(rooms[currentRoom].getType() + ", ");
			
			//print the name of the room and go to a new line
			if(currentRoom == rooms.length-1)
				System.out.println(rooms[currentRoom].getType());
		} //end for loop
		
		System.out.println(lineNumber++ + ".\tTotal Area: " + calculateTotalArea(rooms) + " sq. ft.");
		System.out.println(lineNumber++ + ".\tPrice per sq. ft.: $" + getPricePerSquareFoot());
		System.out.print(lineNumber++ + ".\tEstimated Property Value: $" + calculateValue(rooms, getPricePerSquareFoot()));
	}
	
} //Property class
