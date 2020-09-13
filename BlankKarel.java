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

		topOfBallet();
		
		goDownBallet();
	}

	private void goDownBallet() {
		// TODO Auto-generated method stub
		int i =0;
		while(notFacingSouth()) {
			turnLeft();
		}
		
		
		while(frontIsClear()) {
			if(beepersPresent()) {
				i++;
			}
			move();
		}
		if(beepersPresent()) {
			i++;
		}
		if(i == 3 || i==0) {
			while(notFacingNorth()) {
				turnLeft();
			}
			move();
		}else {
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

	private void topOfBallet() {
		// TODO Auto-generated method stub
		while(notFacingNorth()) {
			turnLeft();
		}
		while(frontIsClear()) {
			move();
			
		}
	}
}

