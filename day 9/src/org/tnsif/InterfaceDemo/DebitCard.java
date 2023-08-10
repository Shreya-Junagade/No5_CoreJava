package org.tnsif.InterfaceDemo;

public interface DebitCard {
	
	/* by default all var inside interface is public static final if it is
	 *  final we must have to intialize value for that var*/
	
	long cardNo=838748329999l; 
	void displayCardDetails() ;
	/*WE CANT USEE CONCREATE METHOD INSIDE INTERFACE BY DEFAULT METHOD IS 
	 * ABSTACT INSIDR INTERFACE*/
	 default void display() {
		 System.out.println("default method");
		 //default method and static method  is new fun of java 8
	 }
	static void print() {
		System.out.println("static method");
	}
	

}
