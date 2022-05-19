package controlador;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import modelo.Estado;
import modelo.Movimiento;
import modelo.Pokemon;
import modelo.Tipo;

public class ControladorCombate  implements Initializable{

    @FXML
    private Button btnAtacar;

    @FXML
    private TextField txtLog;

    private Pokemon miPokemon;
    private Pokemon rivalPokemon;

    @FXML 
    private void atacar(ActionEvent event){
        miPokemon.atacar(rivalPokemon);
        txtLog.setText("La vitalidad de "+ rivalPokemon.getNombre()+" es : "+ rivalPokemon.getVitalidad());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        miPokemon = new Pokemon("Pikachu", "pepapig", 23, 23, 23, 32, 32, 23, 23, 23, Estado.DORMIDO, new ArrayList<Movimiento>(), Tipo.FUEGO, Tipo.AGUA, 23);
        rivalPokemon = new Pokemon("Squirter", "morad", 23, 23, 23, 32, 32, 23, 23, 23, Estado.DORMIDO, new ArrayList<Movimiento>(), Tipo.FUEGO, Tipo.AGUA, 23);
    }
    
}
