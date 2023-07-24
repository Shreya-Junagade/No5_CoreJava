package org.tnsif.DecisionMaking;

import java.util.Scanner;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
      int age1=S.nextInt();
      int age2=S.nextInt();
      int age3=S.nextInt();
      if(age1>age2 && age1>age3)
      {
    	  System.out.println("age1 is greater:"+age1);
      }
      else if(age2>age1 && age2 > age3) 
      {
    	  System.out.println("age2 is greater:"+age2);
    	  	
      }
      else
      {
    	  
    	  System.out.println("age3 is greater:"+age3);
    	  
      }
      S.close();
	}

}
