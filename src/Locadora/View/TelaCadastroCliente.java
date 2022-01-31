
package Locadora.View;

import Locadora.Dao.ExceptionDAO;
import Locadora.controler.ClienteController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadastroCliente extends javax.swing.JFrame {

    private TelaCadastroCliente telaCadastroCliente;
    private Integer codCliente = 0;
    
    public TelaCadastroCliente(){
    initComponents();
    }
    
    public TelaCadastroCliente(TelaCadastroCliente telaCadastroCliente){
    
    this.telaCadastroCliente = telaCadastroCliente;
    initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelNomeCliente = new javax.swing.JLabel();
        LabelDatNascimento = new javax.swing.JLabel();
        LabelCPF = new javax.swing.JLabel();
        LabelEmail = new javax.swing.JLabel();
        LabelEndereco = new javax.swing.JLabel();
        jTextFieldClienteName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jFormattedTextdtNascimento = new javax.swing.JFormattedTextField();
        jTextFieldCPF = new javax.swing.JTextField();
        jButtonApagar = new javax.swing.JButton();
        jLabelCadastroCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Hora da Pipoca");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        LabelNomeCliente.setBackground(new java.awt.Color(255, 255, 255));
        LabelNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelNomeCliente.setText("Nome:");

        LabelDatNascimento.setBackground(new java.awt.Color(255, 255, 255));
        LabelDatNascimento.setForeground(new java.awt.Color(255, 255, 255));
        LabelDatNascimento.setText("Data de Nascimento:");
        LabelDatNascimento.setToolTipText("");

        LabelCPF.setBackground(new java.awt.Color(255, 255, 255));
        LabelCPF.setForeground(new java.awt.Color(255, 255, 255));
        LabelCPF.setText("CPF:");
        LabelCPF.setToolTipText("");

        LabelEmail.setBackground(new java.awt.Color(255, 255, 255));
        LabelEmail.setForeground(new java.awt.Color(255, 255, 255));
        LabelEmail.setText("e-Mail:");
        LabelEmail.setToolTipText("");

        LabelEndereco.setBackground(new java.awt.Color(255, 255, 255));
        LabelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        LabelEndereco.setText("Endereço:");
        LabelEndereco.setToolTipText("");

        jTextFieldClienteName.setToolTipText("");

        jTextFieldEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnderecoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarCliente(evt);
            }
        });

        jButtonLimpar.setText("Limpar");

        jButtonCancelar.setText("Cancelar");

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarTelaCliente(evt);
            }
        });

        jFormattedTextdtNascimento.setForeground(new java.awt.Color(0, 0, 0));
        jFormattedTextdtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarCliente(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelEndereco)
                            .addComponent(LabelEmail)
                            .addComponent(LabelNomeCliente)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelDatNascimento)
                                .addComponent(LabelCPF, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldClienteName, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFormattedTextdtNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonSalvar)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonLimpar)
                        .addGap(45, 45, 45)
                        .addComponent(jButtonConsultar)
                        .addGap(44, 44, 44)
                        .addComponent(jButtonApagar)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonCancelar)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNomeCliente)
                    .addComponent(jTextFieldClienteName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDatNascimento)
                    .addComponent(jFormattedTextdtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelEndereco)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonApagar))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabelCadastroCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/icon.png"))); // NOI18N
        jLabelCadastroCliente.setText("Cadastro Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnderecoActionPerformed

    private void SalvarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarCliente
        boolean sucesso;
        String CPF = jTextFieldCPF.getText();
        String nome = jTextFieldClienteName.getText();
        String endereco = jTextFieldEndereco.getText();
        String dtNascimento = jFormattedTextdtNascimento.getText();
        String email = jTextFieldEmail.getText();
        
        try {
            
            ClienteController clienteControl = new ClienteController();
            
            if(this.codCliente == 0){
            sucesso = clienteControl.cadastrarCliente(CPF, nome, endereco, dtNascimento, email);
            }
            else
            sucesso = clienteControl.alterarCliente(this.codCliente, CPF, nome, endereco, dtNascimento, email);
            
            if (sucesso = true)
                JOptionPane.showMessageDialog(null, "Parabens Candango");
            else
                JOptionPane.showMessageDialog(null, "Incorreto Digite novamente.");
        
        
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Erro" + e);
        
        }
    }//GEN-LAST:event_SalvarCliente

    public void buscarCliente(Integer codCliente, String nome, String cpf, String endereco, String email, Date dtNascimento){
    
    this.codCliente = codCliente;        
    this.jTextFieldClienteName.setText(nome);
    this.jTextFieldCPF.setText(cpf);
    this.jTextFieldEndereco.setText(endereco);
    this.jTextFieldEmail.setText(email);
    SimpleDateFormat mask = new SimpleDateFormat("dd/MM/yyyy");
    this.jFormattedTextdtNascimento.setText(mask.format(dtNascimento));
    
    }

    private void jButtonConsultarTelaCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarTelaCliente
        TelaConsultaCliente telaConsultaCliente = new TelaConsultaCliente(this);
        telaConsultaCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarTelaCliente

    private void jButtonApagarCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarCliente
       boolean sucesso;
       ClienteController clienteController = new ClienteController();
       try {
           sucesso = clienteController.apagarCliente(this.codCliente);
           if(sucesso){
           JOptionPane.showMessageDialog(null, "O Cliente foi apagado com sucesso! ");
           }
           else
               JOptionPane.showMessageDialog(null, "O Cliente nao foi apagado, por gentileza, CONSULTE! ");
           
           } catch (ExceptionDAO ex) {
           Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButtonApagarCliente

    
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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelCPF;
    private javax.swing.JLabel LabelDatNascimento;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelEndereco;
    private javax.swing.JLabel LabelNomeCliente;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFormattedTextField jFormattedTextdtNascimento;
    private javax.swing.JLabel jLabelCadastroCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldClienteName;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    // End of variables declaration//GEN-END:variables
}
