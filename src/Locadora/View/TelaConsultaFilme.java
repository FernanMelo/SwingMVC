

package Locadora.View;

import Locadora.Dao.ExceptionDAO;
import Locadora.Model.Filme;
import Locadora.controler.FilmeController;
import com.sun.media.sound.ModelOscillator;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class TelaConsultaFilme extends javax.swing.JFrame {
    
    private TelaCadastroFilme telaCadastroFilme;
    
    public TelaConsultaFilme(){
    initComponents();
    }
    
    public TelaConsultaFilme(TelaCadastroFilme telaCadastroFilme){
    
    this.telaCadastroFilme = telaCadastroFilme;
    initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelConsultaFilme = new javax.swing.JPanel();
        jLabelTituloFilme = new javax.swing.JLabel();
        jTextFieldTituloFilme = new javax.swing.JTextField();
        jButtonConsultarFilme = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsultaFilme = new javax.swing.JTable();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locadora Video");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                FecharJanela(evt);
            }
        });

        jPainelConsultaFilme.setBackground(new java.awt.Color(102, 102, 102));

        jLabelTituloFilme.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloFilme.setText("Informe o titulo do Filme:");
        jLabelTituloFilme.setToolTipText("");

        jTextFieldTituloFilme.setToolTipText("Informar o filme");

        jButtonConsultarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/lupa.png"))); // NOI18N
        jButtonConsultarFilme.setToolTipText("Consute o filme");
        jButtonConsultarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarFilme(evt);
            }
        });

        jTableConsultaFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Genero", "Sinopse", "Duração"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsultaFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsultaFilme);

        javax.swing.GroupLayout jPainelConsultaFilmeLayout = new javax.swing.GroupLayout(jPainelConsultaFilme);
        jPainelConsultaFilme.setLayout(jPainelConsultaFilmeLayout);
        jPainelConsultaFilmeLayout.setHorizontalGroup(
            jPainelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelConsultaFilmeLayout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPainelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPainelConsultaFilmeLayout.createSequentialGroup()
                        .addComponent(jLabelTituloFilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsultarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(119, 119, 119))
        );
        jPainelConsultaFilmeLayout.setVerticalGroup(
            jPainelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelConsultaFilmeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPainelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonConsultarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPainelConsultaFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelTituloFilme)
                        .addComponent(jTextFieldTituloFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Locadora/IMAGENS/camera.png"))); // NOI18N
        jLabelTitulo.setLabelFor(jPainelConsultaFilme);
        jLabelTitulo.setText("Consulta Filme");
        jLabelTitulo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPainelConsultaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPainelConsultaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharJanela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_FecharJanela
    
    this.dispose();
    this.telaCadastroFilme.setVisible(true);
        
        
    }//GEN-LAST:event_FecharJanela

    private void jButtonConsultarFilme(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarFilme
            String nome = jTextFieldTituloFilme.getText();
            DefaultTableModel modeloTabela = (DefaultTableModel) jTableConsultaFilme.getModel();
            modeloTabela.setRowCount(0);
            FilmeController filmeController = new FilmeController();
            try {
                ArrayList<Filme> filmes = filmeController.ListarFilmes(nome);
                filmes.forEach((Filme filme) -> {
                   modeloTabela.addRow(new Object[] {filme.getCodFilme(),
                                                     filme.getTitulo(),
                                                     filme.getGenero(),
                                                     filme.getSinopse(),
                                                     filme.getDuracao()});
                 });
                jTableConsultaFilme.setModel(modeloTabela);
                
                
        } catch (ExceptionDAO e) {
            Logger.getLogger(TelaCadastroFilme.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButtonConsultarFilme

    private void jTableConsultaFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaFilmeMouseClicked
      if(evt.getClickCount() == 2){
          Integer codFilme = (Integer) jTableConsultaFilme.getModel().getValueAt(jTableConsultaFilme.getSelectedRow(), 0);
          String titulo = (String) jTableConsultaFilme.getModel().getValueAt(jTableConsultaFilme.getSelectedRow(), 1);
          String genero = (String) jTableConsultaFilme.getModel().getValueAt(jTableConsultaFilme.getSelectedRow(), 2);
          String sinopse = (String) jTableConsultaFilme.getModel().getValueAt(jTableConsultaFilme.getSelectedRow(), 3);
          Integer duracao = (Integer) jTableConsultaFilme.getModel().getValueAt(jTableConsultaFilme.getSelectedRow(), 4);
        
        this.telaCadastroFilme.buscarFilme(codFilme, titulo, genero, sinopse, duracao);
        this.telaCadastroFilme.setVisible(true);
        this.dispose();
      }
        
       
    }//GEN-LAST:event_jTableConsultaFilmeMouseClicked

    
    public static void main(String args[]) {
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultaFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarFilme;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTituloFilme;
    private javax.swing.JPanel jPainelConsultaFilme;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableConsultaFilme;
    private javax.swing.JTextField jTextFieldTituloFilme;
    // End of variables declaration//GEN-END:variables

}
