package org.itson.dao;

import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Mensaje;

/**
 *
 * @author Toled
 */
public final class MensajesDAO extends BaseDAO<Mensaje> {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(MensajesDAO.class.getName());

    @Override
    protected MongoCollection<Mensaje> getCollection() {
        return this.getDataBase().getCollection("mensajes", Mensaje.class);
    }

    @Override
    public void agregar(final Mensaje chat) {
        try {
            MongoCollection<Mensaje> coleccion = this.getCollection();
            coleccion.insertOne(chat);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public void actualizar(final Mensaje mensaje) {
        Document filter = new Document("_id", mensaje.getId());

        Document updateContenido
                = new Document(
                        "$set",
                        new Document(
                                "contenidoMensaje",
                                mensaje.getContenidoMensaje()
                        )
                );

        this.getCollection().updateOne(filter, updateContenido);
    }

    @Override
    public Mensaje consultar(final String idMensaje) {
        List<Mensaje> listaMensajes = new ArrayList<>();
        MongoCollection<Mensaje> coleccion = this.getCollection();
        Document filtro = new Document();
        filtro.append("_id", new ObjectId(idMensaje));
        coleccion.find(filtro).into(listaMensajes);
        if (listaMensajes.isEmpty()) {
            return null;
        } else {
            return listaMensajes.get(0);
        }
    }

    @Override
    public List<Mensaje> consultarTodo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Deshabilita el mensaje y lo regresa.
     *
     * @param mensaje
     * @return el mensaje actualizado.
     */
    public Mensaje deshabilitarMensaje(final Mensaje mensaje) {
        Document filter = new Document("_id", mensaje.getId());

        mensaje.setDisponibilidad(false);

        Document updateDisponibilidad
                = new Document(
                        "$set",
                        new Document(
                                "disponibilidad",
                                mensaje.isDisponibilidad()
                        )
                );

        this.getCollection().updateOne(filter, updateDisponibilidad);

        return mensaje;
    }

}
