package application;


import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public final class Main extends Application {


  @Override
  public void start(Stage stage) {  
    GridPane inputGridPane = new GridPane();
    stage.setTitle("Quiz Generator");
    FileChooser fileChooser = new FileChooser();
    Button openButton = new Button("Load Question");
    Label label=new Label("Quiz Generator");
 Button nextButton = new Button("Next");  
    GridPane.setRowIndex(label, 0);
    
    
    //Setting the vertical and horizontal gaps between the columns 
    inputGridPane.setVgap(100); 
    inputGridPane.setHgap(50);       
    
    //Setting the Grid alignment 
    inputGridPane.setAlignment(Pos.CENTER); 
     
    //Arranging all the nodes in the grid 
    inputGridPane.add(label, 1, 0); 
    inputGridPane.add(openButton, 2, 2); 
    inputGridPane.add(nextButton, 0, 2); 

    openButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         //load data to where????? TODO
          
        }
      }
    });  
   
    inputGridPane.setPadding(new Insets(12, 12, 12, 12));
    GridPane.setMargin(nextButton, new Insets(0, 0, 0,120));
 
    
    nextButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         //load data to where????? TODO
          
        }
      }
    });
    

    stage.setScene(new Scene(inputGridPane, 500, 500));
    stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }

 
}
