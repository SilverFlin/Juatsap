/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.dominio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author deivi
 */
public class Chat {

    private ObjectId _id;
    private ObjectId receptor;
    private ObjectId emisor;
    private LocalDateTime fecha;
    private List<String> historial;

    public Chat() {
        this._id = new ObjectId();
        this.historial = new ArrayList<>();
    
    }

    public Chat(ObjectId receptor, ObjectId emisor, LocalDateTime fecha) {
        this.fecha = fecha;
        this.receptor = receptor;
        this.emisor = emisor;
        this.historial = new ArrayList<>();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Chat(ObjectId _id, ObjectId receptor, ObjectId emisor, List<String> historial) {
        this._id = _id;
        this.receptor = receptor;
        this.emisor = emisor;
        this.historial = historial;
    }

    public ObjectId getEmisor() {
        return emisor;
    }

    public void setEmisor(ObjectId emisor) {
        this.emisor = emisor;
    }

    public List<String> getHistorial() {
        return historial;
    }

    public void setHistorial(List<String> historial) {
        this.historial = historial;
    }

    public ObjectId getReceptor() {
        return receptor;
    }

    public void setReceptor(ObjectId receptor) {
        this.receptor = receptor;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }


    public void agregarMensajes(String mensaje) {
        historial.add(mensaje);
    }

}

