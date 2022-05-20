package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.Pokemon;
import modelo.Tipo;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../vistas/menuPokemon.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mysql://localhost:3306/pokemon";
        String login = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, login, password);

            System.out.println("Conexión establecida");
            
            mostrarPokemon(connection);
            

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
    }

    public static void mostrarPokemon(Connection con) throws SQLException {

        String pokemon = "Charizard";
        String consulta = "SELECT * FROM pokémon ";
        PreparedStatement statement = con.prepareStatement(consulta);
        ResultSet rs = statement.executeQuery(consulta);
        
        
        Pokemon e = new Pokemon();
        while (rs.next()) {
            
            e = new Pokemon();
            
            e.setVitalidad(rs.getInt("Vitalidad"));
            e.setNombre(rs.getString("Nombre"));
            e.setMote(rs.getString("Mote"));
            e.setVelocidad(rs.getInt("Velocidad"));
            e.setNivel(rs.getInt("Nivel"));
            e.setEstamina(rs.getInt("Estamina"));
            e.setDefensa(rs.getInt("Defensa"));
            e.setDefensaEspecial(rs.getInt("Defensa especial"));
            e.setAtaque(rs.getInt("Ataque"));
            e.setAtaqueEspecial(rs.getInt("Ataque especial"));
            e.setFertilidad(rs.getInt("Fertilidad"));
            e.setIdPokemon(rs.getInt("Id_pokemon"));
            
            System.out.println(e.toString());
        }
        statement.close();
    }
    public static void insertarPokemon(Connection con, Pokemon p) throws SQLException {
		String sentencia ="INSERT INTO pokémon  VALUES("+ p.getNombre()+",'"+p.getMote()+",'"+p.getIdPokemon()+"')";
        
		PreparedStatement stmt = null;
		try {
			stmt = (PreparedStatement) con.createStatement();
			stmt.executeUpdate(sentencia);
			
			System.out.println("Nuevo pokemon insertado. "+p.getNombre());
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			stmt.close(); // Puede lanzar SQLExceptions, por eso he puesto el
			// throws en la cabecera del metodo
		}
													   
	}

}
