package org.tnsif.Unchecked.Exception;

public class ArrrayIndexOutOfBoundExecutor {
	
    static void print(int arr[]) {
    	try {
	System.out.println(arr[4]);
}
    	catch(Exception e) {
    		System.out.println("handled"+e);
    	
    	}
    	finally {
    		System.out.println("always executed");
    	}
    	System.out.println("outside statement gets executed");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,4,5};
        print(arr);
	}

}
