package main;

//this class will contain attributes like the street address, number of rooms and the price per sq. foot
public class Property {

	private String streetName;
	private int streetNum;
	private int numRooms;
	private Room[] rooms;
	
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
	
	public Room[] getRooms() {
		return this.rooms;
	}
	
	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	public int getNumRooms() {
		return this.numRooms;
	}
	
	public void setNumRooms(int numRooms) {
		this.numRooms = numRooms;
	}
	
	
} //Property class
