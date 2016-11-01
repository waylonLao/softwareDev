package MainCode;
/**
* @author nklemenc
*/
public class Player extends Sprite {
	
	public final int sparkleCounter = 0;
	
	public Player(int health, Weapon weaponID) {
		super(health, weaponID, "Player");
		setSparkleCounter(0);
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
