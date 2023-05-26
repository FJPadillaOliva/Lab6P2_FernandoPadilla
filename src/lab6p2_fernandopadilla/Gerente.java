
package lab6p2_fernandopadilla;


public class Gerente extends Personas{
    private String usuario, contraseña, cargo;

    public Gerente() {
    }

    public Gerente(String usuario, String contraseña, String cargo, String id, String nombre, int edad, char sexo, String estadoC, double altura, double peso) {
        super(id, nombre, edad, sexo, estadoC, altura, peso);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "usuario=" + usuario + ", contraseña=" + contraseña + ", cargo=" + cargo + '}';
    }
    
    
    
}
