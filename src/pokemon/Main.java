package pokemon;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
    Pokemon pokemon = new Pokemon("nombre", "mote", 12, 21, 12, 35, 32, 10, 12, 12, Estado.PARALIZADO, new ArrayList<Movimiento>(), Tipo.FUEGO);

    pokemon.subirNivel();
    System.out.println();

    }
}
