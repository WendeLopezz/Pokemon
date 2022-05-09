package combate;

<<<<<<< HEAD
import java.util.LinkedList;
import java.util.List;

import entrenador.Entrenador;
import turno.Turno;

public class Combate {

    private Entrenador jugador;
    private Entrenador rival;
    private Entrenador ganador;
    private List<Turno> turno;
    private int numPokemonKOJugador;
    private int numPokemonKORival;
    
    public Combate(){
        turno = new LinkedList<>();
    }
=======
import entrenador.Entrenador;

public class Combate {
    
    private int numeroPokemonKOJugador;
    private int numeroPokemonKORival;
    private Entrenador rival;
    private Entrenador jugador;
    private Entrenador ganador;
    

    public Combate(){

    }

    public int getNumeroPokemonKOJugador() {
        return numeroPokemonKOJugador;
    }

    public int getNumeroPokemonKORival() {
        return numeroPokemonKORival;
    }

    public Entrenador getGanador() {
        return ganador;
    }

>>>>>>> origin/clase_entrenador
    public Entrenador getJugador() {
        return jugador;
    }

<<<<<<< HEAD
    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }
    
=======
>>>>>>> origin/clase_entrenador
    public Entrenador getRival() {
        return rival;
    }

<<<<<<< HEAD
    public void setRival(Entrenador rival) {
        this.rival = rival;
    }
    
    public Entrenador getGanador() {
        return ganador;
=======
    
    public void setNumeroPokemonKOJugador(int numeroPokemonKOJugador) {
        this.numeroPokemonKOJugador = numeroPokemonKOJugador;
    }

    public void setNumeroPokemonKORival(int numeroPokemonKORival) {
        this.numeroPokemonKORival = numeroPokemonKORival;
>>>>>>> origin/clase_entrenador
    }

    public void setGanador(Entrenador ganador) {
        this.ganador = ganador;
    }

<<<<<<< HEAD
    public List<Turno> getTurno() {
        return turno;
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



=======
    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

  

    
>>>>>>> origin/clase_entrenador
}
