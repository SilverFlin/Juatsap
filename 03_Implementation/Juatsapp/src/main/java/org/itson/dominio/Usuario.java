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
public final class Usuario {

    /**
     * Id del documento.
     */
    private ObjectId id;
    /**
     * Nombre del usuario.
     */
    private String username;
    /**
     * Correo del usuario.
     */
    private String correo;
    /**
     * Contraseña del usuario.
     */
    private String password;
    /**
     * Teléfono del usuario.
     */
    private String telefono;
    /**
     * Sexo del usuario.
     */
    private Sexo sexo;
    /**
     * Lista de chats del usuario.
     */
    private List<ObjectId> chats;
    /**
     * Imágen de perfil del usuario.
     */
    private Imagen imagenPerfil;
    /**
     * Fecha de nacimiento del usuario.
     */
    private LocalDateTime fechaNacimiento;
    /**
     * Dirección del usuario.
     */
    private Direccion direccion;

    /**
     * Constructor vacío.
     */
    public Usuario() {
    }

    /**
     * Regresa la id del ususario.
     *
     * @return id del usuario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece la id del usuario.
     *
     * @param id
     */
    public void setId(final ObjectId id) {
        this.id = id;
    }

    /**
     * Regresa el username del usuario.
     *
     * @return el username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Establece el username del usuario.
     *
     * @param username
     */
    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Regresa el correo del usuario.
     *
     * @return el correo del usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo del usuario.
     *
     * @param correo
     */
    public void setCorreo(final String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el la contraseña encriptada del usuario.
     *
     * @return contraseña encriptada.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password
     */
    public void setPassword(final String password) {
        this.password = password;
    }

    /**
     * Regresa el teléfono del usuario.
     *
     * @return el teléfono del usuario
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Esteblece el teléfono del usuario.
     *
     * @param telefono
     */
    public void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el sexo del usuario.
     *
     * @return el sexo sel usuario
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Establece el sexo del usuario.
     *
     * @param sexo
     */
    public void setSexo(final Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtiene la lista de los chatid del usuario.
     *
     * @return lista de chatsid.
     */
    public List<ObjectId> getChats() {
        if (chats == null) {
            return new ArrayList<>();
        }
        return chats;
    }

    /**
     * Establece la lista de chats del usuario.
     *
     * @param chats
     */
    public void setChats(final List<ObjectId> chats) {
        this.chats = chats;
    }

    /**
     * Obtiene el documento de la imágen de perfil del usuario.
     *
     * @return el documento de la imágen.
     */
    public Imagen getImagenPerfil() {
        return imagenPerfil;
    }

    /**
     * Establece el documento de la imágen de perfil del usuario.
     *
     * @param imagenPerfil
     */
    public void setImagenPerfil(final Imagen imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     *
     * @return la fecha de nacimiento del usuario
     */
    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del usuario.
     *
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(final LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la dirección del usuario.
     *
     * @return la dirección del usuario.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del usuario.
     *
     * @param direccion
     */
    public void setDireccion(final Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Genera el hashcode de la clase.
     *
     * @return el hashcode
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     * Compara la clase en base al id.
     *
     * @param obj
     * @return true si coinciden.
     */
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Usuario{"
                + "nombre=" + username
                + ", correo=" + correo
                + ", password=" + password
                + '}';
    }

}
