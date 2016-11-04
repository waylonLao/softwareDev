package MainCode.Rooms;

import java.util.HashMap;
import java.util.Map;

import MainCode.Monster.Player;

public class RoomFactory {
	


	
	static Room room0 = new Room(0, "The room has 4 doors and each door has a name playe above it. To the west is a yellow door marked, to the east is a blue door both marked \"Hallway\". To the south holds a grey door labeled \"Command Center\" and to the north is a red door labeled \"Cryogenics Room\".", null, null, false, true);
	
	static Room room1 = new Room(1, "The walls are dull grey and lined with the statis units for other crew members, they too appear fine, just out. The room has 4 doors and each door has a name plate above it. To the west and east there are black doors, the west is labeled \"Engine Room\" and the east is labeled \"Ship AI\". To the north and south are red doors labeled \"Cryogenics Room\"", null, null, false, true);
	
	static Room room20 = new Room(2, "The hallway towards Communications is long, and includes two sections the walls are a neutral grey color, with the outlines of wall panels visible in some places.", null, null, false, true);
	
	static Room room11 = new Room(11, "Another hallway with dull gray walls", null, null, false, true);
	
	
	
	static Door[] room0Doors = {new Door(room1, "north"), new Door(room11, "east"), new Door(room20, "west")};
	
	
	public static Map<Room, Door[]> myMap = new HashMap<Room, Door[]>();
	
	public static void main(String[]args){
		myMap.put(room0, room0Doors);
		
		Player testPlayer = new Player(200, null);
		testPlayer.setRoomID(room0);
		System.out.println("TESTING: First show the description of the player's current room");
		System.out.println(testPlayer.getRoomID().getRoomDescription());
		
		
		System.out.println("\nTESTING: Next show the possible directions the player can move");
		
		for(int i = 0; i < myMap.get(testPlayer.getRoomID()).length; i++){
			System.out.println(myMap.get(testPlayer.getRoomID())[i].direction);
		}
		
		
		System.out.println("\nTESTING: Finally move the player to the northern room and show the new description");
		testPlayer.setRoomID(myMap.get(testPlayer.getRoomID())[0].connection);
		
		System.out.println(testPlayer.getRoomID().getRoomDescription());
	}
	



	
	
	
	
}
