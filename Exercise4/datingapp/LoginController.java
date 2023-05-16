import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;


public class LoginController {

@FXML
TextField myTextField;

@FXML
PasswordField mypPasswordField;

@FXML
Button myButton;



public void login(ActionEvent event) throws IOException{

 
    String username = myTextField.getText();

    String password = mypPasswordField.getText();

    Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            final Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    
}
}