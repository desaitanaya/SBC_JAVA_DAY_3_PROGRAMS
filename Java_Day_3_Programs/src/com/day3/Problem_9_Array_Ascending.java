package com.day3;

import java.util.Scanner;

public class Problem_9_Array_Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();  //Method
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO DISPLAY THE ELEMENTS OF ARRAY IN ASCENDING ORDER");
		System.out.println();
		
		//Taking input from user
		System.out.println("Enter the size of array : ");
		size=sc.nextInt();
		int a[] = new int[size];
	
		System.out.println();
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		
		int temp=a[0];
		System.out.println();
		System.out.println("Array in ascending order : ");
		//Condition for displaying the elements of array in ascending order
		for(int i=0; i<size; i++ ) {
			for(int j=i+1 ;j<size; j++)
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			System.out.println(a[i]);
		}
		
	}

}
