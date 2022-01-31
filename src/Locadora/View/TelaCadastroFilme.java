

package Locadora.View;

import Locadora.Dao.ExceptionDAO;
import Locadora.controler.FilmeController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TelaCadastroFilme extends javax.swing.JFrame {

   private JFrame telaCadastro;
   private Integer codFilme=0;
    
   public TelaCadastroFilme(){
    initComponents();
    }
    
    public TelaCadastroFilme(JFrame telaCadastro){
    
    this.telaCadastro = telaCadastro;
    initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFilme = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelSinopse = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jComboBoxGenero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSinopse = new javax.swing.JTextArea();
        jLabelDuracao = new javax.swing.JLabel();
        jSpinnerDuracao = new javax.swing.JSpinner();
        Minuto = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Hora da Pipoca");

        jPanelFilme.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Titulo:");

        jLabelGenero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenero.setText("Gênero:");

        jLabelSinopse.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSinopse.setText("Sinopse:");

        jTextTitulo.setToolTipText("");

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Gênero", "Ação", "Animação", "Aventura", "Cinema de arte", "Chanchada", "Comédia", "Comédia romântica", "Comédia dramática", "Comédia de ação", "Dança", "Documentário", "Docuficção", "Drama", "Espionagem", "Faroeste", "Fantasia científica", "Ficção científica", "Filmes de guerra", "Filme policial", "Musical", "Romance", "Seriado", "Suspense", "Terror" }));

        jTextAreaSinopse.setColumns(20);
        jTextAreaSinopse.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSinopse);

        jLabelDuracao.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDuracao.setText("Duração:");
        jLabelDuracao.setToolTipText("");

        jSpinnerDuracao.setModel(new javax.swing.SpinnerNumberModel(0, null, 350, 1));
        jSpinnerDuracao.setToolTipText("");

        Minuto.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Minuto.setForeground(new java.awt.Color(255, 255, 255));
        Minuto.setText("*EM MINUTOS");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Salvar(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setToolTipText("");

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirTelaConsultaFilme(evt);
            }
        });

        Cancelar.setText("Cancelar");

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagar(evt);
            }
        });

        javax.swing.GroupLayout jPanelFilmeLayout = new javax.swing.GroupLayout(jPanelFilme);
        jPanelFilme.setLayout(jPanelFilmeLayout);
        jPanelFilmeLayout.setHorizontalGroup(
            jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFilmeLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTitulo)
                            .addComponent(jLabelSinopse)
                            .addComponent(jLabelGenero)
                            .addComponent(jLabelDuracao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                                .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Minuto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelFilmeLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jButtonSalvar)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonLimpar)
                        .addGap(56, 56, 56)
                        .addComponent(jButtonConsultar)
                        .addGap(51, 51, 51)
                        .addComponent(Cancelar)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonApagar)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanelFilmeLayout.setVerticalGroup(
            jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSinopse)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDuracao)
                    .addComponent(jSpinnerDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minuto))
                .addGap(35, 35, 35)
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonConsultar)
                    .addComponent(Cancelar)
                    .addComponent(jButtonApagar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/icon.png"))); // NOI18N
        jLabel1.setText("Cadastro de Filme");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Salvar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Salvar
       int duracao = Integer.parseInt(jSpinnerDuracao.getValue().toString());
       String genero = jComboBoxGenero.getSelectedItem().toString();
       boolean sucesso;
       
       try{
           FilmeController filmeControl = new FilmeController();
           
           if(this.codFilme == 0){
           sucesso = filmeControl.cadastrarFilme(jTextTitulo.getText(), genero, jTextAreaSinopse.getText(), duracao);
           }
           else{
           sucesso = filmeControl.alterarFilme(this.codFilme, jTextTitulo.getText(), genero, jTextAreaSinopse.getText(), duracao);    
           }
        if (sucesso == true){
            JOptionPane.showMessageDialog(null, "Filme Cadastrado meu grandioso !");
        }
         else
            JOptionPane.showMessageDialog(null, "Não Cadastrou meu consagrado !");
               
           }catch(Exception ex){
            JOptionPane.showConfirmDialog(null,"Erro" + ex);
           }
       
    }//GEN-LAST:event_Salvar

    private void AbrirTelaConsultaFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirTelaConsultaFilme
       TelaConsultaFilme telaConsultaFilme = new TelaConsultaFilme(this);
       telaConsultaFilme.setVisible(true);
       this.setVisible(false);
       
       
    }//GEN-LAST:event_AbrirTelaConsultaFilme

    private void jButtonApagar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagar
       boolean sucesso;
       FilmeController filmeController = new FilmeController();
       try {
           sucesso = filmeController.apagarFilme(this.codFilme);
           if(sucesso){
           JOptionPane.showMessageDialog(null, "O Filme foi apagado com sucesso! ");
           }
           else
               JOptionPane.showMessageDialog(null, "O Filme nao foi apagado, por gentileza, CONSULTE! ");
           
           } catch (ExceptionDAO ex) {
           Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE, null, ex);
       }
          
    }//GEN-LAST:event_jButtonApagar
    public void buscarFilme(Integer codFilme, String titulo, String genero, String sinopse, Integer duracao){
     this.codFilme = codFilme;
     this.jTextTitulo.setText(titulo);
     this.jComboBoxGenero.getModel().setSelectedItem(genero);
     this.jTextAreaSinopse.setText(sinopse);
     this.jSpinnerDuracao.setValue(duracao);
     
    }
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Minuto;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDuracao;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelSinopse;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerDuracao;
    private javax.swing.JTextArea jTextAreaSinopse;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables



   

}
