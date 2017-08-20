package com;

public class AddWithoutPlusOp {

	// Function to add which takes two parameters
	public static int add(int a, int b) { 
		return a - ~b - 1; // ' ~ ' is a complement operator.
	}

	// Main function
	public static void main(String[] args) {

		int result = 0;

		result = add(100, -235);
		System.out.println("Addition Result --------------------> " + result);

		result = add(100, 235);
		System.out.println("Addition Result --------------------> " + result);

		result = add(-100, -235);
		System.out.println("Addition Result --------------------> " + result);

		result = add(0, -235);
		System.out.println("Addition Result --------------------> " + result);
 
	}

}
