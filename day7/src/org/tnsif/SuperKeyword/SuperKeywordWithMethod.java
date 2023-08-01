package org.tnsif.SuperKeyword;
class Sports{
	    String Sportname="cricket";
	
		void display() {
		System.out.println("sportname is:"+Sportname);
	}
}
class Cricket extends Sports{
	int NoofPlayers=2;
	void display() {
	
		super.display();
	    System.out.println("NoofPlayers is:"+NoofPlayers);
}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cricket c=new Cricket();
c.display();
	}
}


