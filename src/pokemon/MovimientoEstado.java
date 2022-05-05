package pokemon;

public class MovimientoEstado extends Movimiento {

    private Estado estadoAplicar;

    MovimientoEstado(Tipo tipo, int estamina, Estado estadoAplicar) {
        super(tipo, estamina);
        this.estadoAplicar = estadoAplicar;

    }

    public Estado getEstadoAplicar() {
        return estadoAplicar;
    }

    public void setEstadoAplicar(Estado estadoAplicar) {
        this.estadoAplicar = estadoAplicar;
    }
}
