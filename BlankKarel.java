/*
 * File: BlankKarel.java
 * ---------------------
 * This class is a blank one that you can change at will.
 */

import stanford.karel.*;

public class BlankKarel extends SuperKarel {
	public void run() {
		/* You fill this in */
		int rowCount= 1;
		while(frontIsClear()) {
			if(rowCount % 2 ==0) {
				CheckBallet();
			}
			
			rowCount++;
			while(notFacingEast()) {
				turnLeft();
			}
			if(frontIsClear()) {
				move();
			}

		}

	}

	private void CheckBallet() {
		// TODO Auto-generated method stub
		
		if(beepersPresent()) {
			
		}
		else{
			while(notFacingSouth())
			{
				turnLeft();
			}
			move();
			startPickUp();
		}
			



	}

	

	private void startPickUp() {
		// TODO Auto-generated method stub
		while(notFacingNorth()) {
			turnLeft();
		}
		while(frontIsClear()) {
			while(beepersPresent()) {
				pickBeeper();
			}
			move();
		}
		while(beepersPresent()) {
			pickBeeper();
		}
		while(notFacingSouth()) {
			turnLeft();
		}
		move();
	}

	
}

