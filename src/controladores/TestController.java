package controladores;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TestController implements Initializable {

    private Stage stage;

    @FXML
    private Button btnCapturar;
    
    @FXML
    private Button btnCombatir;

    @FXML
    private void ventanaCapturar(ActionEvent event) throws IOException {
        
        Parent capturarView;

        capturarView = FXMLLoader.load(getClass().getResource("../vistas/menuCapturar.fxml"));

        Scene capturarScene = new Scene(capturarView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(capturarScene);

        window.show();
        
        //this.stage.show();
    }    

    @FXML
    private void ventanaCombate(ActionEvent event) throws IOException{
        Parent capturarView;

        capturarView = FXMLLoader.load(getClass().getResource("../vistas/menuCombate.fxml"));

        Scene capturarScene = new Scene(capturarView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(capturarScene);

        window.show();
        
        
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
