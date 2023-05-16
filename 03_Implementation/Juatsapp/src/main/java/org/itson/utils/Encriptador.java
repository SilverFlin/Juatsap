package org.itson.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 */
public final class Encriptador {

    /**
     * Costo de encriptación.
     */
    public static final int COST = 12;

    private Encriptador() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Encripta una contraseña y regresa el hash creado.
     *
     * @param password
     * @return El hash generado.
     */
    public static String encriptarPassword(final String password) {
        return BCrypt.withDefaults().hashToString(COST, password.toCharArray());
    }

    /**
     * Encripta una contraseña dada como array de caracteres y regresa el hashs.
     *
     * @param password
     * @return el hash generado.
     */
    public static String encriptarPassword(final char[] password) {
        return BCrypt.withDefaults().hashToString(COST, password);
    }

    /**
     * Valida una contraseña comparandola con un hash.
     *
     * @param password
     * @param hashedPassword
     * @return true, si las contraseñas coinciden.
     */
    public static boolean verificarPasswordConHash(
            final String password,
            final String hashedPassword
    ) {

        BCrypt.Result result
                = BCrypt
                        .verifyer()
                        .verify(password.toCharArray(), hashedPassword);
        return result.verified;
    }
}
