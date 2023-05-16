package org.itson.dominio;

import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 *
 */
public class Usuario {

    private ObjectId id;
    private String nombre;
    private String correo;
    private String password;
    private String telefono;
    private Sexo sexo;
    private List<ObjectId> chat;
    private Imagen imagenPerfil;
    private Calendar fechaNacimiento;
    private Direccion direccion;

    public Usuario() {
    }

    public Usuario(ObjectId id, String nombre, String correo, String password, String telefono, Sexo sexo, List<ObjectId> chat, Calendar fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.sexo = sexo;
        this.chat = chat;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(String correo, String password, String telefono, Sexo sexo, List<ObjectId> chat, Calendar fechaNacimiento) {
        this.correo = correo;
        this.password = password;
        this.telefono = telefono;
        this.sexo = sexo;
        this.chat = chat;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Usuario(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public Usuario(String nombre, List<ObjectId> chat) {
        this.nombre = nombre;
        this.chat = chat;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public List<ObjectId> getChat() {
        return chat;
    }

    public void setChat(List<ObjectId> chat) {
        this.chat = chat;
    }

    public Imagen getImagenPerfil() {
        return imagenPerfil;
    }

    public void setImagenPerfil(Imagen imagenPerfil) {
        this.imagenPerfil = imagenPerfil;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", correo=" + correo + ", password=" + password + '}';
    }

}
