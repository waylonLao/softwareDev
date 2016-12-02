package MainCode.Rooms;

import java.util.ArrayList;

public class RoomFactory {
	
	ArrayList<Room> rooms = new ArrayList<Room>();
	ArrayList<Door[]> doors = new ArrayList<Door[]>();

	public RoomFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Room> newRooms(){
		//Instantiate Rooms
		
		//Cryo Room
		Room room0 = new Room(0,"Cryo Room","The room has 4 doors and each door has a name plate above it. "
				+ "To the west is a yellow door marked, to the east is a blue door both marked \"Hallway\". To the "
				+ "south holds a grey door labeled \"Command Center\" and to the north is a red door labeled \"Cryogenics Room\"."
				, null, null, false, true, null);
		
		//Cryo Room 1
		Room room1 = new Room(1,"Cryo Room 1","The walls are dull grey and lined with the statis units for other crew "
				+ "members, they too appear fine, just out. The room has 4 doors and each door has a name plate above it. To "
				+ "the west and east there are black doors, the west is labeled \"Engine Room\" and the east is labeled \"Ship AI\"."
				+ " To the north and south are red doors labeled \"Cryogenics Room\""
				, null, null, false, true, null);
		
		//Cryo Room 2
		 Room room2 = new Room(2,"Cryo Room 2","The crew in this rooms appears to be fine as well, sleeping in their cham-bers."
				, null, null, false, true, null);
		
		//Cryo Room 3
		 Room room3 = new Room(3,"Cryo Room 3","The room is a dull metal grey with three doors each with a name plate."
				, null, null, false, true, null);
		
		//Cryo Room 4
		 Room room4 = new Room(4,"Cryo Room 4","The room is dull metal grey with two doors. The crew in this room appears fine"
				, null, null, false, true, null);
		
		//Cryo Room 5
		 Room room5 = new Room(5,"Cryo Room 5","The room is dull metal grey with three doors. The door to the east is the same "
				+ "dull grey as the rest of the ship but there appears to be a window near the top.  You give the stasis chambers a "
				+ "quick glance to ensure the crew is fine then go to check the window. The window is small but you can just make out"
				+ " what appears to be a room with something in it.  As you step back your foot catches against something on the floor.  "
				+ "Upon inspection, you realize there is an anchor point on the floor next to the door. "
				, null, null, false, true, null);
		
		//Hallway
		 Room room6 = new Room(6,"Hallway","The room is grey with two exits."
				, null, null, false, true, null);
		
		//Hallway 1
		 Room room7 = new Room(7,"Hallway 1","The grey walls continue into this room as do the red doors."
				, null, null, false, true, null);
		
		//Hallway 2
		 Room room8 = new Room(8,"Hallway 2","The walls are grey and there are two doors."
				, null, null, false, true, null);
		
		//Security
		 Room room9 = new Room(9,"Security","Just like the other rooms it is dull gray but with a flickering"
				+ " overhead light.  Looking around the room the all the monitors are  except for the one in "
				+ "the command center which appears to be in working order."
				, null, null, false, true, null);
		
		//Spaced Energy Cell
		 Room room10 = new Room(10,"Spaced Energy Cell","Once the door is pried open the air is sucking around "
				+ "you pulling you to the leaking hole.  Crawling around the wall you have reached the E-Cell create."
				, null, null, false, true, null);
		
		//Hallway 3
		 Room room11 = new Room(11,"Hallway 3", "Another hallway with dull gray walls"
				, null, null, false, true, null);
		
		//Hallway 4
		 Room room12 = new Room(12,"Hallway 4","Like most of the hallways on the ship this is another dull gray "
				+ "walled room."
				, null, null, false, true, null);
		
		//Server Bank 4
		 Room room13 = new Room(13,"Server Bank 4","This room is abnormally dark even compared to the crippled ship."
				+ "  The light blinking on the server bank are creating a dancing shadow effect, giving a serial effect."
				, null, null, false, true, null);
		
		//Server Bank 3
		 Room room14 = new Room(14,"Server Bank 3","You're struck by how well this room is intact and seems to be "
				+ "in working order.  All server banks seem to be powered on and communicating with the main system. "
				, null, null, false, true, null);
		
		//Server Bank 2
		 Room room15 = new Room(15,"Server Bank 2","This room largely resembles the others, with black server racks "
				+ "occupying most of the space."
				, null, null, false, true, null);
		
		//Server Bank 1
		 Room room16 = new Room(16,"Server Bank 1","Besides the usual grey, the walls of this room are lined with "
				+ "blade servers, most of which remain relatively unscathed."
				, null, null, false, true, null);
		
		//Hallway 4 Iced
		 Room room17 = new Room(17,"Hallway 4 Iced","These hallways all look the same, with the only indication "
				+ "that you've moved being the signs on the floor. That, and the fact that this room is just as cold as "
				+ "the cryogenic rooms."
				, null, null, false, true, null);
		
		//Hallway 5
		 Room room18 = new Room(18,"Hallway 5","The walls of this hallway are a uniform grey throughout. Only about"
				+ " a quar-ter of the lights are working, so it is fairly dark."
				, null, null, false, true, null);
		
		//Command Center
		 Room room19 = new Room(19,"Command Center","When you enter, the room is lit only by back power making it "
				+ "very dim."
				, null, null, false, true, null);
		
		//Hallway 6
		 Room room20 = new Room(20,"Hallway 6", "The hallway towards Communications is long, and includes two "
				+ "sections the walls are a neutral grey color, with the outlines of wall panels visible in some places."
				, null, null, false, true, null);
		
		//Hallway 7
		 Room room21 = new Room(21,"Hallway 7","The second section of the hallway towards the com room seems "
				+ "identical to the first."
				, null, null, false, true, null);
		
		//Communications
		 Room room22 = new Room(22,"Communications","This room is a uniform drab grey like the others. A "
				+ "few computer terminals with blinking lights populate the otherwise sparsely furnished room."
				, null, null, false, true, null);
		
		//Ship Weapons
		 Room room23 = new Room(23,"Ship Weapons","The walls in this room are formed by dark paneling, "
				+ "but the lights are almost bright enough to hurt your eyes. There are quite a few terminals "
				+ "in this room as well, with a large table in the center which projects various holographic "
				+ "images above it. The panels cover every inch of the interior, with the excep-tion of the "
				+ "western wall, which is a large window."
				, null , null, false, true, null);
		
		//Cargo 1
		 Room room24 = new Room(24,"Cargo 1","This is a dull grey room lined with empty cargo crates. "
				+ "There are two doors in this room, one yellow door to the north and a black door to the east."
				, null, null, false, true, null);
		
		//Engine Room
		 Room room25 = new Room(25,"Engine Room","This is a large grey room with multiple exits. There is "
				+ "a large Ion Thruster in the middle of the room. The Ion thruster is not powered on, and all "
				+ "indicator gauges show that there is not enough impulse power to provide sufficient propulsion "
				+ "for escape. Damage to the thruster and missing e-cells are prohib-iting the engine from powering up."
				, null, null, false, false, null);
		
		//Cargo 2
		 Room room26 = new Room(26,"Cargo 2","This is a dull grey room with empty shelves."
				, null, null, false, true, null);
		
		//Energy Cell Cargo
		 Room room27 = new Room(27,"Energy Cell Cargo","This is a dull grey room with six empty Energy Cell "
				+ "crates and one locked energy crate."
				, null, null, false, true, null);
		
		//Viewing 1
		 Room room28 = new Room(28,"Viewing 1","This room has panoramic viewing windows, the length of"
				+ " the room. Through these windows one can see our indigenous galaxy."
				, null, null, false, true, null);
		
		//Viewing 2
		 Room room29 = new Room(29,"Viewing 2","This a dull grey room. This room has panoramic windows"
				+ " but the ships win-dow shutters are closed."
				, null, null, false, true, null);
		
		//Navigation
		 Room room30 = new Room(30,"Navigation","There is only one way in and one way out in this room."
				+ " There is an elaborate navigation control panel. Some of the gauges are damaged but overall"
				+ " the navigation controls appear to be fully functional."
				, null, null, false, false, null);
		
		//Ships AI
		 Room room31 = new Room(31,"Ships AI","You can barely see through the darkness."
				, null, null, false, false, null);
		
		
		rooms = new ArrayList<Room>(){
			{
				add(room0);
				add(room1);
				add(room2);
				add(room3);
				add(room4);
				add(room5);
				add(room6);
				add(room7);
				add(room8);
				add(room9);
				add(room10);
				add(room11);
				add(room12);
				add(room13);
				add(room14);
				add(room15);
				add(room16);
				add(room17);
				add(room18);
				add(room19);
				add(room20);
				add(room21);
				add(room22);
				add(room23);
				add(room24);
				add(room25);
				add(room26);
				add(room27);
				add(room28);
				add(room29);
				add(room30);
				add(room31);
				
			}
		};
		
		return rooms;
	}
	
