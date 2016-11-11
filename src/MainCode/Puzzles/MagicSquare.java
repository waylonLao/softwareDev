/**
 * Josh Tran
 * Date: Nov 9, 2016
 */
package MainCode.Puzzles;

/**
 * @author Joshua Tran
 * Date: Nov 9, 2016
 */
public class MagicSquare extends Puzzle{
	
	public MagicSquare()
	{
		setPuzzleName("Magic Square");
		setPuzzleDescription("Fill in the blanks so that each row and column adds up to 15.\n "
				+ "------------\n" + "| 6 |   | 8 |\n" + "|   | 5 |   |\n" + "| 2 |   | 4 |\n"
				+ "------------\n" + "Insert numbers from top to bottom, left to right");
	}
	
	public static void main(String[] args)
	{
		MagicSquare ms = new MagicSquare();
		System.out.println(ms);
	}

}
