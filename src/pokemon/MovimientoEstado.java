package pokemon;

public class MovimientoEstado extends Movimiento {

    private Estado estadoAplicar;

    MovimientoEstado(Tipo tipo, int estamina, Estado estadoAplicar, String nombre) {
        super(tipo, estamina, nombre);
        this.estadoAplicar = estadoAplicar;

    }

    public Estado getEstadoAplicar() {
        return estadoAplicar;
    }

    public void setEstadoAplicar(Estado estadoAplicar) {
        this.estadoAplicar = estadoAplicar;
    }
}
