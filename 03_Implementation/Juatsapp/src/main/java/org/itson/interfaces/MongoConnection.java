package org.itson.interfaces;

import com.mongodb.client.MongoDatabase;

/**
 *
 *
 */
public interface MongoConnection {

    /**
     * Regresa la base de datos.
     *
     * @return la base de datos
     */
    MongoDatabase getDatabase();
}
