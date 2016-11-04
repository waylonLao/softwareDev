package MainCode.Rooms;

public class Door {
	
	Room connection;
	String direction;

	public Door(Room r, String d) {
		connection = r;
		direction = d;
	}

}
