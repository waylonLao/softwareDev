package MainCode.GUI;

import static java.awt.SystemColor.text;

import MainCode.Items.Weapon;
import MainCode.Monster.Monster;
import MainCode.Monster.Player;
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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.*;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class MainGUI extends Application {
	
	Stage theStage;
	Scene mainScene, fightScene;
	Weapon theWeapon = new Weapon("dull blade", "a dull blade", "cut stuff, obviously", 50);
	Player mainPlayer = new Player(200, theWeapon);
	Monster mainMonster = new Monster(100, theWeapon, "cleaner bot", "This is a monster", null);
	Button startFightBtn = new Button("Start Fight");
	
	
	private Label mainText = new Label("Fight GUI");
	private Label monsterName = new Label(mainMonster.getName());
	private Label playerName = new Label(mainPlayer.getName());
	private Label monsterHealth = new Label(String.valueOf(mainMonster.getHealth()) + "/" + String.valueOf(mainMonster.getMaxHealth()));
	private Label playerHealth = new Label(String.valueOf(mainPlayer.getHealth()) + "/" + String.valueOf(mainPlayer.getMaxHealth()));
	private Button attackBtn = new Button("Attack");
	private Button returnBtn = new Button("Return");
	Text currentActions = new Text();
	Text lastActions = new Text();
	
	
	GridPane myGrid = new GridPane();
	StackPane mainPane;
    
    @Override
    public void start(Stage primaryStage){
    	theStage = primaryStage;

    	
        
        TextField commandLine = new TextField();

        startFightBtn.setOnAction(e -> setFightScene());
        returnBtn.setOnAction(e -> setMainScene());
		attackBtn.setOnAction(e -> doDamage());
		
        
        Text text = new Text();
        text.setFont(new Font(20));
        text.setWrappingWidth(200);
        text.setTextAlignment(TextAlignment.JUSTIFY);
        text.setText("The quick brown fox jumps over the lazy dog");
        StackPane.setAlignment(startFightBtn, Pos.TOP_CENTER);
        StackPane.setAlignment(text, Pos.CENTER);
        StackPane.setAlignment(commandLine, Pos.BOTTOM_CENTER);
        mainPane = new StackPane();
        mainPane.getChildren().addAll(commandLine, text, startFightBtn);
        
        BorderPane fightPane = new BorderPane();
		fightPane.setCenter(getGrid());
		fightPane.setBottom(getVBox());
		
		

		
		fightScene = new Scene(fightPane, 500, 500);
       
        
        mainScene = new Scene(mainPane, 500, 500);
        
        
        theStage.setTitle("Galaxy Explorer");
        theStage.setScene(mainScene);
        theStage.show();
    }

    private void setFightScene() {
		theStage.setScene(fightScene);
	}
    
    private void setMainScene() {
		theStage.setScene(mainScene);
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
		currentActions.setText(String.valueOf(mainPlayer.doDamage(mainMonster)));
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
		lastActions.setText(currentActions.getText());
		currentActions.setText(String.valueOf(mainPlayer.takeDamage(mainMonster)));
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