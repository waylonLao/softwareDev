package MainCode.GUI;

import static java.awt.SystemColor.text;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.text.*;
import MainCode.Rooms.*;

/**
 * @author Joshua Tran
 * Date: Oct 31, 2016
 */
public class MainGUI extends Application {
    
    @Override
    public void start(Stage primaryStage){
    	
        TextField tf1 = new TextField();

        Text text = new Text();
        Text inventoryText = new Text();
        Text battleText = new Text();
        text.setFont(new Font(20));
        text.setWrappingWidth(200);
        text.setTextAlignment(TextAlignment.JUSTIFY);
       
        //text.setText("How do I link this to MainMenuGui???");
        StackPane.setAlignment(text, Pos.CENTER);
        StackPane.setAlignment(tf1, Pos.BOTTOM_CENTER);
        StackPane root = new StackPane();
        root.getChildren().addAll(tf1, text);
       
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Galaxy Explorer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}