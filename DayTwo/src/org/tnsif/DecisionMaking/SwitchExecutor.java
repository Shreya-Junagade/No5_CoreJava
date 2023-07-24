package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class SwitchExecutor {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		 int songno=S.nextInt();
		 switch(songno)
		 {
		 case 1:
			 System.out.println("perfect");
			 break;
		 case 2:
			 System.out.println("taki");
		 default:
			 System.out.println("invalid ip");
		 }
	}

}
