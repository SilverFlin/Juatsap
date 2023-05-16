package org.itson.dominio;

import java.time.LocalDateTime;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 *
 */
public final class Mensaje {

    /**
     * Id del mensaje.
     */
    private ObjectId id;
    /**
     * Id del emisor del mensaje.
     */
    private ObjectId userId;
    /**
     * Contenido del mensaje (texto).
     */
    private String contenidoMensaje;
    /**
     * Imágen opcional del mensaje.
     */
    private Imagen imagen;
    /**
     * Timstamp de la creación del mensaje.
     */
    private LocalDateTime timestamp;
    /**
     * Disponibilidad del mensaje, para ver si se borró o no.
     */
    private boolean disponibilidad;

    /**
     * Constructor vacío.
     */
    public Mensaje() {
    }

    /**
     * Obtiene id del mensaje.
     *
     * @return id del mensaje.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el id del mensaje.
     *
     * @param id
     */
    public void setId(final ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el id del usuario emisor.
     *
     * @return id del usuario emisor
     */
    public ObjectId getUserId() {
        return userId;
    }

    /**
     * Establece el id dle usuario emisor.
     *
     * @param userId
     */
    public void setUserId(final ObjectId userId) {
        this.userId = userId;
    }

    /**
     * Obtiene el contenido del mensaje.
     *
     * @return el contenido del mensaje.
     */
    public String getContenidoMensaje() {
        return contenidoMensaje;
    }

    /**
     * Establece el contneido del mensaje.
     *
     * @param contenidoMensaje
     */
    public void setContenidoMensaje(final String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    /**
     * Obtiene la imágen opcional del mensaje.
     *
     * @return la imágen opcional del mensaje.
     */
    public Imagen getImagen() {
        return imagen;
    }

    /**
     * Establece la imágen opcional del mensaje.
     *
     * @param imagen
     */
    public void setImagen(final Imagen imagen) {
        this.imagen = imagen;
    }

    /**
     * Obtiene la fecha de generación del mensaje.
     *
     * @return fecha de generación del mensaje
     */
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    /**
     * Establece la fecha de generación del mensaje.
     *
     * @param timestamp
     */
    public void setTimestamp(final LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Regresa la disponibilidad del mensaje.
     *
     * @return la disponibilidad del mensaje.
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Establece la disponibilidad del mensaje.
     *
     * @param disponibilidad
     */
    public void setDisponibilidad(final boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
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
        final Mensaje other = (Mensaje) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Mensaje{"
                + "mensaje=" + contenidoMensaje
                + ", timestamp=" + timestamp
                + ", disponibilidad=" + disponibilidad
                + '}';
    }

}
