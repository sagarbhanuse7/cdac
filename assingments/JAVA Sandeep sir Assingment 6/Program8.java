package org.assign6;

import java.util.Scanner;

class FieldArray{
	private int[] arr;

	public FieldArray(int size) {
		arr = new int[size];
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
}

public class Program8 {
 
	public static void main(String[] args) {
		FieldArray a = new FieldArray(5);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 integers:");
        int[] tempArr = new int[5];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = sc.nextInt();
        }
        a.setArr(tempArr);

        int[] arr = a.getArr();
        System.out.println("Array values:");
        for (int value : arr) {
            System.out.println(value);
        }
        sc.close();
	}
}
