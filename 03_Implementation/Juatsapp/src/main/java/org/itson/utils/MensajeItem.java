package org.itson.utils;

import javax.swing.ImageIcon;

/**
 *
 * @author Toled
 */
public class MensajeItem {

    /**
     * Usuario que manda el mensaje.
     */
    private String username;
    /**
     * Fecha con formato.
     */
    private String fechaTexto;
    /**
     * Contenido en texto del mensaje.
     */
    private String contenidoMensaje;
    /**
     * Imagen opcional del mensaje.
     */
    private ImageIcon imagenMensaje;
    /**
     * Lado del mensaje, para identificar si lo envia o lo recibe.
     */
    private MsgSide msgSide;

    public enum MsgSide {
        /**
         * Lado Izquierdo en el chat.
         */
        LEFT,
        /**
         * Lado Derecho en el chat.
         */
        RIGHT
    }

    /**
     * Unico constructor.
     *
     * @param username
     * @param msgSide
     */
    public MensajeItem(final String username, final MsgSide msgSide) {
        this.username = username;
        this.msgSide = msgSide;
    }

    /**
     * Regresa el username del mensaje.
     *
     * @return el username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el username del mensaje.
     *
     * @param username
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Obtiene la fecha con formato.
     *
     * @return la fecha con formato.
     */
    public String getFechaTexto() {
        return fechaTexto;
    }

    /**
     * Establece la fecha con formato.
     *
     * @param fechaTexto
     */
    public void setFechaTexto(final String fechaTexto) {
        this.fechaTexto = fechaTexto;
    }

    /**
     * Obtiene el contenido del mensaje.
     *
     * @return el contenido en texto del mensaje.
     */
    public String getContenidoMensaje() {
        return contenidoMensaje;
    }

    /**
     * Establece el contenido del mensaje.
     *
     * @param contenidoMensaje
     */
    public void setContenidoMensaje(final String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    /**
     * Obtiene la posible imagen del mensaje.
     *
     * @return la posible imagen.
     */
    public ImageIcon getImagenMensaje() {
        return imagenMensaje;
    }

    /**
     * Establece la imagen del mensaje.
     *
     * @param imagenMensaje
     */
    public void setImagenMensaje(final ImageIcon imagenMensaje) {
        this.imagenMensaje = imagenMensaje;
    }

    /**
     * Obtiene le lado donde aparecera el mensaje.
     *
     * @return el lado donde aparecera el mensaje.
     */
    public MsgSide getMsgSide() {
        return msgSide;
    }

    /**
     * Establece el lado del mensaje.
     *
     * @param msgSide
     */
    public void setMsgSide(final MsgSide msgSide) {
        this.msgSide = msgSide;
    }

}
