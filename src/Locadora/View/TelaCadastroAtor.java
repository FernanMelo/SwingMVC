
package Locadora.View;

import Locadora.Dao.ExceptionDAO;
import Locadora.controler.AtorController;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class TelaCadastroAtor extends javax.swing.JFrame {

    private TelaCadastroAtor telaCadastroAtor;
    private Integer codAtor = 0;
    public TelaCadastroAtor(){
    initComponents();
    }
    
    public TelaCadastroAtor(TelaCadastroAtor telaCadastroAtor){
    
    this.telaCadastroAtor = telaCadastroAtor;
    initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel = new javax.swing.JLabel();
        PanelCadastroAtor = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNacionalidade = new javax.swing.JLabel();
        jComboBoxNacionalidade = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonApagarAtor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Hora da Pipoca");
        setResizable(false);

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/icon.png"))); // NOI18N
        jLabel.setText("Cadastro de ATOR");

        PanelCadastroAtor.setBackground(new java.awt.Color(51, 51, 51));
        PanelCadastroAtor.setPreferredSize(new java.awt.Dimension(760, 400));

        jLabelNome.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNome.setText("Nome:");
        jLabelNome.setToolTipText("");

        jTextFieldNome.setToolTipText("Nome Autor");

        jLabelNacionalidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNacionalidade.setText("Nacionalidade");

        jComboBoxNacionalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a Nacionalidade", "Afeganistão", "África do Sul", "Akrotiri", "Albânia", "Alemanha", "Andorra", "Angola", "Anguila", "Antárctida", "Antígua e Barbuda", "Arábia Saudita", "Arctic Ocean", "Argélia", "Argentina", "Arménia", "Aruba", "Ashmore and Cartier Islands", "Atlantic Ocean", "Austrália", "Áustria", "Azerbaijão", "Baamas", "Bangladeche", "Barbados", "Barém", "Bélgica", "Belize", "Benim", "Bermudas", "Bielorrússia", "Birmânia", "Bolívia", "Bósnia e Herzegovina", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burquina Faso", "Burúndi", "Butão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Catar", "Cazaquistão", "Chade", "Chile", "China", "Chipre", "Clipperton Island", "Colômbia", "Comores", "Congo-Brazzaville", "Congo-Kinshasa", "Coral Sea Islands", "Coreia do Norte", "Coreia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Cuba", "Curacao", "Dhekelia", "Dinamarca", "Domínica", "Egipto", "Emiratos Árabes Unidos", "Equador", "Eritreia", "Eslováquia", "Eslovénia", "Espanha", "Estados Unidos", "Estónia", "Etiópia", "Faroé", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Gaza Strip", "Geórgia", "Geórgia do Sul e Sandwich do Sul", "Gibraltar", "Granada", "Grécia", "Gronelândia", "Guame", "Guatemala", "Guernsey", "Guiana", "Guiné", "Guiné Equatorial", "Guiné-Bissau", "Haiti", "Honduras", "Hong Kong", "Hungria", "Iémen", "Ilha Bouvet", "Ilha do Natal", "Ilha Norfolk", "Ilhas Caimão", "Ilhas Cook", "Ilhas dos Cocos", "Ilhas Falkland", "Ilhas Heard e McDonald", "Ilhas Marshall", "Ilhas Salomão", "Ilhas Turcas e Caicos", "Ilhas Virgens Americanas", "Ilhas Virgens Britânicas", "Índia", "Indian Ocean", "Indonésia", "Irão", "Iraque", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Jan Mayen", "Japão", "Jersey", "Jibuti", "Jordânia", "Kosovo", "Kuwait", "Laos", "Lesoto", "Letónia", "Líbano", "Libéria", "Líbia", "Listenstaine", "Lituânia", "Luxemburgo", "Macau", "Macedónia", "Madagáscar", "Malásia", "Malávi", "Maldivas", "Mali", "Malta", "Man, Isle of", "Marianas do Norte", "Marrocos", "Maurícia", "Mauritânia", "México", "Micronésia", "Moçambique", "Moldávia", "Mónaco", "Mongólia", "Monserrate", "Montenegro", "Mundo", "Namíbia", "Nauru", "Navassa Island", "Nepal", "Nicarágua", "Níger", "Nigéria", "Niue", "Noruega", "Nova Caledónia", "Nova Zelândia", "Omã", "Pacific Ocean", "Países Baixos", "Palau", "Panamá", "Papua-Nova Guiné", "Paquistão", "Paracel Islands", "Paraguai", "Peru", "Pitcairn", "Polinésia Francesa", "Polónia", "Porto Rico", "Portugal", "Quénia", "Quirguizistão", "Quiribáti", "Reino Unido", "República Centro-Africana", "República Dominicana", "Roménia", "Ruanda", "Rússia", "Salvador", "Samoa", "Samoa Americana", "Santa Helena", "Santa Lúcia", "São Bartolomeu", "São Cristóvão e Neves", "São Marinho", "São Martinho", "São Pedro e Miquelon", "São Tomé e Príncipe", "São Vicente e Granadinas", "Sara Ocidental", "Seicheles", "Senegal", "Serra Leoa", "Sérvia", "Singapura", "Sint Maarten", "Síria", "Somália", "Southern Ocean", "Spratly Islands", "Sri Lanca", "Suazilândia", "Sudão", "Sudão do Sul", "Suécia", "Suíça", "Suriname", "Svalbard e Jan Mayen", "Tailândia", "Taiwan", "Tajiquistão", "Tanzânia", "Território Britânico do Oceano Índico", "Territórios Austrais Franceses", "Timor Leste", "Togo", "Tokelau", "Tonga", "Trindade e Tobago", "Tunísia", "Turquemenistão", "Turquia", "Tuvalu", "Ucrânia", "Uganda", "União Europeia", "Uruguai", "Usbequistão", "Vanuatu", "Vaticano", "Venezuela", "Vietname", "Wake Island", "Wallis e Futuna", "West Bank", "Zâmbia", "Zimbabué" }));
        jComboBoxNacionalidade.setToolTipText("");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarAtor(evt);
            }
        });

        jButtonLimpar.setText("Limpar");

        jButtonCancelar.setText("Cancelar");

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAtor(evt);
            }
        });

        jButtonApagarAtor.setText("Apagar");
        jButtonApagarAtor.setToolTipText("");
        jButtonApagarAtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarAtorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCadastroAtorLayout = new javax.swing.GroupLayout(PanelCadastroAtor);
        PanelCadastroAtor.setLayout(PanelCadastroAtorLayout);
        PanelCadastroAtorLayout.setHorizontalGroup(
            PanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroAtorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNacionalidade)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelCadastroAtorLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButtonSalvar)
                .addGap(43, 43, 43)
                .addComponent(jButtonLimpar)
                .addGap(43, 43, 43)
                .addComponent(jButtonConsultar)
                .addGap(39, 39, 39)
                .addComponent(jButtonApagarAtor, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(jButtonCancelar)
                .addGap(50, 50, 50))
        );
        PanelCadastroAtorLayout.setVerticalGroup(
            PanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroAtorLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(42, 42, 42)
                .addGroup(PanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBoxNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(PanelCadastroAtorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonLimpar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonApagarAtor))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(PanelCadastroAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelCadastroAtor, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarAtor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarAtor
        String ator = jTextFieldNome.getText();
        String nacionalidade = jComboBoxNacionalidade.getSelectedItem().toString();
        boolean sucesso;
        
        try {
            
            AtorController atorController = new AtorController();
            
            if(this.codAtor == 0){
            sucesso = atorController.CadastrarAtor(ator, nacionalidade);
            }
            else{ 
            sucesso = atorController.AlterarAtor(this.codAtor, ator, nacionalidade);
            }
            
            if(sucesso == true)
                JOptionPane.showMessageDialog(null, "Boa mandou Certinho");
            else
                JOptionPane.showMessageDialog(null, "Digite novamente Retarda <3! ");
        
        } catch (Exception ex) {
            
                JOptionPane.showMessageDialog(null,"Erro:" + ex);
                
        }
       
        
    }//GEN-LAST:event_SalvarAtor

    
     public void buscarFilme(Integer codAtor, String nome, String nacionalidade){
      this.codAtor = codAtor;
      this.jTextFieldNome.setText(nome);
      this.jComboBoxNacionalidade.getModel().setSelectedItem(nacionalidade);
      
      
      }
    
    private void jButtonConsultarAtor(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAtor
        TelaConsultaAtor telaConsultaAtor = new TelaConsultaAtor(this);
        telaConsultaAtor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonConsultarAtor

    private void jButtonApagarAtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarAtorActionPerformed
        boolean sucesso;
       AtorController atorController = new AtorController();
       try {
           sucesso = atorController.apagarAtor(this.codAtor);
           if(sucesso){
           JOptionPane.showMessageDialog(null, "O Ator foi apagado com sucesso! ");
           }
           else
               JOptionPane.showMessageDialog(null, "O Ator nao foi apagado, por gentileza, CONSULTE! ");
           
           } catch (ExceptionDAO ex) {
           Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButtonApagarAtorActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAtor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAtor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCadastroAtor;
    private javax.swing.JButton jButtonApagarAtor;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxNacionalidade;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabelNacionalidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
