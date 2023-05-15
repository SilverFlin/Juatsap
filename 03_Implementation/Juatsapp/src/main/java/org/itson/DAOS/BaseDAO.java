/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package org.itson.DAOS;
/**
 *
 * @author deivi
 */
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

public abstract class BaseDAO<E> {

    private final String HOST= "localhost";
    private final int PUERTO = 27017;
    private final String BASE_DATO = "juatsapp";

    protected MongoDatabase getDataBase() {
        try {
            CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());

            CodecRegistry codeRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

            ConnectionString cadenaConexion = new ConnectionString("mongodb://" + HOST + "/" + PUERTO);

            MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(cadenaConexion)
                    .codecRegistry(codeRegistry)
                    .build();

            MongoClient clienteMongo = MongoClients.create(clientSettings);

            MongoDatabase baseDatos = clienteMongo.getDatabase(BASE_DATO);
            return baseDatos;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    protected abstract MongoCollection<E> getCollecion();

    public abstract void agregar(E entidad);

    public abstract void actualizar(E entidad);

    public abstract E consultar(String idEntidad);

    public abstract List<E> consultarTodo();

}

