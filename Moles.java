
/* Moles class: tracking the location of each Moles object */

import processing.core.*;

public class Moles extends PApplet{

	//  moles x and y coordinate location
		private int molesX;
		private int molesY;

		public Moles(int x, int y) { 
			this.molesX = x;
			this.molesY = y;
		}
		
		// retrieves mole x coordinate location
		public int getMolesX(){
			return this.molesX;	
		}
		
		// retrieves mole y coordinate location
		public int getMolesY() {
			return this.molesY;
		}
		
		
}