package MainCode.GUI;

import static java.awt.SystemColor.text;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
//import java.awt.ScrollPane;
import java.util.HashMap;

import MainCode.Items.ConcussionGrenade;
import MainCode.Items.ECell;
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
	ECell energyCell = new ECell("Energy Cell", "A standard energy storage device", "Used to power rooms");
	
	Key redKey = new Key("Red Key Card", "A red key card", "Used to open Red doors", Arrays.asList(doors.get(0)[0]));
	Key blueKey = new Key("Blue Key Card", "A blue key card", "Used to open Blue doors", Arrays.asList(doors.get(0)[2], doors.get(3)[2]));
	Key yellowKey = new Key("Yellow Key Card", "A Yellow key card", "Used to open Yellow doors", Arrays.asList(doors.get(0)[3]));
	Key commandKey = new Key("Command Key Card", "A command key card", "Used to access the command center", Arrays.asList(doors.get(0)[1]));
	Key nanoTubeRope = new Key("NanoTube Rope", "A nano tube rope", "Used to get to space", Arrays.asList(doors.get(5)[2], doors.get(17)[0]));
	Key selectedKey;
	
	Monster rogueCleaningUnit = new Monster(30, suctionHose, "Rogue Cleaning Unit", "A pissed off vacuum cleaner, easily killed.", healthKit);
	Monster robotDoorman = new Monster(50, largeDoor, "Robot Doorman", "A well-dressed robot in moderate disprepair.", concussionGrenade);
	Monster tunnelingHorror = new Monster(50, sharkTeeth, "Tunneling Horror", "A large alien worm.", healthKit);
	Monster roboChef4000 = new Monster(50, plasmaInducer, "ROBOCHEF4000", "A deranged culinary robot with a French accent and a curly moustache.", plasmaInducer);
	Monster zocrexianInfiltrator = new Monster(50, houndTail, "Zocrexian Infiltrator", "An alien hound all the way from zocrexia.", healthKit);
	Monster littleGreenMan = new Monster(100, disintegratorPistol, "Little Green Man", "A prototypical alien..", disintegratorPistol);
	Monster cyborgPirate = new Monster(100, cutlass, "Cyborg Pirate", "A robotic pirate with a bad attitude.", blueKey);
	Monster maskedRobot = new Monster(50, wrestlingMoves, "Masked Robot", "An aggressive machine who wants to wrestle.", healthKit);
	Monster alienCommando = new Monster(100, plasmaRifle, "Alien Commando", "An incomprehensible alien with an assault weapon.", concussionGrenade);
	Monster spaceKraken = new Monster(150, tentacles, "Space Kraken", "A giant, anomalous squid.", healthKit);
	Monster returnOfCleaningUnit = new Monster(250, flameThrower, "The Return of Cleaning Unit", "A pissed off vacuum cleaner, still mad.", healthKit);
	
	//Instantiate all puzzles
	ECellPuzzle eCellPuzzle = new ECellPuzzle(energyCell);
	Puzzle communicationPuzzle = new Puzzle("Communications Puzzle","A frog is at the bottom of a 30 meter well. "
			+ "Each day he summons enough energy for one 3 meter leap up the well. Exhausted, "
			+ "he then hangs there for the rest of the day. At night, while he is asleep, "
			+ "he slips 2 meters backwards. How many days does it take him to escape from the well?  ","28 days", null);
	MagicSquare magicSquarePuzzle = new MagicSquare(commandKey);
	Puzzle wolvesPuzzle = new Puzzle("Wolves Puzzle","Six wolves catch six lambs in six minutes.  How many wolves "
			+ "will be needed to catch sixty lambs in sixty minutes?","6", energyCell);
	Puzzle brothersPuzzle = new Puzzle("Brothers Puzzle","Brothers and sisters I have none but this man's "
			+ "father is my father's son. Who is the man?","the man is my son", concussionGrenade);
	Puzzle travelPuzzle = new Puzzle("Traveling Puzzle","What can travel around the world, while staying in a corner?","stamp", null);
	Puzzle headPuzzle = new Puzzle("Head Puzzle","What has a head and a tail but no body?","a coin", null);
	Puzzle computerSystemPuzzle = new Puzzle("Computer System Puzzle","Who is the test for AI in a computer system named for?","turing", null);
	Puzzle towelPuzzle = new Puzzle("Wetter Puzzle","What gets wetter and wetter the more it dries? ","A towel", null);
	
	Stage theStage;
	
	Scene mainScene, fightScene, puzzleScene, menuScene, newGameScene, loadGameScene, keyScene, powerScene, deathScene;
	
	BorderPane mainPane = new BorderPane();
	BorderPane puzzlePane = new BorderPane();
	BorderPane fightPane = new BorderPane();
	BorderPane menuPane= new BorderPane();
	GridPane directionalGrid = new GridPane();
	VBox roomInfoPane = new VBox();
	GridPane myGrid = new GridPane();
	GridPane fightGrid = new GridPane();
	VBox puzzleBox = new VBox();
	GridPane mainInvPane = new GridPane();
	ScrollPane roomInvPane = new ScrollPane();
	ScrollPane playerInvPane = new ScrollPane();
	VBox menuButtonPane = new VBox();

	
	VBox newGamePane = new VBox();
	VBox loadGamePane = new VBox();
	GridPane loadGameGrid = new GridPane();
	Text newGameNameHeader = new Text("Enter Your Name");
	TextField newGameNameScanner = new TextField();
	Button submitNewNameBtn = new Button("Submit");
	
	Text loadGameNameHeader = new Text("Load Your Game");
	TextField loadGameNameScanner = new TextField();
	Button submitLoadNameBtn = new Button("Submit");
	
	
	Player mainPlayer = new Player(500, bareHands, rooms.get(0), "Player");
	Monster mainMonster = mainPlayer.getRoomID().getMonster();
	Puzzle mainPuzzle = mainPlayer.getRoomID().getPuzzle();
	Button startFightBtn = new Button("Start Fight");

	VBox textScroller = new VBox();
	Text action2 = new Text();
	Text action1 = new Text();
	Text action0 = new Text();
	Text roomNameText = new Text();
	
	//Make the title, make it pretty, and center it
	Label menuTitle = new Label("Galaxy Explorer");

	
	Text playerHealthHeader = new Text("Your Health: ");
    Text monsterPaneHeader = new Text("Monster in this room:");
    Text monsterPaneMonster = new Text();
    Text puzzlePaneHeader = new Text("Puzzle in this room:");
    Text puzzlePanePuzzle = new Text();
	
	

	Label monsterName = new Label();
	Label playerName = new Label(mainPlayer.getName());
	Label monsterHealth = new Label();
	Label playerHealth = new Label("" + mainPlayer.getHealth());
	Label puzzleName = new Label();
	
	Text playerHealthMain = new Text();
	
	
	Text roomItems = new Text();
	Text playerItems= new Text();
	
	Text puzzleDescription = new Text();
    TextField puzzleScanner = new TextField();
	
	
	private Button attackBtn = new Button("Attack");
	private Button returnBtn = new Button("Return");
	
	//DIRECTION BUTTONS
	private Button northBtn = new Button("north");
	private Button southBtn = new Button("south");
	private Button eastBtn = new Button("east");
	private Button westBtn = new Button("west");
	
	//MainMenuButtons
			Button newGame = new Button("New Game");
			Button loadGame = new Button("Load Game");
			Button help = new Button("Help");
			Button quit= new Button("Quit");
			
			Button saveGameBtn = new Button("Save");
	
	//Puzzle Buttons
	private Button startPuzzleBtn = new Button("Examine Puzzle");
	
	//INVENTORY BUTTONS
	private Button takeItemBtn = new Button("Take Item");
	private Button useItemBtn = new Button("Use Item");
	
	
	//INVENTORY
	ObservableList<Item> obRoomInv;
	ObservableList<Item> obPlayerInv;
	ListView<Item> roomItemList = new ListView<>(obRoomInv);
	ListView<Item> playerItemList = new ListView<>(obPlayerInv);
	
	//Key Fields
	GridPane keyGrid = new GridPane();
	BorderPane keyPane = new BorderPane();
	Text keyHeader = new Text("Use key card on which door?");
	Button northDoor = new Button("North Door");
	Button southDoor = new Button("South Door");
	Button eastDoor = new Button("East Door");
	Button westDoor = new Button("West Door");
	Button exitKeyScene = new Button("Return");
	
	//power Fields
	VBox powerVBox = new VBox();
	BorderPane powerPane = new BorderPane();
	Text powerHeader = new Text("Which room will you power?");
	Button engineRoomBtn = new Button("Engine Room");
	Button shipsAIBtn = new Button("Ships AI");
	Button navigationsBtn = new Button("Navigations");
	Button exitPowerScene = new Button("Return");
	
	//DeathScene
	VBox deathVBox = new VBox();
	BorderPane deathPane = new BorderPane();
	Text deathText = new Text("You Have Died a Valiant Death");
	Button returnToMenu = new Button("Return to Main Menu");
	GridPane deathGrid = new GridPane();
	
	//Description
	Text gameDescription = new Text("NEWS FLASH "
			+ "\n\nToday’s the day folks, after years of research and planning the first space voyage that requires its members to be placed into stasis happens "
			+ "\ntoday.  In just a few moments we will watch live as the crew is launched on this momentous journey.  Their destination is a planet which they believe "
			+ "\nwill support life as we know it. The journey is so long that the crew will have to be placed in stasis for the duration.  Each crew member has been "
			+ "\ncarefully selected to ensure the crew has a good mix of skill sets to colonize this new planet.  Once launched we will receive word from the pilot "
			+ "\nconfirming all systems are operational before the pilot joins the rest of his crew in stasis. After this we will have no contact with the human crew "
			+ "\nuntil they reach their destination. Our thoughts and prayers will be with these brave men and women. "
			+ "\n\nAt launch site "
			+ "\n\nIt’s finally the day, you were selected for this mission almost two years ago. Since then you've spent hours upon hours learning about the ship so "
			+ "\nyou can be the most effective ship engineer you can be.  There’s been countless plans and meetings and check-ups but it has all been worth it because "
			+ "\nnow you’re walking into the ship which will take you to an entirely unknown planet.  One of the many doctors comes up and begins fitting you with "
			+ "\nwires and monitors that will keep your body alive during the journey. They tell you not to worry it’ll just feel like you’re going to sleep and when "
			+ "\nyou wake up you’ll be somewhere new. A nurse comes over and with the doctor the two get you situated in the pod and begin hooking up wires."
			+ "\n\n'Are you ready?', the doctor asks. "
			+ "\n\nYou nod, too nervous to speak. "
			+ "\nThe doctor smiles lightly and presses some buttons, the world begins to grey and you let your eyes slide "
			+ "\nclosed secure in the knowledge when you wake you’ll be at a new planet. "
			+ "\n\nLevel 1 goal: open the command center "
			+ "\nLevel 2 goal: power up the ship's AI "
			+ "\nLevel 3 goal: power up the engine room "
			+ "\nLevel 4 goal (final): power up the navigation then return to the command center to fly off ");

	File cwdFile = new File (".");
	String cwd = cwdFile.getAbsolutePath();
	
    @Override
    public void start(Stage primaryStage){
    	
    	
    	theStage = primaryStage;
    	
        returnToMenu.setOnAction(e -> setMainMenu());

        startFightBtn.setOnAction(e -> setFightScene());
        returnBtn.setOnAction(e -> setMainScene());
		attackBtn.setOnAction(e -> doDamage());
		
		northBtn.setOnAction(e -> moveNorth());
		southBtn.setOnAction(e -> moveSouth());
		eastBtn.setOnAction(e -> moveEast());
		westBtn.setOnAction(e -> moveWest());
		
		startPuzzleBtn.setOnAction(e -> setPuzzleScene());
		
		takeItemBtn.setOnAction(e -> takeItem());
		useItemBtn.setOnAction(e -> useItem());
		newGame.setOnAction(e -> setNewGameScene());
		loadGame.setOnAction(e -> setLoadGameScene());
		saveGameBtn.setOnAction(e -> saveGame());
		
		action0.setText(mainPlayer.getRoomID().getRoomDescription());
		action0.setWrappingWidth(650);
		action1.setWrappingWidth(650);
		action2.setWrappingWidth(650);
		
		northDoor.setOnAction(e -> cycleText(selectedKey.itemFunction(myMap.get(mainPlayer.getRoomID())[0])));
		southDoor.setOnAction(e -> cycleText(selectedKey.itemFunction(myMap.get(mainPlayer.getRoomID())[1])));
		eastDoor.setOnAction(e -> cycleText(selectedKey.itemFunction(myMap.get(mainPlayer.getRoomID())[2])));
		westDoor.setOnAction(e -> cycleText(selectedKey.itemFunction(myMap.get(mainPlayer.getRoomID())[3])));
		exitKeyScene.setOnAction(e -> setMainScene());
		
		
		engineRoomBtn.setOnAction(e -> powerRoom(rooms.get(25)));
		shipsAIBtn.setOnAction(e -> powerRoom(rooms.get(31)));
		navigationsBtn.setOnAction(e -> powerRoom(rooms.get(30)));
		exitPowerScene.setOnAction(e -> setMainScene());
        

        
		textScroller.setAlignment(Pos.CENTER);
		textScroller.getChildren().addAll(action2, action1, action0);
		
		
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
		newGamePane.getChildren().addAll(gameDescription, newGameNameHeader, newGameNameScanner);
		newGameNameScanner.setOnAction(e -> startNewGame(newGameNameScanner.getText()));
		
		//LOAD GAME INTERFACE
		loadGamePane.getChildren().addAll(loadGameNameHeader, loadGameNameScanner);
		loadGameNameScanner.setOnAction(e -> loadGame(loadGameNameScanner.getText()));
		loadGameGrid.add(loadGamePane, 1, 1);
		loadGameGrid.add(returnToMenu, 1, 2);
        
        //MOVEMENT
        directionalGrid.setAlignment(Pos.CENTER);
        directionalGrid.add(northBtn, 1, 0);
        directionalGrid.add(southBtn, 1, 2);
        directionalGrid.add(eastBtn, 2, 1);
        directionalGrid.add(westBtn, 0, 1);
        
        //MONSTER AND PUZZLE INFO
        playerHealthMain.setText(mainPlayer.getHealth() + "/" + mainPlayer.getMaxHealth());
        roomInfoPane.setAlignment(Pos.CENTER);
        roomInfoPane.setPadding(new Insets(10,10,10,10));
        roomInfoPane.getChildren().addAll(playerHealthHeader, playerHealthMain, monsterPaneHeader, monsterPaneMonster, startFightBtn, puzzlePaneHeader, puzzlePanePuzzle, startPuzzleBtn);
        
        
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
        

		
		
		
		//PUZZLE INTERFACE
		puzzleBox.setAlignment(Pos.CENTER);
        
        puzzleScanner.setOnAction(e -> tryPuzzle(puzzleScanner.getText()));
        puzzleBox.getChildren().addAll(puzzleDescription, puzzleScanner, returnBtn);
        
        
        puzzlePane.setCenter(puzzleBox);
        puzzlePane.setTop(puzzleName);
		
        
        
        //ItemInterface
        mainPlayer.takeItem(healthKit);
        //mainPlayer.getRoomID().getRoomInv().addItem(concussionGrenade);
        obPlayerInv = FXCollections.observableArrayList(mainPlayer.getSpriteInv().getItemList());
        playerItemList = new ListView<>(obPlayerInv);
        obRoomInv = FXCollections.observableArrayList(mainPlayer.getRoomID().getRoomInv().getItemList());
        roomItemList = new ListView<>(obRoomInv);
        
        roomItemList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        playerItemList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        
        roomInvPane.setContent(roomItemList);
        playerInvPane.setContent(playerItemList);
        mainInvPane.add(new Text("Room Items"), 0, 0);
        mainInvPane.add(new Text("Player Items"), 1, 0);
        mainInvPane.add(roomInvPane, 0, 1);
        mainInvPane.add(playerInvPane, 1, 1);
        mainInvPane.add(takeItemBtn, 0, 2);
        mainInvPane.add(useItemBtn, 1, 2);
        mainInvPane.setAlignment(Pos.CENTER);
        mainInvPane.setMaxHeight(300);
        
        
        //KEY INTERFACE
        keyGrid.setAlignment(Pos.CENTER);
        keyGrid.setPadding(new Insets(10,10,10,10));
		keyGrid.setHgap(5.0);
		keyGrid.setVgap(10.0);
        keyGrid.add(northDoor, 1, 0);
        keyGrid.add(southDoor, 1, 2);
        keyGrid.add(eastDoor, 2, 1);
        keyGrid.add(westDoor, 0, 1);
        keyGrid.add(exitKeyScene, 1, 3);
        keyPane.setCenter(keyGrid);
        keyPane.setTop(keyHeader);
		
        
        //Power Interface
        powerVBox.setAlignment(Pos.CENTER);
        powerVBox.setPadding(new Insets(10,10,10,10));
        powerVBox.getChildren().addAll(engineRoomBtn, shipsAIBtn, navigationsBtn, exitPowerScene);
        powerPane.setCenter(powerVBox);
        powerPane.setTop(powerHeader);
        
        //Death
        deathVBox.getChildren().addAll(deathText, returnToMenu);
        deathGrid.add(deathVBox, 0, 0);
        deathPane.setCenter(deathGrid);
		
		mainPane.setTop(saveGameBtn);
        mainPane.setCenter(directionalGrid);
        mainPane.setRight(roomInfoPane);
        mainPane.setBottom(textScroller);
        mainPane.setLeft(mainInvPane);
        
        deathScene = new Scene(deathPane, 800, 500);
        mainScene = new Scene(mainPane, 800, 500);
        fightScene = new Scene(fightPane, 800, 500);
        puzzleScene = new Scene(puzzlePane, 800, 500);
        menuScene = new Scene(menuPane, 800,500);
        keyScene = new Scene(keyPane, 800,500);
        powerScene = new Scene(powerPane, 800,500);
        
        newGameScene = new Scene(newGamePane, 800, 500);
        loadGameScene = new Scene(loadGameGrid, 800, 500);
        
        theStage.setTitle("Galaxy Explorer");
        theStage.setScene(menuScene);
        theStage.show();
    }

    
    
    private void powerRoom(Room room) {
    	if(room.isPowered()){
    		cycleText(room.getRoomName() + " is already powered.");
    	}
    	else{
		cycleText(energyCell.itemFunction(room));
		mainPlayer.getSpriteInv().removeItem(energyCell);
    	}
    	updateText();
	}



	private void takeItem() {
		cycleText(mainPlayer.takeItem(roomItemList.getSelectionModel().getSelectedItem()));
		mainPlayer.getRoomID().getRoomInv().removeItem(roomItemList.getSelectionModel().getSelectedItem());
		updateText();
		
	}
    
    private void useItem(){
    	if(playerItemList.getSelectionModel().getSelectedItem() instanceof Weapon){
    		cycleText(mainPlayer.equipWeapon((Weapon) playerItemList.getSelectionModel().getSelectedItem()));
    		mainPlayer.getSpriteInv().removeItem(((Weapon) playerItemList.getSelectionModel().getSelectedItem()));
    	}
    	if(playerItemList.getSelectionModel().getSelectedItem() instanceof HealthPack){
    		cycleText(((HealthPack) playerItemList.getSelectionModel().getSelectedItem()).itemFunction(mainPlayer));
    		mainPlayer.getSpriteInv().removeItem(((HealthPack) playerItemList.getSelectionModel().getSelectedItem()));
    		updateText();
    	}
    	if(playerItemList.getSelectionModel().getSelectedItem() instanceof ConcussionGrenade){
    		cycleText(((ConcussionGrenade) playerItemList.getSelectionModel().getSelectedItem()).itemFuction(mainMonster));
    		mainPlayer.getSpriteInv().removeItem(((ConcussionGrenade) playerItemList.getSelectionModel().getSelectedItem()));
    	}
    	if(playerItemList.getSelectionModel().getSelectedItem() instanceof Key){
    		selectedKey = (Key) playerItemList.getSelectionModel().getSelectedItem();
    		setKeyScene();
    	}
    	if(playerItemList.getSelectionModel().getSelectedItem() instanceof ECell){
    		if(mainPlayer.getRoomID() == rooms.get(19)){
    		setPowerScene();
    		}
    		else{
    			cycleText("This ECell can be used in the Command Center.");
    		}
    	}
    }

    private void setMainMenu()
    {
    	
    	theStage.setScene(menuScene);
    	updateText();
    }
    private void setPowerScene(){
    	powerPane.setBottom(textScroller);
    	theStage.setScene(powerScene);
    	updateText();
    }

    private void setKeyScene(){
    	keyPane.setBottom(textScroller);
    	theStage.setScene(keyScene);
    	updateText();
    }
    
    private void setNewGameScene(){
    	theStage.setScene(newGameScene);
    }
    
    private void setLoadGameScene(){
    	theStage.setScene(loadGameScene);
    }

	private void tryPuzzle(String s) {
    	cycleText((mainPlayer.tryPuzzle(s, mainPuzzle)));
    	if(mainPuzzle.isSolved() == true){
    		mainPlayer.getRoomID().getRoomInv().addItem(mainPuzzle.getItemDrop());
    	}
    	updateText();
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
    	mainPane.setBottom(textScroller);
		theStage.setScene(mainScene);
	}
    
	private void setPuzzleScene() {
		puzzlePane.setBottom(textScroller);
		theStage.setScene(puzzleScene);
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
		else if(mainPlayer.getHealth() <= 0)
		{
			theStage.setScene(deathScene);
		}
		else{
		recieveDamage();
		}
		
	}
	
	private void recieveDamage(){
		cycleText(mainPlayer.takeDamage(mainMonster));
		updateText();
	}
	
	
	private void updateHealth(){
		playerHealth.setText(mainPlayer.getHealth() + "/" + mainPlayer.getMaxHealth());
		monsterHealth.setText(mainMonster.getHealth() + "/" + mainMonster.getMaxHealth());
	}
	
	private void updateText(){
		mainMonster = mainPlayer.getRoomID().getMonster();
		mainPuzzle = mainPlayer.getRoomID().getPuzzle();
		playerHealth.setText(mainPlayer.getHealth() + "/" + mainPlayer.getMaxHealth());
		playerHealthMain.setText(mainPlayer.getHealth() + "/" + mainPlayer.getMaxHealth());
		

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
		
		
		if(mainPuzzle == null || mainPuzzle.isSolved() == true){
			mainPuzzle = null;
			puzzlePanePuzzle.setText("No Puzzle");
			puzzleDescription.setText("Theres nothing here");
			puzzleScanner.setOnAction(e -> cycleText("I said there's nothing here."));
			
			
		}
		else{
			puzzlePanePuzzle.setText(mainPuzzle.getPuzzleName());
			puzzleDescription.setText(mainPuzzle.getPuzzleDescription());
			puzzleScanner.setOnAction(e -> tryPuzzle(puzzleScanner.getText()));
		}
		
		if(rooms.get(25).isPowered()==true && rooms.get(30).isPowered() == true && rooms.get(31).isPowered() == true){
			cycleText("All systems online. You Win!");
		}
		
		
	}

	public Puzzle getMainPuzzle() {
		return mainPuzzle;
	}



	public void setMainPuzzle(Puzzle mainPuzzle) {
		this.mainPuzzle = mainPuzzle;
	}
	
	
	public void startNewGame(String s){
		rooms = rf.newRooms();
		doors = rf.newDoors();
		
		redKey = new Key("Red Key Card", "A red key card", "Used to open Red doors", Arrays.asList(doors.get(0)[0]));
		blueKey = new Key("Blue Key Card", "A blue key card", "Used to open Blue doors", Arrays.asList(doors.get(0)[2], doors.get(3)[2]));
		yellowKey = new Key("Yellow Key Card", "A Yellow key card", "Used to open Yellow doors", Arrays.asList(doors.get(0)[3]));
		commandKey = new Key("Command Key Card", "A command key card", "Used to access the command center", Arrays.asList(doors.get(0)[1]));
		nanoTubeRope = new Key("NanoTube Rope", "A nano tube rope", "Used to get to space", Arrays.asList(doors.get(5)[2], doors.get(17)[0]));
		
		magicSquarePuzzle.setItemDrop(commandKey);
		cyborgPirate.setItemDrop(blueKey);
		
		//set monsters
		rooms.get(1).setMonster(rogueCleaningUnit);
		rooms.get(7).setMonster(cyborgPirate);
		rooms.get(19).setMonster(tunnelingHorror);
		rooms.get(23).setMonster(spaceKraken);
		rooms.get(25).setMonster(alienCommando);
		rooms.get(30).setMonster(littleGreenMan);
		rooms.get(31).setMonster(cyborgPirate);
		
		//set keys
		rooms.get(0).getRoomInv().addItem(redKey);
		rooms.get(9).getRoomInv().addItem(nanoTubeRope);
		rooms.get(31).getRoomInv().addItem(yellowKey);
		
		
		rooms.get(1).getRoomInv().addItem(leadPipe);
		rooms.get(15).getRoomInv().addItem(disintegratorPistol);
		
		rooms.get(6).setPuzzle(eCellPuzzle);
		rooms.get(9).setPuzzle(magicSquarePuzzle);
		rooms.get(10).setPuzzle(eCellPuzzle);
		rooms.get(12).setPuzzle(eCellPuzzle);
		rooms.get(20).setPuzzle(eCellPuzzle);
		rooms.get(22).setPuzzle(brothersPuzzle);
		rooms.get(27).setPuzzle(wolvesPuzzle);
		
		
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
		
		mainPlayer = new Player(500, bareHands, rooms.get(0), s);
		
		
		cycleText(mainPlayer.getRoomID().getRoomDescription());
		updateText();
		setMainScene();
	}
	
	public void saveGame(){
		try
        {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(cwd + mainPlayer.getName() + ".dat"));
            
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
					input = new ObjectInputStream(new FileInputStream(cwd + s + ".dat"));
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
				
				redKey = new Key("Red Key Card", "A red key card", "Used to open Red doors", Arrays.asList(doors.get(0)[0]));
				blueKey = new Key("Blue Key Card", "A blue key card", "Used to open Blue doors", Arrays.asList(doors.get(0)[2], doors.get(3)[2]));
				yellowKey = new Key("Yellow Key Card", "A Yellow key card", "Used to open Yellow doors", Arrays.asList(doors.get(0)[3]));
				commandKey = new Key("Command Key Card", "A command key card", "Used to access the command center", Arrays.asList(doors.get(0)[1]));
				nanoTubeRope = new Key("NanoTube Rope", "A nano tube rope", "Used to get to space", Arrays.asList(doors.get(5)[2], doors.get(17)[0]));
				
				magicSquarePuzzle.setItemDrop(commandKey);
				cyborgPirate.setItemDrop(blueKey);
				
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
	private void shipsAIText()
	{
		
	}



	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}