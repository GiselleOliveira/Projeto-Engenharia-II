/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Positivo
 */
public class ClienteTela extends javax.swing.JFrame {

    /**
     * Creates new form Cliente
     */
    public ClienteTela() {
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

        botaoFecharCliente = new javax.swing.JButton();
        botaoAlterarCliente = new javax.swing.JButton();
        botaoCancelarCliente = new javax.swing.JButton();
        botaoAdicionarCliente = new javax.swing.JButton();
        textDatacriacaoCliente = new javax.swing.JTextField();
        textEmailCliente = new javax.swing.JTextField();
        textTelefoneCliente = new javax.swing.JTextField();
        textCPF = new javax.swing.JTextField();
        TextNomeCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botaoFecharCliente.setBackground(new java.awt.Color(255, 204, 0));
        botaoFecharCliente.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoFecharCliente.setText("Fechar");
        getContentPane().add(botaoFecharCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 120, -1));

        botaoAlterarCliente.setBackground(new java.awt.Color(204, 204, 204));
        botaoAlterarCliente.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoAlterarCliente.setForeground(new java.awt.Color(255, 102, 51));
        botaoAlterarCliente.setText("Alterar");
        getContentPane().add(botaoAlterarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 120, -1));

        botaoCancelarCliente.setBackground(new java.awt.Color(204, 204, 204));
        botaoCancelarCliente.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoCancelarCliente.setForeground(new java.awt.Color(255, 0, 0));
        botaoCancelarCliente.setText("Cancelar");
        getContentPane().add(botaoCancelarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 120, -1));

        botaoAdicionarCliente.setBackground(new java.awt.Color(204, 255, 0));
        botaoAdicionarCliente.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoAdicionarCliente.setForeground(new java.awt.Color(0, 153, 0));
        botaoAdicionarCliente.setText("Adicionar");
        getContentPane().add(botaoAdicionarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 120, -1));

        textDatacriacaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDatacriacaoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(textDatacriacaoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 80, -1));
        getContentPane().add(textEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 330, -1));
        getContentPane().add(textTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 270, -1));
        getContentPane().add(textCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 270, -1));

        TextNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(TextNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 390, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Data Criação");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("E-mail");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CPF");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Cadastro Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 780, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/agenda-tela.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeClienteActionPerformed

    private void textDatacriacaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDatacriacaoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDatacriacaoClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextNomeCliente;
    private javax.swing.JButton botaoAdicionarCliente;
    private javax.swing.JButton botaoAlterarCliente;
    private javax.swing.JButton botaoCancelarCliente;
    private javax.swing.JButton botaoFecharCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textDatacriacaoCliente;
    private javax.swing.JTextField textEmailCliente;
    private javax.swing.JTextField textTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
