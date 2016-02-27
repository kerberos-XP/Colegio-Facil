package client.forms;

import java.awt.Cursor;
import javax.swing.JPanel;
import org.apache.log4j.Logger;

/**
 *
 * @author Omar Paché
 */
public class PanelPreferencias extends JPanel {

    private static final Logger log = Logger.getLogger(PanelPreferencias.class);

    public PanelPreferencias() {
        initComponents();
    }

    private void consultar() {
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        
//        try {
//            Client client = Client.create();
//            WebResource webResource = client.resource(
//                    "http://api.sbif.cl/api-sbifv3/recursos_api"
//                    + "/dolar"
//                    + "?apikey=a99fa8add170d3a4905d663e6bded96d1d11be75"
//                    + "&formato=json"
//            );

//            ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

//            if (response.getStatus() != 200) {
//                throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
//            }

//            String output = response.getEntity(String.class);
//            log.info(output);

//            ObjectMapper mapper = new ObjectMapper();
//            Dolares dolares = mapper.readValue(output,  Dolares.class);
            
//            JOptionPane.showMessageDialog(null, "El valor del dolar es " + dolares.getValor(),
//                    "Información", JOptionPane.INFORMATION_MESSAGE);
//        } catch (RuntimeException | IOException e) {
//            e.printStackTrace();
//        }
        
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnConsulta = new javax.swing.JButton();

        jLabel1.setText("PANEL PREFERENCIAS");

        btnConsulta.setText("Consultar");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(btnConsulta)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsulta;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
