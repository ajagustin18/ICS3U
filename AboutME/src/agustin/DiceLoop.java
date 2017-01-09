/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 16/2016
 *DiceLoop.java
 *Modify dice roll to continue until the user wants to end.
 */
public class DiceLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		int dice1;
		int dice2;
		String question = "yes";
		
do{	
		dice1=(int)(Math.random()*6)+1;
		dice2=(int)(Math.random()*6)+1;
		
		
		if (dice1>dice2){
			System.out.println("YOU WON!!!");}
		
		else if (dice1<dice2){
			System.out.println("YOU LOSE!!!");}
		
		else if (dice1==dice2){
			System.out.println("ITS A TIE!!!");
		}
		System.out.println("Would you like to play again?");
		question=scan.nextLine();
	}while (question.equals("yes"));
		
		}
	}
	

