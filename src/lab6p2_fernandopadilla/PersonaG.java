
package lab6p2_fernandopadilla;


public class PersonaG extends Personas {
    private String ocupacion, horario;
    private int tiempo;
    private double sueldo;

    public PersonaG() {
        super();
    }

    public PersonaG(String ocupacion, String horario, int tiempo, double sueldo, String id, String nombre, int edad, char sexo, String estadoC, double altura, double peso) {
        super(id, nombre, edad, sexo, estadoC, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return getNombre() + ",Ocupacion=" + ocupacion + ", horario=" + horario + ", tiempo=" + tiempo + ", sueldo=" + sueldo;
    }
    
    
}
