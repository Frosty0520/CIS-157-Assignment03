package main;

//contains the attributes for each room rather than declaring a ton of different variables
public class Room {
	//the area in square feet of the room
	private int area;
	//the name of the room
	private String type;
	
	//getters and setters
	public int getArea() {
		return this.area;
	}
	
	public void setArea(int area) {
		this.area = area;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
} //Room class
