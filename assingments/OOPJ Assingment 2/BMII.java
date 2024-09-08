package javaDay2;

import java.util.Scanner;

public class BMII {
	 public static void main(String[] arg) {
		    Scanner Sc = new Scanner(System.in);
		    System.out.println("enter the weight");
		    int weight=Sc.nextInt();
		    System.out.println("enetr the height");
		    float height=Sc.nextFloat();
		    float BMI = weight /(height*height);
		    if (BMI<=18.5) {
		    	System.out.println("the weight is underweight"+BMI);
		    	
		    }
		    else if (BMI>=18.6 && BMI<=29.5) {
		    	System.out.println("the weight is normal weight"+BMI);
		    }
		    else  {
		    	System.out.println("the weight is overweight"+BMI);
		    }
		     

}
}
