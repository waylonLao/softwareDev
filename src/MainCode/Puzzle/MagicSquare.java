/**
 * Josh Tran
 * Date: Nov 14, 2016
 */
package MainCode.Puzzle;

/**
 * @author Joshua Tran
 * Date: Nov 14, 2016
 */
public class MagicSquare extends Puzzle{
	
	public MagicSquare()
	{
		setPuzzleName("Magic Square");
		setPuzzleDescription("6 _ 8 "
				+ "\n_ 5 _ "
				+ "\n2 _ 4"
				+ "\n\nFill in puzzle so that each row and column add up to 15. You may not reuse any number. Use commas to separate numbers");
		setPuzzleSolution("1,7,3,9");
	}
	
	

}
