/**
 * 
 */
package agustin;

import java.text.DecimalFormat;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 10/2016
 *RandomGenerator.java
 *
 */
public class RandomGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat ("0.00");
		
		final double X5;
		final double X6;
		final double X7;
		final double X8;
		final double X9;
		final double X10;
		final double X11;
		final double X12;
		final double X13;
		final double X14;
		
		final double a=1246.9898;
		final double c=200.5457646;
		final double m=50.324253214;
		final int seed=12;
		
		
		
		X5= (a * seed + c) % m;
		X6= (a * X5 + c) % m;
		X7= (a * X6 + c) % m;
		X8= (a * X7 + c) % m;
		X9= (a * X8 + c) % m;
		X10= (a * X9 + c) % m;
		X11= (a * X10 + c) % m;
		X12= (a * X11 + c) % m;
		X13= (a * X12 + c) % m;
		X14= (a * X13 + c) % m;
		
		System.out.println(df.format(X5));
		System.out.println(df.format(X6));
		System.out.println(df.format(X7));
		System.out.println(df.format(X8));
		System.out.println(df.format(X9));
		System.out.println(df.format(X10));
		System.out.println(df.format(X11));
		System.out.println(df.format(X12));
		System.out.println(df.format(X13));
		System.out.println(df.format(X14));
	}

}
