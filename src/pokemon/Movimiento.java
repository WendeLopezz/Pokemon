package pokemon;

public abstract class Movimiento {
    private Tipo tipo;
    private int estamina;

    Movimiento(Tipo tipo, int estamina) {
        this.tipo = tipo;
        this.estamina = estamina;
    }

    public int getEstamina() {
        return estamina;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
