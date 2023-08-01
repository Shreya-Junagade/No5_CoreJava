package org.tnsif.statickeyword;

public class StaticExecutor {
	static int num=67;
	
	//if any var declare nonstatic and outside main fun
	//and acess that var inside main we use static
	
	public static void main(String[] args) {
		
		//StaticExecutor s=new StaticExecutor();
		//System.out.println(s.num);
	
		System.out.println(num);

	}

}
