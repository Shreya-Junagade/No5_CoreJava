
public class MyException extends Exception {
	private static int Accno[]= {101,102,103,104};
	private static String Name[]= {"shreya","tejas","parth","aditi"} ;
	static double bal[]= {100.0,3000.0,2334.0,4900.};
	MyException()
	{
	}
		MyException(String str){
			super();
			
		}
	public static void main( String args[]) {
		try {
			System.out.println("Accno"+"\t"+"Name"+"\t"+"bal");
			for(int i=0;i<4;i++)
			{
				System.out.println(Accno[i]+"\t"+Name[i]+"\t"+bal[i]);
			
			if(bal[i]<1000) {
				MyException e=new MyException("balance is less than 1000"+Accno+Accno[i]);
		System.out.println("bal is less than 1000");
				throw e;
			}
			}
		}
		catch(MyException e) {
			e.printStackTrace();

			
		
		
	}
	}
}
