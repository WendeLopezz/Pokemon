package controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TestController implements Initializable {

    private Stage stage;

    @FXML
    private Button btnCaptura;

    @FXML
    private void sayHelloWorld(ActionEvent event) {
        System.out.println("Capturado");
        
        this.stage.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
