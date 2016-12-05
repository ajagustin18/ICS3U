/**
 * 
 */
package agustin;

import java.util.Scanner;

/**
 * @author 343784815
 *Albert Jay Agustin
 *November 29/2016
 *RemovingString.java
 *Removing String application that prompts the user for a sentence and a string
 */
public class RemovingString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		
		String sentence;
		String word;
		
		
		System.out.print("Enter a sentence: ");
		sentence = scan.nextLine();
		
		System.out.print("Enter a string: ");
		word= scan.nextLine();
		
		sentence = sentence.replace(word, "");
		System.out.print(sentence.trim());
		
		

	}

}
