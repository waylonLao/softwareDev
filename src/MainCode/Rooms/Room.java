package MainCode.Rooms;

import java.io.Serializable;
import java.util.Arrays;

import MainCode.Items.Item;
import MainCode.Monster.Monster;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Room implements Serializable{

	private int roomID;
	private String roomDescription;
	//chances to get a monster, puzzle or item
	private int monsterChance;
	private int puzzleChance;
	private int itemChance;
	private Item[] items;
	private Item item;

	private Monster monsterID;
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
		monsterChance = 0;
		puzzleChance = 0;
		itemChance = 0;
		monsterID = null;
		quickJumpCapable = false;
		powered = false;
	}

	public Room(int id, String d, Item i, Monster m, boolean qj, boolean p){
		roomID = id;
		roomDescription = d;
		setItem(i);
		monsterID = m;
		boolean quickJumpCapable = qj;
		boolean powered = p;
	}

	public Room(int id, String d, Item[] i, Monster m, boolean qj, boolean p){
		roomID = id;
		roomDescription = d;
		items = i;
		monsterID = m;
		boolean quickJumpCapable = qj;
		boolean powered = p;
	}

	//Getters and Setters
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
	 * @return the monsterChance
	 */
	public int getMonsterChance() {
		return monsterChance;
	}

	/**
	 * @param monsterChance the monsterChance to set
	 */
	public void setMonsterChance(int monsterChance) {
		this.monsterChance = monsterChance;
	}

	/**
	 * @return the puzzleChance
	 */
	public int getPuzzleChance() {
		return puzzleChance;
	}

	/**
	 * @param puzzleChance the puzzleChance to set
	 */
	public void setPuzzleChance(int puzzleChance) {
		this.puzzleChance = puzzleChance;
	}

	/**
	 * @return the itemChance
	 */
	public int getItemChance() {
		return itemChance;
	}

	/**
	 * @param itemChance the itemChance to set
	 */
	public void setItemChance(int itemChance) {
		this.itemChance = itemChance;
	}

	/**
	 * @return the monsterID
	 */
	public Monster getMonsterID() {
		return monsterID;
	}

	/**
	 * @param monsterID the monsterID to set
	 */
	public void setMonsterID(Monster monsterID) {
		this.monsterID = monsterID;
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

	//Methods

	public void quickJump()
	{

	}
	public void exploreRoom()
	{

	}
	public void pickUpItem()
	{

	}
	public void move()
	{

	}
	public void populateRoom()
	{

	}
	public Item getItem()
	{
		return item;
	}
	public void setItem(Item item)
	{
		this.item = item;
	}
	@Override
	public String toString()
	{
		return "Room [roomID=" + roomID + ", roomDescription=" + roomDescription + ", monsterChance=" + monsterChance
				+ ", puzzleChance=" + puzzleChance + ", itemChance=" + itemChance + ", items=" + Arrays.toString(items)
				+ ", item=" + item + ", monsterID=" + monsterID + ", quickJumpCapable=" + quickJumpCapable
				+ ", powered=" + powered + "]";
	}
	
	
	
	
}