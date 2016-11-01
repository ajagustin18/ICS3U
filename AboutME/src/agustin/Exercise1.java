/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *October 31/2016
 *Divisibleby7.java
 *Positive, Negative and Divisible by 7
 */
public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		double num;
		
		System.out.print("What is the number = ");
		num= scan.nextDouble();
		
		if (num < 0){
			System.out.println("Your Number is a Negative");}
		
		else {
			System.out.println("Your Number is a Positive");}
		
		if (num % 7 == 0){
			System.out.println("Your Number is Divisible by 7");}
		
		else{
			System.out.println("Your Number is NOT Divisible by 7");}
	}
}