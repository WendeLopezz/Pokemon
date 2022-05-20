package modelo;

public abstract class Movimiento {
    private Tipo tipo;
    private int estamina;
    private String nombre;
    

    Movimiento(Tipo tipo, int estamina, String nombre) {
        this.tipo = tipo;
        this.estamina = estamina;
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
