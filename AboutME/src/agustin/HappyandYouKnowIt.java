/**
 * 
 */
package agustin;



/**
 * @author 343784815
 *Albert Jay Agustin
 *January 9/2017
 *HappyandYouKnowIt.java
 *Write a program that prints out the lyrics to "if you're happy and you know it" with 10 verses. You should havea narray that stores 10 different actions, like "clap your hands", "stomp your feet", and so on. Then you can use a loop to print out the verses.
 */
public class HappyandYouKnowIt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] verses = new String [9];
		
		verses=new String[] {"clap your hand","stomp your feet","shake your head","touch your toe","shake your hand","do the quan","do the nea nea","do the moonwalk","do the hand worm","do the dub"};
		
		for (int i = 0; i <= verses.length - 1; i++){ 
		System.out.println("If you're happy and you know it "+ verses[i]);
		System.out.println("If you're happy and you know it "+ verses[i]);
		System.out.println("If you're happy and you know it and you really want to show it.");
		System.out.println("If you're happy and you know it "+ verses[i]);
		System.out.println();
		}
		
		
		
		
		
	}

}
