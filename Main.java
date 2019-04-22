
package application;

import java.io.File;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 * this class uses javafx to create a scene with title that puts a self-portrait at the center and
 * provides options and buttons to users.
 * 
 * @author
 *
 */
public class Main extends Application {

  /**
   * The main entry point for all JavaFX applications. The start method is called after the init
   * method has returned, and after the system is ready for the application to begin running.
   */
  @Override
  public void start(Stage primaryStage) {
    try { 
      Label greetingLabel = new Label("Hello World!");
      Label projectLabel = new Label("CS400 MyFirstJavaFX");
      Button finishButton = new Button("Done"); 
      ObservableList<String> options =
          FXCollections.observableArrayList("Hamburger", "Sandwich", "Pizza");
      final ComboBox comboBox = new ComboBox(options); 
      ObservableList<String> option2 =
          FXCollections.observableArrayList("togo", "eat here", "Pizza");
      final ComboBox selfservice = new ComboBox(option2);
      BorderPane root = new BorderPane();
      root.setTop(greetingLabel);
      root.setTop(projectLabel);
      root.setLeft(comboBox);
      root.setBottom(finishButton);
      root.setRight(selfservice);
      Scene scene = new Scene(root, 500, 500); 
      scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
      primaryStage.setTitle("Bohao's First JavaFX program");
      Image image = new Image("Me.jpg");
      ImageView imgv = new ImageView();
      imgv.setImage(image);
      imgv.setFitWidth(200);
      imgv.setPreserveRatio(true);
      root.setCenter(imgv);
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch (Exception e) { 
      e.printStackTrace();
    }
  }

  /**
   * launches the program
   * 
   * @param args command line argument
   */
  public static void main(String[] args) {
    // use command line arguments here, before calling launch
    launch(args);
  }
}
