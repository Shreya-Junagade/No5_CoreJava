package org.tnsif.custumException;

public class LoginCredential extends Throwable{
	private String str;

	public LoginCredential(String str) {
		super();
		this.str = str;
	}

	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}

}
