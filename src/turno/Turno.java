package turno;

public class Turno {
    
    private int numTurno;
    private String accionEntrenador;
    private String accionRival;

    public Turno( String accionEntrenador, String accionRival){
    this.numTurno = 0;
    this.accionEntrenador= accionEntrenador;
    this.accionRival= accionRival;
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
