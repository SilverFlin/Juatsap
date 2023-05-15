package org.itson.utils;

/**
 *
 * @author Toled
 */
public final class ValidadorFrames {

    private ValidadorFrames() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Valida que un texto entre en el rango de 1 y 100 caracteres.
     *
     * @param texto
     * @return true si es válido.
     */
    public static boolean isValidText(final String texto) {
        // Expresión regular que valida un string de 1 a 100 caracteres
        String regex = "^.{1,100}$";
        // Validar el texto con la expresión regular
        return texto.matches(regex);
    }

    /**
     * Checa si un string es un email válido.
     *
     * @param email
     * @return true si es válido.
     */
    public static boolean isValidEmail(final String email) {

        String regex = "^[\\w\\-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$";

        return email.matches(regex);
    }

    /**
     * Valida el formato de un teléfono.
     *
     * @param telefono
     * @return true si es válido.
     */
    public static boolean isValidTelefono(final String telefono) {
        // TODO buscar regex para telefono.

        // Expresión regular que valida un string de 1 a 100 caracteres
        String regex = "^.{8,10}$";
        // Validar el texto con la expresión regular
        return telefono.matches(regex);
    }

}
