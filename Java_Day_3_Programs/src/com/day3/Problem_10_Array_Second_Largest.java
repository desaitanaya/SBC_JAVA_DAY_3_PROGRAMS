package com.day3;

import java.util.Scanner;

public class Array_Second_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod(); //Method
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAM TO DISPLAY SECOND LARGEST ELEMENT IN ARRAY")
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
		for(int i=0; i<size; i++ ) {
			for(int j=i+1 ;j<size; j++)
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		
		System.out.println("Second largest element in array : " +a[size-2]);
		
	}

}
