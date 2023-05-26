
package lab6p2_fernandopadilla;


public class Zapatos extends Objetos {
    private char talla;
    private String descripcionZ;
    private int comodidad;

    public Zapatos() {
    }

    public Zapatos(char talla, String descripcion, int comodidad, String color, String descripcionZ, String marca, String tamaño, String calidad, Personas usuario) {
        super(color, descripcion, marca, tamaño, calidad, usuario);
        this.talla = talla;
        this.descripcionZ = descripcionZ;
        setComodidad(comodidad);
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getDescripcionZ() {
        return descripcionZ;
    }

    public void setDescripcionZ(String descripcionZ) {
        this.descripcionZ = descripcionZ;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        if (comodidad>= 1 || comodidad <=10) {
            this.comodidad = comodidad;
        }
    }

    @Override
    public String toString() {
        return "Zapatos{" + "talla=" + talla + ", descripcionZ=" + descripcionZ + ", comodidad=" + comodidad + '}';
    }

    
    
}
