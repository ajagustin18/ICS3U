/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 9/2016
 *Random1.java
 *Asks a person's name, and then 70% of the time says that the name they typed is there favourite, and 30% of the time says they hate that name.
 */
public class Random1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		String name;
		
		System.out.print("Whats your name? ");
		name=scan.nextLine();
		
		int x;
		
		x=(int)((Math.random()*100)+2);
		
		if (x <= 29){
			System.out.println( name +" is NOT your favourite name");}
		
		else if (x >= 30){
			System.out.println( name +" IS YOUR FAVOURITE NAME!!!");}
			
		}
		
	}


