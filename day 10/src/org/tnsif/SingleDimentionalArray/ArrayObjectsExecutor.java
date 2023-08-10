package org.tnsif.SingleDimentionalArray;

public class ArrayObjectsExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[]=new Employee[2];
	
		arr[0]=new Employee(10,"shreya",15000.3);
		arr[1] =new Employee(11,"aditi",34000.3);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}

	}

}
