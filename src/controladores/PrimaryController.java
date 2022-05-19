package controladores;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.Entrenador;
import modelo.Pokemon;


public class PrimaryController implements Initializable {

    private Stage stage;
    private Entrenador entrenador;
    private Pokemon pokemon;

    @FXML
    private Button btnCaptura;

    @FXML
    private void captura(ActionEvent event) {

        System.out.println("Capturar");
        System.out.println(this.entrenador.capturarAPokemon(pokemon));
        System.out.println(this.entrenador.getCaja());

    }

    @FXML
    public void sayHelloWorld(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: El entrenador tiene que ser sacado de BBDD
        entrenador = new Entrenador("DobleU", new ArrayList<>(), new ArrayList<>());
        // El Pokemon tiene que ser sacado de BBDD pero coger uno random de la lista al hacer el select
        
    }

    public void show() {
        stage.show();
    }
}
