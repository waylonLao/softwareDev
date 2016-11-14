package MainCode.Rooms;

import java.io.Serializable;
import java.util.Arrays;

import MainCode.Items.Inventory;
import MainCode.Items.Item;
import MainCode.Monster.Monster;
import MainCode.Puzzles.Puzzle;

/**
 * @author Neal Klemenc
 */
public class Room{

	private int roomID;
	private String roomName;
	private String roomDescription;
	private Inventory roomInv;
	private Monster monster;
	private Puzzle puzzle;
	private boolean quickJumpCapable;
	private boolean powered;

	//Constructors
	public Room()
	{

	}
	public Room(int roomID)
	{
		roomID = 0;
		roomDescription = "null";
		monster = null;
		quickJumpCapable = false;
		powered = false;
	}

	public Room(int id, String d, Monster m, Inventory i, boolean qj, boolean p){
		roomID = id;
		roomDescription = d;
		monster = m;
		roomInv = i;
		boolean quickJumpCapable = qj;
		boolean powered = p;
	}
	/**
	 * @return the roomID
	 */
	public int getRoomID() {
		return roomID;
	}
	/**
	 * @param roomID the roomID to set
	 */
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	/**
	 * @return the roomName
	 */
	public String getRoomName() {
		return roomName;
	}
	/**
	 * @param roomName the roomName to set
	 */
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	/**
	 * @return the roomDescription
	 */
	public String getRoomDescription() {
		return roomDescription;
	}
	/**
	 * @param roomDescription the roomDescription to set
	 */
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}
	
	
	/**
	 * @return the roomInv
	 */
	public Inventory getRoomInv() {
		return roomInv;
	}
	/**
	 * @param roomInv the roomInv to set
	 */
	public void setRoomInv(Inventory roomInv) {
		this.roomInv = roomInv;
	}
	/**
	 * @return the monster
	 */
	public Monster getMonster() {
		return monster;
	}
	/**
	 * @param monster the monster to set
	 */
	public void setMonster(Monster monster) {
		this.monster = monster;
	}
	
	
	
	/**
	 * @return the puzzle
	 */
	public Puzzle getPuzzle() {
		return puzzle;
	}
	/**
	 * @param puzzle the puzzle to set
	 */
	public void setPuzzle(Puzzle puzzle) {
		this.puzzle = puzzle;
	}
	/**
	 * @return the quickJumpCapable
	 */
	public boolean isQuickJumpCapable() {
		return quickJumpCapable;
	}
	/**
	 * @param quickJumpCapable the quickJumpCapable to set
	 */
	public void setQuickJumpCapable(boolean quickJumpCapable) {
		this.quickJumpCapable = quickJumpCapable;
	}
	/**
	 * @return the powered
	 */
	public boolean isPowered() {
		return powered;
	}
	/**
	 * @param powered the powered to set
	 */
	public void setPowered(boolean powered) {
		this.powered = powered;
	}



	
	
	
	
	
}