package MainCode.Rooms;

import java.util.HashMap;
import java.util.Map;

import MainCode.Monster.Player;

public class RoomFactory {
	


	
	static Room room0 = new Room(0, "The room has 4 doors and each door has a name plate above it. To the west is a yellow door marked, to the east is a blue door both marked \"Hallway\". To the south holds a grey door labeled \"Command Center\" and to the north is a red door labeled \"Cryogenics Room\".", null, null, false, true);
	
	static Room room1 = new Room(1, "The walls are dull grey and lined with the statis units for other crew members, they too appear fine, just out. The room has 4 doors and each door has a name plate above it. To the west and east there are black doors, the west is labeled \"Engine Room\" and the east is labeled \"Ship AI\". To the north and south are red doors labeled \"Cryogenics Room\"", null, null, false, true);
	
	static Room room2 = new Room(2,"The crew in this rooms appears to be fine as well, sleeping in their cham-bers.  ", null, null, false, true);
	
	static Room room3 = new Room(3,"The room is a dull metal grey with three doors each with a name plate.", null, null, false, true);
	
	static Room room4 = new Room(4,"The room is dull metal grey with two doors. The crew in this room appears fine", null, null, false, true);
	
	static Room room5 = new Room(5,"The room is dull metal grey with three doors. The door to the east is the same dull grey as the rest of the ship but there appears to be a window near the top.  You give the stasis chambers a quick glance to ensure the crew is fine then go to check the window. The window is small but you can just make out what appears to be a room with something in it.  As you step back your foot catches against something on the floor.  Upon inspection, you realize there is an anchor point on the floor next to the door. ", null, null, false, true);
	
	static Room room6 = new Room(6,"The room is grey with two exits.", null, null, false, true);
	
	static Room room7 = new Room(7,"The grey walls continue into this room as do the red doors.", null, null, false, true);
	
	static Room room8 = new Room(8,"The walls are grey and there are two doors.", null, null, false, true);
	
	static Room room9 = new Room(9,"Just like the other rooms it is dull gray but with a flickering overhead light.  Looking around the room the all the monitors are static except for the one in the command center which appears to be in working order.", null, null, false, true);
	
	static Room room10 = new Room(10,"Once the door is pried open the air is sucking around you pulling you to the leaking hole.  Crawling around the wall you have reached the E-Cell create.", null, null, false, true);
	
	static Room room11 = new Room(11, "Another hallway with dull gray walls", null, null, false, true);
	
	static Room room12 = new Room(12,"Like most of the hallways on the ship this is another dull gray walled room.", null, null, false, true);
	
	static Room room13 = new Room(13,"This room is abnormally dark even compared to the crippled ship.  The light blinking on the server bank are creating a dancing shadow effect, giving a serial effect.", null, null, false, true);
	
	static Room room14 = new Room(14,"You're struck by how well this room is intact and seems to be in working order.  All server banks seem to be powered on and communicating with the main system. ", null, null, false, true);
	
	static Room room15 = new Room(15,"This room largely resembles the others, with black server racks occupying most of the space.", null, null, false, true);
	
	static Room room16 = new Room(16,"Besides the usual grey, the walls of this room are lined with blade servers, most of which remain relatively unscathed.", null, null, false, true);
	
	static Room room17 = new Room(17,"These hallways all look the same, with the only indication that you've moved being the signs on the floor. That, and the fact that this room is just as cold as the cryogenic rooms.", null, null, false, true);
	
	static Room room18 = new Room(18,"The walls of this hallway are a uniform grey throughout. Only about a quar-ter of the lights are working, so it is fairly dark.", null, null, false, true);
	
	static Room room19 = new Room(19,"When you enter, the room is lit only by back power making it very dim.", null, null, false, true);
	
	static Room room20 = new Room(20, "The hallway towards Communications is long, and includes two sections the walls are a neutral grey color, with the outlines of wall panels visible in some places.", null, null, false, true);
	
	static Room room21 = new Room(21,"The second section of the hallway towards the com room seems identical to the first.", null, null, false, true);
	
