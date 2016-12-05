/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 20\2016
 *CountVowels.java
 *
 */
public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		String sentence;
		int vowels=0;
		
		System.out.print("Enter Text: ");
		sentence = scan.nextLine();
		
		
		for (int a = 0; a < sentence.length(); a++){
			if (sentence.charAt(a) == 'a')
				vowels++;
			else if (sentence.charAt(a) == 'e')
				vowels++;
			else if (sentence.charAt(a) == 'i')
				vowels++;
			else if (sentence.charAt(a) =='o')
				vowels++;
			else if (sentence.charAt(a) =='u')
				vowels++;
		}
			System.out.print("The number of vowels in "+ sentence +" is " + vowels);		
		}
		
			
	}


