package org.tnsif.SingleDimentionalArray;

public class Employee {



private String getId;
// TODO Auto-generated method stub
private int Id;
private String Name;
private double Salary;
public Employee(int Id, String Name, double Salary) {
	super();
	this.Id = Id;
	this.Name = Name;
	this.Salary = Salary;
}
public int getId() {
	return Id;
}
public void setId(int Id) {
	this.Id = Id;
}
public String getName() {
	return Name;
}
public void setName(String Name) {
	this.Name = Name;
}
public double getSalary() {
	return Salary;
}
public void setSalary(double Salary) {
	this.Salary = Salary;
}


	}


