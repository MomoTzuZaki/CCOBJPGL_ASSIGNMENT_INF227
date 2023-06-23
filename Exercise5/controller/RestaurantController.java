package controller;

import javax.swing.text.html.ImageView;

import Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class RestoController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Burgerking burgerking = new Burgerking();
    Pizzahut Pizzahut = new Pizzahut();
    KFC kfc = new KFC();
    Mcdo mcdo = new Mcdo();
    Wendys wendys = new Wendys();

    public void initialize() {

        Burgerking.setProduct("Burger");
        Burgerking.setTaste("Juicy");

        Pizzahut.setProduct("Pizza");
        Pizzahut.setTaste("Crip");

        KFC.setProduct("Fried Chicken");
        KFC.setTaste("Tender");

        Mcdo.setProduct("Fries");
        Mcdo.setTaste("Yummm");

        Wendys.setProduct("Spaghetti");
        Wendys.setTaste("Yummy");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Burgerking has " + manginasal.getProduct() + " and its" + Burgerking.getTaste());
        }

        if (sourceButton == btn2) {
            alert.setContentText("PIzzahut has " + jollibee.getProduct() + " and its " + Pizzahut.getTaste());
        }

        if (sourceButton == btn3) {
            alert.setContentText("KFC has " + kfc.getProduct() + " and its " + KFC.getTaste());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Mcdo has " + mcdo.getProduct() + " and its " + Mcdo.getTaste());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Wendys has " + popeyes.getProduct() + " and its" + Wendys.getTaste());
        }

        alert.showAndWait();

    }
}
