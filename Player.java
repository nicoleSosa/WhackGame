/* Player class: obtaining scores of the player */

import processing.core.*;

public class Player extends PApplet{

	private int scores;
	
	// the player scores will always start at 0
	public Player() {
		
		this.scores = 0;
		
	}
	
	// retrieving player's score
	public int getScore () {
		
		return this.scores;
		
	}
	
	// adds points to the player score
	public void setScore( int points) {
		
		 this.scores+= points;	
		 
	}
	
	
}
