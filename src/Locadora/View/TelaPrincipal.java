/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Locadora.View;


public class TelaPrincipal extends javax.swing.JFrame {
    
    
    private TelaPrincipal telaPrincipal;
    
    
   
    public TelaPrincipal(){
    initComponents();
    }
    
    public TelaPrincipal(TelaPrincipal telaPrincipal){
    
    this.telaPrincipal = telaPrincipal;
    initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuLocacao = new javax.swing.JMenu();
        MenuItemAlugar = new javax.swing.JMenuItem();
        MenuItemConsulta = new javax.swing.JMenuItem();
        MenuCadastro = new javax.swing.JMenu();
        MenuItemAtor = new javax.swing.JMenuItem();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemFilme = new javax.swing.JMenuItem();
        MenuItem = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Hora da Pipoca");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/logo.png"))); // NOI18N
        jLabelLogo.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        MenuLocacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/icon.png"))); // NOI18N
        MenuLocacao.setText("Locação");

        MenuItemAlugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/seta.png"))); // NOI18N
        MenuItemAlugar.setText("Alugar");
        MenuLocacao.add(MenuItemAlugar);

        MenuItemConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/seta.png"))); // NOI18N
        MenuItemConsulta.setText("Consultar");
        MenuLocacao.add(MenuItemConsulta);

        jMenuBar1.add(MenuLocacao);

        MenuCadastro.setText("Cadastro");

        MenuItemAtor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/seta.png"))); // NOI18N
        MenuItemAtor.setText("Ator");
        MenuCadastro.add(MenuItemAtor);

        MenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/seta.png"))); // NOI18N
        MenuItemCliente.setText("Cliente");
        MenuCadastro.add(MenuItemCliente);

        MenuItemFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/seta.png"))); // NOI18N
        MenuItemFilme.setText("Filme");
        MenuCadastro.add(MenuItemFilme);

        MenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/seta.png"))); // NOI18N
        MenuItem.setText("Item");
        MenuCadastro.add(MenuItem);

        jMenuBar1.add(MenuCadastro);

        MenuSair.setText("SAIR");
        jMenuBar1.add(MenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuItem;
    private javax.swing.JMenuItem MenuItemAlugar;
    private javax.swing.JMenuItem MenuItemAtor;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemConsulta;
    private javax.swing.JMenuItem MenuItemFilme;
    private javax.swing.JMenu MenuLocacao;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
