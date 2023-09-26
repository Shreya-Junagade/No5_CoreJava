package org.tnsif.custumException;

import java.util.Scanner;

public class CustumExceptionExecutor extends Throwable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter email and pass:");
		String Email=s.nextLine();
		String password=s.nextLine();
		try {
		if(Email.equals("smjunagade@gmail.com") &&  password.equals("mh15cd8918")) {
			System.out.println("credential match");
		}
		else
		{
			throw new LoginCredential("invalid credential");
		}
		}
		catch(LoginCredential e) {
			System.out.println(e);
		}
		
	}
}

