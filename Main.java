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
    FileChooser fileChooser = new FileChooser();
    Button loadQuesion = new Button("Load Question");
    Label label=new Label("Quiz Generator");
    label.setFont(Font.font("Cambria", 32));
    Button operateQuiz = new Button("operate quiz"); 
    Button addQuestion = new Button("add question"); 
    
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
    Label numberQ=new Label("The number of questions: ");
    GridPane.setMargin(numberQ, new Insets(10, 10, 10, 10)); 
    TextField textField=new TextField();
    textField.setMaxWidth(160);
    Label total=new Label("/50");
    Button loadData = new Button("Load Data"); 
    loadData.setMaxWidth(100);
    Button saveFile = new Button("Save  File"); 
    saveFile.setMaxWidth(100);
    gridPane3.add(numberQ, 0,0);
    gridPane3.add(textField, 0,1);
    gridPane3.add(total, 1,1);
    gridPane3.add(loadData, 0,3);
    GridPane.setMargin(loadData, new Insets(10, 10, 10, 40)); 
    gridPane3.add(saveFile, 0,4);
    GridPane.setMargin(saveFile, new Insets(0, 10, 10, 40)); 
    
    Image image = new Image("pig.png");
    ImageView imageview = new ImageView(image);
    imageview.setFitHeight(160);
    imageview.setFitWidth(160);
    gridPane3.add(imageview, 0,5);
    GridPane.setMargin(imageview, new Insets(0, 10, 10,15)); 
    borderPane.setLeft(gridPane3);
    
    
    //right
     // ListView
    ListView<String> list = new ListView<String>();
    list.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    ObservableList<String> items =FXCollections.observableArrayList (
        "topic1", "topic2", "topic3", "topic4","topic5");
    list.setItems(items);
    list.setPrefHeight(100);
    list.setPrefWidth(170);

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
    

    loadData.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         //load data to where????? TODO
          
        }
      }
    });  
   
    borderPane.setPadding(new Insets(12, 12, 12, 12));
  
    
    loadQuesion.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(final ActionEvent e) {
        File file = fileChooser.showOpenDialog(stage);
        if (file != null) {
         
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
