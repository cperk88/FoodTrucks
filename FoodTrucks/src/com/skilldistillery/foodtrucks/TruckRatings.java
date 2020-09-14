package com.skilldistillery.foodtrucks;

import java.util.Scanner;;

public class TruckRatings {
	// static fields for truck id assignment
	private static int nextId = 1000;

	private FoodTruck[] foodTrucks = new FoodTruck[5];

	private String[] truckNames = new String[5];
	private String[] types = new String[5];
	private int[] ratings = new int[5];
	private int[] ids = new int[5];

	// start main method
	public static void main(String[] args) {
		// instantiate new TruckRatings object
		// to use of non-static class methods
		TruckRatings program = new TruckRatings();
		program.inputTrucks();
		program.menu();

	}

	public void inputTrucks() {
		Scanner sc = new Scanner(System.in);
		// FoodTruck object array
		// loops for multiple prompts & storing
		// values into FoodTruck object array
		for (int i = 0; i < foodTrucks.length; i++) {
			// prompt for food truck name & store into array
			System.out.println("Enter a food truck name. Or \"quit\" to exit");
			truckNames[i] = sc.next();
			System.out.println();
			if (truckNames[i].equals("quit")) {
				break;
			}

			// prompt for food truck food type & store
			System.out.println("What type of food does the truck" + "serve?");
			types[i] = sc.next();
			System.out.println();

			// prompt for food truck rating
			System.out.println("What rating do you give" + " this truck? (1-5)");
			ratings[i] = sc.nextInt();
			System.out.println();
			while (ratings[i] < 1 || ratings[i] > 5) {
				System.out.println("Give a rating between" + " 1 and 5.");
				ratings[i] = sc.nextInt();
				System.out.println();
			} // end while

			// assign unique id to each food truck

			ids[i] = nextId;
			nextId++;

			// create FoodTruck object for each set of input & store in array
			// ensure element in array is populated with valid names
			if (truckNames[i] != null || !(truckNames[i].equals("quit"))) {
				foodTrucks[i] = new FoodTruck(ids[i], truckNames[i], types[i], ratings[i]);
			}

		} // end for loop
	} // end inputTruck()

	public void menu() {
		Scanner sc = new Scanner(System.in);
		String[] menuOptions = new String[4];
		menuOptions[0] = "List existing food truck(s)";
		menuOptions[1] = "See average rating of food truck(s)";
		menuOptions[2] = "See highest-rated food truck";
		menuOptions[3] = "quit";
		
		//menu welcome banner
		System.out.println();
		System.out.println("Food Truck Faves");
		
		//loop to print menu and execution of menu until user quits
		boolean menuOn = true;
		while (menuOn == true) {
			// menu print
			System.out.println("Choose an option number from the menu");

			System.out.println();

			// menu print
			for (int i = 0; i < menuOptions.length; i++) {
				System.out.println((i + 1) + "." + " " + menuOptions[i]);
			}

			// execute menu option chosen
			int select = sc.nextInt();
			System.out.println();
			switch (select) {
			case 1:
				for (int i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i] != null) {
						System.out.println(foodTrucks[i].toString());
					}
				}
				System.out.println();
				break;

			case 2:
				int total = 0;
				int average = 0;

				for (int i = 0; i < foodTrucks.length; i++) {
					if (foodTrucks[i] != null) {

						total += ratings[i];
						average = total / (i + 1);
					}
				}
				System.out.println("The average rating of the food trucks is " + average);
				System.out.println();
				break;

			case 3:
				int highestRated = 0;
				int indexTrack = 0;
				
				for (int i = 0; i < foodTrucks.length; i++) {
					if(foodTrucks[i] != null) {
					if (highestRated < ratings[i]) {
							//stores the highest rating to track rating comparisons
							highestRated = ratings[i];
							//tracks index of highest rating
							indexTrack = i;
							
						}
					}
				}
				System.out.println("The highest-rated truck is " 
				+ foodTrucks[indexTrack].toString());
				System.out.println();
				break;
				
			case 4:
				System.out.println("quitting...");
				System.out.println("goodbye");
				menuOn = false;
				break;
				
			default:
				System.out.println("Enter the number of your option from the menu");
				System.out.println();

			}// end switch()

		}//end while()

	}//end menu()
}