package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.Entrenador;
import modelo.Estado;
import modelo.Pokemon;
import modelo.Tipo;

public class PrimaryController implements Initializable {

    private Stage stage;
    private Entrenador entrenador;
    private Pokemon pokemon;

    @FXML
    private Button btnCombate;

    @FXML
    private Button btnCaptura;

    @FXML
    private Button btnVolver;

    @FXML
    private void captura(ActionEvent event) {

        System.out.println("Capturar");
        System.out.println(this.entrenador.capturarAPokemon(pokemon));
        System.out.println(this.entrenador.getCaja());

    }

    @FXML
    public void capturaPokemon(ActionEvent event) {

    }

    @FXML
    private void volverInicio(ActionEvent event) throws IOException {
        Parent capturarView;

        capturarView = FXMLLoader.load(getClass().getResource("../vistas/Pokemon.fxml"));

        Scene capturarScene = new Scene(capturarView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(capturarScene);

        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: El entrenador tiene que ser sacado de BBDD
        entrenador = new Entrenador("DobleU", new ArrayList<>(), new ArrayList<>());
        // El Pokemon tiene que ser sacado de BBDD pero coger uno random de la lista al
        // hacer el select
        pokemon = new Pokemon("Pikachu", "Pika", Estado.SIN_ESTADO, Tipo.ELECTRICO, Tipo.AGUA, new ArrayList<>());
    }

    public void show() {
        stage.show();
    }
}
