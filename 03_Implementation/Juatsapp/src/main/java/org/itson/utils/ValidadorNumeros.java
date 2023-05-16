package org.itson.utils;

/**
 *
 */
public final class ValidadorNumeros {

    private ValidadorNumeros() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Checa si el valor es positivo.
     *
     * @param valor
     * @return true si es positivo.
     */
    public static boolean isPositivo(final Double valor) {
        return !isNull(valor) && valor > 0;
    }

    /**
     * Checa si un objeto es nulo.
     *
     * @param <T>
     * @param elemento
     * @return true si es nulo.
     */
    public static <T> boolean isNull(final T elemento) {
        return elemento == null;
    }

    /**
     * Checa si un texto puede ser double.
     *
     * @param valor
     * @return true si puede ser double.
     */
    public static boolean isDouble(final String valor) {
        try {
            Double.valueOf(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Checa si un texto puede ser integer.
     *
     * @param valor
     * @return true si puede ser integer.
     */
    public static boolean isInteger(final String valor) {
        try {
            Integer.valueOf(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
