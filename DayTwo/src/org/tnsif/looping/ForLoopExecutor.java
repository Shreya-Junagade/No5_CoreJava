package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int num=S.nextInt();
		for(int i=1;i<=num;i++)
		{
          for(int j=1;j<=num;j++)
          {
        	  System.out.println("*");
          }
          System.out.println();
	}
         S.close();
}
}
