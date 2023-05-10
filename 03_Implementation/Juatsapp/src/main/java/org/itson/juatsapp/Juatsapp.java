package org.itson.juatsapp;

import java.util.logging.Logger;

/**
 *
 * @author Toled
 */
public class Juatsapp {

    /**
     * Logger.
     */
    private static final Logger LOGGER
            = Logger.getLogger(Juatsapp.class.getName());

    private Juatsapp() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Runs the system.
     *
     * @param args
     */
    public static void main(String[] args) {
        start();
    }

    /**
     * Inits the data base connection and start the system.
     */
    private static void start() {
        // TODO
    }
}
