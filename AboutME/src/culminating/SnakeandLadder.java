package culminating;

import hsa_new.Console;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 * 
 */

/**
 * @author 343784815
 *January 24/2016
 *SnakeandLadder.java
 *Albert Jay Agustin
 *This is a static game called snake and ladder and can be played by 2 player. The program will provide a board, player disk (red star for player 1)(black star for player 2), instruction and rules, and dice roll for each player.
 */
public class SnakeandLadder {
	static Console c= new Console();
	static Console b= new Console(40, 100);
	
	/**
	 *Instruction and Rules for the game
	 * 
	 */
	
	public static void InstructionsandRules() {
		 c.println("INSTRUCTION AND RULES");
		 c.println("The object of the game is to be the first player to reach the end by ");
		 c.println("moving across the board from square one to the final square.");
		 c.println();
		 c.println("To decide who goes first a coin flip will be made by the program");
		 c.println("");
		 c.println("Roll the dice and move. To take your turn, roll the die again");
		 c.println("read the number that you rolled. Pick up your game piece and");
		 c.println("move forward that number of spaces. For example, if you roll a two");
		 c.println("move your piece to square two. On your next turn, if you roll a");
		 c.println("five,move your piece forward five squares, ending up on square seven.");
		 c.println("");
		 c.clear();
		 c.println("Climb up ladders. The ladders on the game board allow you to move");
		 c.println("upwards and get ahead faster. If you land exactly on a square");
		 c.println("that shows an image of the bottom of a ladder, then you may move");
		 c.println("your game piece all the way up to the square at the top of the ladder.");
		 c.println("	If you land at the top of a ladder or somewhere in the middle of a");
		 c.println("	ladder, just stay put. You never move down ladders.");
		 c.println("");
		 c.println("");
		 c.println("");
		 c.println(""); 
		 c.println("");
		 c.println("");
		 c.println("");
		 c.println("");
		 c.println("");

	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void Players(String player1, String player2) throws InterruptedException {
		
		c.println("Hello "+ player1 +" you will be player 1 (RED STAR)");
		c.println("Hello "+ player2 +" you will be player 2 (BLACK STAR)");
		Thread.sleep(1000);
	}

	/**
	 * Dice roll picture to players to know what they rolled
	 * @param dice1
	 */
	public static void DiceROLL(int dice1){
		
		BufferedImage[] dice = new BufferedImage[5];
		
		try {
			dice[0] = ImageIO.read(new File("src/dice1.png"));
			dice[1] = ImageIO.read(new File("src/dice2.png"));
			dice[2] = ImageIO.read(new File("src/dice3.png"));
			dice[3] = ImageIO.read(new File("src/dice4.png"));
			dice[4] = ImageIO.read(new File("src/dice5.png"));
			dice[5] = ImageIO.read(new File("src/dice6.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 if (dice1==1){
			 c.drawImage (dice[0], 50, 250, 200, 200, null);
		 }
		 if (dice1==2){
			 c.drawImage (dice[1], 50, 250, 200, 200, null);
		 }
		 if (dice1==3){
			 c.drawImage (dice[2], 50, 250, 200, 200, null);
		 }
		 if (dice1==4){
			 c.drawImage (dice[3], 50, 250, 200, 200, null);
		 }
		 if (dice1==5){
			 c.drawImage (dice[4], 50, 250, 200, 200, null);
		 }
		 if (dice1==6){
			 c.drawImage (dice[5], 50, 250, 200, 200, null);
		 }
	}
	
	/**
	 * Draws board and players position in the board along with disk picture 
	 * @param player1pos
	 * @param player2pos
	 */
	public static void drawBoard(int player1pos, int player2pos){ 
		
		BufferedImage[] board = new BufferedImage[1];
		Point[] coords = {new Point(10,10), new Point(5,300), new Point(10,10)};
		
		try {
			board[0] = ImageIO.read(new File("src/snakeandladder.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedImage[] players = new BufferedImage[1];
		
		try {
			players[0] = ImageIO.read(new File("src/player1.png"));
			players[1] = ImageIO.read(new File("src/player2.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		b.drawImage (board[0], 5, 5, 800, 800, null);
		b.drawImage (players[0], (int)coords[player1pos].getX(), (int)coords[player1pos].getY(), null);
		b.drawImage (players[1], (int)coords[player2pos].getX(), (int)coords[player2pos].getY(), null);
	}
		
	/**
	 * 	If statement that determines if the player 1 his disk land on a ladder or a snake
	 * @param player1Pos
	 * @return movement1(player1Pos)
	 */
		
	public static int movement1(int player1Pos){
		
		if (player1Pos == 1){
			return 38;}
			else if (player1Pos == 4){
				return 14;
			}
			else if (player1Pos == 4){
				return 14;
			}
			else if (player1Pos == 9){
				return 31;
			}
			else if (player1Pos == 21){
				return 42;
			}
			else if (player1Pos == 28){
				return 84;
			}
			else if (player1Pos == 51){
				return 67;
			}
			else if (player1Pos == 54){
				return 34;
			}
			else if (player1Pos == 4){
				return 14;
			}
			else if (player1Pos == 62){
				return 19;
			}
			else if (player1Pos == 64){
				return 60;
			}
			else if (player1Pos == 71){
				return 91;
			}
			else if (player1Pos == 80){
				return 100;
			}
			else if (player1Pos == 87){
				return 24;
			}
			else if (player1Pos == 93){
				return 73;
			}
			else if (player1Pos == 95){
				return 75;
			}
		return movement1(player1Pos);
	}
	
	/**
	 * 	If statement that determines if the player 2 his disk land on a ladder or a snake
	 * @param player1Pos
	 * @return movement1(player1Pos)
	 */
	public static int movement2(int player2Pos){
		
		if (player2Pos == 1){
			return 38;}
			else if (player2Pos == 4){
				return 14;
			}
			else if (player2Pos == 4){
				return 14;
			}
			else if (player2Pos == 9){
				return 31;
			}
			else if (player2Pos == 21){
				return 42;
			}
			else if (player2Pos == 28){
				return 84;
			}
			else if (player2Pos == 51){
				return 67;
			}
			else if (player2Pos == 54){
				return 34;
			}
			else if (player2Pos == 4){
				return 14;
			}
			else if (player2Pos == 62){
				return 19;
			}
			else if (player2Pos == 64){
				return 60;
			}
			else if (player2Pos == 71){
				return 91;
			}
			else if (player2Pos == 80){
				return 100;
			}
			else if (player2Pos == 87){
				return 24;
			}
			else if (player2Pos == 93){
				return 73;
			}
			else if (player2Pos == 95){
				return 75;
			}
		return movement1(player2Pos);
	}
	/**
	 * 	player 1 and player 2 dice roll and where there position added to the dice roll to be printed to the board
	 * @param player1pos
	 * @param player2pos
	 * @return
	 */
	public static int playerTurn1 (int player1pos, int player2pos){
		
		int diceroll1= (int)(Math.random()*6)+1;
		int diceroll2= (int)(Math.random()*6)+1;
		
		int position1 = 0;
		int position2 = 0;
		
		position1= position1 + diceroll1;
		position2= position2 + diceroll2;
		
		
		if (movement1(player1pos)[position1]!=0){
			position1 = movement1(player1pos)[position1];
		}
		return player1pos;
		
		if (movement2(player2pos)[position2]!=0){
			position2 = movement2(player2pos)[position2];
		}
		return player2pos;
	}
		
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub


			String player1;
			String player2;
			
			
		InstructionsandRules();
			
			do{
			c.println("What is your names? (player 1 and player 2)");
			player1=c.readLine();
			player2=c.readLine();
			c.clear(); 
			
			Players(player1, player2);
			
			int player1position = 0;
			int player2position = 0;
			
			c.println("To be able to know who goes first a flip of coin will be made");
			c.println("If coin lands on HEADS "+ player1 +" goes first");
			c.println("If coin lands on TAILS "+ player2 +" goes first");
				
			
		while (player1position < 100 && player2position < 100){ 
			
			int player1pos = 0;
			int player2pos = 0;
			
			player1position= playerTurn1(player1pos, player2pos);
			drawBoard(player1pos, player2pos);

			player2position= playerTurn1(player2pos, player2pos);
			drawBoard(player1pos, player2pos);		
		
		}
			c.println("Would you like to play again?");
			
			
		} while ("yes" != null);

		
	}
	}

	

