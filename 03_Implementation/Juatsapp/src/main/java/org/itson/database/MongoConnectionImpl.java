package org.itson.database;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.itson.interfaces.MongoConnection;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 *
 */
public final class MongoConnectionImpl implements MongoConnection {

    /**
     * Cliente del motor de base de datos.
     */
    private final MongoClient mongoClient;

    /**
     * Base de datos.
     */
    private final MongoDatabase database;

    /**
     * Host donde se pondrá la base de datos.
     */
    private static final String HOST = "localhost";
    /**
     * Puerto que usará la base de datos.
     */
    private static final int PUERTO = 27017;
    /**
     * Nombre de la base de datos.
     */
    private static final String DATABASE_NAME = "juatsapp";

    /**
     * Constructor único.
     */
    public MongoConnectionImpl() {

        MongoClientSettings settings = this.loadClientSettings();

        this.mongoClient = MongoClients.create(settings);
        this.database = mongoClient.getDatabase(DATABASE_NAME);
    }

    @Override
    public MongoDatabase getDatabase() {
        return database;
    }

    /**
     * Carga las configuraciones del cliente y las regresa.
     *
     * @return las configuraciones del cliente
     */
    private MongoClientSettings loadClientSettings() {
        CodecRegistry pojoCodecRegistry = fromProviders(
                PojoCodecProvider
                        .builder().
                        automatic(true)
                        .build()
        );

        CodecRegistry codeRegistry = fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                pojoCodecRegistry
        );

        ConnectionString cadenaConexion
                = new ConnectionString("mongodb://" + HOST + "/" + PUERTO);

        return MongoClientSettings
                .builder()
                .applyConnectionString(cadenaConexion)
                .codecRegistry(codeRegistry)
                .build();
    }

}
