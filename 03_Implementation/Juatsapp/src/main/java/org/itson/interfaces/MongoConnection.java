package org.itson.interfaces;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Toled
 */
public interface MongoConnection {

    public MongoDatabase getDatabase();
}
