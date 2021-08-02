/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.ColaPistaAterrizaje;
import Logica.ColaPistaDespegue;
import Logica.ListaAviones;
import Logica.ListaAvionesVolando;
import Logica.PilaHangar;
import Logica.TorreDeControl;
import javax.swing.JOptionPane;

/**
 *
 * @author vilkevi
 */
public class JF_AgregarManual extends javax.swing.JFrame {

    private static final ListaAviones insLA = new ListaAviones();
    private static final ListaAvionesVolando insLAV = new ListaAvionesVolando();
    private static final ColaPistaAterrizaje insCPA = new ColaPistaAterrizaje();
    private static final ColaPistaDespegue insCPD = new ColaPistaDespegue();
    private static final PilaHangar insPA = new PilaHangar();
    private static final JF_menu insJFMenu = new JF_menu();
    private static final TorreDeControl insTDC = new TorreDeControl();

    /**
     * Creates new form JF_AgregarManual
     */
    public JF_AgregarManual() {
        initComponents();
        BoxModelos.addItem("Boeing 747"); // Lista del drop menu de los modelos
        BoxModelos.addItem("Boeing 747-400");
        BoxModelos.addItem("Boeing 777");
        BoxModelos.addItem("Airbus A340");
        BoxModelos.addItem("Boeing 767");
        BoxModelos.addItem("Airbus A330");
        BoxModelos.addItem("Boeing 757");
        BoxModelos.addItem("Boeing 737");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BoxModelos = new javax.swing.JComboBox<>();
        txt_Pasajeros = new javax.swing.JTextField();
        txt_Sobrecargos = new javax.swing.JTextField();
        txt_Piloto = new javax.swing.JTextField();
        btn_MoverHangar = new javax.swing.JButton();
        btn_MoverPDespegue = new javax.swing.JButton();
        btn_AterrizarA = new javax.swing.JButton();
        btn_DespegarA = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Modelo");

        jLabel2.setText("# Pasajeros");

        jLabel3.setText("# Sobrecargos");

        jLabel4.setText("Nombre del piloto");

        btn_MoverHangar.setText("Mover al hangar");
        btn_MoverHangar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MoverHangarActionPerformed(evt);
            }
        });

        btn_MoverPDespegue.setText("Mover a pista de despegue");
        btn_MoverPDespegue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MoverPDespegueActionPerformed(evt);
            }
        });

        btn_AterrizarA.setText("Aterrizar avion");
        btn_AterrizarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AterrizarAActionPerformed(evt);
            }
        });

        btn_DespegarA.setText("Despegar avion");
        btn_DespegarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DespegarAActionPerformed(evt);
            }
        });

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        jLabel5.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_MoverHangar)
                            .addComponent(btn_MoverPDespegue))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_AterrizarA)
                            .addComponent(btn_DespegarA)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_agregar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BoxModelos, 0, 182, Short.MAX_VALUE)
                                .addComponent(txt_Pasajeros)
                                .addComponent(txt_Sobrecargos)
                                .addComponent(txt_Piloto))
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(BoxModelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Sobrecargos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Piloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btn_agregar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MoverHangar)
                    .addComponent(btn_AterrizarA))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_MoverPDespegue)
                    .addComponent(btn_DespegarA))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MoverHangarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MoverHangarActionPerformed
        try {

            insTDC.agregarAvionesManualmente(String.valueOf(BoxModelos.getSelectedItem()), Integer.parseInt(txt_Pasajeros.getText()), Integer.parseInt(txt_Sobrecargos.getText()), txt_Piloto.getText(), Integer.parseInt(txt_id.getText()), "MAH");

            limpiarcampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_MoverHangarActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        try {

            insTDC.agregarAvionesManualmente(String.valueOf(BoxModelos.getSelectedItem()), Integer.parseInt(txt_Pasajeros.getText()), Integer.parseInt(txt_Sobrecargos.getText()), txt_Piloto.getText(), Integer.parseInt(txt_id.getText()), "agre");

            limpiarcampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_AterrizarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AterrizarAActionPerformed
        try {

            insTDC.agregarAvionesManualmente(String.valueOf(BoxModelos.getSelectedItem()), Integer.parseInt(txt_Pasajeros.getText()), Integer.parseInt(txt_Sobrecargos.getText()), txt_Piloto.getText(), Integer.parseInt(txt_id.getText()), "PDA");

            limpiarcampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_AterrizarAActionPerformed

    private void btn_MoverPDespegueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MoverPDespegueActionPerformed
        try {

            insTDC.agregarAvionesManualmente(String.valueOf(BoxModelos.getSelectedItem()), Integer.parseInt(txt_Pasajeros.getText()), Integer.parseInt(txt_Sobrecargos.getText()), txt_Piloto.getText(), Integer.parseInt(txt_id.getText()), "MPD");

            limpiarcampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_MoverPDespegueActionPerformed

    private void btn_DespegarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DespegarAActionPerformed
        try {

            insTDC.agregarAvionesManualmente(String.valueOf(BoxModelos.getSelectedItem()), Integer.parseInt(txt_Pasajeros.getText()), Integer.parseInt(txt_Sobrecargos.getText()), txt_Piloto.getText(), Integer.parseInt(txt_id.getText()), "MLV");

            limpiarcampos();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor rellene los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_DespegarAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JF_AgregarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_AgregarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_AgregarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_AgregarManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_AgregarManual().setVisible(true);
            }
        });
    }

    private void limpiarcampos() {
        txt_Pasajeros.setText(null);
        txt_Sobrecargos.setText(null);
        txt_Piloto.setText(null);
        txt_id.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxModelos;
    private javax.swing.JButton btn_AterrizarA;
    private javax.swing.JButton btn_DespegarA;
    private javax.swing.JButton btn_MoverHangar;
    private javax.swing.JButton btn_MoverPDespegue;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_Pasajeros;
    private javax.swing.JTextField txt_Piloto;
    private javax.swing.JTextField txt_Sobrecargos;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
