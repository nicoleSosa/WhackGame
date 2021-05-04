

	import processing.core.*;

	public class Game extends PApplet {
		
		Timer time;
		
		public Game() {
			
			this.time = new Timer(30);
			this.time.startTimer();	
			
		}
		
		public boolean gameEnd() {
			
			if (this.time.isFinished() == true) {
				return true;
			}
			else {
				return false;
			}
			
		}
		
		public void sound() {
				
		}
		
		
		
		// obtaining the time remaining in the 30 second game round
		 public int getTime() {
			 
			  return time.passedTime;
			  
		  }
		

		

}
