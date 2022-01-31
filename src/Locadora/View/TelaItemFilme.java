/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora.View;



public class TelaItemFilme extends javax.swing.JFrame {
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelItem = new javax.swing.JLabel();
        jPanelItemFilme = new javax.swing.JPanel();
        jLabelMidia = new javax.swing.JLabel();
        jTextFieldTituloSearch = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabelTituloBusca1 = new javax.swing.JLabel();
        jComboBoxMidia = new javax.swing.JComboBox<>();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreço = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonConsultar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Hora da Pipoca");

        jLabelItem.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/icon.png"))); // NOI18N
        jLabelItem.setText("Cadastro de Item");

        jPanelItemFilme.setBackground(new java.awt.Color(102, 102, 102));

        jLabelMidia.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelMidia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMidia.setText("Tipo de Mídia:");

        jButtonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/lupa.png"))); // NOI18N

        jLabelTituloBusca1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelTituloBusca1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloBusca1.setText("Titulo:");

        jComboBoxMidia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Mídia", "CD", "DVD", "Blue-Ray", "Fita Cassete", "Pen-Drive rsrsrs..." }));

        jLabelPreco.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreco.setText("Preço:");
        jLabelPreco.setToolTipText("");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        ButtonLimpar.setText("Limpar");

        ButtonConsultar.setText("Consultar");

        ButtonCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanelItemFilmeLayout = new javax.swing.GroupLayout(jPanelItemFilme);
        jPanelItemFilme.setLayout(jPanelItemFilmeLayout);
        jPanelItemFilmeLayout.setHorizontalGroup(
            jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelItemFilmeLayout.createSequentialGroup()
                .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelItemFilmeLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelPreco)
                            .addComponent(jLabelMidia)
                            .addComponent(jLabelTituloBusca1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelItemFilmeLayout.createSequentialGroup()
                                .addComponent(jTextFieldTituloSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBoxMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldPreço, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelItemFilmeLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jButtonSalvar)
                        .addGap(56, 56, 56)
                        .addComponent(ButtonLimpar)
                        .addGap(55, 55, 55)
                        .addComponent(ButtonConsultar)
                        .addGap(51, 51, 51)
                        .addComponent(ButtonCancelar)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanelItemFilmeLayout.setVerticalGroup(
            jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelItemFilmeLayout.createSequentialGroup()
                .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelItemFilmeLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTituloSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTituloBusca1))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelItemFilmeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMidia)
                    .addComponent(jComboBoxMidia, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextFieldPreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanelItemFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(ButtonLimpar)
                    .addComponent(ButtonConsultar)
                    .addComponent(ButtonCancelar))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(jLabelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addComponent(jPanelItemFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelItemFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaItemFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaItemFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaItemFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaItemFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaItemFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonConsultar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxMidia;
    private javax.swing.JLabel jLabelItem;
    private javax.swing.JLabel jLabelMidia;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTituloBusca1;
    private javax.swing.JPanel jPanelItemFilme;
    private javax.swing.JTextField jTextFieldPreço;
    private javax.swing.JTextField jTextFieldTituloSearch;
    // End of variables declaration//GEN-END:variables
}
