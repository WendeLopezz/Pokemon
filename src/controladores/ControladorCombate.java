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

public class ControladorCombate implements Initializable{

    @FXML
    private Button btnLuchar;

    @FXML
    private Button volverPantalla;

    @FXML
    private void volverPantallaInicio(ActionEvent event) throws IOException{
        Parent capturarView;

        capturarView = FXMLLoader.load(getClass().getResource("../vistas/Pokemon.fxml"));

        Scene capturarScene = new Scene(capturarView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(capturarScene);

        window.show();
    }

    @FXML 
    private void luchaPokemon(ActionEvent event){
        System.out.println("¡Luchad!");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
    }
    
}
