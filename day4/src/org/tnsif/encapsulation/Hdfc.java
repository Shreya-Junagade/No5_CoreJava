package org.tnsif.encapsulation;

public class Hdfc {
private long AccNo;
private int cvvNo;
private String AccType;
private int pinNo;

//getter -get value  setter -set value
public long getAccNo() {
	return AccNo;
}


public void setAccNo(long accNo) {
	AccNo = accNo;
}
public int getCvvNo() {
	return cvvNo;
}
public void setCvvNo(int cvvNo) {
	this.cvvNo = cvvNo;
}
public String getAccType() {
	return AccType;
}
public void setAccType(String accType) {
	AccType = accType;
}
public int getPinNo() {
	return pinNo;
}
public void setPinNo(int pinNo) {
	this.pinNo = pinNo;

}
@Override
public String toString() {
	return "Hdfc [AccNo=" + AccNo + ", cvvNo=" + cvvNo + ", AccType=" + AccType + ", pinNo=" + pinNo + ", getAccNo()="
			+ getAccNo() + ", getCvvNo()=" + getCvvNo() + ", getAccType()=" + getAccType() + ", getPinNo()="
			+ getPinNo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
