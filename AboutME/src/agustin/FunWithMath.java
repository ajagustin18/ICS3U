/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *January 13/2016
 *FunWithMath.java
 *Create a program that gets two numbers from the user and then adds, subtracts, multiplies and divides them. Create a method for each operator that takes the two values as parameters, calculates and prints the result on the screen
 */
 
public class FunWithMath {

	/**
	 * @param args
	 * Adding 2 numbers and printing its sum
	 */
	public static void Adding(int num1, int num2){
		
		int total;
		total=num1 + num2;
		System.out.println("The sum of "+ num1 +" + "+ num2 +" is: "+ total);	
	}
	/**
	 * @param args
	 * Subtracting 2 numbers and printing its sum
	 */
	public static void Subtracting(int num1, int num2){
		int total;
		total= num1 - num2;
		System.out.println("The sum of "+ num1 +" - "+ num2 +" is: "+ total);
		
	}
	/**
	 * @param args
	 * Multiplying 2 numbers and printing its sum
	 */
	public static void Multiplying(int num1, int num2){
		int total;
		total= num1 * num2;
		System.out.println("The sum of "+ num1 +" x "+ num2 +" is: "+ total);
	}
	/**
	 * @param args
	 * Dividing 2 numbers and printing its sum
	 */
	public static void Dividing(int num1, int num2){
		int total;
		total= num1 / num2;
		System.out.println("The sum of "+ num1 +" / "+ num2 +" is: "+ total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		
		int num1;
		int num2;
		int method = 0;

		System.out.println("Enter 1 if you want to Add 2 numbers");
		System.out.println("Enter 2 if you want to Subtract 2 numbers");
		System.out.println("Enter 3 if you want to Multiply 2 numbers");
		System.out.println("Enter 4 if you want to Divide 2 numbers");
		method=scan.nextInt();
		
		if (method==1){
			System.out.println("You choose Adding 2 numbers");
			System.out.println("Enter two number.");
			num1= scan.nextInt();
			num2= scan.nextInt();
		Adding(num1, num2);
		}
		else if (method==2) {
			System.out.println("You choose Subtracting 2 numbers");
			System.out.println("Enter two number.");
			num1= scan.nextInt();
			num2= scan.nextInt();
		Subtracting(num1, num2);
		}
		else if (method==3) {
			System.out.println("You choose Multipliying 2 numbers");
			System.out.println("Enter two number.");
			num1= scan.nextInt();
			num2= scan.nextInt();
		Multiplying(num1, num2);
		}
		else{
			System.out.println("You choose Dividing 2 numbers");
			System.out.println("Enter two number.");
			num1= scan.nextInt();
			num2= scan.nextInt();
		Dividing(num1, num2);
		}
		
		
	}

}
