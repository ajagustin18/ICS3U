/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 10/2016
 *GuessingGame.java
 *Number guessing game between user and computer
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int num1;
		int rom1;
		
		
		System.out.print("Enter a number between 1 to 20: ");
		num1=scan.nextInt();
		
		rom1=(int)(Math.random()*20)+1;
		
		System.out.println("Computer's Number: "+ rom1);
		System.out.println("Player's Number: "+ num1);
		
		if (num1==rom1){
			System.out.println("YOU WON!!!");}
		
		else{
			System.out.println("Better luck next Time.");}
			
		
		
		
		
	}

}
