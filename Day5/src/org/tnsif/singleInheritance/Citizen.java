package org.tnsif.singleInheritance;
//base class
public class Citizen {
	private String city;
	private int pincode;
	private long Aadharno;
	private long Contactno;
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("default");
	}
	public Citizen(String city, int pincode, long aadharno, long contactno) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.Aadharno = aadharno;
		this.Contactno = contactno;
		System.out.println("parameterized");
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAadharno() {
		return Aadharno;
	}
	public void setAadharno(long aadharno) {
		Aadharno = aadharno;
	}
	public long getContactno() {
		return Contactno;
	}
	public void setContactno(long contactno) {
		Contactno = contactno;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", Aadharno=" + Aadharno + ", Contactno=" + Contactno
				+ ", getCity()=" + getCity() + ", getPincode()=" + getPincode() + ", getAadharno()=" + getAadharno()
				+ ", getContactno()=" + getContactno()+ "]";
	}

}
