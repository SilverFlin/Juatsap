package org.itson.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Chat;

/**
 *
 */
public final class ChatsDAO extends BaseDAO<Chat> {

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(ChatsDAO.class.getName());

    @Override
    protected MongoCollection<Chat> getCollection() {
        return this.getDataBase().getCollection("chats", Chat.class);
    }

    @Override
    public void agregar(final Chat chat) {
        try {
            MongoCollection<Chat> coleccion = this.getCollection();
            coleccion.insertOne(chat);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public void actualizar(final Chat chat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Chat consultar(final String idChat) {
        List<Chat> listaChats = new ArrayList<>();
        MongoCollection<Chat> coleccion = this.getCollection();
        Document filtro = new Document();
        filtro.append("_id", new ObjectId(idChat));
        coleccion.find(filtro).into(listaChats);
        if (listaChats.isEmpty()) {
            return null;
        } else {
            return listaChats.get(0);
        }
    }

    @Override
    public List<Chat> consultarTodo() {
        List<Chat> listaChat = new ArrayList<>();
        MongoCollection<Chat> coleccion = this.getCollection();
        coleccion.find().into(listaChat);
        return listaChat;
    }

    /**
     * Agrega un mensaje al chat.
     *
     * @param chatId
     * @param mensajeId
     */
    public void pushMensaje(final ObjectId chatId, final ObjectId mensajeId) {
        Document updateQuery
                = new Document(
                        "$push",
                        new Document("historialMensajes", mensajeId)
                );
        getCollection().updateOne(new Document("_id", chatId), updateQuery);
    }

    /**
     * Verifica si dos usuarios tienen un chat en comun.
     *
     * @param idEmisor
     * @param idReceptor
     * @return true, si tienen un chat en comun.
     */
    public boolean verificarChatExistente(
            final String idEmisor,
            final String idReceptor
    ) {
        List<Chat> listaChats = new ArrayList<>();
        MongoCollection<Chat> coleccion = this.getCollection();
        Document filtro1 = new Document();
        filtro1.append("receptor", new ObjectId(idEmisor));
        filtro1.append("emisor", new ObjectId(idReceptor));

        Document filtro2 = new Document();
        filtro2.append("receptor", new ObjectId(idReceptor));
        filtro2.append("emisor", new ObjectId(idEmisor));

        coleccion.find(Filters.or(filtro1, filtro2)).into(listaChats);
        return !listaChats.isEmpty();
    }

}
