//prg for default parameterized constuctor
package org.tnsifclass;

public class Citizen {
//data member	
String citizentype;
long aadharno;
String gender;
String City;

public Citizen(String citizentype, long aadharno, String gender, String city) {
	super();
		System.out.println("demonstartion of citizen type");


	this.citizentype = citizentype;
	this.aadharno = aadharno;
	this.gender = gender;
	City = city;
}
@Override
public String toString() {
	return "Citizen [citizentype=" + citizentype + ", aadharno=" + aadharno + ", gender=" + gender + ", City=" + City
			+ "]";
}
}