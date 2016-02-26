package client.forms;

import javax.swing.JFrame;
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        itemA = new javax.swing.JMenuItem();
        itemB = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        itemC = new javax.swing.JMenuItem();
        itemD = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu1.setText("Menu1");

        itemA.setText("itemA");
        menu1.add(itemA);

        itemB.setText("itemB");
        menu1.add(itemB);

        barraMenu.add(menu1);

        menu2.setText("Menu2");

        itemC.setText("itemC");
        menu2.add(itemC);

        itemD.setText("itemD");
        menu2.add(itemD);

        barraMenu.add(menu2);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 899, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenuItem itemA;
    private javax.swing.JMenuItem itemB;
    private javax.swing.JMenuItem itemC;
    private javax.swing.JMenuItem itemD;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    // End of variables declaration//GEN-END:variables
}
