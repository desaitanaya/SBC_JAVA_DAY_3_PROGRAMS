package com.day3;

import java.util.Scanner;

public class Problem_2_Array_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int size=0, counted=-1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAM TO DISPLAY FREQUENCY OF EACH ELEMENT IN ARRAY");
		System.out.println();
		
		System.out.println("Enter the size of an array : ");
		size=sc.nextInt();
		int a[] = new int[size] ;
		int frequency[] = new int [a.length];
		
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0;i<size; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Array elements are : " );
		for(int i=0;i<size; i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0; i<size; i++) {
			int count = 1;
			for(int j=i+1; j<size; j++) {
				if(a[i]==a[j]) {
					count = count + 1;
					frequency[j]=counted;
				}
			}
			if(frequency[i] != counted) {
				frequency[i]=count;
			}
		}
		System.out.println();
		System.out.println("Frequency of each element in array : ");
		for(int i=0; i<frequency.length; i++) {
			if(frequency[i] != counted) {
				System.out.println(a[i] +" occurs " + frequency[i] + " times " );
			}
			
		}
		
	}

}
