package MainCode.GUI;

import static java.awt.SystemColor.text;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.IOException;

//import java.awt.ScrollPane;
import java.util.HashMap;

import MainCode.Items.ConcussionGrenade;
import MainCode.Items.HealthPack;
import MainCode.Items.Inventory;
import MainCode.Items.Item;
import MainCode.Items.Weapon;
import MainCode.Items.Key;
import MainCode.Monster.Monster;
import MainCode.Monster.Player;
import MainCode.Puzzle.ECellPuzzle;
import MainCode.Puzzle.MagicSquare;
import MainCode.Puzzle.Puzzle;
import MainCode.Rooms.Door;
import MainCode.Rooms.Room;
import MainCode.Rooms.RoomFactory;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.*;

/**
 * @author Neal Klemenc
 */
public class MainGUI extends Application {
	RoomFactory rf = new RoomFactory();


	ArrayList<Room> rooms = rf.newRooms();
	ArrayList<Door[]> doors = rf.newDoors();

	public HashMap<Room, Door[]> myMap = new HashMap<Room, Door[]>()
	{
		{
			put(rooms.get(0), doors.get(0));
			put(rooms.get(1), doors.get(1));
			put(rooms.get(2), doors.get(2));
			put(rooms.get(3), doors.get(3));
			put(rooms.get(4), doors.get(4));
			put(rooms.get(5), doors.get(5));
			put(rooms.get(6), doors.get(6));
			put(rooms.get(7), doors.get(7));
			put(rooms.get(8), doors.get(8));
			put(rooms.get(9), doors.get(9));
			put(rooms.get(10), doors.get(10));
			put(rooms.get(11), doors.get(11));
			put(rooms.get(12), doors.get(12));
			put(rooms.get(13), doors.get(13));
			put(rooms.get(14), doors.get(14));
			put(rooms.get(15), doors.get(15));
			put(rooms.get(16), doors.get(16));
			put(rooms.get(17), doors.get(17));
			put(rooms.get(18), doors.get(18));
			put(rooms.get(19), doors.get(19));
			put(rooms.get(20), doors.get(20));
			put(rooms.get(21), doors.get(21));
			put(rooms.get(22), doors.get(22));
			put(rooms.get(23), doors.get(23));
			put(rooms.get(24), doors.get(24));
			put(rooms.get(25), doors.get(25));
			put(rooms.get(26), doors.get(26));
			put(rooms.get(27), doors.get(27));
			put(rooms.get(28), doors.get(28));
			put(rooms.get(29), doors.get(29));
			put(rooms.get(30), doors.get(30));
			put(rooms.get(31), doors.get(31));
		}
	};

