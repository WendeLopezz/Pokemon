package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

<<<<<<< HEAD

||||||| a88019e
import entrenador.Entrenador;
import turno.Turno;

=======
>>>>>>> ac09f2a60376d651eded02404d9995fcf2debed4
public class Combate {

    private Entrenador jugador;
    private Entrenador rival;
    private Entrenador ganador;
    private List<Turno> turno;
    private int numPokemonKOJugador;
    private int numPokemonKORival;
    public static final String PATH = "./log/combate.log";
    
    public Combate(){
        turno = new LinkedList<>();

    }
    
    public Entrenador getJugador() {
        return jugador;
    }

    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }
    
    public Entrenador getRival() {
        return rival;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }
    
    public Entrenador getGanador() {
        return ganador;
    }

    public void setGanador(Entrenador ganador) {
        this.ganador = ganador;
    }

   public List<Turno> getTurno() {
       return turno;
    }

    public void setTurno(List<Turno> turno) {
        this.turno = turno;
    }

    public int getNumPokemonKOJugador() {
        return numPokemonKOJugador;
    }
    public void setNumPokemonKOJugador(int numPokemonKOJugador) {
        this.numPokemonKOJugador = numPokemonKOJugador;
    }

    public int getNumPokemonKORival() {
        return numPokemonKORival;
    } 

    public void setNumPokemonKORival(int numPokemonKORival) {
        this.numPokemonKORival = numPokemonKORival;
    }

    public Entrenador retirarse(){
        this.jugador.setPokedollar(this.jugador.getPokedollar()*2/3);
        this.setGanador(rival);
        return ganador;
        // Un entrenador siempre podrÃ¡ retirarse del combate si asÃ­Â­ lo desea,
    }

    public void comprobarGanador(){
        if(this.numPokemonKOJugador == 4)
        this.setGanador(rival);
        if(this.numPokemonKORival == 4)
        this.setGanador(jugador);    
    
        // El entrenador que pierda el combate deberÃ¡ entregar al entrenador ganador 1/3 de su nÃºmero de pokedollars,
    }
    
    public void addTurno(Turno turno){
        this.turno.add(turno);
    }

    public void escribirCombate(){
        File fichero= new File(PATH);
        try {
            FileWriter fileWriter = new FileWriter(fichero);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);

            for (Turno turno : turno) {
                bWriter.write("Tunrno "+ turno.getNumTurno()+ ":\n" );
                bWriter.write("Entrenador: "+ turno.getAccionEntrenador()+ "\n");
                bWriter.write("Rival: "+ turno.getAccionRival()+ "\n");
            }
            bWriter.close();
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

