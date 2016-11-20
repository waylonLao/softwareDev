package MainCode.Items;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import MainCode.Rooms.Door;
import MainCode.Rooms.Door.doorType;

/**
 * @author Neal Klemenc
 */
public class Key extends Item implements Serializable{
	
	
	private List<Door> keyTo = new ArrayList<Door>();
	private Door.doorType doorType;

	public Key(String name, String description, String use, List<Door> list) {
		super(name, description, use);
		keyTo = list;
	}

	public Key(String name, String description, String use, doorType color)
	{
		super(name, description, use);
		doorType = color;
	}

	/**
	 * @return the keyTo
	 */
	public List<Door> getKeyTo() {
		return keyTo;
	}

	/**
	 * @param keyTo the keyTo to set
	 */
	public void setKeyTo(ArrayList<Door> keyTo) {
		this.keyTo = keyTo;
	}
	
	public String itemFunction(Door d){
		if(keyTo.contains(d) || (d.getColor() != null && d.getColor().equals(doorType))){
			d.setIsLocked(false);
			return "The door to the " + d.getConnection().getRoomName() + " can now be reached";
		}
		return "That wont work here";
	}

}
