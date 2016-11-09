package MainCode.Monster;

import java.io.Serializable;

import MainCode.Items.Item;
import MainCode.Items.Weapon;
import MainCode.Rooms.Door;
import MainCode.Rooms.Room;

/**
* @author nklemenc
*/
public class Player extends Sprite {
	
	
	private Room roomID;
	
	public Player(int health, Weapon wpn) {
		super(health, wpn, "Player");
	}
	
	public void useItem(Item i){
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



	@Override
	public String toString()
	{
		return "Player [health=" + health + ", maxHealth=" + maxHealth + ", weapon=" + weapon + ", name=" + name + "]";
	}
	
	

}
