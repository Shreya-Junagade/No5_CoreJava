package org.tnsif.challange;
import java.util.*;
public class RentCal {
private static final String case1 = null;


static int  Hotelrent( String m,int d,int r,int t){
	Switch(m); {
		/*case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		//System.out.println(rent*days);
		break;
		case 4;
		  case 5:
		  case 6:
		  case 11:
		  case 12:
		 
			System.out.println(rent+(rent*0.2)*days);
			break;
			default:
			
			System.out.println("default);
		    break;
			sys*/
		case1 :
		System.out.println("In remaining month rent is:");
		t=r*d;
	
		System.out.println("total is"+t);
	
		
		case2 :
		System.out.println(" rent in apr june  is:");
		t = r*d;
        t+=0.12*t;
        System.out.println(t);

    	case3 :
    	System.out.println("rent in month nov to dec is:");
    		  t = r*d;
    	        t+=0.2*t;
    	        System.out.println(t);
	}
		return 0;
	}

	
		// TODO Auto-generated method stub

		/*write prg to calcuate hotel tarrif the room rent is 12 %high during peak season
		 *  20  % high apr june nov dec peak season) note use switch case
		 *  input month =3,rent=1500,day=2*/
		
	
	private static void Switch(String m) {
	// TODO Auto-generated method stub
	
}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the rent ");
		int r=s.nextInt();
		System.out.println("enter the no of days ");
		int d=s.nextInt();
		System.out.println("enter the month ");
		String m=s.next();
		
		
		Hotelrent(m,d,r, d);
	}
}


 