	static Room room22 = new Room(22,"This room is a uniform drab grey like the others. A few computer terminals with blinking lights populate the otherwise sparsely furnished room.", null, null, false, true);
	
	static Room room23 = new Room(23,"The walls in this room are formed by dark paneling, but the lights are almost bright enough to hurt your eyes. There are quite a few terminals in this room as well, with a large table in the center which projects various holographic images above it. The panels cover every inch of the interior, with the excep-tion of the western wall, which is a large window.", null, null, false, true);
	
	static Room room24 = new Room(24,"This is a dull grey room lined with empty cargo crates. There are two doors in this room, one yellow door to the north and a black door to the east.", null, null, false, true);
	
	static Room room25 = new Room(25,"This is a large grey room with multiple exits. There is a large Ion Thruster in the middle of the room. The Ion thruster is not powered on, and all indicator gauges show that there is not enough impulse power to provide sufficient propulsion for escape. Damage to the thruster and missing e-cells are prohib-iting the engine from powering up.", null, null, false, true);
	
	static Room room26 = new Room(26,"This is a dull grey room with empty shelves.", null, null, false, true);
	
	static Room room27 = new Room(27,"This is a dull grey room with six empty Energy Cell crates and one locked energy crate.", null, null, false, true);
	
	static Room room28 = new Room(28,"This room has panoramic viewing windows, the length of the room. Through these windows one can see our indigenous galaxy.", null, null, false, true);
	
	static Room room29 = new Room(29,"This a dull grey room. This room has panoramic windows but the ships win-dow shutters are closed.", null, null, false, true);
	
	static Room room30 = new Room(30,"There is only one way in and one way out in this room. There is an elaborate navigation control panel. Some of the gauges are damaged but overall the navigation controls appear to be fully functional.", null, null, false, true);
	
	static Room room31 = new Room(31,"You can barely see through the darkness to find the terminal to plug in the E-cell.", null, null, false, true);
	
	
	
