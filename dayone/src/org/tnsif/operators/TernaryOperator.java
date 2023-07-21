package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S =new Scanner(System.in);
		int num=S.nextInt();
		String res=(num%2==0)?"Even":"Odd";
		System.out.println("result is "+res);
		S.close();

	}

}
