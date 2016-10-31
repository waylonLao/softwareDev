package MainCode;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class Room {
  
   private int roomID;
   private String roomDescription;
   //chances to get a monster, puzzle or item
   private int monsterChance;
   private int puzzleChance;
   private int itemChance;
   
   private int monsterID;
   private boolean quickJumpCapable;
   private boolean powered;

   //Constructor
   public Room(int roomID)
   {
       roomID = 0;
       roomDescription = "null";
       monsterChance = 0;
       puzzleChance = 0;
       itemChance = 0;
       monsterID = 0;
       quickJumpCapable = false;
       powered = false;
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
   public int getMonsterID() {
       return monsterID;
   }

   /**
    * @param monsterID the monsterID to set
    */
   public void setMonsterID(int monsterID) {
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
   
   public void showInventory()
   {
       
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
   public void populateRoom()
   {
       
   }
}