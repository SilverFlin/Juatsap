package org.itson.juatsapp;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;
import org.bson.types.ObjectId;
import org.itson.dao.ChatsDAO;
import org.itson.presentacion.FrmIniciarSesion;
import org.itson.dao.UsuarioDAO;
import org.itson.dominio.Chat;
import org.itson.dominio.Mensaje;
import org.itson.dominio.Sexo;
import org.itson.dominio.Usuario;
import org.itson.presentacion.FrmChats;
import org.itson.presentacion.UnitOfWork;

/**
 *
 *
 */
public final class Juatsapp {

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
    public static void main(final String[] args) {
        start();
    }

    /**
     * Inits the data base connection and start the system.
     */
    private static void start() {
        FrmIniciarSesion frmIniciarSesion = new FrmIniciarSesion();
        frmIniciarSesion.setVisible(true);
    }
}
