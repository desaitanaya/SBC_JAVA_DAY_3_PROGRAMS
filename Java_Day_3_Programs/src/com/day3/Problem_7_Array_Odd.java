package com.day3;

import java.util.Scanner;

public class Problem_7_Array_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();  //Method
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println()"PROGRAM TO DISPLAY THE ELEMENTS AT ODD POSITION IN ARRAY");
		System.out.println();
		
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		int a[] = new int[size];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0; i<=size; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Elements at odd position are :");
		//Condition for checking the elements at odd position
		for(int i=0; i<=size; i++) {
			if(i%2!=0) {
				System.out.println(a[i]);
			}
		}
		
	}

}