	static Door[] room0Doors = {new Door(room1, "north"), new Door(room19, "south", true), new Door(room11, "east"), new Door(room20, "west")};
	static Door[] room1Doors = {new Door(room2, "north"), new Door(room0, "south"), new Door(room31, "east"), new Door(room25, "west")};
	static Door[] room2Doors = {new Door(room3, "north"), new Door(room1, "south"), new Door(room31, "east"), new Door(room25, "west")};
	static Door[] room3Doors = {new Door(room4, "north"), new Door(room2, "south"), new Door(room18, "east"), new Door(null, "west")};
	static Door[] room4Doors = {new Door(room5, "north"), new Door(room3, "south"), new Door(null, "east"), new Door(null, "west")};
	static Door[] room5Doors = {new Door(room6, "north"), new Door(room4, "south"), new Door(room10, "east"), new Door(null, "west")};
	static Door[] room6Doors = {new Door(null, "north"), new Door(room5, "south"), new Door(room7, "east"), new Door(null, "west")};
	static Door[] room7Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room8, "east"), new Door(room7, "west")};
	static Door[] room8Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room9, "east"), new Door(room7, "west")};
	static Door[] room9Doors = {new Door(null, "north"), new Door(null, "south"), new Door(null, "east"), new Door(room8, "west")};
	static Door[] room10Doors = {new Door(null, "north"), new Door(room17, "south"), new Door(null, "east"), new Door(room5, "west")};
	static Door[] room11Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room12, "east"), new Door(room0, "west")};
	static Door[] room12Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room13, "east"), new Door(room11, "west")};
	static Door[] room13Doors = {new Door(room14, "north"), new Door(null, "south"), new Door(null, "east"), new Door(room12, "west")};
	static Door[] room14Doors = {new Door(room15, "north"), new Door(room13, "south"), new Door(null, "east"), new Door(room31, "west")};
	static Door[] room15Doors = {new Door(room16, "north"), new Door(room14, "south"), new Door(null, "east"), new Door(room31, "west")};
	static Door[] room16Doors = {new Door(null, "north"), new Door(room15, "south"), new Door(null, "east"), new Door(room17, "west")};
	static Door[] room17Doors = {new Door(room10, "north"), new Door(null, "south"), new Door(room16, "east"), new Door(room18, "west")};
	static Door[] room18Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room17, "east"), new Door(room3, "west")};
	static Door[] room19Doors = {new Door(room0, "north"), new Door(null, "south"), new Door(null, "east"), new Door(null, "west")};
	static Door[] room20Doors = {new Door(room25, "north"), new Door(null, "south"), new Door(room0, "east"), new Door(room21, "west")};
	static Door[] room21Doors = {new Door(room25, "north"), new Door(null, "south"), new Door(room20, "east"), new Door(room22, "west")};
	static Door[] room22Doors = {new Door(room23, "north"), new Door(null, "south"), new Door(room21, "east"), new Door(null, "west")};
	static Door[] room23Doors = {new Door(room24, "north"), new Door(room22, "south"), new Door(room25, "east"), new Door(null, "west")};
	static Door[] room24Doors = {new Door(room26, "north"), new Door(room23, "south"), new Door(room25, "east"), new Door(null, "west")};
	static Door[] room25Doors = {new Door(room2, "northeast"), new Door(room1, "southeast"), new Door(room24, "northwest"), new Door(room23, "southwest")};
	static Door[] room26Doors = {new Door(room27, "north"), new Door(room24, "south"), new Door(null, "east"), new Door(null, "west")};
	static Door[] room27Doors = {new Door(room28, "north"), new Door(room26, "south"), new Door(null, "east"), new Door(null, "west")};
	static Door[] room28Doors = {new Door(room29, "north"), new Door(room27, "south"), new Door(null, "east"), new Door(null, "west")};
	static Door[] room29Doors = {new Door(room30, "north"), new Door(room28, "south"), new Door(null, "east"), new Door(null, "west")};
	static Door[] room30Doors = {new Door(null, "north"), new Door(room29, "south"), new Door(null, "east"), new Door(null, "west")};
	static Door[] room31Doors = {new Door(room15, "northeast"), new Door(room14, "southeast"), new Door(room2, "northwest"), new Door(room1, "southwest")};
	
	
	public static Map<Room, Door[]> myMap = new HashMap<Room, Door[]>()
	{
	    {
	        put(room0, room0Doors);
	        put(room1, room1Doors);
	        put(room2, room2Doors);
	        put(room3, room3Doors);
	        put(room4, room4Doors);
	        put(room5, room5Doors);
	        put(room6, room6Doors);
	        put(room7, room7Doors);
	        put(room8, room8Doors);
	        put(room9, room9Doors);
	        put(room10, room10Doors);
	        put(room11, room11Doors);
	        put(room12, room12Doors);
	        put(room13, room13Doors);
	        put(room14, room14Doors);
	        put(room15, room15Doors);
	        put(room16, room16Doors);
	        put(room17, room17Doors);
	        put(room18, room18Doors);
	        put(room19, room19Doors);
	        put(room20, room20Doors);
	        put(room21, room21Doors);
	        put(room22, room22Doors);
	        put(room23, room23Doors);
	        put(room24, room24Doors);
	        put(room25, room25Doors);
	        put(room26, room26Doors);
	        put(room27, room27Doors);
	        put(room28, room28Doors);
	        put(room29, room29Doors);
	        put(room30, room30Doors);
	        put(room31, room31Doors);
	    }
	};
	
	
	public static void main(String[]args){
		if(myMap.get(room0)[1].getIsLocked() == true)
		System.out.println("Door Locked");
		else
			System.out.println("Door not locked");
		
		
		System.out.println("Unlocking Doors");
		
		myMap.get(room0)[1].setIsLocked(false);
		
		
		if(myMap.get(room0)[1].getIsLocked() == true)
			System.out.println("Door Locked");
			else
				System.out.println("Door not locked");
	}
	
}
