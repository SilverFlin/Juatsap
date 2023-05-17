package org.itson.utils;

import javax.swing.ImageIcon;

/**
 *
 * @author Toled
 */
public class MensajeItem {

    private String username;
    private String contenidoMensaje;
    private ImageIcon imagenMensaje;
    private MsgSide msgSide;

    public enum MsgSide {
        LEFT,
        RIGHT
    }

    public MensajeItem(String username, MsgSide msgSide) {
        this.username = username;
        this.msgSide = msgSide;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setContenidoMensaje(String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    public ImageIcon getImagenMensaje() {
        return imagenMensaje;
    }

    public void setImagenMensaje(ImageIcon imagenMensaje) {
        this.imagenMensaje = imagenMensaje;
    }

    public MsgSide getMsgSide() {
        return msgSide;
    }

    public void setMsgSide(MsgSide msgSide) {
        this.msgSide = msgSide;
    }

}
