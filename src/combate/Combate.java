package combate;

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

    public Entrenador getJugador() {
        return jugador;
    }

    public Entrenador getRival() {
        return rival;
    }

    
    public void setNumeroPokemonKOJugador(int numeroPokemonKOJugador) {
        this.numeroPokemonKOJugador = numeroPokemonKOJugador;
    }

    public void setNumeroPokemonKORival(int numeroPokemonKORival) {
        this.numeroPokemonKORival = numeroPokemonKORival;
    }

    public void setGanador(Entrenador ganador) {
        this.ganador = ganador;
    }

    public void setJugador(Entrenador jugador) {
        this.jugador = jugador;
    }

    public void setRival(Entrenador rival) {
        this.rival = rival;
    }

  

    
}
