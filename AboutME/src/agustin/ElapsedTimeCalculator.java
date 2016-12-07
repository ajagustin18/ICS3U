/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 23/2016
 *ElapsedTimeCalculator.java
 *
 */
public class ElapsedTimeCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int time;
		int elapsedHour;
		int total;
		int total1;
		String amorpm;
		
		System.out.print("Enter the starting hour: ");
		time=scan.nextInt();
		
		System.out.print("Enter am or pm: ");
		amorpm=scan.next();
		
		System.out.print("Enter the number of elapsed hours: ");
		elapsedHour=scan.nextInt();
		total= time+elapsedHour;
		total1=total - 12;
		
		if (amorpm.equals("am"))
			if (total > 12){
				System.out.println("The time is: "+ total1 + ":00 pm");}
				else{
				System.out.println("The time is: "+ total + ":00 am");}
		else{
			if (total > 12){
				System.out.println("The time is: "+ total1 +":00 am");}
			else {
				System.out.println("The time is: "+ total + ":00 pm");}
		}
}
}

		

		