	public ArrayList<Door[]> newDoors(){
		Door[] room0Doors = {new Door(rooms.get(1), "north", true)
				, new Door(rooms.get(19), "south", true)
				, new Door(rooms.get(11), "east", true)
				, new Door(rooms.get(20), "west", true)};
		
		Door[] room1Doors = {new Door(rooms.get(2), "north")
				, new Door(rooms.get(0), "south")
				, new Door(rooms.get(31), "east")
				, new Door(rooms.get(25), "west")};
		
		Door[] room2Doors = {new Door(rooms.get(3), "north")
				, new Door(rooms.get(1), "south")
				, new Door(rooms.get(31), "east")
				, new Door(rooms.get(25), "west")};
		
		Door[] room3Doors = {new Door(rooms.get(4), "north")
				, new Door(rooms.get(2), "south")
				, new Door(rooms.get(18), "east", true)
				, new Door(null, "west")};
		
		Door[] room4Doors = {new Door(rooms.get(5), "north")
				, new Door(rooms.get(3), "south")
				, new Door(null, "east")
				, new Door(null, "west")};
		
		Door[] room5Doors = {new Door(rooms.get(6), "north")
				, new Door(rooms.get(4), "south")
				, new Door(rooms.get(10), "east", true)
				, new Door(null, "west")};
		
		Door[] room6Doors = {new Door(null, "north")
				, new Door(rooms.get(5), "south")
				, new Door(rooms.get(7), "east")
				, new Door(null, "west")};
		
		Door[] room7Doors = {new Door(null, "north")
				, new Door(null, "south")
				, new Door(rooms.get(8), "east")
				, new Door(rooms.get(6), "west")};
		
		Door[] room8Doors = {new Door(null, "north")
				, new Door(null, "south")
				, new Door(rooms.get(9), "east")
				, new Door(rooms.get(7), "west")};
		
		Door[] room9Doors = {new Door(null, "north")
				, new Door(null, "south")
				, new Door(null, "east")
				, new Door(rooms.get(8), "west")};
		
		Door[] room10Doors = {new Door(null, "north")
				, new Door(rooms.get(17), "south")
				, new Door(null, "east")
				, new Door(rooms.get(5), "west")};
		
		Door[] room11Doors = {new Door(null, "north")
				, new Door(null, "south")
				, new Door(rooms.get(12), "east")
				, new Door(rooms.get(0), "west")};
		
		Door[] room12Doors = {new Door(null, "north")
				, new Door(null, "south")
				, new Door(rooms.get(13), "east")
				, new Door(rooms.get(11), "west")};
		
		Door[] room13Doors = {new Door(rooms.get(14), "north")
				, new Door(null, "south")
				, new Door(null, "east")
				, new Door(rooms.get(12), "west")};
		
		Door[] room14Doors = {new Door(rooms.get(15), "north")
				, new Door(rooms.get(13), "south")
				, new Door(null, "east")
				, new Door(rooms.get(31), "west")};
		
		Door[] room15Doors = {new Door(rooms.get(16), "north")
				, new Door(rooms.get(14), "south")
				, new Door(null, "east")
				, new Door(rooms.get(31), "west")};
		
		Door[] room16Doors = {new Door(null, "north")
				, new Door(rooms.get(15), "south")
				, new Door(null, "east")
				, new Door(rooms.get(17), "west")};
		
		Door[] room17Doors = {new Door(rooms.get(10), "north", true)
				, new Door(null, "south")
				, new Door(rooms.get(16), "east")
				, new Door(rooms.get(18), "west")};
		
		Door[] room18Doors = {new Door(null, "north")
				, new Door(null, "south")
				, new Door(rooms.get(17), "east")
				, new Door(rooms.get(3), "west")};
		
		Door[] room19Doors = {new Door(rooms.get(0), "north")
				, new Door(null, "south")
				, new Door(null, "east")
				, new Door(null, "west")};
		
		Door[] room20Doors = {new Door(rooms.get(25), "north")
				, new Door(null, "south")
				, new Door(rooms.get(0), "east")
				, new Door(rooms.get(21), "west")};
		
		Door[] room21Doors = {new Door(rooms.get(25), "north")
				, new Door(null, "south")
				, new Door(rooms.get(20), "east")
				, new Door(rooms.get(22), "west")};
		
		Door[] room22Doors = {new Door(rooms.get(23), "north")
				, new Door(null, "south")
				, new Door(rooms.get(21), "east")
				, new Door(null, "west")};
		
		Door[] room23Doors = {new Door(rooms.get(24), "north")
				, new Door(rooms.get(22), "south")
				, new Door(rooms.get(25), "east")
				, new Door(null, "west")};
		
		Door[] room24Doors = {new Door(rooms.get(26), "north")
				, new Door(rooms.get(23), "south")
				, new Door(rooms.get(25), "east")
				, new Door(null, "west")};
		
		Door[] room25Doors = {new Door(rooms.get(2), "northeast")
				, new Door(rooms.get(1), "southeast")
				, new Door(rooms.get(24), "northwest")
				, new Door(rooms.get(23), "southwest")};
		
		Door[] room26Doors = {new Door(rooms.get(27), "north")
				, new Door(rooms.get(24), "south")
				, new Door(null, "east")
				, new Door(null, "west")};
		
		Door[] room27Doors = {new Door(rooms.get(28), "north")
				, new Door(rooms.get(26), "south")
				, new Door(null, "east")
				, new Door(null, "west")};
		
		Door[] room28Doors = {new Door(rooms.get(29), "north")
				, new Door(rooms.get(27), "south")
				, new Door(null, "east")
				, new Door(null, "west")};
		
		Door[] room29Doors = {new Door(rooms.get(30), "north")
				, new Door(rooms.get(28), "south")
				, new Door(null, "east")
				, new Door(null, "west")};
		
		Door[] room30Doors = {new Door(null, "north")
				, new Door(rooms.get(29), "south")
				, new Door(null, "east")
				, new Door(null, "west")};
		
		Door[] room31Doors = {new Door(rooms.get(18), "north")
				, new Door(rooms.get(11), "south")
				, new Door(rooms.get(15), "east")
				, new Door(rooms.get(2), "west")};
		
		doors = new ArrayList<Door[]>(){
			{
				add(room0Doors);
				add(room1Doors);
				add(room2Doors);
				add(room3Doors);
				add(room4Doors);
				add(room5Doors);
				add(room6Doors);
				add(room7Doors);
				add(room8Doors);
				add(room9Doors);
				add(room10Doors);
				add(room11Doors);
				add(room12Doors);
				add(room13Doors);
				add(room14Doors);
				add(room15Doors);
				add(room16Doors);
				add(room17Doors);
				add(room18Doors);
				add(room19Doors);
				add(room20Doors);
				add(room21Doors);
				add(room22Doors);
				add(room23Doors);
				add(room24Doors);
				add(room25Doors);
				add(room26Doors);
				add(room27Doors);
				add(room28Doors);
				add(room29Doors);
				add(room30Doors);
				add(room31Doors);
			}
		};
		return doors;
	}
	

}
