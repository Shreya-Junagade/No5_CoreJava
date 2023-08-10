package org.tnsif.Polymorphism;
import java.util.Scanner;
class MovieTicket{
//static int status;
	static float st;
	static void ticket(int age,float st) {
		if( age>13) {
			if(st>13.30 && st<17.59) {
				System.out.println("$5.00");
			}
			else
				System.out.println("$8.00");
		}
		else
			if(st>13.30 && st<17.59) {
			System.out.println("$2.00");
			}
			else {
			System.out.println("$4.00");
			}
}
	public static void main(String[] args) {
		Scanner s =new Scanner (System.in);
		System.out.println("enter the age");
		int age=s.nextInt();
		System.out.println("enter the show timing");
	    float st=s.nextFloat();
	
		ticket(age,st);
		System.out.println("enjoy the movie!!");
		/*Scanner s =new Scanner (System.in);
		 * 
		int age=s.nextInt();
		int time=s.nextInt();
				int price=0;
				
			
				
		status=age+time;
		if( status>1213 ){
			System.out.println("price is "+8);
		}
		else if( status<1213 ){
			System.out.println("price is "+4);
		}
		else if( status>1643 ){
			System.out.println("price is "+5);
		}
		else if( status<1643){
			System.out.println("price is "+2);
		}
		System.out.println("price is "+price);*/
	}
	
	
	
}
