package MainCode;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FightGui extends Application{
	private Label mainText = new Label("Fight GUI");
	private Button attackBtn = new Button("Attack");
	private Button returnBtn = new Button("Return");
	
	
	
	Item testItem = new Item();
	Weapon testWeapon = new Weapon();
	Weapon testWeapon2 = new Weapon();
	
	Player testPlayer = new Player(200, testWeapon);
	Monster testMonster = new Monster(200, testWeapon2, 1, "Test Monster", "This is a test Monster", testItem);

	Text monsterName = new Text(testMonster.getName());
	Text playerName = new Text(testPlayer.getName());
	
	
	Text playerHealth = new Text(String.valueOf(testPlayer.getHealth()) + "/" + String.valueOf(testPlayer.getMaxHealth()));
	Text monsterHealth = new Text(String.valueOf(testMonster.getHealth()) + "/" + String.valueOf(testMonster.getMaxHealth()));
	
	Text currentActions = new Text();
	Text lastActions = new Text();
	
	GridPane myGrid = new GridPane();
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane mainPane = new BorderPane();
		mainPane.setCenter(getGrid());
		mainPane.setBottom(getVBox());
		
		
		attackBtn.setOnAction(e -> doDamage());
		returnBtn.setOnAction(e -> primaryStage.close());
		
		Scene scene = new Scene(mainPane, 500, 500);
		
	    primaryStage.setTitle("Fight GUI"); // Set title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	    
	    
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

	private VBox getVBox(){
		VBox myVBox = new VBox(10.0);
		myVBox.setAlignment(Pos.CENTER);
		myVBox.getChildren().add(lastActions);
		myVBox.getChildren().add(currentActions);
		return myVBox;
	}
	
	private void doDamage() {
		currentActions.setText(String.valueOf(testPlayer.doDamage(testMonster)));
		updateHealth();
		if(testMonster.getHealth()<=0){
			attackBtn.setOnAction(returnBtn.getOnAction());
			attackBtn.setText("return");
		}
		else{
		recieveDamage();
		}
		
	}
	
	private void recieveDamage(){
		lastActions.setText(currentActions.getText());
		currentActions.setText(String.valueOf(testPlayer.takeDamage(testMonster)));
		updateHealth();
	}
	
	
	private void updateHealth(){
		playerHealth.setText(String.valueOf(testPlayer.getHealth()) + "/" + String.valueOf(testPlayer.getMaxHealth()));
		monsterHealth.setText(String.valueOf(testMonster.getHealth()) + "/" + String.valueOf(testMonster.getMaxHealth()));
	}
	
	  public static void main(String[] args) {
		    launch(args);
		  }
		

}

