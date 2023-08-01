/*ask user for their birth yr encoded as 2 digit alike (62) and for current
	yr also encoded as 2 digit like( 99) 
	find user current age in yr*/
	

package org.tnsif.challange;
import java.util.*;
public class AgeCalExecutor {
	
	
		
static void Agecal(int cr,int br) {	
if( cr>br) {
	System.out.println((100-br)-cr);

}
else {
	
	System.out.println(br-cr);
}
}
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter birth yr and current yr");
int cr=s.nextInt();
int br=s.nextInt();
Agecal(cr,br);	
}
}


 
 
 /*the microwave manufacter recommend that when heating 2 item and 50 % to 
 heating time and when heating 3 item double heating time heating more than
  3 item is not recommended 
  write prg to find out recommeded heating time
  item =2 heating time 5.0*/