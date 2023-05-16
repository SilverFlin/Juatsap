package org.itson.dao;

import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Usuario;
import org.itson.utils.Encriptador;

/**
 *
 */
public final class UsuarioDAO extends BaseDAO<Usuario> {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(UsuarioDAO.class.getName());

    @Override
    protected MongoCollection<Usuario> getCollection() {
        return this.getDataBase().getCollection("usuarios", Usuario.class);
    }

    @Override
    public void agregar(final Usuario usuario) {
        try {
            MongoCollection<Usuario> coleccion = this.getCollection();
            String hashedPassword
                    = Encriptador.encriptarPassword(usuario.getPassword());
            usuario.setPassword(hashedPassword);
            coleccion.insertOne(usuario);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public void actualizar(final Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public Usuario consultar(final String idEntidad) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        MongoCollection<Usuario> coleccion = this.getCollection();
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
        MongoCollection<Usuario> coleccion = this.getCollection();
        coleccion.find().into(listaUsuarios);
        return listaUsuarios;
    }

    /**
     * Consulta al usuario por username.
     *
     * @param username
     * @return el ususario, si se encontró.
     */
    public Usuario consultarPorUsername(final String username) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        MongoCollection<Usuario> coleccion = this.getCollection();
        Document filtro = new Document();
        filtro.append("username", username);
        coleccion.find(filtro).into(listaUsuarios);
        if (listaUsuarios.isEmpty()) {
            return null;
        } else {
            return listaUsuarios.get(0);
        }
    }

    /**
     * Consulta al usuario por correo.
     *
     * @param correo
     * @return el ususario, si se encontró.
     */
    public Usuario consultarPorCorreo(final String correo) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        MongoCollection<Usuario> coleccion = this.getCollection();
        Document filtro = new Document();
        filtro.append("correo", correo);
        coleccion.find(filtro).into(listaUsuarios);
        if (listaUsuarios.isEmpty()) {
            return null;
        } else {
            return listaUsuarios.get(0);
        }
    }

    /**
     * Agrega un chat al usuario.
     *
     * @param userId
     * @param chatId
     */
    public void pushChat(final ObjectId userId, final ObjectId chatId) {
        Document updateQuery
                = new Document("$push", new Document("chats", chatId));
        getCollection().updateOne(new Document("_id", userId), updateQuery);
    }

}
