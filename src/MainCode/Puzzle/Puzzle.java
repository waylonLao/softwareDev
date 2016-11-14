package MainCode.Puzzle;

import MainCode.Items.Item;

/**
 * @author Neal Klemenc
 */
public class Puzzle {
	
	private String puzzleName;
	private String puzzleSolution;
	private String puzzleDescription;
	private Item itemDrop;
	private int remainingTries;
	
	
	public Puzzle(String n, String s, String d, Item i){
		puzzleName = n;
		puzzleSolution = s;
		puzzleDescription = d;
		itemDrop = i;
		remainingTries = 3;
	}


	/**
	 * @return the puzzleName
	 */
	public String getPuzzleName() {
		return puzzleName;
	}


	/**
	 * @param puzzleName the puzzleName to set
	 */
	public void setPuzzleName(String puzzleName) {
		this.puzzleName = puzzleName;
	}


	/**
	 * @return the puzzleSolution
	 */
	public String getPuzzleSolution() {
		return puzzleSolution;
	}


	/**
	 * @param puzzleSolution the puzzleSolution to set
	 */
	public void setPuzzleSolution(String puzzleSolution) {
		this.puzzleSolution = puzzleSolution;
	}


	/**
	 * @return the puzzleDescription
	 */
	public String getPuzzleDescription() {
		return puzzleDescription;
	}


	/**
	 * @param puzzleDescription the puzzleDescription to set
	 */
	public void setPuzzleDescription(String puzzleDescription) {
		this.puzzleDescription = puzzleDescription;
	}


	
	
	
	/**
	 * @return the itemDrop
	 */
	public Item getItemDrop() {
		return itemDrop;
	}


	/**
	 * @param itemDrop the itemDrop to set
	 */
	public void setItemDrop(Item itemDrop) {
		this.itemDrop = itemDrop;
	}


	/**
	 * @return the remainingTries
	 */
	public int getRemainingTries() {
		return remainingTries;
	}


	/**
	 * @param remainingTries the remainingTries to set
	 */
	public void setRemainingTries(int remainingTries) {
		this.remainingTries = remainingTries;
	}
	
	
	
}
