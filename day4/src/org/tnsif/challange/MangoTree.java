package org.tnsif.challange;
import java.util.*;
public class MangoTree {


		// TODO Auto-generated method stub
		static void isMangoTree(int n,int t) {
			if(t%n==0||t%n==1||t<=n)
			{
				System.out.println("mango tree ");
		    }
			else {
				System.out.println("not mango tree");
			}
		}
			public static void main(String[] args) {
				Scanner s=new Scanner(System.in);
				System.out.println("enter value of n and t:");
				int n=s.nextInt();
				int t=s.nextInt();
				isMangoTree(n,t);
			}
	}

