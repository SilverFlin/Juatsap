package org.itson.dao;

import com.mongodb.client.MongoCollection;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.itson.dominio.Chat;

/**
 *
 */
public final class ChatsDAO extends BaseDAO<Chat> {

    @Override
    protected MongoCollection<Chat> getCollection() {
        return this.getDataBase().getCollection("chats", Chat.class);
    }

    @Override
    public void agregar(final Chat chat) {
        throw new UnsupportedOperationException("Not supported yet.");
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
                = new Document("$push", new Document("historial", mensajeId));
        getCollection().updateOne(new Document("_id", chatId), updateQuery);
    }

}