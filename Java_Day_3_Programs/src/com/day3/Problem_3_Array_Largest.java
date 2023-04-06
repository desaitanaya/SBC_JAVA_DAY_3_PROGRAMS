package com.day3;

import java.util.Scanner;

public class Problem_3_Array_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod(); //Method
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO FIND LARGEST ELEMENT IN AN ARRAY");
		
		System.out.println();
		//Taking the input from user
		System.out.println("Enter the size of an array : ");
		int size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		
		int max=a[0];
		for(int i=0; i<size; i++) {
			//Condition for checking the largest element
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println();
		//Displaying the largest element
		System.out.println("Largest element in array is : " +max);
	
	}

}
