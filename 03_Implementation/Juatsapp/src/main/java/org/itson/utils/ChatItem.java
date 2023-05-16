package org.itson.utils;

import org.itson.dominio.Imagen;

/**
 *
 * @author Toled
 */
public class ChatItem {

    private String nombreChat;
    private Imagen imagen;

    public ChatItem(String nombreChat, Imagen imagen) {
        this.nombreChat = nombreChat;
        this.imagen = imagen;
    }

    public String getNombreChat() {
        return nombreChat;
    }

    public void setNombreChat(String nombreChat) {
        this.nombreChat = nombreChat;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return nombreChat;
    }

}