	//	public Door[] room0Doors = {new Door(rooms.get(1), "north"), new Door(rooms.get(19), "south", true), new Door(rooms.get(11), "east"), new Door(rooms.get(20), "west")};
	//	public Door[] room1Doors = {new Door(rooms.get(2), "north"), new Door(rooms.get(0), "south"), new Door(rooms.get(31), "east"), new Door(rooms.get(25), "west")};
	//	public Door[] room2Doors = {new Door(rooms.get(3), "north"), new Door(rooms.get(1), "south"), new Door(rooms.get(31), "east"), new Door(rooms.get(25), "west")};
	//	public Door[] room3Doors = {new Door(rooms.get(4), "north"), new Door(rooms.get(2), "south"), new Door(rooms.get(18), "east"), new Door(null, "west")};
	//	public Door[] room4Doors = {new Door(rooms.get(5), "north"), new Door(rooms.get(3), "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room5Doors = {new Door(rooms.get(6), "north"), new Door(rooms.get(4), "south"), new Door(rooms.get(10), "east"), new Door(null, "west")};
	//	public Door[] room6Doors = {new Door(null, "north"), new Door(rooms.get(5), "south"), new Door(rooms.get(7), "east"), new Door(null, "west")};
	//	public Door[] room7Doors = {new Door(null, "north"), new Door(null, "south"), new Door(rooms.get(8), "east"), new Door(rooms.get(7), "west")};
	//	public Door[] room8Doors = {new Door(null, "north"), new Door(null, "south"), new Door(rooms.get(9), "east"), new Door(rooms.get(7), "west")};
	//	public Door[] room9Doors = {new Door(null, "north"), new Door(null, "south"), new Door(null, "east"), new Door(rooms.get(8), "west")};
	//	public Door[] room10Doors = {new Door(null, "north"), new Door(rooms.get(17), "south"), new Door(null, "east"), new Door(rooms.get(5), "west")};
	//	public Door[] room11Doors = {new Door(null, "north"), new Door(null, "south"), new Door(rooms.get(12), "east"), new Door(rooms.get(0), "west")};
	//	public Door[] room12Doors = {new Door(null, "north"), new Door(null, "south"), new Door(rooms.get(13), "east"), new Door(rooms.get(11), "west")};
	//	public Door[] room13Doors = {new Door(rooms.get(14), "north"), new Door(null, "south"), new Door(null, "east"), new Door(rooms.get(12), "west")};
	//	public Door[] room14Doors = {new Door(rooms.get(15), "north"), new Door(rooms.get(13), "south"), new Door(null, "east"), new Door(rooms.get(31), "west")};
	//	public Door[] room15Doors = {new Door(rooms.get(16), "north"), new Door(rooms.get(14), "south"), new Door(null, "east"), new Door(rooms.get(31), "west")};
	//	public Door[] room16Doors = {new Door(null, "north"), new Door(rooms.get(15), "south"), new Door(null, "east"), new Door(rooms.get(17), "west")};
	//	public Door[] room17Doors = {new Door(rooms.get(10), "north"), new Door(null, "south"), new Door(rooms.get(16), "east"), new Door(rooms.get(18), "west")};
	//	public Door[] room18Doors = {new Door(null, "north"), new Door(null, "south"), new Door(rooms.get(17), "east"), new Door(rooms.get(3), "west")};
	//	public Door[] room19Doors = {new Door(rooms.get(0), "north"), new Door(null, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room20Doors = {new Door(rooms.get(25), "north"), new Door(null, "south"), new Door(rooms.get(0), "east"), new Door(rooms.get(21), "west")};
	//	public Door[] room21Doors = {new Door(rooms.get(25), "north"), new Door(null, "south"), new Door(rooms.get(20), "east"), new Door(rooms.get(22), "west")};
	//	public Door[] room22Doors = {new Door(rooms.get(23), "north"), new Door(null, "south"), new Door(rooms.get(21), "east"), new Door(null, "west")};
	//	public Door[] room23Doors = {new Door(rooms.get(24), "north"), new Door(rooms.get(22), "south"), new Door(rooms.get(25), "east"), new Door(null, "west")};
	//	public Door[] room24Doors = {new Door(rooms.get(26), "north"), new Door(rooms.get(23), "south"), new Door(rooms.get(25), "east"), new Door(null, "west")};
	//	public Door[] room25Doors = {new Door(rooms.get(2), "northeast"), new Door(rooms.get(1), "southeast"), new Door(rooms.get(24), "northwest"), new Door(rooms.get(23), "southwest")};
	//	public Door[] room26Doors = {new Door(rooms.get(27), "north"), new Door(rooms.get(24), "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room27Doors = {new Door(rooms.get(28), "north"), new Door(rooms.get(26), "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room28Doors = {new Door(rooms.get(29), "north"), new Door(rooms.get(27), "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room29Doors = {new Door(rooms.get(30), "north"), new Door(rooms.get(28), "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room30Doors = {new Door(null, "north"), new Door(rooms.get(29), "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room31Doors = {new Door(rooms.get(15), "northeast"), new Door(rooms.get(14), "southeast"), new Door(rooms.get(2), "northwest"), new Door(rooms.get(1), "southwest")};
	//	
	//	
	//	
	//	public HashMap<Room, Door[]> myMap = new HashMap<Room, Door[]>()
	//	{
	//	    {
	//	        put(rooms.get(0), room0Doors);
	//	        put(rooms.get(1), room1Doors);
	//	        put(rooms.get(2), room2Doors);
	//	        put(rooms.get(3), room3Doors);
	//	        put(rooms.get(4), room4Doors);
	//	        put(rooms.get(5), room5Doors);
	//	        put(rooms.get(6), room6Doors);
	//	        put(rooms.get(7), room7Doors);
	//	        put(rooms.get(8), room8Doors);
	//	        put(rooms.get(9), room9Doors);
	//	        put(rooms.get(10), room10Doors);
	//	        put(rooms.get(11), room11Doors);
	//	        put(rooms.get(12), room12Doors);
	//	        put(rooms.get(13), room13Doors);
	//	        put(rooms.get(14), room14Doors);
	//	        put(rooms.get(15), room15Doors);
	//	        put(rooms.get(16), room16Doors);
	//	        put(rooms.get(17), room17Doors);
	//	        put(rooms.get(18), room18Doors);
	//	        put(rooms.get(19), room19Doors);
	//	        put(rooms.get(20), room20Doors);
	//	        put(rooms.get(21), room21Doors);
	//	        put(rooms.get(22), room22Doors);
	//	        put(rooms.get(23), room23Doors);
	//	        put(rooms.get(24), room24Doors);
	//	        put(rooms.get(25), room25Doors);
	//	        put(rooms.get(26), room26Doors);
	//	        put(rooms.get(27), room27Doors);
	//	        put(rooms.get(28), room28Doors);
	//	        put(rooms.get(29), room29Doors);
	//	        put(rooms.get(30), room30Doors);
	//	        put(rooms.get(31), room31Doors);
	//	    }
	//	};



	Game game = new Game();
	MainGUI mg;

	Weapon bareHands = new Weapon("Bare hands", "Your weak, fleshy hands", "Used to fight", 10);
	Weapon leadPipe = new Weapon("Lead Pipe", "A sturdy pipe", "Used to fight", 15);
	Weapon suctionHose = new Weapon("Suction Hose", "A weak suction hose", "Used to fight", 10);
	Weapon largeDoor = new Weapon("A Large Door", "It's just a really big door", "Used to fight", 15);
	Weapon sharkTeeth = new Weapon("Sharp teeth", "Very sharp teeth", "Used to fight", 20);
	Weapon plasmaInducer = new Weapon("Plasma Inducer", "", "Used to fight", 25);
	Weapon houndTail = new Weapon("Hound Tail", "", "Used to fight", 30);
	Weapon disintegratorPistol = new Weapon("Disintegrator  Pistol", "", "Used to fight", 35);
	Weapon cutlass = new Weapon("Cutlass", "", "Used to fight", 40);
	Weapon wrestlingMoves = new Weapon("Wrestling Moves", "", "Used to fight", 45);
	Weapon plasmaRifle = new Weapon("Plasma Rifle", "", "Used to fight", 50);
	Weapon tentacles = new Weapon("Tentacles", "Terrible Towering Tentacles", "Used to fight", 55);
	Weapon flameThrower = new Weapon("FlameThrower", "Hot stuff", "Used to fight", 60);

	HealthPack healthKit = new HealthPack("Health Kit", "Some basic first-aid.", "Used to heal wounds.");
	ConcussionGrenade concussionGrenade = new ConcussionGrenade();


	Monster rogueCleaningUnit = new Monster(30, suctionHose, "Rogue Cleaning Unit", "A pissed off vacuum cleaner, easily killed.", healthKit);
	Monster robotDoorman = new Monster(50, largeDoor, "Robot Doorman", "A well-dressed robot in moderate disprepair.", concussionGrenade);
	Monster tunnelingHorror = new Monster(50, sharkTeeth, "Tunneling Horror", "A large alien worm.", healthKit);
	Monster roboChef4000 = new Monster(50, plasmaInducer, "ROBOCHEF4000", "A deranged culinary robot with a French accent and a curly moustache.", plasmaInducer);
	Monster zocrexianInfiltrator = new Monster(50, houndTail, "Zocrexian Infiltrator", "An alien hound all the way from zocrexia.", healthKit);
	Monster littleGreenMan = new Monster(100, disintegratorPistol, "Little Green Man", "A prototypical alien..", disintegratorPistol);
	Monster cyborgPirate = new Monster(100, cutlass, "Cyborg Pirate", "A robotic pirate with a bad attitude.", healthKit);
	Monster maskedRobot = new Monster(50, wrestlingMoves, "Masked Robot", "An aggressive machine who wants to wrestle.", healthKit);
	Monster alienCommando = new Monster(100, plasmaRifle, "Alien Commando", "An incomprehensible alien with an assault weapon.", concussionGrenade);
	Monster spaceKraken = new Monster(150, tentacles, "Space Kraken", "A giant, anomalous squid.", healthKit);
	Monster returnOfCleaningUnit = new Monster(250, flameThrower, "The Return of Cleaning Unit", "A pissed off vacuum cleaner, still mad.", healthKit);

