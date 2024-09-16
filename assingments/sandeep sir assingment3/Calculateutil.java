package JavaDay6;

import java.util.Scanner;

class Calculate {
	private int principalamount;
	private float annualintrestrate;
	private int loanterm;
	 public float monthlypayment ;

	public Calculate(int principalamount, float annualintrestrate, int loanterm) {
		this.principalamount = principalamount;
		this.annualintrestrate = annualintrestrate;
		this.loanterm = loanterm;
	}

	public Calculate() {
		// TODO Auto-generated constructor stub
	}

	public int getPrincipalamount() {
		return principalamount;
	}

	public void setPrincipalamount(int principalamount) {
		this.principalamount = principalamount;
	}

	public float getAnnualintrestrate() {
		return annualintrestrate;
	}

	public void setAnnualintrestrate(float annualintrestrate) {
		this.annualintrestrate = annualintrestrate;
	}

	public int getLoanterm() {
		return loanterm;
	}

	public void setLoanterm(int loanterm) {
		this.loanterm = loanterm;
	}

	public double monthlypayment () {
		float monthlyintrestRate = (annualintrestrate / 12) / 100;
		float numberOfMonths = loanterm * 12;
		double monthlypayment = principalamount * (monthlyintrestRate * Math.pow(1 + monthlyintrestRate, numberOfMonths)
				/ ((Math.pow(1 + monthlyintrestRate, numberOfMonths) - 1)));
		return monthlypayment;
	}

}

public class Calculateutil {
	private Calculate cal = new Calculate();
	
	
      
	public void acceptrecord() {
		Scanner sc = new Scanner(System.in);
		System.out.print("principalamount");
		cal.setPrincipalamount(sc.nextInt());
		System.out.print("annualintrestrate");
		cal.setAnnualintrestrate(sc.nextFloat());
		System.out.print("loanterm");
		cal.setLoanterm(sc.nextInt());
		
		
       
	}

	public void printrecord() {
		System.out.println("Principalamount    " + cal.getPrincipalamount());
		System.out.println("annualintrestrate   " + cal.getAnnualintrestrate());
		System.out.println("loanterm            " + cal.getLoanterm());
        System.out.println("monthlypayment     " +cal.monthlypayment());
	}

	public static int menulist() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0   exit");
		System.out.println("1   acceptrecord");
		System.out.println("2   printrecord");
		System.out.print("Enter the choice   ");
		int choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] argv) {
		int choice;
		Calculateutil cal = new Calculateutil();
		while ((choice = Calculateutil.menulist()) != 0) {
			switch (choice) {
			case 1:
				cal.acceptrecord();
				break;

			case 2:
				cal.printrecord();
				break;
			
			}

		}

	}

}
