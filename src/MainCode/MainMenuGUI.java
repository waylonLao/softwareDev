package MainCode;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainMenuGUI extends Application{

	@Override
	public void start(Stage maninMenuStage) throws Exception {
		
		//create Label
		Label labelTitle = new Label();
		
		//label text
		labelTitle.setText("Galaxy Explorer");
		
		//create buttons
		Button b1 = new Button();
		Button b2 = new Button();
		Button b3 = new Button();
		Button b4 = new Button();
		
		//create Stage
	    Stage mainMenuStage = new Stage();
	    
	    //button text
		b1.setText("New Game");
		b2.setText("Load Game");
		b3.setText("Options");
		b4.setText("Test");
		
		//create StackPane
		StackPane stackPane1 = new StackPane();
		
		//stackpane setup
		stackPane1.getChildren().add(labelTitle);
		stackPane1.getChildren().add(b1);
		
		//create scene
		Scene mainMenuScene = new Scene(stackPane1, 500, 500);
		
		//stage setup
		mainMenuStage.setTitle("Galaxy Explorer");
		mainMenuStage.setScene(mainMenuScene);
		mainMenuStage.show();
	}
		
		 public static void main(String[] args)
		 {
		        launch(args);
		 }
		    
		
	}


