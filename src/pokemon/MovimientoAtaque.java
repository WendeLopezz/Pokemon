package pokemon;

public class MovimientoAtaque extends Movimiento {

    private int potenciaAtaque;

    MovimientoAtaque(Tipo tipo, int estamina, int potenciaAtaque) {
        super(tipo, estamina);
        this.potenciaAtaque = potenciaAtaque;
    }

    public int getPotenciaAtaque() {
        return potenciaAtaque;
    }

    public void setPotenciaAtaque(int potenciaAtaque) {
        this.potenciaAtaque = potenciaAtaque;
    }
}