	//Instantiate all puzzles
	ECellPuzzle eCellPuzzle = new ECellPuzzle();
	Puzzle communicationPuzzle = new Puzzle("Communications Puzzle","A frog is at the bottom of a 30 meter well. "
			+ "Each day he summons enough energy for one 3 meter leap up the well. Exhausted, "
			+ "he then hangs there for the rest of the day. At night, while he is asleep, "
			+ "he slips 2 meters backwards. How many days does it take him to escape from the well?� ","28 days", null);
	MagicSquare magicSquarePuzzle = new MagicSquare();
	Puzzle wolvesPuzzle = new Puzzle("Wolves Puzzle","Six wolves catch six lambs in six minutes.� How many wolves "
			+ "will be needed to catch sixty lambs in sixty minutes?","6", null);
	Puzzle brothersPuzzle = new Puzzle("Brothers Puzzle","Brothers and sisters I have none but this man's "
			+ "father is my father's son. Who is the man?","the man is my son", null);
	Puzzle travelPuzzle = new Puzzle("Traveling Puzzle","What can travel around the world, while staying in a corner?","stamp", null);
	Puzzle headPuzzle = new Puzzle("Head Puzzle","What has a head and a tail but no body?","a coin", null);
	Puzzle computerSystemPuzzle = new Puzzle("Computer System Puzzle","Who is the test for AI in a computer system named for?","turing", null);
	Puzzle towelPuzzle = new Puzzle("Wetter Puzzle","What gets wetter and wetter the more it dries? ","A towel", null);

	//Instantiate Rooms


