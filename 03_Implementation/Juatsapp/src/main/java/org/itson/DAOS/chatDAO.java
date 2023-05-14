/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.DAOS;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Chat;

/**
 *
 * @author deivid
 */
public class chatDAO extends BaseDAO<Chat> {

    @Override
    protected MongoCollection<Chat> getCollecion() {
        return this.getDataBase().getCollection("chats", Chat.class);
    }

    @Override
    public void agregar(Chat chat) {
       
    }

    @Override
    public void actualizar(Chat chat) {
        
    }

    @Override
    public Chat consultar(String idChat) {
        List<Chat> listaChats = new ArrayList<>();
        MongoCollection<Chat> coleccion = this.getCollecion();
        Document filtro = new Document();
        filtro.append("_id", new ObjectId(idChat));
        coleccion.find(filtro).into(listaChats);
        if(listaChats.isEmpty()){
            return null;
        }else{
            return listaChats.get(0);
        }
    }

    @Override
    public List<Chat> consultarTodo() {
        List<Chat> listaChat = new ArrayList<>();
        MongoCollection<Chat> coleccion = this.getCollecion();
        coleccion.find().into(listaChat);
        return listaChat;
    }
    
}