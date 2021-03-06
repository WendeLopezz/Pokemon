package modelo;

public class MovimientoMejora extends Movimiento {

    private Mejora mejoraAplicar;
    private int numTurno;

    MovimientoMejora(Tipo tipo, int estamina, Mejora mejoraAplicar, int numTurno, String nombre) {
        super(tipo, estamina, nombre);
        this.mejoraAplicar = mejoraAplicar;
        this.numTurno = numTurno;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }

    public Mejora getMejoraAplicar() {
        return mejoraAplicar;
    }

    public void setMejoraAplicar(Mejora mejoraAplicar) {
        this.mejoraAplicar = mejoraAplicar;
    }

}
