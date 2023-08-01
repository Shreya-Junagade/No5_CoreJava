package org.tnsif.challange;
import java.util.*;
public class CircleChallange {

/*there are n people standing in circle WAITING TO BE EXCECUTED the counting out begins at 
SOME PT IN CIRCLE AT PROCEDES AROUND CIRCLE In FIX DIRECTION IN EACH STEP A CERTAIN NO OF
PEOPLE ARE SKIPPED AND NXT PERSON IS EXECUTED THE ELIMINATION PROCEDES AROUND CIRCLE
(WHICH IS BECOMING SMALLER AND SMALLER AS EXECUTE PEOPLE ARE REMOVE), UNTIL ONY LAST
PERSON REMAIN,WHO IS GIVEN FREEDOM
GIVEN TOTAL NO OF PERSON N AND NO K WHICH INDICATE THAT A-1 PERSON ARE SKIPPED AND K TH 
PERSON IS SKILLED IN CIRCLE
TASK IS TO CHOSE INTIAL PERSON IN CIRCLE THAT SURVIVES
N=T K=2
*/
 
    public static int survive(int n, int k)
    {
    	if (n == 1) { 
    		return 1;
    	}
    	else {
    		/* The position returned by josephus(n - 1, k) is adjusted because the 
    		recursive call josephus(n - 1, k) considers the original position 
    		k%n + 1 as position 1 */
    		return (survive(n - 1, k) + k-1) % n + 1;
    		//n-1 =surving   k th person killing   k-1 th person skipped   out of n person
    		// n+1 person at 1 st position
    	}
    	} 
    	 public static void main(String[] args)
    	    {
    		 Scanner s=new Scanner(System.in);
    		 int n=s.nextInt();
    		 int k=s.nextInt();
    	      
    	        System.out.println(survive(n, k));
    	    }
    }
