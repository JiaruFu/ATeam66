package application;

import java.io.File;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public final class Main extends Application {


  @Override
  public void start(Stage stage) {  
    BorderPane borderPane = new BorderPane();
    GridPane gridPane1=new GridPane();
    GridPane gridPane2=new GridPane();
    GridPane gridPane3=new GridPane();
    stage.setTitle("Quiz Generator: ATEAM 66");
    
   //top
    Label label=new Label("Quiz Generator");
    label.setFont(Font.font("Cambria", 50));
    gridPane1.setAlignment(Pos.CENTER); 
    gridPane1.getChildren().add(label);
    borderPane.setTop(gridPane1);
    
    //bottom
    Button operateQuiz = new Button("generate quiz"); 
    operateQuiz.setStyle("-fx-font-size:15");
    Button addQuestion = new Button("add question");
    addQuestion.setStyle("-fx-font-size:15");
    gridPane2.add(operateQuiz, 0,0);
    gridPane2.add(addQuestion, 1,0);
    GridPane.setMargin(operateQuiz, new Insets(20, 10, 10, 100)); 
    GridPane.setMargin(addQuestion, new Insets(20, 10, 10, 180)); 
    borderPane.setBottom(gridPane2);
    
    //left 
    Label numberQ=new Label("The number of questions: ");
    numberQ.setFont(Font.font("Cambria", 32));
    GridPane.setMargin(numberQ, new Insets(10, 10, 10, 10)); 
    
    TextField textField=new TextField();
    textField.setMaxWidth(160);
    textField.setMaxHeight(50);
    Label label2=new Label("/ 50");
    label2.setFont(Font.font("Cambria", 32));
    Pane secondRow = new HBox(5);
    secondRow.getChildren().add(textField);
    secondRow.getChildren().add(label2);
    
    Button saveFile = new Button("Save  File"); 
    saveFile.setMaxWidth(250);
    saveFile.setStyle("-fx-font-size:15");
    Button loadQuestion = new Button("Load Question");
    loadQuestion.setMaxWidth(250);
    loadQuestion.setStyle("-fx-font-size:15");
    gridPane3.add(numberQ, 0,0);
    GridPane.setMargin(numberQ, new Insets(10, 10, 10, 40)); 
    gridPane3.add(secondRow, 0,1);
    GridPane.setMargin(secondRow, new Insets(10, 10, 10, 40)); 
    gridPane3.add(loadQuestion, 0,2);
    GridPane.setMargin(loadQuestion, new Insets(10, 10, 10, 40)); 
    gridPane3.add(saveFile, 0,3);
    GridPane.setMargin(saveFile, new Insets(0, 10, 10, 40)); 
    
    Image image = new Image("pig.png");
    ImageView imageview = new ImageView(image);
    imageview.setFitHeight(170);
    imageview.setFitWidth(170);
    gridPane3.add(imageview, 0,5);
    GridPane.setMargin(imageview, new Insets(10, 10, 10, 80)); 
    borderPane.setLeft(gridPane3);
    
    
    //right
     // ListView
    ListView<String> list = new ListView<String>();
    list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    ObservableList<String> items =FXCollections.observableArrayList (
        "topic1", "topic2", "topic3", "topic4","topic5");
    list.setItems(items);
    list.setPrefHeight(70);
    list.setPrefWidth(300);
    System.out.println(list.getSelectionModel());
    list.setOnMouseClicked(new EventHandler<Event>() {
      @Override
      public void handle(Event event) {
          ObservableList<String> selectedItems =  list.getSelectionModel().getSelectedItems();
          for(String s : selectedItems){
              System.out.println("selected item " + s);
          }
      }
  });
    borderPane.setRight(list);
    
    FileChooser fileChooser = new FileChooser();
   
    loadQuestion.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         
        }
      }
    });
    
    borderPane.setPadding(new Insets(50, 50, 50, 50));
    stage.setScene(new Scene(borderPane, 800, 600));
    stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }

 
}