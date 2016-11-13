package MainCode.Rooms;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import MainCode.Items.Item;
import MainCode.Monster.Monster;
import MainCode.Puzzles.Puzzle;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Room implements Serializable{

	private int roomID;
	private String roomName;
	private String roomDescription;
	//chances to get a monster, puzzle or item
	private int monsterChance;
	private int puzzleChance;
	private int itemChance;
	private Item[] items;
	private Item item;
	private int numberOfExits;
	
	//ArrayLists for Room
	private ArrayList<Item> roomItemArray = null;
	private ArrayList<Monster> roomMonsterArray = null;
	private ArrayList<Puzzle> roomPuzzleArray = null;
	private ArrayList<Door> roomDoorArray = null;

	private Monster monsterID;
	private boolean quickJumpCapable;
	private boolean powered;

	//Constructors
	public Room()
	{
		roomItemArray = null;
		roomMonsterArray = null;
		roomPuzzleArray = null;
		roomDoorArray = null;
		
	}
	
	//Constructors aren't used at all/correctly. Modify or delete.
	
	/*public Room(int roomID)
	{
		this.roomID = roomID;
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
	}*/

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

	/**
	 * @return the roomMonsterArray
	 */
	public ArrayList<Monster> getRoomMonsterArray() {
		return roomMonsterArray;
	}
	/**
	 * @param roomMonsterArray the roomMonsterArray to set
	 */
	public void setRoomMonsterArray(ArrayList<Monster> roomMonsterArray) {
		this.roomMonsterArray = roomMonsterArray;
	}
	
	/**
	 * @return the roomPuzzleArray
	 */
	public ArrayList<Puzzle> getRoomPuzzleArray() {
		return roomPuzzleArray;
	}
	/**
	 * @param roomPuzzleArray the roomPuzzleArray to set
	 */
	public void setRoomPuzzleArray(ArrayList<Puzzle> roomPuzzleArray) {
		this.roomPuzzleArray = roomPuzzleArray;
	}
	//add item to room
	public void addItem(Item item)
	{
		ArrayList<Item> roomItemArray = new ArrayList<Item>();
		
		roomItemArray.add(item);
	}
	//add monster to room
	public void addMonster(Monster monster)
	{
		ArrayList<Monster> roomMonsterArray = new ArrayList<Monster>();
		roomMonsterArray.add(monster);
	}
	//add puzzle to room
	public void addPuzzle(Puzzle puzzle)
	{
		ArrayList<Puzzle> roomPuzzleArray = new ArrayList<Puzzle>();
		
		roomPuzzleArray.add(puzzle);
	}
	
	public void addDoor(Door door1)
	{
		roomDoorArray.add(door1);
	}
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

	public Item getItem()
	{
		return item;
	}
	public void setItem(Item item)
	{
		this.item = item;
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
	 * @return the roomItemArray
	 */
	public ArrayList<Item> getRoomItemArray() {
		return roomItemArray;
	}
	/**
	 * @param roomItemArray the roomItemArray to set
	 */
	public void setRoomItemArray(ArrayList<Item> roomItemArray) {
		this.roomItemArray = roomItemArray;
	}
	/**
	 * @return the roomDoorArray
	 */
	public ArrayList<Door> getRoomDoorArray() {
		return roomDoorArray;
	}
	/**
	 * @param roomDoorArray the roomDoorArray to set
	 */
	public void setRoomDoorArray(ArrayList<Door> roomDoorArray) {
		this.roomDoorArray = roomDoorArray;
	}
	/**
	 * @return the numberOfExits
	 */
	public int getNumberOfExits() {
		return numberOfExits;
	}
	/**
	 * @param numberOfExits the numberOfExits to set
	 */
	public void setNumberOfExits(int numberOfExits) {
		this.numberOfExits = numberOfExits;
	}
	@Override
	public String toString()
	{
		return roomName + roomDescription;
	}
	
	
	
	
}