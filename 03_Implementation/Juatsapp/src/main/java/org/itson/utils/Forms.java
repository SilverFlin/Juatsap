package org.itson.utils;

import javax.swing.JFrame;
import org.itson.interfaces.JFrameActualizable;

/**
 *
 * @author Toled
 */
public class Forms {

    private Forms() {
        throw new IllegalStateException("Utility class");
    }

    public static <T extends JFrame> void cargarForm(T cargar, JFrame actual) {
        if (cargar != null) {
            actual.setVisible(false);
            cargar.setVisible(true);
            return;
        }
        throw new InstantiationError("Form no instanciado");
    }

    public static <T extends JFrameActualizable> void cargarForm(T cargar, JFrame actual) {
        if (cargar != null) {
            actual.setVisible(false);
            cargar.actualizaFrame();
            cargar.setVisible(true);
            return;
        }
        throw new InstantiationError("Form no instanciado");
    }

    public static void regresar(JFrameActualizable frmAnterior, JFrame actual) {
        frmAnterior.actualizaFrame();
        frmAnterior.setVisible(true);
        actual.setVisible(false);
    }

}
