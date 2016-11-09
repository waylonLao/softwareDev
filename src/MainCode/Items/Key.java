package MainCode.Items;

import MainCode.Rooms.Door;

public class Key extends Item {
	
	private Door keyTo;

	public Key(String name, String description, String use, Door k) {
		super(name, description, use);
		keyTo = k;
	}

	/**
	 * @return the keyTo
	 */
	public Door getKeyTo() {
		return keyTo;
	}

	/**
	 * @param keyTo the keyTo to set
	 */
	public void setKeyTo(Door keyTo) {
		this.keyTo = keyTo;
	}
	
	public String itemFunction(Door d){
		if(keyTo == d){
			d.setIsLocked(false);
			return "The door to the " + d.getConnection().getRoomName() + " can now be reached";
		}
		return "That wont work here";
	}

}
