package org.assign6;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		acceptRecord(arr);
		printRecord(arr);
	}
	
	public static void acceptRecord(int[] arr) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 Integers: ");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			sc.close();
		}
	}
	
	public static void printRecord(int[] arr) {
		System.out.println("Array Values are: ");
		for(int value : arr) {
			System.out.println(value);
		}
	}
}
