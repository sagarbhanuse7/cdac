package javaDay1;

import java.util.Scanner;

public class SwitchSeason {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc= new Scanner (System.in);
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1 to 12");
            int num=sc.nextInt();
            String season ;
         switch(num){
         case 1:case 2:case 3:
           season="winter";
            System.out.println("the season is "+ season);
           break;
         case 4:case 5:case 6:
           season="spring";
           System.out.println("the season is "+ season);
           break;
         case 7:case 8:case 9:
           season="summer";
           System.out.println("the season is "+ season);
           break;
         case 10:case 11:case 12:
           season="autumn";
           System.out.println("the season is "+ season);
           break;
            default:
           System.out.println("default number");
          }
      }
	}

