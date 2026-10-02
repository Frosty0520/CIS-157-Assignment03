package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Property property = new Property();
		
		Scanner input = new Scanner(System.in);
		
		//create the property based on the prompts
		//street name
		System.out.println("What street is the property on?");
		property.setStreetName(input.nextLine());
		//street number
		System.out.println("What is its street number?");
		property.setStreetNum(input.nextInt());
		//price per square foot
		System.out.println("What is the price per square foot?");
		property.setPricePerSquareFoot(input.nextDouble());
		
		//number of rooms
		System.out.println("How many rooms are there?");	
		property.setNumRooms(input.nextInt());
		property.setRoomsArray(property.getNumRooms());
		
		System.out.println("Describe the rooms:");
		
		//loop through every room in the property and get information about them
		for(int currentRoom = 0; currentRoom < property.getRoomsArray().length; currentRoom++) {
			
			System.out.println("What kind of room is this?");
			property.getRoomsArray()[currentRoom].setType(input.nextLine());
			System.out.println("What is the area of the room?");
			property.getRoomsArray()[currentRoom].setArea(input.nextInt());
			
		} //contents of the rooms array now have their attributes defined.
		
		property.PrintInformation();
		
	} //main

} //Main class