package org.itson.presentacion;

import org.itson.dao.ChatsDAO;
import org.itson.dao.UsuarioDAO;

/**
 *
 * @author Toled
 */
public class UnitOfWork {

    private UsuarioDAO usuarioDAO;

    private ChatsDAO chatsDAO;

    /**
     * Constructor vacío. No inicializa nada.
     */
    public UnitOfWork() {
        // No hace falta hacer nada.
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de UsuariosDAO.
     */
    public UsuarioDAO usuariosDAO() {
        if (usuarioDAO != null) {
            return usuarioDAO;
        } else {
            usuarioDAO = new UsuarioDAO();
            return usuarioDAO;
        }
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de ChatsDAO.
     */
    public ChatsDAO chatsDAO() {
        if (chatsDAO != null) {
            return chatsDAO;
        } else {
            chatsDAO = new ChatsDAO();
            return chatsDAO;
        }
    }

}
