package org.itson.dominio;

/**
 *
 *
 */
public final class Direccion {

    /**
     * Calle de la dirección.
     */
    private String calle;
    /**
     * Número de la dirección.
     */
    private String numero;
    /**
     * Colonia de la dirección.
     */
    private String colonia;
    /**
     * Ciudad de la dirección.
     */
    private String ciudad;
    /**
     * Estadi de la dirección.
     */
    private String estado;
    /**
     * País de la dirección.
     */
    private String pais;

    /**
     * Constructor vacío.
     */
    public Direccion() {

    }

    /**
     * Obtiene la calle de la dirección.
     *
     * @return la calle de la dirección
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece la calle de la dirección.
     *
     * @param calle
     */
    public void setCalle(final String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el numero de la dirección.
     *
     * @return numero de la dirección.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Establece el número de la dirección.
     *
     * @param numero
     */
    public void setNumero(final String numero) {
        this.numero = numero;
    }

    /**
     * Obtiene la colonia de la dirección.
     *
     * @return la colonia de la dirección.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece la colonia de la dirección.
     *
     * @param colonia
     */
    public void setColonia(final String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene la ciudad de la dirección.
     *
     * @return la ciudad de la dirección.
     *
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece la ciudad de la dirección.
     *
     * @param ciudad
     */
    public void setCiudad(final String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el estado de la dirección.
     *
     * @return estado de la dirección.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado de la dirección.
     *
     * @param estado
     */
    public void setEstado(final String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el pais de la dirección.
     *
     * @return el pais de la dirección.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Establece el pais de la dirección.
     *
     * @param pais
     */
    public void setPais(final String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{"
                + "calle=" + calle
                + ", numero=" + numero
                + ", colonia=" + colonia
                + ", ciudad=" + ciudad
                + ", estado=" + estado
                + ", pais=" + pais
                + '}';
    }

}
