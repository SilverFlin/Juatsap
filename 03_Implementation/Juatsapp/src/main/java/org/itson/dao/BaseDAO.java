package org.itson.dao;

/**
 *
 * @author deivi, Toled
 */
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.itson.database.MongoConnectionImpl;

public abstract class BaseDAO<E> {

    protected MongoDatabase getDataBase() {
        return new MongoConnectionImpl().getDatabase();
    }

    protected abstract MongoCollection<E> getCollection();

    public abstract void agregar(E entidad);

    public abstract void actualizar(E entidad);

    public abstract E consultar(String idEntidad);

    public abstract List<E> consultarTodo();

}
