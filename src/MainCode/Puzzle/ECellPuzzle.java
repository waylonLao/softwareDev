/**
 * Josh Tran
 * Date: Nov 14, 2016
 */
package MainCode.Puzzle;
import java.io.Serializable;
import java.util.*;

import MainCode.Items.Item;
/**
 * @author Joshua Tran
 * Date: Nov 14, 2016
 */
public class ECellPuzzle extends Puzzle implements Serializable{
	

	Random rand = new Random();
	int number = rand.nextInt(20);
	
	public ECellPuzzle(Item i)
	{
		setPuzzleName("Binary Puzzle");
		setPuzzleDescription("Convert this Binary number into an Integer: " + Integer.toBinaryString(number));
		setPuzzleSolution(Integer.toString(number));
		setItemDrop(i);
		
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	public static void main(String[] args)
	{
		//ECellPuzzle testPuzzle = new ECellPuzzle();
		//System.out.println(testPuzzle);
		
	}

	@Override
	public String toString() {
		return getPuzzleName() + "\n" + getPuzzleDescription() + "\n" + getPuzzleSolution();
	}
}
