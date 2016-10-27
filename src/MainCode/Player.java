package MainCode;
/**
* @author nklemenc
*/
public class Player extends Sprite {
	
	public Player(int health, Weapon weaponID) {
		super(health, weaponID, "Player");
		// TODO Auto-generated constructor stub
	}

	private int roomID;
	
	public void useItem(){
		//TODO use item and update inventory
	}
	
	public void equipItem(){
		//TODO update weaponID
	}
	
	public void move(){
		//TODO move player to different room
	}

}
