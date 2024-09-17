package org.assign6;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int [] arr = new int[5];
		
		System.out.println("Default values of the array:");
        for (int value : arr) {
            System.out.println(value);  
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            
            sc.close();
        }

     
        System.out.println("Updated values of the array:");
        for (int value : arr) {
            System.out.println(value);
        }
	}
}
