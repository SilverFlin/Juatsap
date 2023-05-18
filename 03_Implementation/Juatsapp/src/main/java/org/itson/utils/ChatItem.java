package org.itson.utils;

import org.itson.dominio.Imagen;

/**
 *
 * @author Toled
 */
public final class ChatItem {

    /**
     * Nombre del chat.
     */
    private String nombreChat;

    /**
     * Fecha con formato.
     */
    private String fechaTexto;
    /**
     * Imagen del chat.
     */
    private Imagen imagen;
    /**
     * Id del Chat.
     */
    private String id;

    /**
     * Unico constructor.
     *
     * @param nombreChat
     * @param imagen
     * @param id
     */
    public ChatItem(
            final String nombreChat,
            final Imagen imagen,
            final String id
    ) {
        this.nombreChat = nombreChat;
        this.imagen = imagen;
        this.id = id;
    }

    /**
     * Obtener nombre del chat.
     *
     * @return nombre del chat.
     */
    public String getNombreChat() {
        return nombreChat;
    }

    /**
     * Establece el nombre del chat.
     *
     * @param nombreChat
     */
    public void setNombreChat(final String nombreChat) {
        this.nombreChat = nombreChat;
    }

    public String getFechaTexto() {
        return fechaTexto;
    }

    public void setFechaTexto(String fechaTexto) {
        this.fechaTexto = fechaTexto;
    }

    /**
     * Obtiene la imagen del chat.
     *
     * @return imagen del chat
     */
    public Imagen getImagen() {
        return imagen;
    }

    /**
     * Establece la imagen del chat.
     *
     * @param imagen
     */
    public void setImagen(final Imagen imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene id del chat.
     *
     * @return id del chat.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece id del chat.
     *
     * @param id
     */
    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return nombreChat;
    }

}
