package org.itson.database;

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
        CodecProvider provider
                = PojoCodecProvider
                        .builder()
                        .automatic(true)
                        .build();
        CodecRegistry registry = MongoClientSettings.getDefaultCodecRegistry();

        CodecRegistry pojoCodecRegistry
                = fromRegistries(registry, fromProviders(provider));

        return MongoClientSettings
                .builder()
                .codecRegistry(pojoCodecRegistry)
                .build();
    }

}
