package org.itson.utils;

import java.awt.Color;
import javax.swing.JButton;
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

    /**
     * Ilumina el boton ajustando el color del fondo y del texto.
     *
     * @param btn
     */
    public static void iluminarBoton(final JButton btn) {
        final int rBg = 0;
        final int gBg = 153;
        final int bBg = 153;
        btn.setBackground(new Color(rBg, gBg, bBg));

        final int rFg = 255;
        final int gFg = 255;
        final int bFg = 255;

        btn.setForeground(new Color(rFg, gFg, bFg));
    }

    /**
     * Desilumina el boton ajustando el color del fondo y del texto.
     *
     * @param btn
     */
    public static void desiluminarBoton(final JButton btn) {
        final int rBg = 255;
        final int gBg = 255;
        final int bBg = 255;
        btn.setBackground(new Color(rBg, gBg, bBg));

        final int rFg = 0;
        final int gFg = 153;
        final int bFg = 153;

        btn.setForeground(new Color(rFg, gFg, bFg));
    }

}
