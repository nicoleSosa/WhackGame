
/* Timer class: timer for the 30 second game*/

import processing.core.*;

public class Timer extends PApplet {
	
	//start time
	  int savedTime; 
	  
	//how long the timer should go for
	  int totalTime; 
	  
	// time remaining
	  int passedTime;

	  Timer(int time) { 
		  
	    this.totalTime = time; 
	    
	  }
	  
	  // begins the stop watch
	  void startTimer() {
		  
		//seconds 
	    this.savedTime = millis()/1000; 
	    
	  }
	  
	  // stops the timer once time is up
	  public boolean isFinished() {
		  
	    this.passedTime = (millis()/1000) - this.savedTime; 
	    
	    if (this.passedTime == this.totalTime) {
	      return true;
	    } 
	    else {
	      return false;
	    }
	    
	  }
	
	
}
