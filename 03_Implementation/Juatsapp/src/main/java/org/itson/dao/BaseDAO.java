package org.itson.dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.itson.database.MongoConnectionImpl;
import org.itson.interfaces.MongoConnection;

public abstract class BaseDAO<E> {

    protected MongoConnection mongoConnection;

    /**
     * Obtiene la base de datos de la conexión.
     *
     * @return la base de datos.
     */
    protected MongoDatabase getDataBase() {
        if (mongoConnection != null) {
            return mongoConnection.getDatabase();
        } else {
            mongoConnection = new MongoConnectionImpl();
            return mongoConnection.getDatabase();
        }
    }

    /**
     * Regresa la colección relacionada a la DAO.
     *
     * @return la colección
     */
    protected abstract MongoCollection<E> getCollection();

    /**
     * Agrega la entidad a la colección.
     *
     * @param entidad
     */
    public abstract void agregar(E entidad);

    /**
     * actualiza la entidad de la colección.
     *
     * @param entidad
     */
    public abstract void actualizar(E entidad);

    /**
     * Consulta la entidad por su ID.
     *
     * @param idEntidad
     * @return la entidad, si se encontró.
     */
    public abstract E consultar(String idEntidad);

    /**
     * Regresa una lista con todos los registros de la colección.
     *
     * @return lista con todos los registros.
     */
    public abstract List<E> consultarTodo();

}