	//	//Cryo Room
	//	public Room room0 = new Room(0,"Cryo Room","The room has 4 doors and each door has a name plate above it. "
	//			+ "To the west is a yellow door marked, to the east is a blue door both marked \"Hallway\". To the "
	//			+ "south holds a grey door labeled \"Command Center\" and to the north is a red door labeled \"Cryogenics Room\"."
	//			, rogueCleaningUnit, null, false, true, null);
	//	
	//	//Cryo Room 1
	//	public Room room1 = new Room(1,"Cryo Room 1","The walls are dull grey and lined with the statis units for other crew "
	//			+ "members, they too appear fine, just out. The room has 4 doors and each door has a name plate above it. To "
	//			+ "the west and east there are black doors, the west is labeled \"Engine Room\" and the east is labeled \"Ship AI\"."
	//			+ " To the north and south are red doors labeled \"Cryogenics Room\""
	//			, robotDoorman, null, false, true, null);
	//	
	//	//Cryo Room 2
	//	public Room room2 = new Room(2,"Cryo Room 2","The crew in this rooms appears to be fine as well, sleeping in their cham-bers."
	//			, null, null, false, true, communicationPuzzle);
	//	
	//	//Cryo Room 3
	//	public Room room3 = new Room(3,"Cryo Room 3","The room is a dull metal grey with three doors each with a name plate."
	//			, null, null, false, true, null);
	//	
	//	//Cryo Room 4
	//	public Room room4 = new Room(4,"Cryo Room 4","The room is dull metal grey with two doors. The crew in this room appears fine"
	//			, null, null, false, true, null);
	//	
	//	//Cryo Room 5
	//	public Room room5 = new Room(5,"Cryo Room 5","The room is dull metal grey with three doors. The door to the east is the same "
	//			+ "dull grey as the rest of the ship but there appears to be a window near the top.  You give the stasis chambers a "
	//			+ "quick glance to ensure the crew is fine then go to check the window. The window is small but you can just make out"
	//			+ " what appears to be a room with something in it.  As you step back your foot catches against something on the floor.  "
	//			+ "Upon inspection, you realize there is an anchor point on the floor next to the door. "
	//			, null, null, false, true, eCellPuzzle);
	//	
	//	//Hallway
	//	public Room room6 = new Room(6,"Hallway","The room is grey with two exits."
	//			, null, null, false, true, eCellPuzzle);
	//	
	//	//Hallway 1
	//	public Room room7 = new Room(7,"Hallway 1","The grey walls continue into this room as do the red doors."
	//			, cyborgPirate, null, false, true, null);
	//	
	//	//Hallway 2
	//	public Room room8 = new Room(8,"Hallway 2","The walls are grey and there are two doors."
	//			, null, null, false, true, null);
	//	
	//	//Security
	//	public Room room9 = new Room(9,"Security","Just like the other rooms it is dull gray but with a flickering"
	//			+ " overhead light.  Looking around the room the all the monitors are public except for the one in "
	//			+ "the command center which appears to be in working order."
	//			, null, null, false, true, magicSquarePuzzle);
	//	
	//	//Spaced Energy Cell
	//	public Room room10 = new Room(10,"Spaced Energy Cell","Once the door is pried open the air is sucking around "
	//			+ "you pulling you to the leaking hole.  Crawling around the wall you have reached the E-Cell create."
	//			, null, null, false, true, eCellPuzzle);
	//	
	//	//Hallway 3
	//	public Room room11 = new Room(11,"Hallway 3", "Another hallway with dull gray walls"
	//			, null, null, false, true, null);
	//	
	//	//Hallway 4
	//	public Room room12 = new Room(12,"Hallway 4","Like most of the hallways on the ship this is another dull gray "
	//			+ "walled room."
	//			, null, null, false, true, eCellPuzzle);
	//	
	//	//Server Bank 4
	//	public Room room13 = new Room(13,"Server Bank 4","This room is abnormally dark even compared to the crippled ship."
	//			+ "  The light blinking on the server bank are creating a dancing shadow effect, giving a serial effect."
	//			, null, null, false, true, null);
	//	
	//	//Server Bank 3
	//	public Room room14 = new Room(14,"Server Bank 3","You're struck by how well this room is intact and seems to be "
	//			+ "in working order.  All server banks seem to be powered on and communicating with the main system. "
	//			, null, null, false, true, null);
	//	
	//	//Server Bank 2
	//	public Room room15 = new Room(15,"Server Bank 2","This room largely resembles the others, with black server racks "
	//			+ "occupying most of the space."
	//			, null, null, false, true, headPuzzle);
	//	
	//	//Server Bank 1
	//	public Room room16 = new Room(16,"Server Bank 1","Besides the usual grey, the walls of this room are lined with "
	//			+ "blade servers, most of which remain relatively unscathed."
	//			, null, null, false, true, null);
	//	
	//	//Hallway 4 Iced
	//	public Room room17 = new Room(17,"Hallway 4 Iced","These hallways all look the same, with the only indication "
	//			+ "that you've moved being the signs on the floor. That, and the fact that this room is just as cold as "
	//			+ "the cryogenic rooms."
	//			, null, null, false, true, travelPuzzle);
	//	
	//	//Hallway 5
	//	public Room room18 = new Room(18,"Hallway 5","The walls of this hallway are a uniform grey throughout. Only about"
	//			+ " a quar-ter of the lights are working, so it is fairly dark."
	//			, null, null, false, true, null);
	//	
	//	//Command Center
	//	public Room room19 = new Room(19,"Command Center","When you enter, the room is lit only by back power making it "
	//			+ "very dim."
	//			, null, null, false, true, null);
	//	
	//	//Hallway 6
	//	public Room room20 = new Room(20,"Hallway 6", "The hallway towards Communications is long, and includes two "
	//			+ "sections the walls are a neutral grey color, with the outlines of wall panels visible in some places."
	//			, null, null, false, true, computerSystemPuzzle);
	//	
	//	//Hallway 7
	//	public Room room21 = new Room(21,"Hallway 7","The second section of the hallway towards the com room seems "
	//			+ "identical to the first."
	//			, null, null, false, true, null);
	//	
	//	//Communications
	//	public Room room22 = new Room(22,"Communications","This room is a uniform drab grey like the others. A "
	//			+ "few computer terminals with blinking lights populate the otherwise sparsely furnished room."
	//			, null, null, false, true, brothersPuzzle);
	//	
	//	//Ship Weapons
	//	public Room room23 = new Room(23,"Ship Weapons","The walls in this room are formed by dark paneling, "
	//			+ "but the lights are almost bright enough to hurt your eyes. There are quite a few terminals "
	//			+ "in this room as well, with a large table in the center which projects various holographic "
	//			+ "images above it. The panels cover every inch of the interior, with the excep-tion of the "
	//			+ "western wall, which is a large window."
	//			, spaceKraken , null, false, true, null);
	//	
	//	//Cargo 1
	//	public Room room24 = new Room(24,"Cargo 1","This is a dull grey room lined with empty cargo crates. "
	//			+ "There are two doors in this room, one yellow door to the north and a black door to the east."
	//			, null, null, false, true, null);
	//	
	//	//Engine Room
	//	public Room room25 = new Room(25,"Engine Room","This is a large grey room with multiple exits. There is "
	//			+ "a large Ion Thruster in the middle of the room. The Ion thruster is not powered on, and all "
	//			+ "indicator gauges show that there is not enough impulse power to provide sufficient propulsion "
	//			+ "for escape. Damage to the thruster and missing e-cells are prohib-iting the engine from powering up."
	//			, alienCommando, null, false, true, null);
	//	
	//	//Cargo 2
	//	public Room room26 = new Room(26,"Cargo 2","This is a dull grey room with empty shelves."
	//			, null, null, false, true, null);
	//	
	//	//Energy Cell Cargo
	//	public Room room27 = new Room(27,"Energy Cell Cargo","This is a dull grey room with six empty Energy Cell "
	//			+ "crates and one locked energy crate."
	//			, null, null, false, true, null);
	//	
	//	//Viewing 1
	//	public Room room28 = new Room(28,"Viewing 1","This room has panoramic viewing windows, the length of"
	//			+ " the room. Through these windows one can see our indigenous galaxy."
	//			, null, null, false, true, null);
	//	
	//	//Viewing 2
	//	public Room room29 = new Room(29,"Viewing 2","This a dull grey room. This room has panoramic windows"
	//			+ " but the ships win-dow shutters are closed."
	//			, null, null, false, true, towelPuzzle);
	//	
	//	//Navigation
	//	public Room room30 = new Room(30,"Navigation","There is only one way in and one way out in this room."
	//			+ " There is an elaborate navigation control panel. Some of the gauges are damaged but overall"
	//			+ " the navigation controls appear to be fully functional."
	//			, littleGreenMan, null, false, true, wolvesPuzzle);
	//	
	//	//Ships AI
	//	public Room room31 = new Room(31,"Ships AI","You can barely see through the darkness to find the "
	//			+ "terminal to plug in the E-cell."
	//			, cyborgPirate, null, false, true, null);
	//	


