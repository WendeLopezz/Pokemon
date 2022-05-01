package entrenador;

import pokemon.Pokemon;

public class Entrenador {
    
    private String nombre;
    private Pokemon [] equipo = new Pokemon [4];
    private Pokemon [] caja;

    public Entrenador(String nom, Pokemon [] equipo, Pokemon [] caja){
        this.nombre = nom;
        this.equipo = equipo;
        this.caja = caja;        
    }

    public String getNombre() {
        return nombre;
    }
    public Pokemon[] getEquipo() {
        return equipo;
    }
    public Pokemon[] getCaja() {
        return caja;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEquipo(Pokemon[] equipo) {
        this.equipo = equipo;
    }
    public void setCaja(Pokemon[] caja) {
        this.caja = caja;
    }

    public Boolean moverPokemonCaja(){
        
        return true;
    }

    public Boolean sacarPokemonCaja(){
        return true;
    }

    public Boolean capturarPokemon(Pokemon pokemon){
        
        return true;
    }

    public Pokemon generarPokemon(){
        return new Pokemon();
    }

    public void combatir(Pokemon pokemon){

    }



}
