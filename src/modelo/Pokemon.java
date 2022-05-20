package modelo;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon {
    private String nombre;
    private String mote;
    private int vitalidad;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int nivel;
    private int experiencia;
    private int estamina;
    private int velocidad;
    private int fertilidad;
    private Estado estado;
    private ArrayList<Movimiento> movimientos;
    private Tipo tipo;
    private Tipo tipo2;
    private int idPokemon;
    
    
    Random ran = new Random();

    public Pokemon(String nombre, String mote,
             ArrayList<Movimiento> movimientos, Tipo tipo, Tipo tipo2) {

              
        this.fertilidad = 5;
        this.ataque = ran.nextInt(10) + 10;
        this.ataqueEspecial = ran.nextInt(10) + 10;
        this.defensa = ran.nextInt(10) + 1;
        this.defensaEspecial = ran.nextInt(10) + 1;
        this.estado = Estado.SIN_ESTADO;
        this.tipo = tipo;
        this.tipo2 = tipo2;
        this.movimientos = movimientos;
        this.estamina = ran.nextInt(10) + 1;
        this.nombre = nombre;
        this.mote = mote;
        this.nivel = 1;
        this.vitalidad = 100;
        this.experiencia = 0;
        this.velocidad = ran.nextInt(10) + 1;

    }

    public Pokemon(){
        
        
        this.nombre = "";
        this.mote = "";
        this.vitalidad = 0;
        this.ataque = 0;
        this.defensa = 0;
        this.ataqueEspecial = 0;
        this.defensaEspecial = 0;
        this.velocidad = 0;
        this.fertilidad = 0;        
        this.estamina = 0;
        this.nivel = 1;
        this.idPokemon = 0;
        
        
        
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
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

    public Tipo getTipo2() {
        return tipo2;
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

    public void setTipo2(Tipo tipo2) {
        this.tipo2 = tipo2;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setVitalidad(int vitalidad) {
        this.vitalidad = vitalidad;
    }

    public boolean ganarExp(int experienciaNueva) {
        this.experiencia += experienciaNueva;
        if (experiencia >= nivel * 10)
            nivel++;
        return true;
    }

    public boolean atacarPokemon(Pokemon pokemonRival) {
        int danioRival = this.ataque - pokemonRival.defensa;
        if(danioRival >= 0){
            pokemonRival.setVitalidad(pokemonRival.vitalidad - danioRival); 
            return true;
        }
        return false;
    }

    public boolean descansar() {
        this.estamina++;
        return true;
    }

    public boolean aprenderAtaque() {

        return true;
    }

    public int checkTipo(Pokemon pokemon) {

        int numDebil = 0;

        switch (this.getTipo()) {
            case AGUA:
                if (pokemon.getTipo() == Tipo.PLANTA || pokemon.getTipo() == Tipo.ELECTRICO)
                    numDebil++;
                if (pokemon.getTipo2() == Tipo.PLANTA || pokemon.getTipo2() == Tipo.ELECTRICO)
                    numDebil++;
                break;
            case TIERRA:
                if (pokemon.getTipo() == Tipo.PLANTA || pokemon.getTipo() == Tipo.AGUA)
                    numDebil++;
                if (pokemon.getTipo2() == Tipo.PLANTA || pokemon.getTipo2() == Tipo.AGUA)
                    numDebil++;
                break;
            case PLANTA:
                if (pokemon.getTipo() == Tipo.FUEGO || pokemon.getTipo() == Tipo.BICHO)
                    numDebil++;
                if (pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.BICHO)
                    numDebil++;
                break;
            case ELECTRICO:
                if (pokemon.getTipo() == Tipo.TIERRA || pokemon.getTipo() == Tipo.PLANTA)
                    numDebil++;
                if (pokemon.getTipo2() == Tipo.TIERRA || pokemon.getTipo2() == Tipo.PLANTA)
                    numDebil++;
                break;

            case BICHO:
                if (pokemon.getTipo() == Tipo.FUEGO || pokemon.getTipo() == Tipo.VOLADOR)
                    numDebil++;
                if (pokemon.getTipo2() == Tipo.FUEGO || pokemon.getTipo2() == Tipo.VOLADOR)
                    numDebil++;
                break;

            case VOLADOR:
                if (pokemon.getTipo() == Tipo.ELECTRICO || pokemon.getTipo() == Tipo.TIERRA)
                    numDebil++;
                if (pokemon.getTipo2() == Tipo.ELECTRICO || pokemon.getTipo2() == Tipo.TIERRA)
                    numDebil++;
                break;

            case FUEGO:
                if (pokemon.getTipo() == Tipo.TIERRA || pokemon.getTipo() == Tipo.AGUA)
                    numDebil++;
                if (pokemon.getTipo2() == Tipo.TIERRA || pokemon.getTipo2() == Tipo.AGUA)
                    numDebil++;
                break;
        }
        return numDebil;
    }
    public boolean atacar(Pokemon rival){

        int danioRival = this.ataque - rival.defensa;
        if(danioRival >= 0){
            int vitalidadFinal = rival.vitalidad - danioRival;
            if(vitalidadFinal <= 0){
                rival.setVitalidad(0);
            }else{
                rival.setVitalidad(vitalidadFinal);
            }
            return true;
        }
        
        return false; 
    }
}
