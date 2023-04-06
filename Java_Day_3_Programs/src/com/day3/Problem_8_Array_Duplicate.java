package com.day3;

import java.util.Scanner;

public class Problem_8_Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size;
		
		System.out.println("PROGRAM FOR DISPLAYING THE DUPLICATE ELEMENTS IN ARRAY");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		//Taking input from user
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0; i<=size; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Duplicate elements in the array : ");
		//Conditions for checking the duplicate elements in array
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
			
				}
		
	}

}
