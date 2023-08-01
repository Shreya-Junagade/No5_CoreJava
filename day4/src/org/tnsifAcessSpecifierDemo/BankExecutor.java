package org.tnsifAcessSpecifierDemo;

import org.tnsif.acess.specifier.Bank;

public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new Bank();
b.bankname="SBI";
b.display();

//b.displaydefault(); account no and display method are default we are not able to acess 
//in another package

//b.pinNo();  display private pin no is private we cant acess in another class 
//and another package
	}

}