	//	public Door[] room0Doors = {new Door(room1, "north"), new Door(room19, "south", true), new Door(room11, "east"), new Door(room20, "west")};
	//	public Door[] room1Doors = {new Door(room2, "north"), new Door(room0, "south"), new Door(room31, "east"), new Door(room25, "west")};
	//	public Door[] room2Doors = {new Door(room3, "north"), new Door(room1, "south"), new Door(room31, "east"), new Door(room25, "west")};
	//	public Door[] room3Doors = {new Door(room4, "north"), new Door(room2, "south"), new Door(room18, "east"), new Door(null, "west")};
	//	public Door[] room4Doors = {new Door(room5, "north"), new Door(room3, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room5Doors = {new Door(room6, "north"), new Door(room4, "south"), new Door(room10, "east"), new Door(null, "west")};
	//	public Door[] room6Doors = {new Door(null, "north"), new Door(room5, "south"), new Door(room7, "east"), new Door(null, "west")};
	//	public Door[] room7Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room8, "east"), new Door(room7, "west")};
	//	public Door[] room8Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room9, "east"), new Door(room7, "west")};
	//	public Door[] room9Doors = {new Door(null, "north"), new Door(null, "south"), new Door(null, "east"), new Door(room8, "west")};
	//	public Door[] room10Doors = {new Door(null, "north"), new Door(room17, "south"), new Door(null, "east"), new Door(room5, "west")};
	//	public Door[] room11Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room12, "east"), new Door(room0, "west")};
	//	public Door[] room12Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room13, "east"), new Door(room11, "west")};
	//	public Door[] room13Doors = {new Door(room14, "north"), new Door(null, "south"), new Door(null, "east"), new Door(room12, "west")};
	//	public Door[] room14Doors = {new Door(room15, "north"), new Door(room13, "south"), new Door(null, "east"), new Door(room31, "west")};
	//	public Door[] room15Doors = {new Door(room16, "north"), new Door(room14, "south"), new Door(null, "east"), new Door(room31, "west")};
	//	public Door[] room16Doors = {new Door(null, "north"), new Door(room15, "south"), new Door(null, "east"), new Door(room17, "west")};
	//	public Door[] room17Doors = {new Door(room10, "north"), new Door(null, "south"), new Door(room16, "east"), new Door(room18, "west")};
	//	public Door[] room18Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room17, "east"), new Door(room3, "west")};
	//	public Door[] room19Doors = {new Door(room0, "north"), new Door(null, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room20Doors = {new Door(room25, "north"), new Door(null, "south"), new Door(room0, "east"), new Door(room21, "west")};
	//	public Door[] room21Doors = {new Door(room25, "north"), new Door(null, "south"), new Door(room20, "east"), new Door(room22, "west")};
	//	public Door[] room22Doors = {new Door(room23, "north"), new Door(null, "south"), new Door(room21, "east"), new Door(null, "west")};
	//	public Door[] room23Doors = {new Door(room24, "north"), new Door(room22, "south"), new Door(room25, "east"), new Door(null, "west")};
	//	public Door[] room24Doors = {new Door(room26, "north"), new Door(room23, "south"), new Door(room25, "east"), new Door(null, "west")};
	//	public Door[] room25Doors = {new Door(room2, "northeast"), new Door(room1, "southeast"), new Door(room24, "northwest"), new Door(room23, "southwest")};
	//	public Door[] room26Doors = {new Door(room27, "north"), new Door(room24, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room27Doors = {new Door(room28, "north"), new Door(room26, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room28Doors = {new Door(room29, "north"), new Door(room27, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room29Doors = {new Door(room30, "north"), new Door(room28, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room30Doors = {new Door(null, "north"), new Door(room29, "south"), new Door(null, "east"), new Door(null, "west")};
	//	public Door[] room31Doors = {new Door(room15, "northeast"), new Door(room14, "southeast"), new Door(room2, "northwest"), new Door(room1, "southwest")};
	//	
	//	
	//	
	//	public HashMap<Room, Door[]> myMap = new HashMap<Room, Door[]>()
	//	{
	//	    {
	//	        put(room0, room0Doors);
	//	        put(room1, room1Doors);
	//	        put(room2, room2Doors);
	//	        put(room3, room3Doors);
	//	        put(room4, room4Doors);
	//	        put(room5, room5Doors);
	//	        put(room6, room6Doors);
	//	        put(room7, room7Doors);
	//	        put(room8, room8Doors);
	//	        put(room9, room9Doors);
	//	        put(room10, room10Doors);
	//	        put(room11, room11Doors);
	//	        put(room12, room12Doors);
	//	        put(room13, room13Doors);
	//	        put(room14, room14Doors);
	//	        put(room15, room15Doors);
	//	        put(room16, room16Doors);
	//	        put(room17, room17Doors);
	//	        put(room18, room18Doors);
	//	        put(room19, room19Doors);
	//	        put(room20, room20Doors);
	//	        put(room21, room21Doors);
	//	        put(room22, room22Doors);
	//	        put(room23, room23Doors);
	//	        put(room24, room24Doors);
	//	        put(room25, room25Doors);
	//	        put(room26, room26Doors);
	//	        put(room27, room27Doors);
	//	        put(room28, room28Doors);
	//	        put(room29, room29Doors);
	//	        put(room30, room30Doors);
	//	        put(room31, room31Doors);
	//	    }
	//	};



	Stage theStage;

	Scene mainScene, fightScene, puzzleScene, menuScene, newGameScene, loadGameScene, deathScene;

	BorderPane mainPane = new BorderPane();
	BorderPane puzzlePane = new BorderPane();
	BorderPane fightPane = new BorderPane();
	BorderPane menuPane= new BorderPane();


	BorderPane deathPane = new BorderPane();

	GridPane directionalGrid = new GridPane();
	VBox roomInfoPane = new VBox();
	GridPane myGrid = new GridPane();
	GridPane fightGrid = new GridPane();
	GridPane mainInvPane = new GridPane();

	GridPane mainMenuGrid = new GridPane();

	GridPane deathGrid = new GridPane();
	ScrollPane roomInvPane = new ScrollPane();
	ScrollPane playerInvPane = new ScrollPane();

	VBox menuButtonPane = new VBox();

	VBox newGamePane = new VBox();
	VBox loadGamePane = new VBox();
	Text newGameNameHeader = new Text("Enter your name");
	TextField newGameNameScanner = new TextField();
	Button submitNewNameBtn = new Button("Submit");

	Text loadGameNameHeader = new Text("Enter your name");
	TextField loadGameNameScanner = new TextField();
	Button submitLoadNameBtn = new Button("Submit");


	Player mainPlayer = new Player(500, bareHands, rooms.get(0), "Player");


	Monster mainMonster = mainPlayer.getRoomID().getMonster();
	Puzzle mainPuzzle1 = new Puzzle("Test Puzzle", "xyzzy", "The is the test Puzzle. The solution is 'xyzzy'", null);
	Puzzle mainPuzzle = mainPlayer.getRoomID().getPuzzle();


