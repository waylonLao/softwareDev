package MainCode.Monster;

import java.io.Serializable;

import MainCode.Items.Item;
import MainCode.Items.Weapon;
import MainCode.Puzzle.Puzzle;
import MainCode.Rooms.Door;
import MainCode.Rooms.Room;

/**
* @author nklemenc
*/
public class Player extends Sprite implements Serializable{
	
	
	private Room roomID;
	
	public Player(int health, Weapon wpn, Room r) {
		super(health, wpn, "Player");
		roomID = r;
	}
	
	public Player() {
		super();
	}

	public void useItem(Item i){
	}
	

	
	public String move(Door d){
		if(d.getConnection() == null){
			return "You can't go that way.";
		}
		else if(d.getIsLocked()){
			return "The door is locked shut.";
		}
		this.setRoomID(d.getConnection());
		return d.getConnection().getRoomName() + "\n\n" + d.getConnection().getRoomDescription();
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
	
	
	public String takeItem(Item i){
		if(this.getSpriteInv().getItemList().contains(i)){
			return "You cant carry any more of those";
		}
		this.getSpriteInv().addItem(i);
		return "You take the " + i.getItemName();
	}
	
	public String dropItem(Item i){
		this.getRoomID().getRoomInv().addItem(i);
		this.getSpriteInv().removeItem(i);
		return "You drop the " + i.getItemName();
		
	}
	
	public String doDamage(Monster target){
		target.setHealth(target.getHealth() - this.getWeapon().getWeaponDamage());
		if(target.getHealth() <= 0){
			//this.getRoomID().getRoomInv().addItem(target.getItemDrop());
			return target.getName() + " has been defeated!";
		}
		return this.getName() + " dealt " + this.getWeapon().getWeaponDamage() + " damage to the " + target.getName();
		
		
	}
	
	public String takeDamage(Monster target){
		if(target.getStunDuration() > 0){
			target.setStunDuration(target.getStunDuration() - 1);
			return target.getName() + "is stunned and cannot attack.";
		}
		
		this.setHealth(this.getHealth() - target.getWeapon().getWeaponDamage());
		if(this.getHealth() <= 0){
			return "You died.";
		}
		return target.getName() + " has dealt " + target.getWeapon().getWeaponDamage() + " damage to you ";
	}
	
	public String tryPuzzle(String s, Puzzle p){
		s.toLowerCase();
		if(!s.equals(p.getPuzzleSolution())){
			p.setRemainingTries(p.getRemainingTries() - 1);
			if(p.getRemainingTries() <= 0){
				this.setHealth(this.getHealth() - 20);
				return "You failed!";
			}
			else{
				return "Wrong answer!";
			}
		}
		return "correct!";
	}



	@Override
	public String toString()
	{
		return "Player [health=" + health + ", maxHealth=" + maxHealth + ", weapon=" + weapon + ", name=" + name + "]";
	}
	
	

}
