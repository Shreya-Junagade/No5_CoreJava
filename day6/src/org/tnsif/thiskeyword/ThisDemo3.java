package org.tnsif.thiskeyword;

public class ThisDemo3 {


		// TODO Auto-generated method stub
		int x;
		public ThisDemo3(){
			this(35);
			//calling parameter constructor
			System.out.println("default");
		}
		ThisDemo3(int x){
			this.x=x;
			System.out.println("parameterized"+x);
		}
		public static void main(String[] args) {
			ThisDemo3 t=ThisDemo3();
				
	}
		private static ThisDemo31 () {
			// TODO Auto-generated method stub
			System.out.println("i");
		}
		
	

}
