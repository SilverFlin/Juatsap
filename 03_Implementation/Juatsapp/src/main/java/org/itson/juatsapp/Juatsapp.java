package org.itson.juatsapp;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;
import org.itson.GUI.FrmIniciarSesion;
import org.itson.dao.UsuarioDAO;
import org.itson.dominio.Sexo;
import org.itson.dominio.Usuario;

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
    public static void main(final String[] args)  {
        probarGUI();
    }

    /**
     * Inits the data base connection and start the system.
     */
    private static void start() {
        // TODO
    }
    
    private static void probarGUI() {
        FrmIniciarSesion frmIniciarSesion = new FrmIniciarSesion();
        frmIniciarSesion.setVisible(true);
    }

    private static void probarDominio() throws IOException {
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        Usuario usuario = new Usuario();
        usuario.setCorreo("asda@sadas.com");
        usuario.setUsername("asdasdas");
        usuario.setPassword("asdasd");
        usuario.setFechaNacimiento(LocalDateTime.now());
        usuario.setSexo(Sexo.OTRO);

        usuarioDAO.agregar(usuario);

    }

}
