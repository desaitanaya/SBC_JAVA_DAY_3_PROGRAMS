package com.day3;

import java.util.Scanner;

public class Problem_4_Array_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();  //Method
	}  

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size;
		
		System.out.println("PROGRAM TO DISPLAY SMALLEST ELEMENT IN ARRAY");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		
		int min=a[0];
		for(int i=0; i<size; i++) {
			//Condition for checking the smallest element
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println();
		//Displaying the smallest element in array
		System.out.println("Smallest element in array is : " +min);
		
	}
	
}
	