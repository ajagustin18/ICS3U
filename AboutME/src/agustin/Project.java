/**
 * 
 */
package agustin;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 343784815
 *
 */
public class Project {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double designing;
		double coding;
		double debugging;
		double testing;
		double time;

		
		System.out.println("PLEASE ENTER THE AMOUNT OF HOUR YOU SPENT IN THIS AREAS");
		
		
		System.out.print("Designing: ");
		designing=scan.nextDouble();
		
		System.out.print("Coding: ");
		coding=scan.nextDouble();
		
		System.out.print("Debugging: ");
		debugging=scan.nextDouble();
		
		System.out.print("Testing: ");
		testing=scan.nextDouble();
		
		time=designing+coding+debugging+testing;
	
		System.out.format("%0s %15s", "Task" , "% Time\n");
		
		System.out.format("%5s", "Designing:   %" + df.format((designing/time)*100));
		System.out.format("\n");
		System.out.format("%5s", "Coding:      %" + df.format((coding/time)*100));
		System.out.format("\n");
		System.out.format("%5s", "Debugging:   %" + df.format((debugging/time)*100));
		System.out.format("\n");
		System.out.format("%5s", "Testing:     %" + df.format((testing/time)*100));
		
	}

}
