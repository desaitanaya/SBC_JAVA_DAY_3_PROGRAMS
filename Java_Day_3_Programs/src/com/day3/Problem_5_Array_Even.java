package com.day3;

import java.util.Scanner;

public class Problem_5_Array_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod(); //Method
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size;
		
		System.out.println("PROGRAM TO DISPLAY ELEMENTS AT EVEN POSITION IN ARRAY");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		//Taking  the input from user
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0; i<=size; i++) {
			a[i]=sc.nextInt();
		}
		
		//Displaying the elements at even position in array
		System.out.println("Elements at even position are :");
		for(int i=0; i<=size; i++) {
			//Condition for checking the elements at even position
			if(i%2==0) {
				System.out.println(a[i]);
			}
		}
		
	}

}
