
package lab6p2_fernandopadilla;


public class ObjetosHogar extends Objetos {
    private String descripcionO, instrucciones;
    private int tiempoG;

    public ObjetosHogar() {
    }

    public ObjetosHogar(String descripcionO, String instrucciones, int tiempoG, String color, String descripcion, String marca, String tamaño, String calidad, Personas usuario) {
        super(color, descripcion, marca, tamaño, calidad, usuario);
        this.descripcionO = descripcionO;
        this.instrucciones = instrucciones;
        this.tiempoG = tiempoG;
    }

    public String getDescripcionO() {
        return descripcionO;
    }

    public void setDescripcionO(String descripcionO) {
        this.descripcionO = descripcionO;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public int getTiempoG() {
        return tiempoG;
    }

    public void setTiempoG(int tiempoG) {
        this.tiempoG = tiempoG;
    }

    @Override
    public String toString() {
        return "ObjetosHogar{" + "descripcionO=" + descripcionO + ", instrucciones=" + instrucciones + ", tiempoG=" + tiempoG + '}';
    }
    
    
}
