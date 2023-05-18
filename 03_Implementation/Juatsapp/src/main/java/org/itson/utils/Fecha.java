/**
 * Fecha.java
 */
package org.itson.utils;

// Importaciones
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Esta clase permite encapsular herramientas útiles a la hora de querer
 * implementar fechas.
 */
public class Fecha {

    /**
     * Método para obtener la fecha en tipo LocalDateTime del preciso momento.
     *
     * @return ahora, fecha y hora del preciso momento.
     */
    public static LocalDateTime fechaAhora() {
        return LocalDateTime.now();
    }
    
    /**
     * Método para obtener la fecha y hora del preciso momento.
     *
     * @return ahora, fecha y hora del preciso momento.
     */
    public static String fechaAhoraConHora() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return ahora.format(formatter);
    }
    
    /**
     * Método para obtener la fecha del preciso momento.
     *
     * @return ahora, fecha del preciso momento.
     */
    public static String fechaAhoraSinHora() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return ahora.format(formatter);
    }

    /**
     * Método que toma un fecha tipo LocalDateTime y regresa un string que incluye
     * la fecha, horas y minutos de dicha fecha.
     *
     * @param fecha Ojeto tipo LocalDateTime que regresará como string.
     * @return Fecha representada en format dd/MM/yyyy HH:mm en un string.
     * @throws ParseException en caso que haya una excepción en los tipos de
     * datos.
     */
    public static String formatoFechaConHora(LocalDateTime fecha) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return fecha.format(formatter);
    }
    
    /**
     * Método que toma un fecha tipo LocalDateTime y regresa un string que incluye
     * la fecha.
     *
     * @param fecha Ojeto tipo LocalDateTime que regresará como string.
     * @return Fecha representada en format dd/MM/yyyy en un string.
     * @throws ParseException en caso que haya una excepción en los tipos de
     * datos.
     */
    public static String formatoFechaSinHora(LocalDateTime fecha) throws ParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatter);
    }
}
