


import processing.core.*;


public class Main extends PApplet {
	
	
		// global variables 
		PImage moleImg;
		Game moleGame;
		Player player;
		int count =0;
		static Moles [] moleArray =  new Moles[9];
		

		public static void main(String[] args) {
			
			PApplet.main("Main");
			
		}
		
		public void settings() {
			
			size(500,550);
			
		}
		
		
		public void setup() {
			
			// load the image
			moleImg = loadImage("download-1.png");
			
			// create the nine moles for the game board
			createMoles();
			
			moleGame = new Game();
			player = new Player();
			
			// green background
			background(0,0,0);
			
			//title 
			fill(255);
			textSize(19);
			text("Welcome to WHACK-A-MOLE Game", 90, 150);
			text("Start", 210,300);
			
			frameRate(1);
			
			
		}
		
		public void draw() {
			
			// the board 
			displayBoard();
			
			// random mole
			int randomMole = (int)(Math.random()*9);
			
			popUp(randomMole);
			
			// checking if the game ended
			if (moleGame.gameEnd() == true) {
				noLoop();	
			}	
				
		}
		
		// showing the 9 holes 
		public void displayBoard() {
			
			background(0,290,0);
			
			// displaying the nine brown holes
			for (int y = 50; y<=350; y+=150)
			{
				for (int x = 150; x<=350; x += 100)
				{
					fill (150,75,0); 
					ellipse(x,y,50,50);
				}
			}
			
			// displaying the players score as they play
			int score = player.getScore();
			fill(0);
			textSize(30);
			text("Scores: "+ score, 180, 450);
			
			// display the time left in the 30 second game
			fill(0);
			textSize(30);
			text("Timer: "+ (29 - moleGame.getTime()),180, 480);
			
		}
		
		// displaying the image of a mole at a random mole location
		public void popUp(int i ) {
			
			// location of the random mole
			int moleX = moleArray[i].getMolesX();
			int moleY = moleArray[i].getMolesY();
			
			// displaying the mole image
			image(moleImg, moleX ,  moleY , moleImg.width/11, moleImg.height/11);
			
			// player gets one point if they clicked on the location of the mole image
			if (mousePressed && dist(pmouseX, pmouseY, moleArray[i].getMolesX(), moleArray[i].getMolesY() ) <= 450) {
				player.setScore(1);
			}
	
		}
		
		
		public void mousePressed() {
			
		}
		
		// creating the nine moles for the game each with locations from the 9 mole holes
		public void createMoles() {
			
			int y,x;
			int count = 0;
			
			for (int i = 0; i< 3; i++){
				for (int j = 0; j < 3; j++)
				{
					y = (j*150) + 25;
					x = (i*100) + 125;
					
					// instantiating each mole object
					Moles moleObj = new Moles( x, y);
					
					// adding each mole object to the mole array
					moleArray [ count ] = moleObj;
					count+=1;			
				}
			}
			
		}
	
	
	
}