	//Puzzle mainPuzzle = mainPlayer.getRoomID().getPuzzle();
	Button startFightBtn = new Button("Start Fight");

	VBox textScroller = new VBox();
	Text action2 = new Text();
	Text action1 = new Text();
	Text action0 = new Text();
	Text roomNameText = new Text();


	Label puzzlePaneHeader = new Label("Puzzle in this room");
	Label monsterPaneHeader = new Label("Monster in this room");
	Label puzzlePanePuzzle = new Label("No Puzzle");
	Label monsterPaneMonster = new Label(getRoomPuzzleName());


	Label monsterName = new Label();






	Label menuTitle = new Label("Galaxy Explorer");	
	Label deathLabel = new Label("You have died...");

	Label playerName = new Label(mainPlayer.getName());

	Label monsterHealth = new Label();
	Label playerHealth = new Label();


	Label puzzleName = new Label();


	Text roomItems = new Text();
	Text playerItems= new Text();

	private Button mainMenuBtn = new Button("Return to Main Menu");
	private Button saveGame = new Button("Save Game");
	private Button attackBtn = new Button("Attack");
	private Button returnBtn = new Button("Return");

	//DIRECTION BUTTONS
	private Button northBtn = new Button("north");
	private Button southBtn = new Button("south");
	private Button eastBtn = new Button("east");
	private Button westBtn = new Button("west");


	private	Button saveGameBtn = new Button("Save");


	//Puzzle Buttons
	private Button startPuzzleBtn = new Button("Examine Puzzle");

	//INVENTORY BUTTONS
	private Button takeItemBtn = new Button("Take Item");
	private Button useItemBtn = new Button("Use Healthkit");

	//MainMenu Buttons
	private Button newGame = new Button("New Game");
	private Button loadGame = new Button("Load Game");
	private Button help = new Button("Help");
	private Button quit= new Button("Quit");


	//INVENTORY
	ObservableList<Item> obRoomInv;
	ObservableList<Item> obPlayerInv;
	ListView<Item> roomItemList = new ListView<>(obRoomInv);
	ListView<Item> playerItemList = new ListView<>(obPlayerInv);



