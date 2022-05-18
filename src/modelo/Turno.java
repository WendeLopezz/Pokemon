package modelo;

public class Turno {
    
    private int numTurno;
    private String accionEntrenador;
    private String accionRival;

    public Turno(int paramNumTurno,String paramAccionEntrenador, String paramAccionRival){
    this.numTurno = paramNumTurno;
    this.accionEntrenador= paramAccionEntrenador;
    this.accionRival= paramAccionRival;
    }

    public int getNumTurno() {
        return numTurno;
    }

    public void setNumTurno(int numTurno) {
        this.numTurno = numTurno;
    }
    
    public String getAccionEntrenador() {
        return accionEntrenador;
    }

    public void setAccionEntrenador(String accionEntrenador) {
        this.accionEntrenador = accionEntrenador;
    }
    
    public String getAccionRival() {
        return accionRival;
    }

    public void setAccionRival(String accionRival) {
        this.accionRival = accionRival;
    }
    


}
