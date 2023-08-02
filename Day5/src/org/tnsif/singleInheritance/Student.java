package org.tnsif.singleInheritance;
//derive class
public class Student extends Citizen {

private String CollageName;
private int RollNo;
public Student() {
	//super it call to parent class constuctor
	super();
	// TODO Auto-generated constructor stub
	System.out.println("child class default constuctor");
}
public Student(String city, int pincode, long aadharno, long contactno,int RollNo,String CollageName ) {
	super(city, pincode, aadharno, contactno);
	this.RollNo=RollNo;
	this.CollageName=CollageName;
	// TODO Auto-generated constructor stub
}
public String getCollageName() {
	return CollageName;
}
public void setCollageName(String collageName) {
	CollageName = collageName;
}
public int getRollNo() {
	return RollNo;
}
public void setRollNo(int rollNo) {
	RollNo = rollNo;
}
@Override
public String toString() {
	return "Student [CollageName=" + CollageName + ", RollNo=" + RollNo + ", getCollageName()=" + getCollageName()
			+ ", getRollNo()=" + getRollNo() + ", toString()=" + super.toString() + "]";
}

	// TODO Auto-generated method stub

}
