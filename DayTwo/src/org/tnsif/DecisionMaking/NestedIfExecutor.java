package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class NestedIfExecutor {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int age=S.nextInt();
		int wt=S.nextInt();
		if(age>=12)
		{
			if( wt>=40) 
			{
				System.out.println("eligible for bunjee jumping");
			if(wt>110)
			{
				System.out.println("extra wt are added");
			}
		 }
		
			else
		    {
			System.out.println("not eligible");
		}
	}
		else {
			System.out.println("not eligible");
		}
 }
}