package entrenador;

<<<<<<< HEAD
public class Entrenador {
    
=======
import java.util.ArrayList;

import pokemon.Pokemon;

public class Entrenador {
    

    private String nombre;
    private ArrayList<Pokemon> equipo;
    private  ArrayList<Pokemon> caja;
    private int pokedollar;


    public Entrenador(String nombreParam, ArrayList<Pokemon> equipoParam, ArrayList<Pokemon> cajaParam ){
        this.nombre = nombreParam;
        this.equipo = equipoParam;
        this.caja = cajaParam;
        this.pokedollar = (int)(Math.random()* 201) + 800;
    }

    public String getNombre() {
        return nombre;        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pokemon> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Pokemon> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Pokemon> getCaja() {
        return caja;
    }

    public void setCaja(ArrayList<Pokemon> caja) {
        this.caja = caja;
    }
    
    public int getPokedollar() {
        return pokedollar;
    }
   
    public void setPokedollar(int pokedollar) {
        this.pokedollar = pokedollar;
    }

    public boolean moverPokemonCaja(Pokemon pokemon){
        if(this.equipo.size() < 1){
            this.caja.add(pokemon);
            return true;
        }
        else{
             return false;
        }
          // mover uno de los PokÃ©mon del equipo principal a la caja (siempre que no se quede sin PokÃ©mon en su equipo principal).
    }

    public boolean moverPokemonEquipo(Pokemon pokemon){
        if(this.caja.size() < 4 ){
            this.equipo.add(pokemon);
            return true;
        }
        else{
        return false;
        }    // mover uno de los PokÃ©mon de su caja al equipo principal (siempre que no se tengan 4 PokÃ©mon ya en el equipo principal).

    }


>>>>>>> origin/clase_entrenador
}
