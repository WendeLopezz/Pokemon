package main;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Combate;
import modelo.Turno;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);

        /*Conectar BBDD
        String url = "jdbc:mysql://localhost:3306/pokemon ";
		String login = "root";
		String password = "";
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection connection = DriverManager.getConnection(url, login, password);

		    System.out.println("Conexión establecida");
            mostrarPokemon(connection);

            Pokemon poke= new Pokemon(152,"Chikorita","Planta","");

            insertarPokemon(connection,poke);


            try {
				connection.close();
				System.out.println("Conexión cerrada");
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
        */

        Combate c = new Combate();
        Turno t1 = new Turno(1, "Entrenador: Charmander usa ascuas",
                "Rival: Squirtle usa Burbuja");
        c.addTurno(t1);
        c.escribirCombate();
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../vistas/Pokemon.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Pokemón");
            primaryStage.show();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

}
