package client.forms;

import client.utilities.Utils;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Paché
 */
public class MainFrame extends JFrame {

    public static final Logger log = Logger.getLogger(MainFrame.class);

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        
        EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}