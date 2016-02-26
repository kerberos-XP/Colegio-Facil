package client.main;

import client.forms.VentanaPrincipal;
import client.utilities.Utils;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Paché
 */
public class Main {

    private static final Logger log = Logger.getLogger(VentanaPrincipal.class);

    public static void main(String args[]) {

        if (!Utils.comprobarInstancia()) {
            JOptionPane.showMessageDialog(null, "La aplicación ya está ejecutándose en otra ventana",
                    "Error", JOptionPane.ERROR_MESSAGE);
            Utils.cerrarPrograma();
        }

        log.info("Iniciando Aplicacion");
        // Mostrar S.O.
        log.info("S.O. cliente: " + System.getProperty("os.name") + " " + System.getProperty("os.version") + " "
                + System.getProperty("os.arch"));
        // Mostrar usuario S.0.
        log.info("Nombre usuario S.O: " + System.getProperty("user.name"));
        // Mostrar version java
        log.info("Version JRE: " + System.getProperty("java.version") + " de " + System.getProperty("java.vendor"));

        // Obtiene los valores del archivo de propiedades
        Utils.leerArchivoPropiedades();

        // Levantar ventana principal
        JFrame ventanaPrincipal = new JFrame();
//        ventanaPrincipal.setIconImage(img.getImage());
        ventanaPrincipal.setMinimumSize(new Dimension(800, 600));
        ventanaPrincipal.setResizable(true);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaPrincipal.pack();
        ventanaPrincipal.setVisible(true);
    }
    
}
