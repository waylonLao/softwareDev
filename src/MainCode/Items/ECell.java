package MainCode.Items;

import java.io.Serializable;

import MainCode.Rooms.Room;

public class ECell extends Item implements Serializable{

	public ECell() {
		// TODO Auto-generated constructor stub
	}

	public ECell(String name, String description, String use) {
		super(name, description, use);
		// TODO Auto-generated constructor stub
	}
	
	public String itemFunction(Room r){
		
		r.setPowered(true);
		return r.getRoomName() + " is now online.";
	}

}
