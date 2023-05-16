package org.itson.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 *
 */
public final class Chat {

    /**
     * Id del chat.
     */
    private ObjectId id;
    /**
     * Id del receptor del chat.
     */
    private ObjectId receptor;
    /**
     * Id del emisor del chat.
     */
    private ObjectId emisor;
    /**
     * tiempo de creación del chat.
     */
    private LocalDateTime fecha;
    /**
     * Historial de mensajes del chat chat.
     */
    private List<ObjectId> historialMensajes;

    /**
     * Constructor vacío.
     */
    public Chat() {
    }

    /**
     * Obtiene id del chat.
     *
     * @return id del chat.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece id del chat.
     *
     * @param id
     */
    public void setId(final ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el receptor del mensaje.
     *
     * @return El ObjectId del receptor.
     */
    public ObjectId getReceptor() {
        return receptor;
    }

    /**
     * Establece el receptor del mensaje.
     *
     * @param receptor El ObjectId del receptor.
     */
    public void setReceptor(final ObjectId receptor) {
        this.receptor = receptor;
    }

    /**
     * Obtiene el emisor del mensaje.
     *
     * @return El ObjectId del emisor.
     */
    public ObjectId getEmisor() {
        return emisor;
    }

    /**
     * Establece el emisor del mensaje.
     *
     * @param emisor El ObjectId del emisor.
     */
    public void setEmisor(final ObjectId emisor) {
        this.emisor = emisor;
    }

    /**
     * Obtiene la fecha del mensaje.
     *
     * @return La fecha del mensaje.
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del mensaje.
     *
     * @param fecha La fecha del mensaje.
     */
    public void setFecha(final LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene el historial de mensajes del chat.
     *
     * @return La lista de ObjectId del historial de mensajes.
     */
    public List<ObjectId> getHistorialMensajes() {
        if (historialMensajes == null) {
            return new ArrayList<>();
        }
        return historialMensajes;
    }

    /**
     * Establece el historial de mensajes del chat.
     *
     * @param historialMensajes La lista de ObjectId del historial de mensajes.
     */
    public void setHistorialMensajes(final List<ObjectId> historialMensajes) {
        this.historialMensajes = historialMensajes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Chat other = (Chat) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Chat{" + "fecha=" + fecha + '}';
    }

}
