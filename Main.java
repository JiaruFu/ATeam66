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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public final class Main extends Application {


  @Override
  public void start(Stage stage) {  
    BorderPane borderPane = new BorderPane();
    GridPane gridPane1=new GridPane();
    GridPane gridPane2=new GridPane();
    GridPane gridPane3=new GridPane();
    stage.setTitle("Quiz Generator");
    FileChooser fileChooser = new FileChooser();
    Button openButton = new Button("Load Question");
    Label label=new Label("Quiz Generator");
    Button operateQuiz = new Button("operate quiz"); 
    Button addQuestion = new Button("add question"); 
    
    Button loadData = new Button("Load Data"); 
    
   //top
    gridPane1.setAlignment(Pos.CENTER); 
    gridPane1.getChildren().add(label);
    borderPane.setTop(gridPane1);
    
    //bottom
    gridPane2.add(operateQuiz, 0,0);
    gridPane2.add(addQuestion, 1,0);
    GridPane.setMargin(operateQuiz, new Insets(10, 10, 10, 50)); 
    GridPane.setMargin(addQuestion, new Insets(10, 10, 10, 80)); 
    borderPane.setBottom(gridPane2);
    
    //left 
    
  //  gridPane3.
    borderPane.setLeft(gridPane3);

    openButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         //load data to where????? TODO
          
        }
      }
    });  
   
    borderPane.setPadding(new Insets(12, 12, 12, 12));
  
    
    loadData.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         //load data to where????? TODO
          
        }
      }
    });
    

    stage.setScene(new Scene(borderPane, 400, 400));
    stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }

 
}
