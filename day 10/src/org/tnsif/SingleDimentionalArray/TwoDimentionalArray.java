package org.tnsif.SingleDimentionalArray;
import java.util.Scanner;
public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[3][2];
		for (int i=0;i<3;i++)
		{
			// inside arr
			for(int j=0;j<2;j++) {
			arr[i][j]=s.nextInt();
				
			}
			
		}
		//outside arr
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++) {
			
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
