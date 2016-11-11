package MainCode.Rooms;

import java.util.ArrayList;

public class RoomArray {
	
	private ArrayList<Room> roomArray;
	
	public RoomArray()
	{
		CryoRoom cryoRoom1 = new CryoRoom(0);
		CryoRoom cryoRoom2 = new CryoRoom(1);
		CryoRoom cryoRoom3 = new CryoRoom(2);
		CryoRoom cryoRoom4 = new CryoRoom(3);
		CryoRoom cryoRoom5 = new CryoRoom(4);
		
		roomArray.add(cryoRoom1);
		roomArray.add(cryoRoom2);
		roomArray.add(cryoRoom3);
		roomArray.add(cryoRoom4);
		roomArray.add(cryoRoom5);
	}

	public ArrayList<Room> getRoomArray() {
		return roomArray;
	}

	public void setRoomArray(ArrayList<Room> roomArray) {
		this.roomArray = roomArray;
	}

	
	@Override
	public String toString() {
		return "RoomArray [roomArray=" + roomArray + "]";
	}

	public static void main(String[] args)
	{
		ArrayList<Room> roomArray = new ArrayList<Room>();
		
		CryoRoom cryoRoom1 = new CryoRoom(0);
		CryoRoom cryoRoom2 = new CryoRoom(1);
		CryoRoom cryoRoom3 = new CryoRoom(2);
		CryoRoom cryoRoom4 = new CryoRoom(3);
		CryoRoom cryoRoom5 = new CryoRoom(4);
		
		roomArray.add(cryoRoom1);
		roomArray.add(cryoRoom2);
		roomArray.add(cryoRoom3);
		roomArray.add(cryoRoom4);
		roomArray.add(cryoRoom5);
		
		System.out.println(roomArray);
	}
}
