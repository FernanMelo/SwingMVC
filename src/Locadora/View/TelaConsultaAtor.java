
package Locadora.View;

import Locadora.Dao.ExceptionDAO;
import Locadora.Model.Ator;
import Locadora.controler.AtorController;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class TelaConsultaAtor extends javax.swing.JFrame {

    private TelaCadastroAtor telaCadastroAtor;
    public TelaConsultaAtor(){
    initComponents();
    }
    
    public TelaConsultaAtor(TelaCadastroAtor telaCadastroAtor){
    
    this.telaCadastroAtor = telaCadastroAtor;
    initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelConsultaAtor = new javax.swing.JPanel();
        jLabelI = new javax.swing.JLabel();
        jTextFieldAtorInfome = new javax.swing.JTextField();
        jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaAtor = new javax.swing.JTable();
        jLabelConsultarAtor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelConsultaAtor.setBackground(new java.awt.Color(102, 102, 102));

        jLabelI.setForeground(new java.awt.Color(255, 255, 255));
        jLabelI.setText("Informe nome do Ator:");

        jTextFieldAtorInfome.setToolTipText("NomeATOR");

        jButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/lupa_1.png"))); // NOI18N
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAtor(evt);
            }
        });

        jTableConsultaAtor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nacionalidade", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaAtor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarTelaCadastro(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaAtor);

        javax.swing.GroupLayout jPanelConsultaAtorLayout = new javax.swing.GroupLayout(jPanelConsultaAtor);
        jPanelConsultaAtor.setLayout(jPanelConsultaAtorLayout);
        jPanelConsultaAtorLayout.setHorizontalGroup(
            jPanelConsultaAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaAtorLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabelI, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelConsultaAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelConsultaAtorLayout.createSequentialGroup()
                        .addComponent(jTextFieldAtorInfome, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanelConsultaAtorLayout.setVerticalGroup(
            jPanelConsultaAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConsultaAtorLayout.createSequentialGroup()
                .addGroup(jPanelConsultaAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelConsultaAtorLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanelConsultaAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAtorInfome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelConsultaAtorLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabelConsultarAtor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelConsultarAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/camera.png"))); // NOI18N
        jLabelConsultarAtor.setText("Consuta Ator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelConsultaAtor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(jLabelConsultarAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelConsultarAtor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelConsultaAtor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarAtor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAtor
            String nome = jTextFieldAtorInfome.getText();
            DefaultTableModel modeloTabela = (DefaultTableModel) jTableConsultaAtor.getModel();
            modeloTabela.setRowCount(0);
            AtorController atorController = new AtorController();
            
            try {
                ArrayList<Ator> atores = atorController.listarAtores(nome);
                atores.forEach((Ator ator) -> {
                modeloTabela.addRow(new Object[]{ator.getCodAtor(),
                                                 ator.getNome(),
                                                 ator.getNacionalidade(),
                                                 });
                
                });
                jTableConsultaAtor.setModel(modeloTabela);
                
        } catch (ExceptionDAO e) {
         Logger.getLogger(TelaCadastroAtor.class.getName()).log(Level.SEVERE, null, e);
        
        }
       
    }//GEN-LAST:event_jButtonConsultarAtor

    private void VoltarTelaCadastro(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarTelaCadastro
     if(evt.getClickCount()==2){
      Integer codAtor = (Integer) jTableConsultaAtor.getModel().getValueAt(jTableConsultaAtor.getSelectedRow(), 0);
      String nome = (String) jTableConsultaAtor.getModel().getValueAt(jTableConsultaAtor.getSelectedRow(), 1);
      String nacionalidade = (String) jTableConsultaAtor.getModel().getValueAt(jTableConsultaAtor.getSelectedRow(), 2);
     
      telaCadastroAtor.buscarFilme(codAtor, nome, nacionalidade);
      telaCadastroAtor.setVisible(true);
      this.dispose();
     }        
    }//GEN-LAST:event_VoltarTelaCadastro

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
            java.util.logging.Logger.getLogger(TelaConsultaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultaAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaAtor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabelConsultarAtor;
    private javax.swing.JLabel jLabelI;
    private javax.swing.JPanel jPanelConsultaAtor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaAtor;
    private javax.swing.JTextField jTextFieldAtorInfome;
    // End of variables declaration//GEN-END:variables
}
