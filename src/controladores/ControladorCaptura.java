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
import modelo.Pokemon;



public class ControladorCaptura implements Initializable {

    private Stage stage;
    private Entrenador entrenador;
    

    @FXML
    private Button btnCapturar;

    @FXML
    private void capturar(ActionEvent event) {
        
        
        entrenador.capturaPokemon();
        for(int i = 0; i < entrenador.getCaja().size(); i++){
            System.out.println(entrenador.getCaja().get(i).getNombre());

        }

    }

    @FXML
    private void volverVentana(ActionEvent event) throws IOException{
        Parent  capturarView;

        capturarView = FXMLLoader.load(getClass().getResource("../vistas/menuPokemon.fxml"));

        Scene capturarScene = new Scene(capturarView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(capturarScene);

        window.show();
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO: El entrenador tiene que ser sacado de BBDD
        entrenador = new Entrenador("DobleU", new ArrayList<Pokemon>(), new ArrayList<Pokemon>());
        // El Pokemon tiene que ser sacado de BBDD pero coger uno random de la lista al hacer el select
        
    }

    public void show() {
        stage.show();
    }
}
