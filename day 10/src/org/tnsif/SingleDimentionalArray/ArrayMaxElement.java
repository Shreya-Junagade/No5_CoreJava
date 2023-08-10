package org.tnsif.SingleDimentionalArray;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no of elements:");
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{//arr initialization
			arr[i]=s.nextInt();
		}

		for(int i=0;i<n;i++)
		{//arr initialization
	    System.out.println(arr[i]+ "");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
		}
		System.out.println("the largest element of array is "+max);

		for(int i=0;i<n;i++)
		{//arr initialization
	    System.out.println(arr[i]+ "");
		
	
		Arrays.sort(arr);
		}
	}
	
		

}
