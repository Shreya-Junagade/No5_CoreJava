package org.tnsif.checkedException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		try {
	
	FileInputStream f=new FileInputStream("C:\\Users\\User\\Desktop\\hello.txt");
	System.out.println("file found");
	}
	catch(FileNotFoundException e) {
		System.out.println("file not exist :" +e);
	}
		
	}

}
