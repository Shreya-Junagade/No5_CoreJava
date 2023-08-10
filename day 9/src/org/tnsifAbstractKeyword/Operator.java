package org.tnsifAbstractKeyword;

public abstract class Operator {
	
abstract void operation();

abstract void multiplication();
//if abstract class contain more tan one operator then provide implementatin to all
//abstract method of that class insde child class
void print( int a,int b)
{
	System.out.println(a+b);
}
}