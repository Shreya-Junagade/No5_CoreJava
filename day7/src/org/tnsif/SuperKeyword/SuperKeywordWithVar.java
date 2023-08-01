package org.tnsif.SuperKeyword;
class State{
	String statename="punjab";
}

class Capital extends State{
	String statename="haryana";
	String capital="chandigarh";
	public void display()
	{
		// super is use to call parent CLASS VAR IF PARENT AD CHILD CLASS VAR NAME
		//ARE SAME
		System.out.println(super.statename);
		System.out.println(statename);
	
	}
}

public class SuperKeywordWithVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Capital c=new Capital();

c.display();
	}
}
