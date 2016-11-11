package MainCode.GUI;

import static java.awt.SystemColor.text;

import java.util.HashMap;

import MainCode.Items.Weapon;
import MainCode.Monster.Monster;
import MainCode.Monster.Player;
import MainCode.Puzzles.Puzzle;
import MainCode.Rooms.Door;
import MainCode.Rooms.Room;
import MainCode.Rooms.RoomFactory;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.*;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class MainGUI extends Application {

	
public Room room0 = new Room(0, "The room has 4 doors and each door has a name plate above it. To the west is a yellow door marked, to the east is a blue door both marked \"Hallway\". To the south holds a grey door labeled \"Command Center\" and to the north is a red door labeled \"Cryogenics Room\".", null, null, false, true);
	
	public Room room1 = new Room(1, "The walls are dull grey and lined with the statis units for other crew members, they too appear fine, just out. The room has 4 doors and each door has a name plate above it. To the west and east there are black doors, the west is labeled \"Engine Room\" and the east is labeled \"Ship AI\". To the north and south are red doors labeled \"Cryogenics Room\"", null, null, false, true);
	
	public Room room2 = new Room(2,"The crew in this rooms appears to be fine as well, sleeping in their cham-bers.  ", null, null, false, true);
	
	public Room room3 = new Room(3,"The room is a dull metal grey with three doors each with a name plate.", null, null, false, true);
	
	public Room room4 = new Room(4,"The room is dull metal grey with two doors. The crew in this room appears fine", null, null, false, true);
	
	public Room room5 = new Room(5,"The room is dull metal grey with three doors. The door to the east is the same dull grey as the rest of the ship but there appears to be a window near the top.  You give the stasis chambers a quick glance to ensure the crew is fine then go to check the window. The window is small but you can just make out what appears to be a room with something in it.  As you step back your foot catches against something on the floor.  Upon inspection, you realize there is an anchor point on the floor next to the door. ", null, null, false, true);
	
	public Room room6 = new Room(6,"The room is grey with two exits.", null, null, false, true);
	
	public Room room7 = new Room(7,"The grey walls continue into this room as do the red doors.", null, null, false, true);
	
	public Room room8 = new Room(8,"The walls are grey and there are two doors.", null, null, false, true);
	
	public Room room9 = new Room(9,"Just like the other rooms it is dull gray but with a flickering overhead light.  Looking around the room the all the monitors are public except for the one in the command center which appears to be in working order.", null, null, false, true);
	
	public Room room10 = new Room(10,"Once the door is pried open the air is sucking around you pulling you to the leaking hole.  Crawling around the wall you have reached the E-Cell create.", null, null, false, true);
	
	public Room room11 = new Room(11, "Another hallway with dull gray walls", null, null, false, true);
	
	public Room room12 = new Room(12,"Like most of the hallways on the ship this is another dull gray walled room.", null, null, false, true);
	
	public Room room13 = new Room(13,"This room is abnormally dark even compared to the crippled ship.  The light blinking on the server bank are creating a dancing shadow effect, giving a serial effect.", null, null, false, true);
	
	public Room room14 = new Room(14,"You're struck by how well this room is intact and seems to be in working order.  All server banks seem to be powered on and communicating with the main system. ", null, null, false, true);
	
	public Room room15 = new Room(15,"This room largely resembles the others, with black server racks occupying most of the space.", null, null, false, true);
	
	public Room room16 = new Room(16,"Besides the usual grey, the walls of this room are lined with blade servers, most of which remain relatively unscathed.", null, null, false, true);
	
	public Room room17 = new Room(17,"These hallways all look the same, with the only indication that you've moved being the signs on the floor. That, and the fact that this room is just as cold as the cryogenic rooms.", null, null, false, true);
	
	public Room room18 = new Room(18,"The walls of this hallway are a uniform grey throughout. Only about a quar-ter of the lights are working, so it is fairly dark.", null, null, false, true);
	
	public Room room19 = new Room(19,"When you enter, the room is lit only by back power making it very dim.", null, null, false, true);
	
	public Room room20 = new Room(20, "The hallway towards Communications is long, and includes two sections the walls are a neutral grey color, with the outlines of wall panels visible in some places.", null, null, false, true);
	
	public Room room21 = new Room(21,"The second section of the hallway towards the com room seems identical to the first.", null, null, false, true);
	
	public Room room22 = new Room(22,"This room is a uniform drab grey like the others. A few computer terminals with blinking lights populate the otherwise sparsely furnished room.", null, null, false, true);
	
	public Room room23 = new Room(23,"The walls in this room are formed by dark paneling, but the lights are almost bright enough to hurt your eyes. There are quite a few terminals in this room as well, with a large table in the center which projects various holographic images above it. The panels cover every inch of the interior, with the excep-tion of the western wall, which is a large window.", null, null, false, true);
	
	public Room room24 = new Room(24,"This is a dull grey room lined with empty cargo crates. There are two doors in this room, one yellow door to the north and a black door to the east.", null, null, false, true);
	
	public Room room25 = new Room(25,"This is a large grey room with multiple exits. There is a large Ion Thruster in the middle of the room. The Ion thruster is not powered on, and all indicator gauges show that there is not enough impulse power to provide sufficient propulsion for escape. Damage to the thruster and missing e-cells are prohib-iting the engine from powering up.", null, null, false, true);
	
	public Room room26 = new Room(26,"This is a dull grey room with empty shelves.", null, null, false, true);
	
	public Room room27 = new Room(27,"This is a dull grey room with six empty Energy Cell crates and one locked energy crate.", null, null, false, true);
	
	public Room room28 = new Room(28,"This room has panoramic viewing windows, the length of the room. Through these windows one can see our indigenous galaxy.", null, null, false, true);
	
	public Room room29 = new Room(29,"This a dull grey room. This room has panoramic windows but the ships win-dow shutters are closed.", null, null, false, true);
	
	public Room room30 = new Room(30,"There is only one way in and one way out in this room. There is an elaborate navigation control panel. Some of the gauges are damaged but overall the navigation controls appear to be fully functional.", null, null, false, true);
	
	public Room room31 = new Room(31,"You can barely see through the darkness to find the terminal to plug in the E-cell.", null, null, false, true);
	
	
	
	public Door[] room0Doors = {new Door(room1, "north"), new Door(room19, "south", true), new Door(room11, "east"), new Door(room20, "west")};
	public Door[] room1Doors = {new Door(room2, "north"), new Door(room0, "south"), new Door(room31, "east"), new Door(room25, "west")};
	public Door[] room2Doors = {new Door(room3, "north"), new Door(room1, "south"), new Door(room31, "east"), new Door(room25, "west")};
	public Door[] room3Doors = {new Door(room4, "north"), new Door(room2, "south"), new Door(room18, "east"), new Door(null, "west")};
	public Door[] room4Doors = {new Door(room5, "north"), new Door(room3, "south"), new Door(null, "east"), new Door(null, "west")};
	public Door[] room5Doors = {new Door(room6, "north"), new Door(room4, "south"), new Door(room10, "east"), new Door(null, "west")};
	public Door[] room6Doors = {new Door(null, "north"), new Door(room5, "south"), new Door(room7, "east"), new Door(null, "west")};
	public Door[] room7Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room8, "east"), new Door(room7, "west")};
	public Door[] room8Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room9, "east"), new Door(room7, "west")};
	public Door[] room9Doors = {new Door(null, "north"), new Door(null, "south"), new Door(null, "east"), new Door(room8, "west")};
	public Door[] room10Doors = {new Door(null, "north"), new Door(room17, "south"), new Door(null, "east"), new Door(room5, "west")};
	public Door[] room11Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room12, "east"), new Door(room0, "west")};
	public Door[] room12Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room13, "east"), new Door(room11, "west")};
	public Door[] room13Doors = {new Door(room14, "north"), new Door(null, "south"), new Door(null, "east"), new Door(room12, "west")};
	public Door[] room14Doors = {new Door(room15, "north"), new Door(room13, "south"), new Door(null, "east"), new Door(room31, "west")};
	public Door[] room15Doors = {new Door(room16, "north"), new Door(room14, "south"), new Door(null, "east"), new Door(room31, "west")};
	public Door[] room16Doors = {new Door(null, "north"), new Door(room15, "south"), new Door(null, "east"), new Door(room17, "west")};
	public Door[] room17Doors = {new Door(room10, "north"), new Door(null, "south"), new Door(room16, "east"), new Door(room18, "west")};
	public Door[] room18Doors = {new Door(null, "north"), new Door(null, "south"), new Door(room17, "east"), new Door(room3, "west")};
	public Door[] room19Doors = {new Door(room0, "north"), new Door(null, "south"), new Door(null, "east"), new Door(null, "west")};
	public Door[] room20Doors = {new Door(room25, "north"), new Door(null, "south"), new Door(room0, "east"), new Door(room21, "west")};
	public Door[] room21Doors = {new Door(room25, "north"), new Door(null, "south"), new Door(room20, "east"), new Door(room22, "west")};
	public Door[] room22Doors = {new Door(room23, "north"), new Door(null, "south"), new Door(room21, "east"), new Door(null, "west")};
	public Door[] room23Doors = {new Door(room24, "north"), new Door(room22, "south"), new Door(room25, "east"), new Door(null, "west")};
	public Door[] room24Doors = {new Door(room26, "north"), new Door(room23, "south"), new Door(room25, "east"), new Door(null, "west")};
	public Door[] room25Doors = {new Door(room2, "northeast"), new Door(room1, "southeast"), new Door(room24, "northwest"), new Door(room23, "southwest")};
	public Door[] room26Doors = {new Door(room27, "north"), new Door(room24, "south"), new Door(null, "east"), new Door(null, "west")};
	public Door[] room27Doors = {new Door(room28, "north"), new Door(room26, "south"), new Door(null, "east"), new Door(null, "west")};
	public Door[] room28Doors = {new Door(room29, "north"), new Door(room27, "south"), new Door(null, "east"), new Door(null, "west")};
	public Door[] room29Doors = {new Door(room30, "north"), new Door(room28, "south"), new Door(null, "east"), new Door(null, "west")};
	public Door[] room30Doors = {new Door(null, "north"), new Door(room29, "south"), new Door(null, "east"), new Door(null, "west")};
	public Door[] room31Doors = {new Door(room15, "northeast"), new Door(room14, "southeast"), new Door(room2, "northwest"), new Door(room1, "southwest")};
	
	
	public HashMap<Room, Door[]> myMap = new HashMap<Room, Door[]>()
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
	
	
	Stage theStage;
	Scene mainScene, fightScene, puzzleScene;
	
	BorderPane mainPane = new BorderPane();
	BorderPane puzzlePane = new BorderPane();
	BorderPane fightPane = new BorderPane();
	
	Weapon theWeapon = new Weapon("dull blade", "a dull blade", "cut stuff, obviously", 50);
	Player mainPlayer = new Player(200, theWeapon, room0);
	Monster mainMonster = new Monster(100, theWeapon, "cleaner bot", "This is a monster", null);
	Puzzle mainPuzzle = new Puzzle("Test Puzzle", "xyzzy", "The is the test Puzzle. The solution is 'xyzzy'", null);
	Button startFightBtn = new Button("Start Fight");

	VBox textScroller = new VBox();
	Text action2 = new Text();
	Text action1 = new Text();
	Text action0 = new Text();
	
	
	private Label mainText = new Label("Fight GUI");
	private Label monsterName = new Label(mainMonster.getName());
	private Label playerName = new Label(mainPlayer.getName());
	private Label monsterHealth = new Label(String.valueOf(mainMonster.getHealth()) + "/" + String.valueOf(mainMonster.getMaxHealth()));
	private Label playerHealth = new Label(String.valueOf(mainPlayer.getHealth()) + "/" + String.valueOf(mainPlayer.getMaxHealth()));
	private Label puzzleName = new Label(mainPuzzle.getPuzzleName());
	
	
	private Button attackBtn = new Button("Attack");
	private Button returnBtn = new Button("Return");
	
	//DIRECTION BUTTONS
	private Button northBtn = new Button("north");
	private Button southBtn = new Button("south");
	private Button eastBtn = new Button("east");
	private Button westBtn = new Button("west");
	
	//Puzzle Buttons
	private Button startPuzzleBtn = new Button("Examine Puzzle");
	
	
	
	
	GridPane myGrid = new GridPane();
	

    
    @Override
    public void start(Stage primaryStage){
    	theStage = primaryStage;

        startFightBtn.setOnAction(e -> setFightScene());
        returnBtn.setOnAction(e -> setMainScene());
		attackBtn.setOnAction(e -> doDamage());
		
		northBtn.setOnAction(e -> moveNorth());
		southBtn.setOnAction(e -> moveSouth());
		eastBtn.setOnAction(e -> moveEast());
		westBtn.setOnAction(e -> moveWest());
		
		startPuzzleBtn.setOnAction(e -> setPuzzleScene());
		
		action0.setText(mainPlayer.getRoomID().getRoomDescription());
		action0.setWrappingWidth(650);
		action1.setWrappingWidth(650);
		action2.setWrappingWidth(650);
		
        

        
		textScroller.setAlignment(Pos.CENTER);
		textScroller.getChildren().addAll(action2, action1, action0);
		
//		GridPane textGrid = new GridPane();
//		textGrid.setAlignment(Pos.CENTER);
//        textGrid.add(lastActions, 1, 0);
//        textGrid.add(currentActions, 1, 2);
        
        
        GridPane directionalGrid = new GridPane();
        directionalGrid.setAlignment(Pos.CENTER);
        directionalGrid.add(northBtn, 1, 0);
        directionalGrid.add(southBtn, 1, 2);
        directionalGrid.add(eastBtn, 2, 1);
        directionalGrid.add(westBtn, 0, 1);
        
        
        VBox roomMonsterPane = new VBox();
        Text monsterPaneHeader = new Text("Monster in this room:");
        Text monsterPaneMonster = new Text(mainMonster.getName());
        Text puzzlePaneHeader = new Text("Puzzle in this room:");
        Text puzzlePanePuzzle = new Text(mainPuzzle.getPuzzleName());
        roomMonsterPane.setAlignment(Pos.CENTER);
        roomMonsterPane.setPadding(new Insets(10,10,10,10));
        roomMonsterPane.getChildren().addAll(monsterPaneHeader, monsterPaneMonster, startFightBtn, puzzlePaneHeader, puzzlePanePuzzle, startPuzzleBtn);
        
        
        
        
        
        mainPane.setCenter(directionalGrid);
        mainPane.setRight(roomMonsterPane);
        mainPane.setBottom(textScroller);


        
        
		fightPane.setCenter(getGrid());
		
		
		
		VBox puzzleBox = new VBox();
		puzzleBox.setAlignment(Pos.CENTER);
        Text puzzleDescription = new Text(mainPuzzle.getPuzzleDescription());
        TextField puzzleScanner = new TextField();
        puzzleScanner.setOnAction(e -> tryPuzzle(puzzleScanner.getText()));
        puzzleBox.getChildren().addAll(puzzleDescription, puzzleScanner, returnBtn);
        
        
        puzzlePane.setCenter(puzzleBox);
		
		
		
		

		
		
       
        
        mainScene = new Scene(mainPane, 1000, 1000);
        fightScene = new Scene(fightPane, 1000, 1000);
        puzzleScene = new Scene(puzzlePane, 1000, 1000);
        
        theStage.setTitle("Galaxy Explorer");
        theStage.setScene(mainScene);
        theStage.show();
    }

    
    
    private void tryPuzzle(String s) {
    	cycleText((mainPlayer.tryPuzzle(s, mainPuzzle)));
	}







	private void moveNorth() {
		cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[0]));
	}
    
    private void moveSouth() {
    	cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[1]));
	}
    
    private void moveEast() {
    	cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[2]));
	}
    
    private void moveWest() {
    	cycleText(mainPlayer.move(myMap.get(mainPlayer.getRoomID())[3]));
	}

	private void setFightScene() {
		fightPane.setBottom(textScroller);
		theStage.setScene(fightScene);
	}
    
    private void setMainScene() {
    	mainPane.setBottom(textScroller);
		theStage.setScene(mainScene);
	}
    
	private void setPuzzleScene() {
		puzzlePane.setBottom(textScroller);
		theStage.setScene(puzzleScene);
	}
    
    private void cycleText(String s){
    	action2.setText(action1.getText());
    	action1.setText(action0.getText());
    	action0.setText(s);
    }


	private GridPane getGrid(){
		GridPane myGrid = new GridPane();
		myGrid.setAlignment(Pos.CENTER);
		myGrid.setPadding(new Insets(10,10,10,10));
		myGrid.setHgap(5.0);
		myGrid.setVgap(10.0);
		myGrid.add(mainText, 1, 0);
		myGrid.add(monsterName, 2, 1);
		myGrid.add(monsterHealth, 2, 2);
		myGrid.add(playerName, 0, 1);
		myGrid.add(playerHealth, 0, 2);
		myGrid.add(attackBtn, 1, 3);
		//myGrid.add(lastActions, 1, 4);
		//myGrid.add(currentActions, 1, 5);
		return myGrid;
	}


	
	private void doDamage() {
		cycleText(mainPlayer.doDamage(mainMonster));
		updateHealth();
		if(mainMonster.getHealth()<=0){
			attackBtn.setOnAction(returnBtn.getOnAction());
			attackBtn.setText("return");
		}
		else{
		recieveDamage();
		}
		
	}
	
	private void recieveDamage(){
		cycleText(mainPlayer.takeDamage(mainMonster));
		updateHealth();
	}
	
	
	private void updateHealth(){
		playerHealth.setText(String.valueOf(mainPlayer.getHealth()) + "/" + String.valueOf(mainPlayer.getMaxHealth()));
		monsterHealth.setText(String.valueOf(mainMonster.getHealth()) + "/" + String.valueOf(mainMonster.getMaxHealth()));
	}

	/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}