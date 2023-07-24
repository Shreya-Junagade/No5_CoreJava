package org.tnsif.looping;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		int n=S.nextInt();
		do {
			System.out.println("value of n:"+n);
			
		n++;
	}
		while(n<14);
	}

}
