package org.tnsif.challange;

import java.util.Scanner;

public class MicrowaveExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of items");
Scanner s=new Scanner(System.in);
int item=s.nextInt();
System.out.println("enter heating time");
float h=s.nextFloat();
switch(item)
{
case 1:
	
	System.out.println(h);
	break;
case 2:
	System.out.println((h/2)+h);
	break;
	case 3:
	System.out.println(2*h);
	break;
	default:
		System.out.println("more than 3 item not recommended");
		
	
}
	}

}
