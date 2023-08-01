package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Hdfc h=new Hdfc();
    h.setAccNo(2833479979459l);
    h.setAccType("current accNo");
    h.setCvvNo(377);
    h.setPinNo(433844);
  
    /*System.out.println(h.getAccNo());
    System.out.println(h.getAccType());
    System.out.println(h.getCvvNo());
    System.out.println(h.getPinNo());
    
	*/
    System.out.println(h);
	}
}
