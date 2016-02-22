package client.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;
import org.apache.log4j.Logger;

/**
 * Clase con funciones de utilidad
 *
 * @author Omar Paché
 */
public class Utils {

    static final Logger log = Logger.getLogger(Utils.class);

    /**
     * Evalua si ya existe otra instancia del programa en ejecución
     *
     * @return true en caso de que no este corriendo otra instancia del programa, falso si ya esta corriendo
     */
    public static boolean comprobarInstancia() {
        UnaInstancia ui;
        try {
            Socket clientSocket = new Socket("localhost", UnaInstancia.PORT);
            return false;
        } catch (IOException e) {
            ui = new UnaInstancia();
            ui.start();
            return true;
        }
    }

    /**
     * Cierra la aplicación
     */
    public static void cerrarPrograma() {
        System.exit(0);
    }

    /**
     * Lee el archivo de propiedades y carga su valores en variables globales
     */
    public static void leerArchivoPropiedades() {
        InputStream input;
        Properties propiedades = new Properties();
        try {
            input = (Utils.class).getClassLoader().getResourceAsStream("cliente.properties");
            propiedades.load(input);
        } catch (IOException e) {
            log.warn("Error al leer cliente.properties", e);
        }
        Global.ambiente = propiedades.getProperty("ambiente");
        log.info("Ambiente: " + Global.ambiente);
    }
}
