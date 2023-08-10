package org.tnsifAbstractKeyword;
//prg to demonstrate abstract keyword
public class AbstractClassExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cannot create obj of abstract class
//Operator o=new Operator();
		Addition a=new Addition();
	
		a.print(10,20);
		a.operation();
		a.multiplication();
		
	}

}