	@Override
	public void start(Stage primaryStage){


		theStage = primaryStage;




		mainMenuBtn.setOnAction(e -> primaryStage.setScene(menuScene));
		saveGame.setOnAction(e -> {
			try {
				game.saveGame(mainPlayer, mainPlayer.getRoomID(), mainPlayer.getSpriteInv());
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		startFightBtn.setOnAction(e -> setFightScene());
		returnBtn.setOnAction(e -> setMainScene());
		attackBtn.setOnAction(e -> doDamage());

		northBtn.setOnAction(e -> moveNorth());
		southBtn.setOnAction(e -> moveSouth());
		eastBtn.setOnAction(e -> moveEast());
		westBtn.setOnAction(e -> moveWest());

		startPuzzleBtn.setOnAction(e -> setPuzzleScene());

		takeItemBtn.setOnAction(e -> takeItem());

		newGame.setOnAction(e -> setNewGameScene());
		loadGame.setOnAction(e -> setLoadGameScene());
		saveGameBtn.setOnAction(e -> saveGame());


		useItemBtn.setOnAction(e -> useItem());

		action0.setText(mainPlayer.getRoomID().getRoomDescription());
		action0.setWrappingWidth(650);
		action1.setWrappingWidth(650);
		action2.setWrappingWidth(650);

		textScroller.setAlignment(Pos.CENTER);
		textScroller.getChildren().addAll(action0, action1);

		//MAIN MENU
		menuTitle.setFont(Font.font("Arial", 40));
		menuTitle.setPadding(new Insets(20, 0, 0, 0));
		menuTitle.setMaxWidth(Double.MAX_VALUE);
		menuTitle.setAlignment(Pos.CENTER);
		newGame.setMaxWidth(Double.MAX_VALUE);
		loadGame.setMaxWidth(Double.MAX_VALUE);
		help.setMaxWidth(Double.MAX_VALUE);
		quit.setMaxWidth(Double.MAX_VALUE);

		menuButtonPane.getChildren().addAll(newGame, loadGame, help, quit);
		menuButtonPane.setSpacing(70);
		menuButtonPane.setPadding(new Insets(120, 100, 10, 100));

		menuPane.setTop(menuTitle);
		menuPane.setCenter(menuButtonPane);



		//NEW GAME INTERFACE
		newGamePane.getChildren().addAll(newGameNameHeader, newGameNameScanner, submitNewNameBtn);
		submitNewNameBtn.setOnAction(e -> startNewGame(newGameNameScanner.getText()));


		//LOAD GAME INTERFACE
		loadGamePane.getChildren().addAll(loadGameNameHeader, loadGameNameScanner);
		loadGameNameScanner.setOnAction(e -> loadGame(loadGameNameScanner.getText()));

		//MOVEMENT
		directionalGrid.setAlignment(Pos.CENTER);
		directionalGrid.add(northBtn, 1, 0);
		directionalGrid.add(southBtn, 1, 2);
		directionalGrid.add(eastBtn, 2, 1);
		directionalGrid.add(westBtn, 0, 1);

		//MONSTER AND PUZZLE INFO
		roomInfoPane.setAlignment(Pos.CENTER);
		roomInfoPane.setPadding(new Insets(10,10,10,10));
		roomInfoPane.getChildren().addAll(monsterPaneHeader, monsterPaneMonster, startFightBtn, puzzlePaneHeader, puzzlePanePuzzle, startPuzzleBtn);


		//FIGHT INTERFACE
		fightGrid.setAlignment(Pos.CENTER);




		//newGame.setOnAction(e -> primaryStage.setScene(mainScene));
		/*loadGame.setOnAction(e -> );
				help.setOnAction(e -> );*/
		quit.setOnAction(e -> primaryStage.close());









		//FIGHT INTERFACE
		fightGrid.setAlignment(Pos.CENTER);

		fightGrid.setPadding(new Insets(10,10,10,10));
		fightGrid.setHgap(5.0);
		fightGrid.setVgap(10.0);
		fightGrid.add(monsterName, 2, 1);
		fightGrid.add(monsterHealth, 2, 2);
		fightGrid.add(playerName, 0, 1);
		fightGrid.add(playerHealth, 0, 2);
		fightGrid.add(attackBtn, 1, 3);
		fightPane.setCenter(fightGrid);

		//Death Interface
		deathGrid.setAlignment(Pos.CENTER);
		deathGrid.setPadding(new Insets(10, 10, 10, 10));
		deathGrid.setHgap(5.0);
		deathGrid.setVgap(10.0);
		deathGrid.add(deathLabel, 0, 0);
		deathGrid.add(mainMenuBtn, 0, 2);
		deathPane.setCenter(deathGrid);



		//PUZZLE INTERFACE
		VBox puzzleBox = new VBox();
		puzzleBox.setAlignment(Pos.CENTER);


		puzzlePane.setCenter(puzzleBox);
		puzzlePane.setTop(puzzleName);


		Text puzzleDescription = new Text(getRoomDescription());

		TextField puzzleScanner = new TextField();
		puzzleScanner.setOnAction(e -> tryPuzzle(puzzleScanner.getText()));
		puzzleBox.getChildren().addAll(puzzleDescription, puzzleScanner, returnBtn);
		

		mainPane.setTop(saveGameBtn);
		mainPane.setCenter(directionalGrid);
		mainPane.setRight(roomInfoPane);
		mainPane.setBottom(textScroller);
		mainPane.setLeft(mainInvPane);

		mainScene = new Scene(mainPane, 800, 500);
		fightScene = new Scene(fightPane, 800, 500);
		puzzleScene = new Scene(puzzlePane, 800, 500);
		menuScene = new Scene(menuPane, 800,500);
		deathScene = new Scene(deathPane, 800,500);

		newGameScene = new Scene(newGamePane, 800, 600);
		loadGameScene = new Scene(loadGamePane, 800, 600);

		theStage.setTitle("Galaxy Explorer");
		theStage.setScene(menuScene);
		theStage.show();
	}





	


	private void setNewGameScene(){
		theStage.setScene(newGameScene);
	}

	private void setLoadGameScene(){
		theStage.setScene(loadGameScene);
	}



	private void takeItem()
	{ 
		if (roomItemList.getSelectionModel().getSelectedItem() != null)
		{
			cycleText(mainPlayer.takeItem(roomItemList.getSelectionModel().getSelectedItem()));
			mainPlayer.getRoomID().getRoomInv().removeItem(roomItemList.getSelectionModel().getSelectedItem());
			updateText(); 
		}	
		else 
			cycleText("No Item");

	}

	private String getRoomPuzzleName()
	{
		String result = "";
		if(mainPlayer.getRoomID().getPuzzle() == null)
		{
			puzzlePanePuzzle = new Label("No Puzzle");
		}
		else
		{
			result = mainPlayer.getRoomID().getPuzzle().getPuzzleName();
			return result;
		}
		return result;
	}
	private String getRoomDescription()
	{
		String result = "";
		if(mainPlayer.getRoomID().getPuzzle() == null)
		{
			result = "No Puzzle";
		}
		else
		{
			result = mainPlayer.getRoomID().getPuzzle().getPuzzleDescription();
			return result;
		}
		return result;
	}

	private void useItem()
	{

		cycleText(mainPlayer.useItem(healthKit));
		updateText();

	}


	private void tryPuzzle(String s) {
		cycleText((mainPlayer.tryPuzzle(s, mainPuzzle1)));
	}


	private void moveNorth() {
		cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[0]));
		updateText();
	}

	private void moveSouth() {
		cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[1]));
		updateText();
	}

	private void moveEast() {
		cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[2]));
		updateText();
	}

	private void moveWest() {
		cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[3]));
		updateText();
	}

	private void setFightScene() {
		fightPane.setBottom(textScroller);
		theStage.setScene(fightScene);
	}

	void setMainScene() {
		mainPane.setCenter(textScroller);
		theStage.setScene(mainScene);
	}

	private void setPuzzleScene() {
		puzzlePane.setBottom(textScroller);
		theStage.setScene(puzzleScene);
	}

	private void setDeathScene()
	{
		theStage.setScene(deathScene);
	}

	private void cycleText(String s){
		action0.setText(s);

	}

	private void doDamage() {
		cycleText(mainPlayer.doDamage(mainMonster));
		if(mainMonster.getHealth()<=0){
			mainPlayer.getRoomID().getRoomInv().addItem(mainMonster.getItemDrop());
			updateText();
		}
		else{
			recieveDamage();
		}

	}

	private void recieveDamage(){

		if(mainPlayer.getHealth() <= 0)
		{
			setDeathScene();
		}
		else
		{
			cycleText(mainPlayer.takeDamage(mainMonster));
			updateText();
		}
	}




	private void updateHealth(){
		playerHealth.setText(mainPlayer.getHealth() + "/" + mainPlayer.getMaxHealth());
		monsterHealth.setText(mainMonster.getHealth() + "/" + mainMonster.getMaxHealth());
	}

	private void updateText(){
		mainMonster = mainPlayer.getRoomID().getMonster();
		mainPuzzle1 = mainPlayer.getRoomID().getPuzzle();
		playerHealth.setText(mainPlayer.getHealth() + "/" + mainPlayer.getMaxHealth());


		obPlayerInv = FXCollections.observableArrayList(mainPlayer.getSpriteInv().getItemList());
		playerItemList = new ListView<>(obPlayerInv);
		obRoomInv = FXCollections.observableArrayList(mainPlayer.getRoomID().getRoomInv().getItemList());
		roomItemList = new ListView<>(obRoomInv);
		roomInvPane.setContent(roomItemList);
		playerInvPane.setContent(playerItemList);


		if(mainMonster == null || mainMonster.getHealth() <= 0){
			mainMonster = null;
			monsterPaneMonster.setText("No Monster Here");
			monsterHealth.setText("No Monster");
			attackBtn.setOnAction(e -> setMainScene());
			attackBtn.setText("return");
		}
		else{
			monsterPaneMonster.setText(mainMonster.getName());
			monsterName.setText(mainMonster.getName());
			monsterHealth.setText(mainMonster.getHealth() + "/" + mainMonster.getMaxHealth());
			attackBtn.setOnAction(e -> doDamage());
	
			attackBtn.setText("Attack");
		}


		if(mainPuzzle1 == null){
			puzzlePanePuzzle.setText("No Puzzle");
		}
		else{
			puzzlePanePuzzle.setText(mainPuzzle1.getPuzzleName());
		}


	}

	public Puzzle getMainPuzzle() {
		return mainPuzzle1;
	}



	public void setMainPuzzle(Puzzle mainPuzzle) {
		this.mainPuzzle1 = mainPuzzle;
	}


	public void startNewGame(String s){
		rooms = rf.newRooms();
		doors = rf.newDoors();

		rooms.get(1).setMonster(rogueCleaningUnit);
		rooms.get(7).setMonster(cyborgPirate);
		rooms.get(19).setMonster(tunnelingHorror);
		rooms.get(23).setMonster(spaceKraken);
		rooms.get(25).setMonster(alienCommando);
		rooms.get(30).setMonster(littleGreenMan);
		rooms.get(31).setMonster(cyborgPirate);

		rooms.get(1).getRoomInv().addItem(leadPipe);

		myMap = new HashMap<Room, Door[]>()
		{
			{
				put(rooms.get(0), doors.get(0));
				put(rooms.get(1), doors.get(1));
				put(rooms.get(2), doors.get(2));
				put(rooms.get(3), doors.get(3));
				put(rooms.get(4), doors.get(4));
				put(rooms.get(5), doors.get(5));
				put(rooms.get(6), doors.get(6));
				put(rooms.get(7), doors.get(7));
				put(rooms.get(8), doors.get(8));
				put(rooms.get(9), doors.get(9));
				put(rooms.get(10), doors.get(10));
				put(rooms.get(11), doors.get(11));
				put(rooms.get(12), doors.get(12));
				put(rooms.get(13), doors.get(13));
				put(rooms.get(14), doors.get(14));
				put(rooms.get(15), doors.get(15));
				put(rooms.get(16), doors.get(16));
				put(rooms.get(17), doors.get(17));
				put(rooms.get(18), doors.get(18));
				put(rooms.get(19), doors.get(19));
				put(rooms.get(20), doors.get(20));
				put(rooms.get(21), doors.get(21));
				put(rooms.get(22), doors.get(22));
				put(rooms.get(23), doors.get(23));
				put(rooms.get(24), doors.get(24));
				put(rooms.get(25), doors.get(25));
				put(rooms.get(26), doors.get(26));
				put(rooms.get(27), doors.get(27));
				put(rooms.get(28), doors.get(28));
				put(rooms.get(29), doors.get(29));
				put(rooms.get(30), doors.get(30));
				put(rooms.get(31), doors.get(31));
				theStage.setScene(mainScene);
			}
		};

		mainPlayer = new Player(500, bareHands, rooms.get(0), s);
	}



	public void saveGame(){
		try
		{
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(mainPlayer.getName() + ".dat"));

			// write each room in turn
			for (int i =0; i< rooms.size(); i++)
			{
				Room myRoom = rooms.get(i);
				output.writeObject(myRoom);
			}

			// write each door array in turn
			for (int i =0; i< doors.size(); i++)
			{
				Door[] myDoor = doors.get(i);
				output.writeObject(myDoor);
			}


			output.writeObject(mainPlayer);
			// done writing close file
			output.close();
		}

		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Problem writing to file");
		}
		cycleText("Game Saved");
	}

	public void loadGame(String s){
		// open file for reading
		ObjectInputStream input = null;

		try {
			input = new ObjectInputStream(new FileInputStream(s + ".dat"));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not found");
		}

		// get objects from file and add them to rooms
		try {
			for(int i = 0; i < rooms.size(); i++) {
				Room r = (Room) input.readObject();
				rooms.set(i, r);
			}

			for(int i = 0; i < doors.size(); i++) {
				Door[] d = (Door[]) input.readObject();
				doors.set(i, d);
			}

			mainPlayer = (Player) input.readObject();

		} catch (EOFException e) {
			// file ended done reading - do nothing

		} catch (IOException e) {
			System.out.println("Problem reading from file");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Corrupted file - regenerate");
			e.printStackTrace();
		}


		myMap = new HashMap<Room, Door[]>()
		{
			{
				put(rooms.get(0), doors.get(0));
				put(rooms.get(1), doors.get(1));
				put(rooms.get(2), doors.get(2));
				put(rooms.get(3), doors.get(3));
				put(rooms.get(4), doors.get(4));
				put(rooms.get(5), doors.get(5));
				put(rooms.get(6), doors.get(6));
				put(rooms.get(7), doors.get(7));
				put(rooms.get(8), doors.get(8));
				put(rooms.get(9), doors.get(9));
				put(rooms.get(10), doors.get(10));
				put(rooms.get(11), doors.get(11));
				put(rooms.get(12), doors.get(12));
				put(rooms.get(13), doors.get(13));
				put(rooms.get(14), doors.get(14));
				put(rooms.get(15), doors.get(15));
				put(rooms.get(16), doors.get(16));
				put(rooms.get(17), doors.get(17));
				put(rooms.get(18), doors.get(18));
				put(rooms.get(19), doors.get(19));
				put(rooms.get(20), doors.get(20));
				put(rooms.get(21), doors.get(21));
				put(rooms.get(22), doors.get(22));
				put(rooms.get(23), doors.get(23));
				put(rooms.get(24), doors.get(24));
				put(rooms.get(25), doors.get(25));
				put(rooms.get(26), doors.get(26));
				put(rooms.get(27), doors.get(27));
				put(rooms.get(28), doors.get(28));
				put(rooms.get(29), doors.get(29));
				put(rooms.get(30), doors.get(30));
				put(rooms.get(31), doors.get(31));
			}
		};

		cycleText(mainPlayer.getRoomID().getRoomDescription());
		updateText();
		setMainScene();

	}



	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);

	}

}