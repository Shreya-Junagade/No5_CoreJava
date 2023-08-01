package org.tnsif.acess.specifier;

public class Bank {
	public String bankname;
	private int pinNo;
    long accountNo=23889758320358l;
    public void display()
      {
    	System.out.println("bankname is:"+bankname);
       }

private void displayprivate() {
	System.out.println("pinNo is:"+pinNo);
}
void displaydefault()
{
	System.out.println("accountNo is:"+accountNo);
}
}
