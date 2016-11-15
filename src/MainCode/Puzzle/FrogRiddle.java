/**
 * Class: CommunicationsPuzzle.java
 * 
 * @author afirdaus
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2014 
 * Written: Nov 10, 2016
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */
package MainCode.Puzzles;

public class FrogRiddle extends RiddlePuzzle
{
	public FrogRiddle() 
	{
		setPuzzleID(1);
		setPuzzleDescription("A frog is at the bottom of a 30 meter"
				+ " well. Each day he summons enough energy for one"
				+ " 3 meter leap up the well. Exhausted, he then"
				+ " hangs there for the rest of the day. At night,"
				+ " while he is asleep, he slips 2 meters backwards."
				+ " How many days does it take him to escape from the well?  ");
		setPuzzleSolution("28 Days");
	}

}
