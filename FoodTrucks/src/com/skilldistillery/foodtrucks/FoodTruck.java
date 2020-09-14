package com.skilldistillery.foodtrucks;

public class FoodTruck {
	//fields
	private int numId;
	private int rating;
	private String name;
	private String foodType;
	
	//initialize numId for assignment
	
	
	//constructor
	public FoodTruck () {
		
	}
	
	public FoodTruck(int id, String name, 
			String foodType, int rating) {
		numId = id;
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	@Override
	public String toString() {
		return "FoodTruck [numId=" + numId + ", rating=" + rating + ", name=" + name + ", foodType=" + foodType + "]";
	}	
	
}


