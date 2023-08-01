package org.tnsif.statickeyword;

public class StaticMethod {
	int x=2;
	static String clgname="MET";
	public static void print()
	{
		
		/*if any method is outside main fun AND if u want
		to acess that method inside main fun we have to make that method as static*/
	System.out.println(clgname);
	// System.out.println( x);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
	

	}

}
