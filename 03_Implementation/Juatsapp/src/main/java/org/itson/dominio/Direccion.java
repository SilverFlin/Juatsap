package org.itson.dominio;

/**
 *
 * @author Toled
 */
public class Direccion {

    private String calle;
    private String numero;
    private String colonia;
    private String ciudad;
    private String estado;
    private String pais;

    public Direccion(String calle, String numero, String colonia, String ciudad, String estado, String pais) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + ", ciudad=" + ciudad + ", estado=" + estado + ", pais=" + pais + '}';
    }

}
