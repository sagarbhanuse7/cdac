package org.assign6;

import java.util.Scanner;

class ArrayField{
	
	private int[] arr;

    public ArrayField(int size) {
        arr = new int[size];
    }

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arr.length + " integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
    }

    public void printRecord() {
        System.out.println("Array values:");
        for (int value : arr) {
            System.out.println(value);
        }
    }
}

public class Program7 {
 public static void main(String[] args) {
	 ArrayField manager = new ArrayField(5);
     manager.acceptRecord();
     manager.printRecord();
 }
}

