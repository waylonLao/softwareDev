/**
 * Class: PuzzleFactory.java
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

import MainCode.RandomGenerator;
import MainCode.Monster.Monster;
import MainCode.Monster.MonsterFactory;

public class PuzzleFactory 
{
	static RandomGenerator rg = new RandomGenerator();
	static int randomNumber = rg.generate(100);

	public Puzzle manufacturePuzzle()
	{
		if(randomNumber <=10)
		{
		return new BinaryPuzzle();	
		}
		else if (randomNumber <20)
		{
			return new AIRiddle();
		}
		else if (randomNumber <30)
		{
			return new CoinRiddle();
		}
		else if (randomNumber <40)
		{
			return new FamilyRiddle();
		}
		else if (randomNumber <50)
		{
			return new MagicSquare();
		}
		else if (randomNumber <60)
		{
			return new StampRiddle();
		}
		else if (randomNumber <70)
		{
			return new TowelRiddle();
		}
		else if (randomNumber <100)
		{
			return new WolvesRiddle();
		}
		else 
			return null;
	}
	
	public static void main(String[] args)
	{
		Puzzle ranPuzzle = new Puzzle();
		PuzzleFactory pF = new PuzzleFactory();
		ranPuzzle = pF.manufacturePuzzle();
		System.out.println(ranPuzzle.toString());
	}
	
	
}
