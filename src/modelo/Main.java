package modelo;

public class Main {
    public static void main(String[] args) {
        
        Combate combate = new Combate();
        Turno turno1 = new Turno(1,
        "Charmander usa Ascuas",
        "Squirter usa Burbuja");

        Turno turno2 = new Turno( 2,
        "Pikachu usa Golpe trueno",
        " Gyrados usa Hidrocanon");
        
        combate.addTurno(turno1);
        combate.escribirCombate();

        combate.addTurno(turno2);
        combate.escribirCombate();

    }
}
