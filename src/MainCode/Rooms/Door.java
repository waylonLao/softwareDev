package MainCode.Rooms;

import java.io.Serializable;

/**
 * @author Neal Klemenc
 */
public class Door implements Serializable{
	
	String color;
	Room connection;
	String direction;
	Boolean isLocked;

	public Door(Room r, String d) {
		connection = r;
		direction = d;
		isLocked = false;
	}
	
	public Door(Room r, String d, Boolean l, String color){
		connection = r;
		direction = d;
		isLocked = l;
		this.color = color;
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
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
