package controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.Combate;
import modelo.Entrenador;
import modelo.Movimiento;
import modelo.Pokemon;
import modelo.Tipo;
import modelo.Turno;

public class ControladorCombate  implements Initializable{

    @FXML
    private Button btnAtacar;

    @FXML
    private Button btnVolver;

    @FXML
    private TextField txtLog;

    @FXML
    private TextField txtLog2;

    @FXML
    private TextField txtLogTurno;

    @FXML 
    private TextField txtNumKOUsuario;

    @FXML 
    private TextField txtNumKORival;
    
    private Pokemon miPokemon;
    private Pokemon rivalPokemon;
    private Combate combate;
    private int numeroTurno;
    private Entrenador usuario;
    private Entrenador usuorioRival;
    private int numPokemonKOJugador;
    private int numPokemonKORival;   


    @FXML
    private void volver(ActionEvent event) throws IOException{
        Parent  combateView;

        combateView = FXMLLoader.load(getClass().getResource("../vistas/menuPokemon.fxml"));

        Scene combateScene = new Scene(combateView);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(combateScene);

        window.show();

        combate.escribirCombate();
    }
    /*while que mientras no 4ko siga combate, if pokemon vida -0 equipo pok2, if pok1 vel + pok2 vel atak pok1 */
    @FXML 
    private void atacarPokemon(ActionEvent event){        
        
        
        if(this.miPokemon.getVelocidad() >= this.rivalPokemon.getVelocidad()){
            miPokemon.atacar(rivalPokemon);
            rivalPokemon.atacar(miPokemon);
        }
        else{
            rivalPokemon.atacar(miPokemon);
            miPokemon.atacar(rivalPokemon);
        }
        
        if(this.rivalPokemon.getVitalidad() <= 0){
            numPokemonKOJugador++;                         
        }
        if(this.miPokemon.getVitalidad() <= 0){
            numPokemonKORival++;        
        }
        
        /*if(this.miPokemon.getVitalidad() == 0 || this.rivalPokemon.getVitalidad() == 0 ){
            
        }        */
        combate.comprobarGanador();       
        
        this.numeroTurno++;        
        
        txtLog.setText("La vitalidad de "+ miPokemon.getNombre()+" es : "+ miPokemon.getVitalidad());
        txtLog2.setText("La vitalidad de "+ rivalPokemon.getNombre()+" es : "+ rivalPokemon.getVitalidad());
        
        Turno turno = new Turno(numeroTurno, "La vitalidad de "+ rivalPokemon.getNombre()+" es : "+ rivalPokemon.getVitalidad(), "La vitalidad de "+ miPokemon.getNombre()+" es : "+ miPokemon.getVitalidad());
        combate.addTurno(turno);
        txtLogTurno.setText("Turno "+numeroTurno);

        comprobarGanador();

    }

    private void comprobarGanador() {

        if(this.miPokemon.getVitalidad() <= 0){
            txtNumKOUsuario.setText("PERDEDOR!");
            txtNumKORival.setText("GANADOR!");
            
            combate.escribirCombate();
        }
        else if (this.rivalPokemon.getVitalidad() <= 0){
            txtNumKOUsuario.setText("GANADOR!");
            txtNumKORival.setText("PERDEDOR!");
            combate.escribirCombate();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        miPokemon = new Pokemon("Zoroark", "Zoroark", new ArrayList<Movimiento>(), Tipo.FUEGO, Tipo.AGUA);
        rivalPokemon = new Pokemon("Charizard", "Charizard", new ArrayList<Movimiento>(), Tipo.FUEGO, Tipo.AGUA );
        combate = new Combate();
        this.numeroTurno = 1;

        txtLog.setText("La vitalidad de "+ miPokemon.getNombre()+" es : "+ miPokemon.getVitalidad());
        txtLog2.setText("La vitalidad de "+ rivalPokemon.getNombre()+" es : "+ rivalPokemon.getVitalidad());

        txtLogTurno.setText("Turno "+numeroTurno);

        usuario  = new Entrenador("Ash Kechup", new ArrayList<Pokemon>(), new ArrayList<Pokemon>());
        usuorioRival = new Entrenador("Ash Mayonesa", new ArrayList<Pokemon>(), new ArrayList<Pokemon>());

        Pokemon zoroark = new Pokemon("Zoraoark", "Zoroark", new ArrayList<Movimiento>(), Tipo.NORMAL, Tipo.NORMAL);
        
        Pokemon charizard = new Pokemon("Charizard", "Charizard", new ArrayList<Movimiento>(), Tipo.FUEGO, Tipo.FUEGO);

        Pokemon pikachu = new Pokemon("Pikachu", "Pika", new ArrayList<Movimiento>(), Tipo.ELECTRICO, Tipo.ELECTRICO);

        Pokemon squirtle = new Pokemon("Squirtle", "Squirtle", new ArrayList<Movimiento>(), Tipo.AGUA, Tipo.AGUA);
    }   
    
}
