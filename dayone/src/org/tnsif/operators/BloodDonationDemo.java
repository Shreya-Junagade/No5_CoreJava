package org.tnsif.operators;

import java.util.Scanner;

public class BloodDonationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		int wt=0;
		Scanner S=new Scanner(System.in);
		System.out.println("enter age");
		int num1=S.nextInt();
		System.out.println("enter wt");
		int num2=S.nextInt();
		
		if( age >18 && wt >50) {
			System.out.println("eligible donate blood");
		}
			else {
				System.out.println("not eligiable to donate");
			}
			
		}
		

	}


