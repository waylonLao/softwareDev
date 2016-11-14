package MainCode.Rooms;

/**
 * @author Neal Klemenc
 */
public class Door {
	
	Room connection;
	String direction;
	Boolean isLocked;

	public Door(Room r, String d) {
		connection = r;
		direction = d;
		isLocked = false;
	}
	
	public Door(Room r, String d, Boolean l){
		connection = r;
		direction = d;
		isLocked = l;
	}

	/**
	 * @return the connection
	 */
	public Room getConnection() {
		return connection;
	}

	/**
	 * @param connection the connection to set
	 */
	public void setConnection(Room connection) {
		this.connection = connection;
	}

	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the isLocked
	 */
	public Boolean getIsLocked() {
		return isLocked;
	}

	/**
	 * @param isLocked the isLocked to set
	 */
	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}
	
	
	
	

}
