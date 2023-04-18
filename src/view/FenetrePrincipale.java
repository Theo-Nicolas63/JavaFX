package view;

import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class FenetrePrincipale {

    private boolean aClique = false;
    @FXML
    private Button boutton;
    @FXML
    private Button bouttonExit;

    @FXML
    private Label lelabel;

    @FXML
    private void clicButtonPlay(ActionEvent actionEvent) {
        if (aClique) {
            lelabel.setText("Label");
            aClique = false;
        } else {
            lelabel.setText("A cliqué sur le bouton play");
            aClique = true;
        }
    }

    @FXML
    private void clicButtonExit(ActionEvent actionEvent){

        Stage stage = (Stage) bouttonExit.getScene().getWindow();
        stage.close();
    }
}
