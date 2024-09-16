package JavaDay6;
import java.io.InputStream;
import java.util.*;
class CompoundIntrest {
	int principal ;
	 float annualIntrest ;
	 float compoundnumbers;
	 int years;
	
	 public CompoundIntrest(int principal, float annualIntrest, float compoundnumbers, int years) {
		this.principal = principal;
		this.annualIntrest = annualIntrest;
		this.compoundnumbers = compoundnumbers;
		this.years = years;
	}

	public CompoundIntrest() {
		// TODO Auto-generated constructor stub
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	public float getAnnualIntrest() {
		return annualIntrest;
	}

	public void setAnnualIntrest(float annualIntrest) {
		this.annualIntrest = annualIntrest;
	}

	public float getCompoundnumbers() {
		return compoundnumbers;
	}

	public void setCompoundnumbers(float compoundnumbers) {
		this.compoundnumbers = compoundnumbers;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	} 
	
	public float futurevalue() {

		// TODO Auto-generated method stub
		float futureValue = principal * (1+ annualIntrest / compoundnumbers); Math.pow (compoundnumbers * years, futureValue);
		return futureValue ;
	}

		
	
	
	}


public class compoundintrestutil {
	
		private CompoundIntrest comp = new CompoundIntrest ();
		
		public void acceptrecord () {
		Scanner sc = new Scanner(System.in);
		System.out.print("principal    ");
		comp.setPrincipal(sc.nextInt());
		System.out.print("annualIntrest"   );
		comp.setAnnualIntrest(sc.nextFloat());
		System.out.print("compoundnumbers"  );
		comp.setCompoundnumbers(sc.nextFloat());
		System.out.print("years"   );
		comp.setYears(sc.nextInt());
		}
		
		
		public void printrecord () {
		System.out.println("principal"    +comp.getPrincipal());
		System.out.println("annualIntrest"   +comp.getAnnualIntrest());
		System.out.println("compoundnumbers"    +comp.getCompoundnumbers());
		System.out.println("years"         +comp.getYears());
	    System.out.println("futurevalue"  +comp.futurevalue()); 
	
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
		
		

			public static void main ( String []argv) {
				int choice ;
				compoundintrestutil comp = new compoundintrestutil ();
				while ((choice =compoundintrestutil.menulist()) !=0) {
				 
				 switch (choice) {
					case 1:
						comp.acceptrecord();
						break;

					case 2:
						comp.printrecord();
						break;
					
					 
				
				 }
		
				}
				
			}
}


