package client.forms;

import client.utilities.Utils;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Paché
 */
public class VentanaPrincipal extends JFrame {

    private static final Logger log = Logger.getLogger(VentanaPrincipal.class);

    public VentanaPrincipal() {
        initComponents();
    }

    private void preferencias() {
        this.getContentPane().removeAll();
        this.add(new PanelPreferencias());
        refrescarPanel();
    }

    private void acercaDe() {
        JOptionPane.showMessageDialog(null, "Sistema para la Gestión de Colegios. \nSi tiene dudas escríbanos a "
                + "contacto@SGC.cl", "Acerca de", JOptionPane.INFORMATION_MESSAGE);
    }

    private void refrescarPanel() {
        this.paintAll(this.getGraphics());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemPreferencias = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        itemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        panelPrincipal.setBorder(null);

        jLabel1.setText("WELCOME TO THE JUNGLE");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        getContentPane().add(panelPrincipal, "card2");

        barraMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        menuArchivo.setText("Archivo");

        itemPreferencias.setText("Preferencias");
        itemPreferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPreferenciasActionPerformed(evt);
            }
        });
        menuArchivo.add(itemPreferencias);
        menuArchivo.add(jSeparator1);

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemSalir);

        barraMenu.add(menuArchivo);

        menuAyuda.setText("Ayuda");

        itemAcercaDe.setText("Acerca de");
        itemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(itemAcercaDe);

        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        Utils.cerrarAplicacion();
    }//GEN-LAST:event_itemSalirActionPerformed

    private void itemPreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPreferenciasActionPerformed
        preferencias();
    }//GEN-LAST:event_itemPreferenciasActionPerformed

    private void itemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAcercaDeActionPerformed
        acercaDe();
    }//GEN-LAST:event_itemAcercaDeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemAcercaDe;
    private javax.swing.JMenuItem itemPreferencias;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
