package Day5;
import java.util.Scanner;


 class Calulate {
	private int principalamount ;
	private float  annualintrestrate ;
	private int  loanterm ;
	public  void acceptrecord () {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("principalamount \n");
	      
	      this.principalamount = sc.nextInt();
	      System.out.println("annualintrestrate");
	      
	      this.annualintrestrate = sc.nextFloat();
	      System.out.println("loanterm");
	      this.loanterm= sc.nextInt();
	      
	      formula(principalamount,annualintrestrate,loanterm);
		}
	
	public void formula (int principalamount,float annualintrestrate, int loanterm) {
		float monthlyintrestRate= (annualintrestrate/12)/100;
		float numberOfMonths=loanterm *12;
		double monthlypayment = principalamount * (monthlyintrestRate *  Math.pow(1+ monthlyintrestRate, numberOfMonths)
				/((Math.pow(1+monthlyintrestRate,numberOfMonths)-1)));
		System.out.println(monthlypayment);
	}
	
	
	
}

public class Loan {
	public static void main(String[] args) {
		Calulate calulate = new Calulate();
		calulate.acceptrecord();
	}
	
}
