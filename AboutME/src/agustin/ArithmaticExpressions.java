package agustin;
/**
 * 
 */

/**
 * @author 343784815

 *Albert Jay Agustin
 *September 28/2016
 *ArithmaticExpressions.java
 *Arithmetic Expressions that shows and calculation the equation
 */
import java.util.Scanner;
public class ArithmaticExpressions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner (System.in);
		
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextInt();
		num4 = scan.nextInt();
		num5 = scan.nextInt();
		
		System.out.println("The Sum of Five Numbers are = "+ (num1+num2+num3+num4+num5));
		System.out.println("The Sum of the second number being subtracted from the third is = "+ (num2-num3));
		System.out.println("The Product of the First and Fifth number = "+ (num1*num5));
		System.out.println("The Quotient of the fourth number divided by the second = "+ (num4/num2));
		System.out.println("The Remainder when dividing the fourth number by the second = "+ (num4%num2));
		System.out.println("The first number raised to the power of the third number = "+ (Math.pow(num1, num3)));
		System.out.println("The square root of the fifth number = "+ (Math.sqrt(num5)));
		
		
		
		

	}

}
