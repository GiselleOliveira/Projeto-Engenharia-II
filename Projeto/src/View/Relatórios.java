/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Positivo
 */
public class Relatórios extends javax.swing.JFrame {

    /**
     * Creates new form Relatórios
     */
    public Relatórios() {
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

        botaoFecharRelatorio = new javax.swing.JButton();
        botaoGerarRelatorio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        periodoFinal = new javax.swing.JTextField();
        periodoInicial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipoRelatorio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoFecharRelatorio.setBackground(new java.awt.Color(255, 204, 0));
        botaoFecharRelatorio.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoFecharRelatorio.setText("Fechar");
        getContentPane().add(botaoFecharRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 130, -1));

        botaoGerarRelatorio.setBackground(new java.awt.Color(153, 255, 51));
        botaoGerarRelatorio.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoGerarRelatorio.setForeground(new java.awt.Color(0, 153, 0));
        botaoGerarRelatorio.setText("Gerar");
        getContentPane().add(botaoGerarRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 100, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("a");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 20, -1));
        getContentPane().add(periodoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 140, 80, -1));

        periodoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodoInicialActionPerformed(evt);
            }
        });
        getContentPane().add(periodoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 80, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Período de");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        tipoRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoRelatorioActionPerformed(evt);
            }
        });
        getContentPane().add(tipoRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo Relatório");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Relatórios");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 790, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/agenda-tela.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void periodoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodoInicialActionPerformed

    private void tipoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoRelatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatórios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatórios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoFecharRelatorio;
    private javax.swing.JButton botaoGerarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField periodoFinal;
    private javax.swing.JTextField periodoInicial;
    private javax.swing.JComboBox<String> tipoRelatorio;
    // End of variables declaration//GEN-END:variables
}
