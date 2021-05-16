package com.snakeladderproblems;

public class Snakeladder {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int position=0;
				System.out.println("Player 1 is at 0 position now you can roll the die");
			int randomCheck = (int) Math.floor(Math.random() * 10) % 6+1;
				System.out.println("You got the die roll :"+ randomCheck);
			int randomPlay = (int) (Math.random() * 10) % 3;
			switch(randomPlay) {
				case 0:
					System.out.println("No play");
					position+=0;
					break;
				case 1:
					System.out.println("Ladder");
					position += randomCheck;
					break;
				case 2:
					System.out.println("Snake");
					position -= randomCheck;
					break;
				}
	}
}