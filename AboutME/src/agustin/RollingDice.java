/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *
 */
public class RollingDice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Dice = {0,0,0,0,0,0,0,0,0,0,0};
		
		for (int i=1; i<10000; i++)
		{
		int dice1 = (int)(Math.random()*6)+1;
		int dice2= (int)(Math.random()*6)+1;
		
		
		int totalDice= dice1+dice2;
		
		Dice[totalDice-2]=Dice[totalDice-2]+1;
	}
		System.out.println("Total     Number of Times this Happened");
		System.out.format("%2s %15s %8s","2",Dice[0],"\n");
		System.out.format("%2s %15s %8s","3",Dice[1],"\n");
		System.out.format("%2s %15s %8s","4",Dice[2],"\n");
		System.out.format("%2s %15s %8s","5",Dice[3],"\n");
		System.out.format("%2s %15s %8s","6",Dice[4],"\n");
		System.out.format("%2s %15s %8s","7",Dice[5],"\n");
		System.out.format("%2s %15s %8s","8",Dice[6],"\n");
		System.out.format("%2s %15s %8s","9",Dice[8],"\n");
		System.out.format("%2s %15s %8s","11",Dice[9],"\n");
		System.out.format("%2s %15s %8s","12",Dice[10],"\n");
	}

}
