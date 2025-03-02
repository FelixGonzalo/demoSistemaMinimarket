/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;

/**
 *
 * @author Fekilo
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("Sistema MiniMarket v1.1");
        jmenu.setBackground(Color.BLACK);
        jmenu.setOpaque(true);
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
        jmenu = new javax.swing.JMenuBar();
        jmenVenta = new javax.swing.JMenu();
        jmenCompra = new javax.swing.JMenu();
        jmenInventario = new javax.swing.JMenu();
        jmenReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1105, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        jmenu.setBackground(new java.awt.Color(204, 204, 204));
        jmenu.setBorder(null);
        jmenu.setBorderPainted(false);
        jmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jmenVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/carritoCompra.png"))); // NOI18N
        jmenVenta.setText("Venta");
        jmenVenta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jmenVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmenVentaMouseClicked(evt);
            }
        });
        jmenu.add(jmenVenta);

        jmenCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/camion.png"))); // NOI18N
        jmenCompra.setText("Compra");
        jmenCompra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jmenCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmenCompraMouseClicked(evt);
            }
        });
        jmenu.add(jmenCompra);

        jmenInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/inventario.png"))); // NOI18N
        jmenInventario.setText("Inventario");
        jmenInventario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jmenInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmenInventarioMouseClicked(evt);
            }
        });
        jmenu.add(jmenInventario);

        jmenReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/img/reporte.png"))); // NOI18N
        jmenReportes.setText("Reportes");
        jmenReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jmenReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmenReportesMouseClicked(evt);
            }
        });
        jmenu.add(jmenReportes);

        setJMenuBar(jmenu);

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

    private void jmenVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenVentaMouseClicked
        VistaVenta vVenta = new VistaVenta(this, rootPaneCheckingEnabled);
        vVenta.setVisible(true);
    }//GEN-LAST:event_jmenVentaMouseClicked

    private void jmenReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenReportesMouseClicked
        VistaReportes vReportes = new VistaReportes(this, rootPaneCheckingEnabled);
        vReportes.setVisible(true);
    }//GEN-LAST:event_jmenReportesMouseClicked

    private void jmenInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenInventarioMouseClicked
        VistaInventario vInventario = new VistaInventario(this, rootPaneCheckingEnabled);
        vInventario.setVisible(true);
    }//GEN-LAST:event_jmenInventarioMouseClicked

    private void jmenCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmenCompraMouseClicked
        VistaCompra vCompra = new VistaCompra(this, rootPaneCheckingEnabled);
        vCompra.setVisible(true);
    }//GEN-LAST:event_jmenCompraMouseClicked

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmenCompra;
    private javax.swing.JMenu jmenInventario;
    private javax.swing.JMenu jmenReportes;
    private javax.swing.JMenu jmenVenta;
    private javax.swing.JMenuBar jmenu;
    // End of variables declaration//GEN-END:variables

}
