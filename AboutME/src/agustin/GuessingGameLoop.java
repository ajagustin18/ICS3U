/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 22/2016
 *GuessingGameLoop.java
 *modified guessing game for as many guesses as necessary to guess the secret number
 */
public class GuessingGameLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int num1;
		int rom1;
		do{
		System.out.print("Enter a number between 1 to 20: ");
		num1=scan.nextInt();
		rom1=(int)(Math.random()*20)+1;

		if (num1==rom1){
			System.out.println("YOU WON!!!");}
		
		else if (num1!=rom1)
			System.out.println("Better luck next Time.");
		}while (num1 != rom1);
	}
}

