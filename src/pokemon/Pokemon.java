package pokemon;

import java.util.ArrayList;

public class Pokemon {
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int nivel;
    private int estamina;
    private int velocidad;
    private int fertilidad;
    private Estado estado;
    private ArrayList<Movimiento> movimientos;
    private Tipo tipo;

    public Pokemon(String nombre, String mote, int vitalidad, int ataque, int defensa,
            int ataqueEspecial, int defensaEspecial, int nivel, int estamina, int velocidad,
            Estado estado, ArrayList<Movimiento> movimientos, Tipo tipo) {

        this.fertilidad = 5;
        this.ataque = ataque;
        this.ataqueEspecial = ataqueEspecial;
        this.defensa = defensa;
        this.defensaEspecial = defensaEspecial;
        this.estado = estado;
        this.tipo = tipo;
        this.movimientos = movimientos;
        this.estamina = estamina;
        this.nombre = nombre;
        this.mote = mote;
        this.nivel = nivel;
        this.vitalidad = vitalidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getEstamina() {
        return estamina;
    }

    public int getFertilidad() {
        return fertilidad;
    }

    public String getMote() {
        return mote;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getVitalidad() {
        return vitalidad;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setEstamina(int estamina) {
        this.estamina = estamina;
    }

    public void setFertilidad(int fertilidad) {
        this.fertilidad = fertilidad;
    }

    public void setMote(String mote) {
        this.mote = mote;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public boolean subirNivel() {
        
        return true;
    }

    public boolean atacarPokemon(Pokemon pokemon) {

        return true;
    }

    public boolean descansar() {

        return true;
    }

    public boolean aprenderAtaque() {

        return true;
    }

    public void checkTipo(Pokemon pokemon) {

    }
}
