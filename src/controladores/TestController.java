package controladores;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.Combate;

public class TestController implements Initializable {

    private Stage stage;

    @FXML
    private Button btnCaptura;
    
    @FXML
    private Button btnAtacar;

    @FXML
    private void sayHelloWorld(ActionEvent event) {
        System.out.println("Capturado");
        
        this.stage.show();
    }    

    @FXML
    private void Atacar(ActionEvent event){
        System.out.println("A la taquer");
        Combate combate = new Combate();
        
    }

    @FXML
    private void retirarse(ActionEvent event){
        System.out.println("Hasta luego lucas");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
