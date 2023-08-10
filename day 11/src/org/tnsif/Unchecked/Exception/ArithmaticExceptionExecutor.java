package org.tnsif.Unchecked.Exception;

import java.util.Scanner;

public class ArithmaticExceptionExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contain exception code
		try {
	        System.out.println(x/y);
	}
      	catch(Exception e) {
      		//catch block use to handle exception
      		System.out.println("exception handled"+e);
      	}

	}

}
