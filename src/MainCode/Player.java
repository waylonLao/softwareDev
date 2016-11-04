package MainCode;
/**
* @author nklemenc
*/
public class Player extends Sprite {
	
	public int sparkleCounter = 0;
	
	private Room roomID;
	
	public Player(int health, Weapon weaponID) {
		super(health, weaponID, "Player");
		setSparkleCounter(0);
	}
	
	public void useItem(){
		//TODO use item and update inventory
	}
	
	public void equipItem(){
		//TODO update weaponID
	}
	
	

	/**
	 * @return the roomID
	 */
	public Room getRoomID() {
		return roomID;
	}

	/**
	 * @param roomID the roomID to set
	 */
	public void setRoomID(Room roomID) {
		this.roomID = roomID;
	}

	/**
	 * @return the sparkleCounter
	 */
	public int getSparkleCounter() {
		return sparkleCounter;
	}

	/**
	 * @param sparkleCounter the sparkleCounter to set
	 */
	public void setSparkleCounter(int sparkleCounter) {
		this.sparkleCounter = sparkleCounter;
	}

}
