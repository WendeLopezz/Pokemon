package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.Combate;

public class TestController implements Initializable {

    @FXML
    private Button btnPokemon;
    @FXML
    private Button btnCombate;

    @FXML
    private void combatePokemon(ActionEvent event) throws IOException {
        Parent capturarView;

        capturarView = FXMLLoader.load(getClass().getResource("../vistas/Combate.fxml"));

        Scene capturarScene = new Scene(capturarView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(capturarScene);

        window.show();

    }

    @FXML
<<<<<<< HEAD
    private void capturaPokemon(ActionEvent event) throws IOException {

        Parent capturarView;

        capturarView = FXMLLoader.load(getClass().getResource("../vistas/captura.fxml"));

        Scene capturarScene = new Scene(capturarView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(capturarScene);

        window.show();

||||||| 577f2c3
    private void sayHelloWorld(ActionEvent event) {
        System.out.println("Capturado");
        
        this.stage.show();
=======
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
>>>>>>> estropicio
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
