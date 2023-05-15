/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.DAOS;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Usuario;

/**
 *
 * @author deivi
 */
public class UsuarioDAO extends BaseDAO<Usuario> {

    @Override
    protected MongoCollection<Usuario> getCollecion() {
        return this.getDataBase().getCollection("usuarios", Usuario.class);
    }

    @Override
    public void agregar(Usuario usuario) {
        try {
            MongoCollection<Usuario> coleccion = this.getCollecion();
            coleccion.insertOne(usuario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El usuario no se ha guardado", "Informacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void actualizar(Usuario usuario) {
       
    }

    @Override
    public Usuario consultar(String idEntidad) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        MongoCollection<Usuario> coleccion = this.getCollecion();
        Document filtro = new Document();
        filtro.append("_id", new ObjectId(idEntidad));
        coleccion.find(filtro).into(listaUsuarios);
        if (listaUsuarios.isEmpty()) {
            return null;
        } else {
            return listaUsuarios.get(0);
        }
    }

    @Override
    public List<Usuario> consultarTodo() {
        List<Usuario> listaUsuarios = new ArrayList<>();
        MongoCollection<Usuario> coleccion = this.getCollecion();
        coleccion.find().into(listaUsuarios);
        return listaUsuarios;
    }

}

