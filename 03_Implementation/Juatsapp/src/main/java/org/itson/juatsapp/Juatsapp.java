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
        probarGUI();
    }

    /**
     * Inits the data base connection and start the system.
     */
    private static void start() {
        FrmIniciarSesion frmIniciarSesion = new FrmIniciarSesion();
        frmIniciarSesion.setVisible(true);
    }

    private static void probarAgregarMensajes() {

        Mensaje mensaje = new Mensaje();
        mensaje.setContenidoMensaje("HOLAAAA");
        mensaje.setTimestamp(LocalDateTime.now());
        mensaje.setUserId(new ObjectId("6463dd5397ce261b0e6f1657"));
        new UnitOfWork().mensajesDAO().agregar(mensaje);

        Mensaje mensaje2 = new Mensaje();
        mensaje2.setContenidoMensaje("ADIOOOOSSS");
        mensaje2.setTimestamp(LocalDateTime.now());
        mensaje2.setUserId(new ObjectId("6463d1859401a57d3ecb2762"));
        new UnitOfWork().mensajesDAO().agregar(mensaje2);

        new UnitOfWork()
                .chatsDAO()
                .pushMensaje(
                        new ObjectId("6463fd9b23bb3a1be58f45e5"),
                        mensaje.getId()
                );
        new UnitOfWork()
                .chatsDAO().
                pushMensaje(
                        new ObjectId("6463fd9b23bb3a1be58f45e5"),
                        mensaje2.getId()
                );
    }

    private static void probarAgregarChats() {
        Chat chat = new Chat();
        chat.setEmisor(new ObjectId("6463d1859401a57d3ecb2762"));
        chat.setReceptor(new ObjectId("6463dd5397ce261b0e6f1657"));
        new ChatsDAO().agregar(chat);

        new UsuarioDAO().pushChat(
                new ObjectId("6463d1859401a57d3ecb2762"),
                chat.getId()
        );
        new UsuarioDAO().pushChat(
                new ObjectId("6463dd5397ce261b0e6f1657"),
                chat.getId()
        );

    }

    private static void probarGUI() {

        UnitOfWork unitOfWork = new UnitOfWork();
        Usuario usuarioLoggeado
                = unitOfWork.usuariosDAO().consultarPorUsername("qwe");
        FrmChats frmChats = new FrmChats(usuarioLoggeado, unitOfWork);

        frmChats.setVisible(true);
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
