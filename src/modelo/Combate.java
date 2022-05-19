package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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
    public void escribirCombate(){
        File fichero = new File(PATH);
        try {
            FileWriter fw = new FileWriter(fichero);
            BufferedWriter bw = new BufferedWriter(fw);

            for (Turno turno2 : turno) {
                bw.write("Turno"+ turno2.getNumTurno()+ "\n");
                bw.write("Entrenador: "+ turno2.getNumTurno()+ "\n");
                bw.write("Rival: "+ turno2.getNumTurno()+ "\n");
            }
            bw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void setTurno(List<Turno> turno) {
        this.turno = turno;
    }

    public void addTurno(Turno turno){
        this.turno.add(turno);
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
        // Un entrenador siempre podrá retirarse del combate si así lo desea,
    }

    public void comprobarGanador(){
        if (this.numPokemonKORival == 4)
            this.setGanador(jugador);
        if (this.numPokemonKOJugador == 4)
            this.setGanador(rival);
        // El entrenador que pierda el combate deberá entregar al entrenador ganador 1⁄3 de su número de pokédollars,
    }



}