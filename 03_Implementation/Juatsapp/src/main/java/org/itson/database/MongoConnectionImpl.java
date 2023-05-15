package org.itson.database;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.itson.interfaces.MongoConnection;
import org.bson.codecs.configuration.CodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Toled
 */
public class MongoConnectionImpl implements MongoConnection {

    private final MongoClient mongoClient;
    private final MongoDatabase database;

    private final String HOST = "localhost";
    private final int PUERTO = 27017;
    private static final String DATABASE_NAME = "juatsapp";

    public MongoConnectionImpl() {

        MongoClientSettings settings = this.loadClientSettings();

        this.mongoClient = MongoClients.create(settings);
        this.database = mongoClient.getDatabase(DATABASE_NAME);
    }

    @Override
    public MongoDatabase getDatabase() {
        return database;
    }

    private MongoClientSettings loadClientSettings() {
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());

        CodecRegistry codeRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);

        ConnectionString cadenaConexion = new ConnectionString("mongodb://" + HOST + "/" + PUERTO);

        return MongoClientSettings.builder().applyConnectionString(cadenaConexion)
                .codecRegistry(codeRegistry)
                .build();
    }

}
