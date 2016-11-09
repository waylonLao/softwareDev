package MainCode.Monster;

import java.io.Serializable;

import MainCode.Items.Weapon;
import MainCode.Rooms.Door;
import MainCode.Rooms.Room;

/**
* @author nklemenc
*/
public class Player extends Sprite implements Serializable {
	
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
	
	public String move(Door d){
		if(d.getIsLocked()){
			return "The door is locked shut.";
		}
		this.setRoomID(d.getConnection());
		return d.getConnection().getRoomDescription();
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

	@Override
	public String toString()
	{
		return "Player [health=" + health + ", maxHealth=" + maxHealth + ", weapon=" + weapon + ", name=" + name + "]";
	}
	
	

}
