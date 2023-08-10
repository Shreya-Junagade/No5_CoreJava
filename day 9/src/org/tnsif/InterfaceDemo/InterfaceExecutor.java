package org.tnsif.InterfaceDemo;

public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//DebitCard d=new DebitCard();
		//cannot instantiate interface
		SBIDebitCard d=new SBIDebitCard();
	
		d.displayCardDetails();
		//we can call default method of interface using obj of implementable class
		d.display();
		DebitCard.print();
		//print is static method in interface to
		//call print we have to use interface.methodname 
		CheesePopCorn c=new CheesePopCorn();
		c.displayReceipe();
		Person p=new Person();
	    p.ShowDrinkName();
		
	}

}
