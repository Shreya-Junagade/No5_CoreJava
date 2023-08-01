package org.tnsif.intro;

import java.util.Scanner;

/* prg to demonstrate on user ip*/
public class USERINPUTDEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		Scanner S= new Scanner(System.in); 
		
		System.out.println("enter the num");
			int num=S.nextInt();
		System.out.println("enter the value of num is: "+num);
		float num1=S.nextFloat();
		System.out.println("the value of Floatnum is : "+num);
		char c=S.next().charAt(0);
		System.out.println("char is :"+c);*/
		String str1=S.nextLine();	
		S.next();
		System.out.println("string is: "+str1);*/
		 Scanner S= new Scanner(System.in);
		    String userName;
		    
		    // Enter username and press Enter
		    System.out.println("Enter username"); 
		    userName = S.nextLine();   
		       
		    System.out.println("Username is: " + userName);
				
	

}
}
