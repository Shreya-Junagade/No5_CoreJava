package org.tnsif.statickeyword;

public class StaticBlockExecutor {
static float salary;
String companyname;
static {
	//companyname="tns";
	salary=778585.67f;
	/*static block is use to initialize static var 
	we cant assign val for any non static var inside static block*/
}
static void print() {
	System.out.println(salary);
}
public static void main(String[] args) {
	print();
}
}
