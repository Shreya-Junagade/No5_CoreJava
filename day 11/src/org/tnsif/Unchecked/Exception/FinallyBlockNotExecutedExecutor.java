package org.tnsif.Unchecked.Exception;

import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		try {
	        System.out.println(x/y);
	        System.exit(0);
	        //finally block  will not execute when we use system.exit
	}
      	catch(Exception e) {
      		//catch(ArithmaticException || NullpointerException e) {
      		
      		//catch block use to handle exception
      		System.out.println("exception handled"+e);
      	    //System.exit(0);
      	    //catch block will not execute when we use system.exit
      	}
		finally {
			//when finally block contain exception then finally block 
			//does not executed
			//System.out.println(x/y);
    		System.out.println("always executed");
    		
    	}
	}

}
