/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 21/2016
 *PrimeFactor.java
 *The Fundamental Theorem of Arithmetic state that every positive integers is the product of a set of prime number
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Enter Number: ");
		int userInput=scan.nextInt();
		
		int counter=2;
		while (counter <= userInput){
			if (userInput % counter == 0)
			{
				System.out.println(counter);
				userInput=(userInput/counter);
			}
			else
				counter = counter + 1;
		}
	}
}


