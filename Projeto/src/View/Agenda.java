/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Positivo
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        campoTipoReserva = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        campoHorafim = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoSaida = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoData1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoHorainicio = new javax.swing.JTextField();
        campoDia = new javax.swing.JTextField();
        tabelaReserva = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoReservar = new javax.swing.JButton();
        campoQuadraReserva = new javax.swing.JComboBox<>();
        campocliente = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoValor = new javax.swing.JTextField();
        campoDescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        fundoagenda = new javax.swing.JLabel();
        menuagenda = new javax.swing.JLabel();
        fundoagenda1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        campoTipoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loca????o", "Manuten????o" }));
        getContentPane().add(campoTipoReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 170, 20));

        jLabel7.setBackground(new java.awt.Color(255, 204, 51));
        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 51));
        jLabel7.setText("Reserva");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        campoHorafim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoHorafimActionPerformed(evt);
            }
        });
        getContentPane().add(campoHorafim, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 70, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hr. fim");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Hr. in??cio");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));
        getContentPane().add(campoSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 70, -1));

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Hr. sa??da");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));
        getContentPane().add(campoData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 70, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo Reserva");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hr. entrada");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dt. Reserva");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));
        getContentPane().add(campoHorainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 70, -1));
        getContentPane().add(campoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 70, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Quadra", "Descri????o", "Valor", "Dt. Reserva", "Hora in??cio", "Hora fim", "Hr. entrada", "Hr. sa??da", "Tipo Reserva"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaReserva.setViewportView(jTable1);

        getContentPane().add(tabelaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 700, 110));

        botaoReservar.setBackground(new java.awt.Color(102, 255, 51));
        botaoReservar.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        botaoReservar.setForeground(new java.awt.Color(0, 153, 51));
        botaoReservar.setText("Reservar");
        getContentPane().add(botaoReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 340, 30));

        campoQuadraReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(campoQuadraReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 220, 20));

        getContentPane().add(campocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 220, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descri????o");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quadra");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));
        getContentPane().add(campoValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 220, -1));
        getContentPane().add(campoDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 220, -1));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));
        getContentPane().add(campoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 220, -1));

        fundoagenda.setBackground(new java.awt.Color(153, 255, 102));
        fundoagenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        fundoagenda.setText("agendar");
        getContentPane().add(fundoagenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 790, 380));

        menuagenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/agenda-tela.jpg"))); // NOI18N
        menuagenda.setText("jLabel1");
        getContentPane().add(menuagenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 770, 430));

        fundoagenda1.setBackground(new java.awt.Color(153, 255, 102));
        fundoagenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        fundoagenda1.setText("agendar");
        getContentPane().add(fundoagenda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 790, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoHorafimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoHorafimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoHorafimActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoReservar;
    private javax.swing.JTextField campoData1;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoDia;
    private javax.swing.JTextField campoHorafim;
    private javax.swing.JTextField campoHorainicio;
    private javax.swing.JTextField campoID;
    private javax.swing.JComboBox<String> campoQuadraReserva;
    private javax.swing.JTextField campoSaida;
    private javax.swing.JComboBox<String> campoTipoReserva;
    private javax.swing.JTextField campoValor;
    private javax.swing.JComboBox<String> campocliente;
    private javax.swing.JLabel fundoagenda;
    private javax.swing.JLabel fundoagenda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel menuagenda;
    private javax.swing.JScrollPane tabelaReserva;
    // End of variables declaration//GEN-END:variables
}
