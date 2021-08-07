package Presentacion;

import Control.TorreDeControl;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.awt.Image;

public final class JF_menu extends javax.swing.JFrame {

    private static  TorreDeControl insTC = new TorreDeControl();

    public JF_menu() {
        initComponents();
        deshabilitaBotones();
        setIconImage(getIconImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_iniciaSimulacion = new javax.swing.JButton();
        btn_ver_AvionesEnVuelo = new javax.swing.JButton();
        lbl_info_avionesEnVuelo = new javax.swing.JLabel();
        lbl_info_avionesEnPistaAterrizaje = new javax.swing.JLabel();
        lbl_info_avionesEnPistaDespegue = new javax.swing.JLabel();
        lbl_info_avionesEnHangar = new javax.swing.JLabel();
        lbl_text_avionesEnVuelo = new javax.swing.JLabel();
        lbl_text_avionesEnPistaAterrizaje = new javax.swing.JLabel();
        lbl_text_avionesEnPistaDespegue = new javax.swing.JLabel();
        lbl_text_avionesEnHangar = new javax.swing.JLabel();
        btn_ver_pistaDespegue = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_ver_hangar = new javax.swing.JButton();
        btn_ver_pistaAterrizaje = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_prepararDespegue = new javax.swing.JButton();
        btn_ordenarAterrizar = new javax.swing.JButton();
        btn_OrdenarDespegar = new javax.swing.JButton();
        btn_moverAlHangar = new javax.swing.JButton();
        btn_agregaAviones = new javax.swing.JButton();
        lbl_text_totalDeAviones = new javax.swing.JLabel();
        lbl_info_totalDeAviones = new javax.swing.JLabel();
        btn_agregaAvionesAleatoriamente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador");

        btn_iniciaSimulacion.setText("Iniciar");
        btn_iniciaSimulacion.setPreferredSize(new java.awt.Dimension(140, 50));
        btn_iniciaSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciaSimulacionActionPerformed(evt);
            }
        });

        btn_ver_AvionesEnVuelo.setText("Ver Aviones en Vuelo");
        btn_ver_AvionesEnVuelo.setPreferredSize(new java.awt.Dimension(135, 23));
        btn_ver_AvionesEnVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_AvionesEnVueloActionPerformed(evt);
            }
        });

        lbl_text_avionesEnVuelo.setText("Aviones en Vuelo:");

        lbl_text_avionesEnPistaAterrizaje.setText("Pista de Aterrizaje:");

        lbl_text_avionesEnPistaDespegue.setText("Pista de Despegue:");

        lbl_text_avionesEnHangar.setText("Aviones en Hangar:");

        btn_ver_pistaDespegue.setText("Ver Pista de Despegue");
        btn_ver_pistaDespegue.setMaximumSize(new java.awt.Dimension(135, 23));
        btn_ver_pistaDespegue.setMinimumSize(new java.awt.Dimension(135, 23));
        btn_ver_pistaDespegue.setPreferredSize(new java.awt.Dimension(135, 23));
        btn_ver_pistaDespegue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_pistaDespegueActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 102, 102));
        btn_salir.setText("Salir");
        btn_salir.setMaximumSize(new java.awt.Dimension(135, 23));
        btn_salir.setMinimumSize(new java.awt.Dimension(135, 23));
        btn_salir.setPreferredSize(new java.awt.Dimension(135, 23));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_ver_hangar.setText("Ver Hangar");
        btn_ver_hangar.setMaximumSize(new java.awt.Dimension(135, 23));
        btn_ver_hangar.setMinimumSize(new java.awt.Dimension(135, 23));
        btn_ver_hangar.setPreferredSize(new java.awt.Dimension(135, 23));
        btn_ver_hangar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_hangarActionPerformed(evt);
            }
        });

        btn_ver_pistaAterrizaje.setText("Ver Pista de Aterrizaje");
        btn_ver_pistaAterrizaje.setMaximumSize(new java.awt.Dimension(135, 23));
        btn_ver_pistaAterrizaje.setMinimumSize(new java.awt.Dimension(135, 23));
        btn_ver_pistaAterrizaje.setPreferredSize(new java.awt.Dimension(135, 23));
        btn_ver_pistaAterrizaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ver_pistaAterrizajeActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Administración de Aviones"));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 80));

        btn_prepararDespegue.setText("Preparar Despegue");
        btn_prepararDespegue.setMaximumSize(new java.awt.Dimension(111, 23));
        btn_prepararDespegue.setMinimumSize(new java.awt.Dimension(111, 23));
        btn_prepararDespegue.setPreferredSize(new java.awt.Dimension(111, 23));
        btn_prepararDespegue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prepararDespegueActionPerformed(evt);
            }
        });

        btn_ordenarAterrizar.setText("Ordenar Aterrizar");
        btn_ordenarAterrizar.setMaximumSize(new java.awt.Dimension(111, 23));
        btn_ordenarAterrizar.setMinimumSize(new java.awt.Dimension(111, 23));
        btn_ordenarAterrizar.setPreferredSize(new java.awt.Dimension(111, 23));
        btn_ordenarAterrizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarAterrizarActionPerformed(evt);
            }
        });

        btn_OrdenarDespegar.setText("Ordenar Despegar");
        btn_OrdenarDespegar.setMaximumSize(new java.awt.Dimension(111, 23));
        btn_OrdenarDespegar.setMinimumSize(new java.awt.Dimension(111, 23));
        btn_OrdenarDespegar.setPreferredSize(new java.awt.Dimension(111, 23));
        btn_OrdenarDespegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_OrdenarDespegarActionPerformed(evt);
            }
        });

        btn_moverAlHangar.setText("Mover al Hangar");
        btn_moverAlHangar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_moverAlHangarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_OrdenarDespegar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ordenarAterrizar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_prepararDespegue, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moverAlHangar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_prepararDespegue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_OrdenarDespegar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ordenarAterrizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_moverAlHangar))
                .addGap(30, 30, 30))
        );

        btn_agregaAviones.setText("Agregar Aviones Manualmente");
        btn_agregaAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregaAvionesActionPerformed(evt);
            }
        });

        lbl_text_totalDeAviones.setText("Total de Aviones:");

        btn_agregaAvionesAleatoriamente.setText("Agregar Aviones Aleatoriamente");
        btn_agregaAvionesAleatoriamente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregaAvionesAleatoriamenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_ver_pistaAterrizaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_iniciaSimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ver_AvionesEnVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ver_pistaDespegue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_ver_hangar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregaAviones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregaAvionesAleatoriamente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_text_avionesEnHangar)
                                    .addComponent(lbl_text_avionesEnPistaDespegue)
                                    .addComponent(lbl_text_totalDeAviones))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_info_avionesEnPistaDespegue, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                        .addComponent(lbl_info_avionesEnHangar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lbl_info_totalDeAviones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_text_avionesEnVuelo)
                                    .addComponent(lbl_text_avionesEnPistaAterrizaje))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_info_avionesEnPistaAterrizaje, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                                    .addComponent(lbl_info_avionesEnVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btn_iniciaSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregaAviones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_agregaAvionesAleatoriamente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(btn_ver_AvionesEnVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_info_avionesEnVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_text_avionesEnVuelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_info_avionesEnPistaAterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_text_avionesEnPistaAterrizaje))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_text_avionesEnPistaDespegue)
                            .addComponent(lbl_info_avionesEnPistaDespegue, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_text_avionesEnHangar)
                            .addComponent(lbl_info_avionesEnHangar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_text_totalDeAviones)
                            .addComponent(lbl_info_totalDeAviones, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_ver_hangar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ver_pistaDespegue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ver_pistaAterrizaje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciaSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciaSimulacionActionPerformed

        llenaEtiquetasAviones();
        
        habilitaBotones();
        btn_iniciaSimulacion.setEnabled(false);
    }//GEN-LAST:event_btn_iniciaSimulacionActionPerformed

    private void btn_ver_AvionesEnVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_AvionesEnVueloActionPerformed

        insTC.abreJFAvionesEnVuelo();
    }//GEN-LAST:event_btn_ver_AvionesEnVueloActionPerformed

    private void btn_ver_pistaDespegueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_pistaDespegueActionPerformed
        
        insTC.abreJFDespegue();
    }//GEN-LAST:event_btn_ver_pistaDespegueActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ver_hangarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_hangarActionPerformed

        insTC.abreJFHangar();
    }//GEN-LAST:event_btn_ver_hangarActionPerformed

    private void btn_ver_pistaAterrizajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ver_pistaAterrizajeActionPerformed
        insTC.abreJFAterrizaje();
    }//GEN-LAST:event_btn_ver_pistaAterrizajeActionPerformed

    private void btn_prepararDespegueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prepararDespegueActionPerformed
        
        if(insTC.hangarAPistaDespegue()){
            llenaEtiquetasAviones();
            insTC.actualizaInformacion();
            JOptionPane.showMessageDialog(null, "El avion se traslado a la pista de despegue", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No hay aviones en el hangar", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_btn_prepararDespegueActionPerformed

    private void btn_OrdenarDespegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_OrdenarDespegarActionPerformed
        
        if(insTC.despegar()){
            insTC.actualizaInformacion();
            JOptionPane.showMessageDialog(null, "El avion ha despegado", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No hay aviones en la pista de despegue", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_OrdenarDespegarActionPerformed

    private void btn_ordenarAterrizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarAterrizarActionPerformed

        if (!insTC.atterizarValida()) {
            insTC.abreJFAterrizar();
        } else {
            JOptionPane.showMessageDialog(null, "No hay aviones en vuelo", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ordenarAterrizarActionPerformed

    private void btn_moverAlHangarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_moverAlHangarActionPerformed
        
        if(insTC.DePistaAterrizajeAHangar()){
            insTC.actualizaInformacion();
            JOptionPane.showMessageDialog(null, "El avion fue guardado en el hangar", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No hay aviones en la pista de aterrizaje", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_moverAlHangarActionPerformed

    private void btn_agregaAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregaAvionesActionPerformed
        
        insTC.agregaAvionManual();
        insTC.actualizaEtiquetaID();
    }//GEN-LAST:event_btn_agregaAvionesActionPerformed

    private void btn_agregaAvionesAleatoriamenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregaAvionesAleatoriamenteActionPerformed
        
        insTC.abreJFAgregaAleatorio();
//        int cantidadAviones = insTC.AvionesAleatorios();
//        JOptionPane.showMessageDialog(null, cantidadAviones + " aviones distribuidos", "", JOptionPane.INFORMATION_MESSAGE);
//        insTC.actualizaInformacion();
    }//GEN-LAST:event_btn_agregaAvionesAleatoriamenteActionPerformed

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
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_menu().setVisible(true);
            }
        });
    }
    @Override
    public Image getIconImage(){
    
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoAvion.png"));
        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_OrdenarDespegar;
    private javax.swing.JButton btn_agregaAviones;
    private javax.swing.JButton btn_agregaAvionesAleatoriamente;
    private javax.swing.JButton btn_iniciaSimulacion;
    private javax.swing.JButton btn_moverAlHangar;
    private javax.swing.JButton btn_ordenarAterrizar;
    private javax.swing.JButton btn_prepararDespegue;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_ver_AvionesEnVuelo;
    private javax.swing.JButton btn_ver_hangar;
    private javax.swing.JButton btn_ver_pistaAterrizaje;
    private javax.swing.JButton btn_ver_pistaDespegue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_info_avionesEnHangar;
    private javax.swing.JLabel lbl_info_avionesEnPistaAterrizaje;
    private javax.swing.JLabel lbl_info_avionesEnPistaDespegue;
    private javax.swing.JLabel lbl_info_avionesEnVuelo;
    private javax.swing.JLabel lbl_info_totalDeAviones;
    private javax.swing.JLabel lbl_text_avionesEnHangar;
    private javax.swing.JLabel lbl_text_avionesEnPistaAterrizaje;
    private javax.swing.JLabel lbl_text_avionesEnPistaDespegue;
    private javax.swing.JLabel lbl_text_avionesEnVuelo;
    private javax.swing.JLabel lbl_text_totalDeAviones;
    // End of variables declaration//GEN-END:variables

    private void deshabilitaBotones() {
        
        btn_ver_AvionesEnVuelo.setEnabled(false);
        btn_ver_pistaDespegue.setEnabled(false);
        btn_ver_hangar.setEnabled(false);
        btn_ver_pistaAterrizaje.setEnabled(false);
        btn_agregaAviones.setEnabled(false);
        btn_agregaAvionesAleatoriamente.setEnabled(false);
        btn_prepararDespegue.setEnabled(false);
        btn_ordenarAterrizar.setEnabled(false);
        btn_moverAlHangar.setEnabled(false);
        btn_OrdenarDespegar.setEnabled(false);
    }
    
    private void habilitaBotones() {
        
        btn_ver_AvionesEnVuelo.setEnabled(true);
        btn_ver_pistaDespegue.setEnabled(true);
        btn_ver_hangar.setEnabled(true);
        btn_ver_pistaAterrizaje.setEnabled(true);
        btn_agregaAviones.setEnabled(true);
        btn_agregaAvionesAleatoriamente.setEnabled(true);
        btn_prepararDespegue.setEnabled(true);
        btn_ordenarAterrizar.setEnabled(true);
        btn_moverAlHangar.setEnabled(true);
        btn_OrdenarDespegar.setEnabled(true);
    }

    public void llenaEtiquetasAviones() {

        lbl_info_avionesEnVuelo.setText(insTC.imprimeAvionesVolando2());
        lbl_info_avionesEnPistaAterrizaje.setText(insTC.imprimeAvionesPistaAterrizaje2());
        lbl_info_avionesEnPistaDespegue.setText(insTC.imprimeAvionesPistaDespegue2());
        lbl_info_avionesEnHangar.setText(insTC.imprimeAvionesHangar2());
        lbl_info_totalDeAviones.setText(insTC.imprimeTotalDeAviones());
    }

}
