package org.itson.utils;

import org.itson.dominio.Imagen;

/**
 *
 * @author Toled
 */
public class ChatItem {

    private String nombreChat;
    private Imagen imagen;
    private String id;

    public ChatItem(String nombreChat, Imagen imagen, String id) {
        this.nombreChat = nombreChat;
        this.imagen = imagen;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombreChat;
    }

}
