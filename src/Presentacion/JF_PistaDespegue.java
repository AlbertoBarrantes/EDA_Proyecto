
package Presentacion;

import Logica.Nodo;
import Logica.TorreDeControl;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;


public class JF_PistaDespegue extends javax.swing.JFrame {
    
    private static final TorreDeControl insTC = new TorreDeControl();

    public JF_PistaDespegue() {
        initComponents();
        setIconImage(getIconImage());
        llenaTabla(insTC.retornaListaPistaDespegue());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pista de Despegue");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden de Despegue", "Piloto", "ID", "Modelo", "Pasajeros", "Sobrecargos"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JF_PistaDespegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_PistaDespegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_PistaDespegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_PistaDespegue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JF_PistaDespegue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables


private void llenaTabla(Nodo lista) {
        
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        Object rowData[] = new Object[6];
        int cont = 1;
        Nodo aux = lista;
        while(aux != null){
            rowData[0] = "#" + cont;
            rowData[1] = aux.piloto;
            rowData[2] = aux.id;
            rowData[3] = aux.modelo;
            rowData[4] = aux.pasajeros;
            rowData[5] = aux.sobrecargos;
            tModel.addRow(rowData);
            cont++;
            aux = aux.sig;
        }
    }



    @Override
    public Image getIconImage(){
    
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoAvion.png"));
        return retValue;
    }














}
