package org.itson.utils;

import javax.swing.JFrame;
import org.itson.interfaces.JFrameActualizable;

/**
 *
 */
public final class Forms {

    private Forms() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Carga un JFrame y oculta el JFrame actual.
     *
     * @param <T>
     * @param cargar
     * @param actual
     */
    public static <T extends JFrame> void cargarForm(
            final T cargar,
            final JFrame actual
    ) {
        if (cargar != null) {
            actual.setVisible(false);
            cargar.setVisible(true);
            return;
        }
        throw new InstantiationError("Form no instanciado");
    }

    /**
     * Carga un JFrameActualizable, lo actualiza, y oculta el actual.
     *
     * @param <T>
     * @param cargar
     * @param actual
     */
    public static <T extends JFrameActualizable> void cargarForm(
            final T cargar,
            final JFrame actual
    ) {
        if (cargar != null) {
            actual.setVisible(false);
            cargar.actualizaFrame();
            cargar.setVisible(true);
            return;
        }
        throw new InstantiationError("Form no instanciado");
    }

    /**
     * Se regresa al JFrame anterior.
     *
     * @param frmAnterior
     * @param actual
     */
    public static void regresar(
            final JFrameActualizable frmAnterior,
            final JFrame actual
    ) {
        frmAnterior.actualizaFrame();
        frmAnterior.setVisible(true);
        actual.setVisible(false);
    }

}
