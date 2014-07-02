package Source;

import javax.swing.table.DefaultTableModel;

public class FrmTabla extends javax.swing.JFrame {

    Renderer r = new Renderer(); //Clase renderer donde se encuentra el DefaultTableCellRenrer
    DefaultTableModel dt; 
    public FrmTabla() {
        initComponents();
        setLocationRelativeTo(null);
        dt = (DefaultTableModel) tabla.getModel();
        tabla.setDefaultRenderer(Object.class, r); //Con el nombre de la tabla le aplicamos el Renderer
    }

    private void btnLlenarActionPerformed(java.awt.event.ActionEvent evt) {
        for (int i = 0; i < 10; i++) {
            dt.addRow(new Object[]{i,(i+5)});
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLlenar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
