package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TestControler implements Initializable{

    @FXML
    private Button btnAtacar;

    @FXML
    private Button btnRetirarse;

    @FXML
    private Button btnCombate;

    @FXML 
    private void ComenzarCombate(ActionEvent event){
        
        System.out.println("Combatir");
    }

    @FXML
    private void Retirarse(ActionEvent event){
        System.out.println("Retirarse");
    }

    @FXML
    private void cambiarVentana(ActionEvent event){
       try {
           FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/COMBATE.fmxl"));       
        
            Parent root = loader.load();

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
        
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        
    }
    
}
