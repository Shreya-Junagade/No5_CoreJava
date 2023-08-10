package org.tnsif.Unchecked.Exception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowExecutor {
	static Scanner s=new Scanner(System.in);
	static int age=s.nextInt();
	static int wt=s.nextInt();
	
		// TODO Auto-generated method stub
		static void isEligible(int age,int weight) throws IOException {
		
			if( age>18 && weight>50) {
				System.out.println("eligible");
			}
			else
				throw new IOException("requirements not fuliflled");
		}
		public static void main(String[] args) throws IOException{
	
		isEligible(age,wt);
	}

}
