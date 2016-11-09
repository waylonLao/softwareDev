package MainCode.Puzzles;

public class Puzzle {
	
	private int puzzleID;
	private String puzzleName;
	private String puzzleSolution;
	private String puzzleDescription;
	
	
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
	
	public void giveUp(){
		
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
	 * @return the puzzleID
	 */
	public int getPuzzleID() {
		return puzzleID;
	}
	/**
	 * @param puzzleID the puzzleID to set
	 */
	public void setPuzzleID(int puzzleID) {
		this.puzzleID = puzzleID;
	}
	
}
