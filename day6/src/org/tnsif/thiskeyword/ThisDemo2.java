package org.tnsif.thiskeyword;

public class ThisDemo2 {

	
		// TODO Auto-generated method stub
		void print(ThisDemo2 t) {
			System.out.println("hey using this keyword");
		}
		void display() {
			print(this);
			
			/*when u call any parameter method imside non prameter method then
			   we gwt er to overcome we use this keyword as arg in method call
			 */
		}
		public static void main(String[] args) {
			ThisDemo2  t1=new ThisDemo2();
			t1.display();
			
	}

}
