/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itson.dominio;


import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;


/**
 *
 * @author deivi
 */
public class Usuario {

    private ObjectId _id;
    private String nombre, correo, contraseña,telefono;
    private Sexo sexo;
    private List<ObjectId> chat;

    private Calendar fecha_nacimiento;
    
    public Usuario() {
    }

    public Usuario(ObjectId _id, String nombre, String correo, String contraseña, String telefono, Sexo sexo, List<ObjectId> chat, Calendar fecha_nacimiento) {
        this._id = _id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.sexo = sexo;
        this.chat = chat;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Usuario(String correo, String contraseña, String telefono, Sexo sexo, List<ObjectId> chat, Calendar fecha_nacimiento) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.telefono = telefono;
        this.sexo = sexo;
        this.chat = chat;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Usuario(String nombre, String correo, String contraseña) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public Usuario(String nombre, List<ObjectId> chat) {
        this.nombre = nombre;
        this.chat = chat;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Calendar getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Calendar fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
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

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
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

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public void agregarChat(ObjectId id){
        chat.add(id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this._id);
        hash = 43 * hash + Objects.hashCode(this.nombre);
        hash = 43 * hash + Objects.hashCode(this.correo);
        hash = 43 * hash + Objects.hashCode(this.contraseña);
        hash = 43 * hash + Objects.hashCode(this.telefono);
        hash = 43 * hash + Objects.hashCode(this.sexo);
        hash = 43 * hash + Objects.hashCode(this.chat);
        hash = 43 * hash + Objects.hashCode(this.fecha_nacimiento);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.correo, other.correo)) {
            return false;
        }
        if (!Objects.equals(this.contraseña, other.contraseña)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.chat, other.chat)) {
            return false;
        }
        return Objects.equals(this.fecha_nacimiento, other.fecha_nacimiento);
    }

    @Override
    public String toString() {
        return "Usuario{" + "_id=" + _id + ", nombre=" + nombre + ", correo=" + correo + ", contrase\u00f1a=" + contraseña + ", telefono=" + telefono + ", sexo=" + sexo + ", chat=" + chat + ", fecha_nacimiento=" + fecha_nacimiento + '}';
    }

    

    

        

}
