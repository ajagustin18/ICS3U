/**
 * 
 */
package agustin;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *October 31/2016
 *Printing number of copies
 */
public class Printing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		int cop;
		
		System.out.print("Enter the number of copies to be printed:");
		cop=scan.nextInt();
		
		if (cop <= 99){
		System.out.println("Price per copy is: $0.30");
		System.out.println("Total Cost is:" +df.format (0.30*cop));}
		
		else if (cop <= 499){
			System.out.println("Price per copy is: $0.28");
			System.out.println("Total cost is: $"+df.format (0.28*cop));}
		
		else if (cop <= 749){
			System.out.println("Price per copy is: $0.27");
			System.out.println("Total cost is: $"+df.format (0.27*cop));}
		
		else if (cop <= 1000){
			System.out.println("Price per copy is: $0.26");
			System.out.println("Total cost is: $"+df.format (0.26*cop));}
		
		else if (cop > 1000){
			System.out.println("Price per copy is: $0.25");
			System.out.println("Total cost is: $"+df.format (0.25*cop));}
	
	}
}
		