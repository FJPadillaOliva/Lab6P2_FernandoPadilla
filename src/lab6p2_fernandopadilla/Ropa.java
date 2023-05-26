
package lab6p2_fernandopadilla;


public class Ropa extends Objetos {
    private char talla;
    private String tipoTela, pais;

    public Ropa() {
    }

    public Ropa(char talla, String tipoTela, String pais, String color, String descripcion, String marca, String tamaño, String calidad, Personas usuario) {
        super(color, descripcion, marca, tamaño, calidad, usuario);
        this.talla = talla;
        this.tipoTela = tipoTela;
        this.pais = pais;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", tipoTela=" + tipoTela + ", pais=" + pais + '}';
    }
    
    
    
}
