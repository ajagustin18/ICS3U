/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 1/2016
 *Grade.java
 *User percentage earned on test or other graded
 */
public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int grade;
		
		System.out.print("Enter the Percentage: ");
		grade=scan.nextInt();
		
		if (grade >= 90){
			System.out.println("The corresponding letter grade is: A");}
		
		else if (grade >= 80){
			System.out.println("The corresponding letter grade is: B");}
		
		else if (grade >= 70){
			System.out.println("The corresponding letter grade is: C");}
		
		else if (grade >= 60){
			System.out.println("The corresponding letter grade is: D");}
		
		else
			System.out.println("The corresponding letter grade is: F");
		
		
	}

}
