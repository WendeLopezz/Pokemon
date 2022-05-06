package combate;

import entrenador.Entrenador;
import turno.Turno;

public class Combate {

    private Entrenador jugador;
    private Entrenador rival;
    private Entrenador ganador;
    private Turno turno;
    private int numPokemonKOJugador;
    private int numPokemonKORival;
    
    public Combate(){

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

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
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
