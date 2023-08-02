package org.tnsif.multilevelInheritance;

public class TeamMember extends TeamLead {
private int size;
private   int duration;

public TeamMember(String leadName, int empId, String projectName, int size, int duration,String deptName, String name, int empid) {
	super(leadName, empId,projectName, deptName,  name, empid);
	this.size = size;
	this.duration = duration;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "TeamMember [size=" + size + ", duration=" + duration +" " + super.toString() + "]";
}

}
