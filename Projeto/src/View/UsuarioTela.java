/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Positivo
 */
public class UsuarioTela extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public UsuarioTela() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        botaoFecharUsuario = new javax.swing.JButton();
        botaoSenhaUsuario = new javax.swing.JButton();
        botaoAcessoUsuario = new javax.swing.JButton();
        botaoExcluirUsuario = new javax.swing.JButton();
        botaoAlterarUsuario = new javax.swing.JButton();
        tipoUsuario = new javax.swing.JComboBox<>();
        botaoAdicionarUsuario = new javax.swing.JButton();
        TextDatausuario = new javax.swing.JTextField();
        TextEmailusuario = new javax.swing.JTextField();
        TextTelefoneusuario = new javax.swing.JTextField();
        TextCPFusuario = new javax.swing.JTextField();
        TextnomeUsuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tipo Usu??rio", "Nome", "Email", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 500, 80));

        botaoFecharUsuario.setBackground(new java.awt.Color(255, 204, 0));
        botaoFecharUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoFecharUsuario.setText("Fechar");
        botaoFecharUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoFecharUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 110, -1));

        botaoSenhaUsuario.setBackground(new java.awt.Color(255, 204, 0));
        botaoSenhaUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoSenhaUsuario.setText("Senha");
        botaoSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSenhaUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 110, -1));

        botaoAcessoUsuario.setBackground(new java.awt.Color(255, 204, 0));
        botaoAcessoUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoAcessoUsuario.setText("Acessos");
        botaoAcessoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAcessoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 110, -1));

        botaoExcluirUsuario.setBackground(new java.awt.Color(255, 204, 0));
        botaoExcluirUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoExcluirUsuario.setText("Excluir");
        botaoExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoExcluirUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 110, -1));

        botaoAlterarUsuario.setBackground(new java.awt.Color(255, 204, 0));
        botaoAlterarUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoAlterarUsuario.setText("Alterar");
        botaoAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 110, -1));

        tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Zelador" }));
        tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, -1));

        botaoAdicionarUsuario.setBackground(new java.awt.Color(255, 204, 0));
        botaoAdicionarUsuario.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoAdicionarUsuario.setText("Adicionar");
        botaoAdicionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAdicionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 110, -1));

        TextDatausuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDatausuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextDatausuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 90, -1));

        TextEmailusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextEmailusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, -1));

        TextTelefoneusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTelefoneusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextTelefoneusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, -1));

        TextCPFusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCPFusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextCPFusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 190, -1));

        TextnomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextnomeUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(TextnomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 420, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Dt. Cria????o");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("E-mail");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CPF");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo Usu??rio");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 51));
        jLabel3.setText("Cadastro Usu??rio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 30));

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 10, 790, 420));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/agenda-tela.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextnomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextnomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextnomeUsuarioActionPerformed

    private void TextCPFusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCPFusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCPFusuarioActionPerformed

    private void TextTelefoneusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTelefoneusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTelefoneusuarioActionPerformed

    private void TextEmailusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailusuarioActionPerformed

    private void TextDatausuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDatausuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDatausuarioActionPerformed

    private void tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoUsuarioActionPerformed

    private void botaoAdicionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAdicionarUsuarioActionPerformed

    private void botaoAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAlterarUsuarioActionPerformed

    private void botaoExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoExcluirUsuarioActionPerformed

    private void botaoAcessoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAcessoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoAcessoUsuarioActionPerformed

    private void botaoSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoSenhaUsuarioActionPerformed

    private void botaoFecharUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoFecharUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextCPFusuario;
    private javax.swing.JTextField TextDatausuario;
    private javax.swing.JTextField TextEmailusuario;
    private javax.swing.JTextField TextTelefoneusuario;
    private javax.swing.JTextField TextnomeUsuario;
    private javax.swing.JButton botaoAcessoUsuario;
    private javax.swing.JButton botaoAdicionarUsuario;
    private javax.swing.JButton botaoAlterarUsuario;
    private javax.swing.JButton botaoExcluirUsuario;
    private javax.swing.JButton botaoFecharUsuario;
    private javax.swing.JButton botaoSenhaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}
