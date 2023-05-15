package org.itson.dominio;

import java.time.LocalDateTime;
import java.util.Objects;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Toled
 */
public class Mensaje {

    private ObjectId _id;
    private ObjectId userId;
    private String mensaje;
    private Document imagen;
    private LocalDateTime timestamp;
    private boolean disponibilidad;

    public Mensaje() {
    }

    public Mensaje(
            final ObjectId userId,
            final String mensaje,
            final Document imagen,
            final LocalDateTime timestamp,
            final boolean disponibilidad
    ) {
        this.userId = userId;
        this.mensaje = mensaje;
        this.imagen = imagen;
        this.timestamp = timestamp;
        this.disponibilidad = disponibilidad;
    }

    public Mensaje(
            final ObjectId _id,
            final ObjectId userId,
            final String mensaje,
            final Document imagen,
            final LocalDateTime timestamp,
            final boolean disponibilidad
    ) {
        this._id = _id;
        this.userId = userId;
        this.mensaje = mensaje;
        this.imagen = imagen;
        this.timestamp = timestamp;
        this.disponibilidad = disponibilidad;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Document getImagen() {
        return imagen;
    }

    public void setImagen(Document imagen) {
        this.imagen = imagen;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this._id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
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
        return Objects.equals(this._id, other._id);
    }

    @Override
    public String toString() {
        return "Mensaje{" + "mensaje=" + mensaje + ", timestamp=" + timestamp + ", disponibilidad=" + disponibilidad + '}';
    }

}
