/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 24/2016
 *Chaos.java
 *Chaos application the prompts the user for a starting value and then performs the experiment
 */
public class Chaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double total;
		
		System.out.print("Enter a number: ");
		total=scan.nextDouble();
		
		for ( int x=0; x < 50; x++);{
			total = 2 * total * (1-total);
			System.out.print(total);
		}
		
		
	}

}
