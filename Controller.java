package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;



public class Controller {
    @FXML
    private Button DisplayName;

    public Controller() {
    }

    @FXML
    private Label nameOfUser ;
    @FXML
    private TextField userName ;
    @FXML
    public void onDisplayNameTapped(){
nameOfUser.setText("hey! "+userName.getText());

    }


}
