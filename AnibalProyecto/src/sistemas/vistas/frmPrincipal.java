/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemas.vistas;

/**
 *
 * @author Anibal
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mnuPrincipal = new javax.swing.JMenuBar();
        mnuMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        sprSeparador1 = new javax.swing.JPopupMenu.Separator();
        mnuitmSalir = new javax.swing.JMenuItem();
        mnuAdministracion = new javax.swing.JMenu();
        mnuitmGerencial = new javax.swing.JMenuItem();
        mnuitmContabilidad = new javax.swing.JMenuItem();
        mnuitmRecursosHumanos = new javax.swing.JMenuItem();
        mnuOperaciones = new javax.swing.JMenu();
        mnuitmDiarias = new javax.swing.JMenuItem();
        mnuitmMensuales = new javax.swing.JMenuItem();
        mnuitmAnuales = new javax.swing.JMenuItem();
        mnuMantenimiento = new javax.swing.JMenu();
        mnuitmInventario = new javax.swing.JMenuItem();
        mnuitmOperaciones = new javax.swing.JMenuItem();
        mnuGestion = new javax.swing.JMenu();
        mnuitmCobranzas = new javax.swing.JMenuItem();
        mnuitmPagos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuMenu.setText("Menú");

        jMenuItem1.setText("jMenuItem1");
        mnuMenu.add(jMenuItem1);
        mnuMenu.add(sprSeparador1);

        mnuitmSalir.setText("Salir");
        mnuitmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmSalirActionPerformed(evt);
            }
        });
        mnuMenu.add(mnuitmSalir);

        mnuPrincipal.add(mnuMenu);

        mnuAdministracion.setText("Administración");

        mnuitmGerencial.setText("Gerencial");
        mnuAdministracion.add(mnuitmGerencial);

        mnuitmContabilidad.setText("Contablidad");
        mnuAdministracion.add(mnuitmContabilidad);

        mnuitmRecursosHumanos.setText("Recursos Humanos");
        mnuAdministracion.add(mnuitmRecursosHumanos);

        mnuPrincipal.add(mnuAdministracion);

        mnuOperaciones.setText("Operaciones");

        mnuitmDiarias.setText("Diarias");
        mnuOperaciones.add(mnuitmDiarias);

        mnuitmMensuales.setText("Mensuales");
        mnuOperaciones.add(mnuitmMensuales);

        mnuitmAnuales.setText("Anuales");
        mnuOperaciones.add(mnuitmAnuales);

        mnuPrincipal.add(mnuOperaciones);

        mnuMantenimiento.setText("Mantenimiento");

        mnuitmInventario.setText("Inventario");
        mnuMantenimiento.add(mnuitmInventario);

        mnuitmOperaciones.setText("Operaciones");
        mnuMantenimiento.add(mnuitmOperaciones);

        mnuPrincipal.add(mnuMantenimiento);

        mnuGestion.setText("Gestión");

        mnuitmCobranzas.setText("Cobranzas");
        mnuGestion.add(mnuitmCobranzas);

        mnuitmPagos.setText("Pagos");
        mnuitmPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuitmPagosActionPerformed(evt);
            }
        });
        mnuGestion.add(mnuitmPagos);

        mnuPrincipal.add(mnuGestion);

        setJMenuBar(mnuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 304, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuitmPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmPagosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuitmPagosActionPerformed

    private void mnuitmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuitmSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuitmSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu mnuAdministracion;
    private javax.swing.JMenu mnuGestion;
    private javax.swing.JMenu mnuMantenimiento;
    private javax.swing.JMenu mnuMenu;
    private javax.swing.JMenu mnuOperaciones;
    private javax.swing.JMenuBar mnuPrincipal;
    private javax.swing.JMenuItem mnuitmAnuales;
    private javax.swing.JMenuItem mnuitmCobranzas;
    private javax.swing.JMenuItem mnuitmContabilidad;
    private javax.swing.JMenuItem mnuitmDiarias;
    private javax.swing.JMenuItem mnuitmGerencial;
    private javax.swing.JMenuItem mnuitmInventario;
    private javax.swing.JMenuItem mnuitmMensuales;
    private javax.swing.JMenuItem mnuitmOperaciones;
    private javax.swing.JMenuItem mnuitmPagos;
    private javax.swing.JMenuItem mnuitmRecursosHumanos;
    private javax.swing.JMenuItem mnuitmSalir;
    private javax.swing.JPopupMenu.Separator sprSeparador1;
    // End of variables declaration//GEN-END:variables
}
