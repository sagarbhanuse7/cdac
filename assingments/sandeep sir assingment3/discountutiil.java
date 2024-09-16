package JavaDay6;

import java.util.Scanner;

class Dress	{
	  private int Originalprice ;
      private float discount ;

   public Dress () {
	   this.Originalprice = 0;
	   this.discount = 0;
   }
	  public Dress (int o , float d) {
		  this.Originalprice = o ;
		  this.discount = d;
	  }
	public int getOriginalprice() {
		return Originalprice;
	}
	public void setOriginalprice(int originalprice) {
		Originalprice = originalprice;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	} 

	public float finalprice () {
	float discountAmount = Originalprice * (discount / 100);
	float finalPrice = Originalprice - discountAmount ;
	  return finalPrice ;
		
	}

		  
	  }
   
   public class discountutiil {
	   private Dress D = new Dress ();
	  
	   public void acceptrecord () {
	  
	   Scanner sc = new Scanner (System.in);
	   System.out.print(" Originalprice  ");
	   D.setOriginalprice(sc.nextInt());
	   System.out.print("discount  ");
	   D.setDiscount(sc.nextFloat());
	   }
	   public void printrecord () {
		   System.out.println(" Originalprice"      +D.getOriginalprice());
		   System.out.println("discount"    +D.getDiscount());
		   System.out.println("finalPrice"   +D.finalprice());
	   }
	   public static int menulist() {
			Scanner sc = new Scanner(System.in);
			System.out.println("0 exit");
			System.out.println("1 acceptrecord");
			System.out.println("2 printrecord");
			System.out.print("Enter the choice   ");
			int choice = sc.nextInt();
			return choice;
			
		}
		public static void main ( String []argv) {
			int choice ;
			discountutiil util = new discountutiil ();
			while ((choice=discountutiil.menulist()) !=0) {
			 
			 switch (choice) {
				case 1:
					util.acceptrecord();
					break;

				case 2:
					util.printrecord();
					break;
				
			
			 }
			 
	
			}
			
		}
}



	   

   
