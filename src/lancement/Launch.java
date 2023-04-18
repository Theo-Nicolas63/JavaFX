package lancement;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launch extends Application {

   @Override
   public void start(Stage stage) throws Exception {
      Parent container = FXMLLoader.load(getClass().getResource("/test.fxml"));
      Scene scene = new Scene(container, 800, 600);
      scene.getStylesheets().add("style.css");
      stage.setScene(scene);
      stage.setTitle("ESCAPE GAME");

      stage.show();
   }
}
