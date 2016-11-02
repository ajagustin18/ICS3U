/**
 * 
 */
package agustin;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 1/2016
 *Eggs.java
 *Price on the number of eggs purchased
 */
public class Eggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double egg;
		
		System.out.print("Enter the number of eggs purchased: ");
		egg=scan.nextDouble();
		egg=egg/12;
		
		if (egg <= 4){
				System.out.println("Price per dozen is: $0.50");
				System.out.println("The bill is equal to: $" +df.format(0.50*egg));}
			
		else if (egg <= 6){
				System.out.println("Price per dozen is: $0.45");
				System.out.println("The bill is equal to: $"+df.format(0.45*egg));}
			
		else if (egg <= 11){
				System.out.println("Price per dozen is: $0.40");
				System.out.println("The bill is equal to: $"+df.format(0.40*egg));}
			
		else if (egg <= 1000){
				System.out.println("Price per dozen is: $0.35");
				System.out.println("The bill is equal to: $"+df.format(0.35*egg));}
			

		
		
	}

}
