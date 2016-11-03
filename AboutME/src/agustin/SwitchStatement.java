/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 3/2016
 *SwitchStatement.java
 *Determining which day of the week it is and print it out
 */
public class SwitchStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		int day;
		String dayString= null;
		
		System.out.print("Enter a day of a week: ");
		day=scan.nextInt();
		
		switch (day)
		{
		case 1: dayString = "Monday";
			break;
		case 2: dayString = "Tuesday";
			break;
		case 3: dayString = "Wednesday";
			break;
		case 4: dayString = "Thursday";
			break;
		case 5: dayString = "Friday";
			break;
		case 6: dayString = "Saturday";
			break;
		case 7: dayString = "Sunday";
			break;
		default: dayString = " An Invalid Day";
		}
		if (day <= 1){
			System.out.println("The "+ day +"st of the week is "+ dayString);}
		else if (day <= 2){
			System.out.println("The "+ day +"nd of the week is "+ dayString);}
		else if (day <= 3){
			System.out.println("The "+ day +"rd of the week is "+ dayString);}
		else {
			System.out.println("The "+ day +"th of the week is "+ dayString);}
	}

}
