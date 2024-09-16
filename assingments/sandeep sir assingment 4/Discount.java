package Day5;
import java.math.*;
import java.util.Scanner;
  class Dress	{
  private int Originalprice ;
	private float discount ;
	
	 
	public void acceptrecord () {
		Scanner sc = new Scanner (System.in);
		System.out.println("Originalprice    ");
		this.Originalprice = sc.nextInt();
		System.out.println("discount  ");
		this.discount = sc.nextFloat();
		formula (Originalprice , discount );
		}
	
	
	

	private void formula (int Originalprice, float discount2) {
	float discountAmount = Originalprice * (discount2 / 100);
	float finalPrice = Originalprice - discountAmount ;
	System.out.println( finalPrice );
		
	}

}
 
public class Discount {
	public static void main (String []argv) {
		Dress d = new Dress ();
		 d.acceptrecord () ;
		
	}

	
		
	
}
 
