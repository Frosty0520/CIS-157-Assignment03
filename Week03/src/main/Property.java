package main;

import java.util.ArrayList;

//this class will contain attributes like the street address, number of rooms and the price per sq. foot
public class Property {

	private String streetName;
	private int streetNum;
	private int numRooms;
	private ArrayList<Room> rooms;
	private double pricePerSquareFoot;
	
	private int totalArea;
	

	public Property() {
		
	}
	
	public Property(String streetName, int streetNum, double price, int numRooms) {
		this.streetName = streetName;
		this.streetNum = streetNum;
		this.pricePerSquareFoot = price;
		this.numRooms = numRooms;
		this.rooms = new ArrayList<Room>();
		this.totalArea = 0;
		
		//populate the array
		for(Room r : rooms)
			rooms.add(r);
		
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
	
	public ArrayList<Room> getRoomsList() {
		return this.rooms;
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

	public int calculateTotalArea(ArrayList<Room> rooms) {
		
		for(int currentRoom = 0; currentRoom < rooms.size(); currentRoom++) {
			setTotalArea(getTotalArea() + rooms.get(currentRoom).getArea());
		}
		
		return this.totalArea;
	}
	
	//calculates the property value by multiplying the area of every room combined by the price per square foot
	public double calculateValue(double price) {
		
		return calculateTotalArea(rooms) * price;
	}
	
	public void printReport() {
		
	}
	
} //Property class
