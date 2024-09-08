package javaDay2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] argv, float x) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter the weight");
    int weight=Sc.nextInt();
    System.out.println("enetr the height");
    float height=Sc.nextFloat();
    float BMI = weight /(height*height);
    if (BMI<=18.5) {
    	System.out.println("the weight is underweight");
    	
    }
    else if (18.6<=BMI && BMI>=29.5) {
    	System.out.println("the weight is normal weight");
    }
    else  {
    	System.out.println("the weight is overweight");
    }
     
   
    	
      
    
    
    		
    
    }  
}

