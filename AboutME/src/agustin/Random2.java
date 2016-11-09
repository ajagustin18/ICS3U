/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 9/2016
 *Random2.java
 *Simulates rolling two dice twice, first for the user, and then for the computer. Then announce who won: the user, the computer, or say it was a tie.
 */
public class Random2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int die1;
		int die2;
		
		
		die1=(int)(Math.random()*6)+1;
		die2=(int)(Math.random()*6)+1;
		
		if (die1>die2){
			System.out.println("YOU WON!!!");}
		
		else if (die1<die2){
			System.out.println("YOU LOSE!!!");}
		
		else if (die1==die2){
			System.out.println("ITS A TIE!!!");}
		
	}

}
