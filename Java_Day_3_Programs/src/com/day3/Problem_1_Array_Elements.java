package com.day3;

import java.util.Scanner;

public class Problem_1_Array_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAM TO DISPLAY THE ARRAY ELEMENTS");
		System.out.println();
		
		//Taking an input from the user
		System.out.println("Enter the size of an array : ");
		int size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0;i<size; i++) {
			a[i]=sc.nextInt();
		}
		
		//Displaying the array elements
		System.out.println();
		System.out.println("Array elements are : " );
		for(int i=0;i<size; i++) {
			System.out.println(a[i]);
		}
	}

}
