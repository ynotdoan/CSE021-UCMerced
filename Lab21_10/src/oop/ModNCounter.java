package oop;


/**
 * A counter class that cycles its internal value back to 0 when it
 * reaches a maximum value. 
 * 
 * e.g., A (new) ModNCounter with a cycleLength (maximum) of 5 will,
 * when increment() is called 7 times, have an internal value of 2
 */
public class ModNCounter  extends Counter { 


	private int cycleLength; 

	public ModNCounter (int n) { 
		cycleLength = n; 
	}  

	@Override
	public void increment() { 
		if (value() < (cycleLength-1)) 
			super.increment();
		else
			reset();
		
	}
} 
