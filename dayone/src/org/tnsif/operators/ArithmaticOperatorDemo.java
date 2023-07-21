package org.tnsif.operators;
import java.util.Scanner;
public class ArithmaticOperatorDemo {

public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner S=new Scanner(System.in);
int num1=S.nextInt();
int num2=S.nextInt();
System.out.println(num1+num2);
System.out.println(num1*num2);
System.out.println(num1/num2);
System.out.println(num1-num2);
System.out.println(num1%num2);
S.close();
	}

}
