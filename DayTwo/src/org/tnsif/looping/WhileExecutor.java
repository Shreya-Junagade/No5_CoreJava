package org.tnsif.looping;

import java.util.Scanner;

public class WhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		   int n=S.nextInt();
		   int i=1;
		   while(n>=i)
		   {
			   System.out.println(n+"");
			   n--;
		   }
	}

}
