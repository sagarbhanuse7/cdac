package javaDay4;

import java.util.Scanner;

public class Employee {
	String name ;
	   int Empid ;
	   float salary;
	    
	public void acceptrecord ( ) {
		  Scanner sc = new Scanner ( System.in);
		  
		  System.out.println("name    ");
		  this.name = sc.nextLine ();
		  System.out.println("Empid   ");
		  this.Empid = sc.nextInt ();
		  System.out.println("salary  ");
		  this.salary = sc. nextFloat ();
	}
	    
	  public void printrecord () {
		  System.out.println("name    "    +name);
		  System.out.println("Empid   "   +Empid);
		  System.out.println("salary  "  +salary);
		  
	  }
		 public static void main (String [] argv) {
			 Employee emp1 = new Employee ();
			 emp1. acceptrecord ();
			 emp1.printrecord ();
			 Employee emp2 = new Employee ();
			 emp2. acceptrecord ();
			 emp2.printrecord ();
			 Employee emp3 = new Employee ();
			 emp3. acceptrecord ();
			 emp3.printrecord ();
			 
			 
  }
		  
	
	  
}


