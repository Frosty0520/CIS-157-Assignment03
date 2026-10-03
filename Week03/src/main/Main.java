package main;
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
		System.out.println(property.getRoomsList().get(0).getType());
		//System.out.println("Describe the rooms:");
		
		//property.printReport();
		
	} //main

} //Main class