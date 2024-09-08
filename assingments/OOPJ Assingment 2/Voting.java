package javaDay1;

import java.util.Scanner;

public class Voting {
	public static void main (String[] argv) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the num");
		  int num= sc.nextInt();
		if (num > 18) {
			 System.out.println("eligible for voting");
		}
		else {
			System.out.println("not eligible for voting");	
		}	
	}

}
