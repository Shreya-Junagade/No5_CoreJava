package org.tnsif.looping;

import java.util.Scanner;

public class ForLoopExecutor {

	public static void main(String[] args) {
	
	
     	int rows, columns, i, j;
		Scanner s= new Scanner(System.in);
		
		System.out.print(" Please Enter Number of Rows : ");
		rows = s.nextInt();	
		
		System.out.print(" Please Enter Number of Columns : ");
		columns = s.nextInt();		
			
		for(i = 0; i <= rows; i++)
		{
			for(j = 0; j <= columns; j++)
			{
				System.out.print("* "); 
			}
			System.out.print("\n"); 
}
}
}
