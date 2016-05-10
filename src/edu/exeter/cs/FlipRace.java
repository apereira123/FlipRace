package edu.exeter.cs;

public class FlipRace {

	public static void main(String[] args) {
		
		Coin Andrew, Adrian;
		Andrew = new Coin();
		Adrian = new Coin();
		
		int adrianCount = 0;
		int andrewCount = 0;
		int flip = 0;
		
		while (adrianCount < 3 && andrewCount < 3) {
			Adrian.flip();
			System.out.println("Adrian flipped a " + Adrian);
			Andrew.flip();
			System.out.println("Andrew flipped a " + Andrew);
			flip++;
			if (Andrew.isHeads() == true) {
				andrewCount++;
			} else {
				andrewCount = 0;
			}
			if (Adrian.isHeads() == true) {
				adrianCount++;
			} else {
				adrianCount = 0;
			}
		}
		
		if (adrianCount == 3 && andrewCount == 3) {
			System.out.println("You both won! You made " + flip + " flips.");
		} else if (andrewCount == 3) {
			System.out.println("Andrew won! He made " + flip + " flips.");
		} else {
			System.out.println("Adrian won! He made " + flip + " flips.");
		}

	}

}
