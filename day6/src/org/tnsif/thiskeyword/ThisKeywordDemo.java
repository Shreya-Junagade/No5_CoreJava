package org.tnsif.thiskeyword;

public class ThisKeywordDemo {
	

		// TODO Auto-generated method stub
		int x,y;
		void setdata(int x,int y)
		{
		this.x=x;
		this.y=y;
		}
		 void display()
		{

       System.out.println(x+" "+y);
	}
		public static void main(String[] args) {
		
		ThisKeywordDemo t=new ThisKeywordDemo();
		t.setdata(2,3);
		t.display();

}
}
