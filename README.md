# FoodTrucksProject
  ## Overview
    This program allows a user to input up to five food trucks by providing 
    their names, each truck's cuisine, and a rating for the respective truck.
    
    The program then displays a menu with options for the user to view each
    truck's information, an average rating of the trucks entered, and the 
    highest-rated truck's information.
    
    Options are afforded to the user to quit both the input and main portions 
    of program. Users can exit the input portion by entering "quit" as the truck's 
    name. Additionally, users may quit the main program by choosing the appropriate 
    numeric option of program's menu.

  ## Topics & Technologies used
  * Classes
  * Fields (as a way to store single values to be manipulated by other classes)
  * Arrays (as a method to store groups of information)
  * For Loops (as a method to access elements of arrays)
  * While Loops (as a way to run a program until the user quits)
  * Methods (as a method to manipulate behaviors of the program)
  * toString() Methods (as a way to print stored information to the user)
  * Switch Statements (as a way to execute selected menu commands from user input) 
  * Polymorphism (as a way to customize a method for multiple desired outcomes)
  * Encapsulation (as a way to package data and methods into a class and restrict access to data)
  
  
  ## Concepts Learned and Reinforced
  * How to perform object instatiation and why
    * Objects must be instantiated to access bodies of non-static classes
    
  * How encapsulation and polymorphism can be used to create more efficient, more readable code
  
  * Using the proper logic to find and return the highest-rated truck reinforced my understanding of for loops and how they manipulate data though each iteration
    
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
    
     
