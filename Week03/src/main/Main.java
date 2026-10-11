package main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String streetName;
		int streetNum;
		int numRooms;
		double pricePerSquareFoot;
				
		Scanner input = new Scanner(System.in);
		
		//create the property based on the prompts
		//street name
		System.out.println("What street is the property on?");
		streetName = input.nextLine();
		//street number
		System.out.println("What is its street number?");
		streetNum = input.nextInt();
		//price per square foot
		System.out.println("What is the price per square foot?");
		pricePerSquareFoot = input.nextDouble();
		//number of rooms
		System.out.println("How many rooms are there?");
		numRooms = input.nextInt();
		
		//create Property object
		Property property = new Property(streetName, streetNum, pricePerSquareFoot, numRooms);
		
		//populate the list of rooms
		for(int i = 0; i < numRooms; i++) {
			property.getRoomsList().add(new Room());
		}
		
		//define the attributes of each room
		for(int i = 0; i < property.getRoomsList().size(); i++) {
			Room currentRoom = property.getRoomsList().get(i);
			String roomName;
			int roomArea;
			System.out.println("Enter room name:");
			roomName = input.nextLine();
			currentRoom.setType(roomName);
			input.next();
			System.out.println("Enter room area:");
			roomArea = input.nextInt();
			currentRoom.setArea(roomArea);
		}
		
		printReport(property);
		
	} //main
	
	private static void printReport(Property p) {
		int lineNum = 1;
		
		System.out.println(lineNum++ + ".\tStreet: " + p.getStreetName() + " #" + p.getStreetNum());
		System.out.print(lineNum++ + ".\tTotal Rooms: ");
		
		for(int i = 0; i < p.getRoomsList().size(); i++) {
			Room currentRoom = p.getRoomsList().get(i);
			System.out.print(currentRoom.getType() + ", ");
			
			//when we reach the end of the list, just print the name of the room and move to the next line
			if(i == p.getRoomsList().size()-1)
				System.out.println(currentRoom.getType());
				
		} //end for loop
		
		System.out.println(lineNum++ + ".\tTotal Area: " + p.calculateTotalArea(p.getRoomsList()) + " sq. ft.");
		System.out.println(lineNum++ + ".\tPrice per sq. ft: $" + p.getPricePerSquareFoot());
		System.out.println(lineNum++ + ".\tEstimated Property Value: $" + p.calculateValue(p.getPricePerSquareFoot()));
	}
	

} //Main class