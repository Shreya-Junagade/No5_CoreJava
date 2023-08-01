package org.tnsif.SuperKeyword;
class Nationality{
	
	String nationname;
	
	public Nationality(String nationname) {
		this.nationname=nationname;
		System.out.println(nationname);
	}
}
class Person extends Nationality{
	String lang;

public Person(String nationaname, String lang) {
		super(nationaname);
		this.lang = lang;
		System.out.println(lang);
	}
}

public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person c=new Person("germany","german");
	}

}
