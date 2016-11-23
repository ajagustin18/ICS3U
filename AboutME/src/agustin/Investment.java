/**
 * 
 */
package agustin;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 22/2016
 *Investment.java
 *Investment application that calculate how many years it will take for $2500 investment to be worth at least $5000 if compounded annually at %7.5
 */
public class Investment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double investment= 2500;
		int investment2= 5000;
		int year = 1;

		
		while(investment <= investment2){
			investment = investment * 1.075;
			year = year + 1;
		}
		
		System.out.print("It will take you "+ (int) year +" year.");
		
		
	}
}