package javaDay2;

import java.util.Scanner;

public class Shape {
	public static void main(String[] arg) {
		System.out.println("type 1 is to calculate circle");
		System.out.println("type 2 is to calculate rectangle");
		System.out.println("type 3 is to calculate square");
		System.out.println("type 4 is to calculatetriangle ");
	

	Scanner sc = new Scanner(System.in);
	int shape=sc.nextInt();
	switch(shape) {
		case 1: System.out.println("enter the radius");
		int b1 = sc.nextInt();
		float area = (3.14f * b1 * b1);
		System.out.println("area is " + area);
		break;
		case 2: System.out.println("enter the length");
		System.out.println("enter the breadth");
		int l1 = sc.nextInt();
		int g1 = sc.nextInt();
		int are = (l1 * g1);
		System.out.println("area is " + are);
		break;
		case 3: System.out.println("enter the side1");
		System.out.println("enter the side2");
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int ar = (s1 * s2);
		System.out.println("area is" + ar);
		break;
		case 4: System.out.println("enter the base");
		System.out.println("enter the height");
		int e1 = sc.nextInt();
		int e2 = sc.nextInt();
		int a = (e1 * e2 / 2);
		System.out.println("area is"+ a);
		break;1

	}
}}
