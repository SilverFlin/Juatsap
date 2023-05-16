package org.itson.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public final class Dialogs {

    private Dialogs() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Muestra un mensaje de error sobre el componente especificado.
     *
     * @param componente
     * @param msg
     */
    public static void mostrarMensajeError(
            final Component componente,
            final String msg
    ) {
        JOptionPane.showMessageDialog(
                componente,
                msg,
                "Error",
                JOptionPane.ERROR_MESSAGE
        );

    }

    /**
     * Muestra un mensaje de exito sobre el componente especificado.
     *
     * @param componente
     * @param msg
     */
    public static void mostrarMensajeExito(
            final Component componente,
            final String msg
    ) {
        JOptionPane.showMessageDialog(
                componente,
                msg,
                "Exito",
                JOptionPane.PLAIN_MESSAGE
        );
    }

}
