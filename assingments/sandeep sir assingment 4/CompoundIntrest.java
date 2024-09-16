package Day5;
import java.util.Scanner;

 class Calculate {
 int principal ;
 float annualIntrest ;
 float compoundnumbers;
 int years;
 
 public void acceptrecord () {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("principal");
	 this.principal = sc. nextInt();
	 System.out.println("annualIntrest");
	 this.annualIntrest= sc.nextFloat();
	  System.out.println("compoundnumbers");
	  this.compoundnumbers= sc.nextFloat();
	  System.out.println("years");
	  this.years= sc.nextInt();
	  
	  formula (principal,annualIntrest,years,compoundnumbers);
 }

private void formula(int principal, float annualIntrest, int years, float compoundnumbers) {

	// TODO Auto-generated method stub
	float futureValue = principal * (1+ annualIntrest / compoundnumbers); Math.pow (compoundnumbers * years, futureValue);
	System.out.println(futureValue);
} 
}
 public class CompoundIntrest {
	 public static void main (String []argv) {
	 Calculate cal = new Calculate ();
	  cal. acceptrecord ();
 }
 }	 
 
	
  

	



