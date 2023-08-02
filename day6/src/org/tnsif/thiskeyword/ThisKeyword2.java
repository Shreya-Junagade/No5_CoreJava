package org.tnsif.thiskeyword;

public class ThisKeyword2 {
	//int x,y;
	int x,y;
	

	//public ThisKeyword2(int a, int b){
		public ThisKeyword2(int x, int y){
		// TODO Auto-generated method stub
		
	
		//confuse between constructor and class var
		//x=x;
		//y=y;
		//x=a;
		//y=b;
		this.x=x;
		this.y=y;
		}
		 void display()
			{
			 System.out.println(x+" "+y);
			}

		public static void main(String[] args) {
	
		ThisKeyword2  t1=new ThisKeyword2(2,3);
		t1.display();
		
	}

}
