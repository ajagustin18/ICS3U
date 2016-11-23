/**
 * 
 */
package agustin;
/**
 * @author 343784815
 *Albert Jay Agustin
 *September/16/2016
 *Order.java
 *Shows and calculate the total, before tax, and change
 */
import java.text.DecimalFormat;
/**
 * @author 343784815
 *
 */
import java.util.Scanner;
public class Order {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("0.00");
		
		double burgers;
		double fries;
		double sodas;
		double beforetax;
		double tax;
		double tendered;
		double total;

		System.out.print("Enter the number of burgers:" );
		burgers=scan.nextDouble()*1.69;
		
		System.out.print("Enter the number of fries:" );
		fries=scan.nextDouble()*1.09;
		
		System.out.print("Enter the number of sodas:" );
		sodas=scan.nextDouble()*0.99;
		
		System.out.println("Total before tax: $" + (df.format(burgers+fries+sodas)));
		beforetax=burgers+fries+sodas;
		
		System.out.println("Tax: $" + (df.format(beforetax * 0.065)));
		tax=beforetax * 0.065;
				
		System.out.println("Total: $" + (df.format(beforetax+tax)));
		total=beforetax+tax;
		
		System.out.print("Enter Amount tendered: $");
		tendered=scan.nextDouble();
		
		System.out.println("Change: $" + (df.format(tendered-total)));
		
		
		
	}

}
