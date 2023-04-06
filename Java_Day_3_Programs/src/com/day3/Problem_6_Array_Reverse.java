package com.day3;

import java.util.Scanner;

public class Problem_6_Array_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();  //Method
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size;
		
		System.out.println("PROGRAM TO REVERSE THE ARRAY ELEMENTS");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		//Taking the input from the user
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0; i<=size; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Reversed array :");
		//Condition for reversing the array elements
		for(int i=size; i>=0 ;i--) {
			System.out.println(a[i]);
		}
	}

}
