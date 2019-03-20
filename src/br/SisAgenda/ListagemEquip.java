/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.SisAgenda;

import br.SisAgenda.dao.Dao;
import br.SisAgenda.modelo.Equipe;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListagemEquip extends javax.swing.JPanel {
    
    private CardLayout cl;
    private int id;
   
    public ListagemEquip() {
        initComponents();
        
        this.add(painelListagem, "painelListagem");
        this.add(painelEdicao, "painelEdicao");
        
        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagem");
        
        
    }
    
        private void popularTabela() {
        Dao eqp = new Dao();
        List<Equipe> listaEquipe;

        try {
            listaEquipe = eqp.listarEquipe();

            DefaultTableModel model = (DefaultTableModel) tblEquipe.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaEquipe.size(); i++) {
                Equipe e = listaEquipe.get(i);
                lista.add(new Object[]{e.getIdEqp(),e.getNomEqp(),
                    e.getDesEqp()});
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter os clientes do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemEquip.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        
    private void limparTabela() {
        ((DefaultTableModel) tblEquipe.getModel()).setNumRows(0);
        tblEquipe.updateUI();
    }
    
    
        
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipe = new javax.swing.JTable();
        painelEdicao = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cpNomEquipe = new javax.swing.JTextField();
        cpDesEquipe = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        painelListagem.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painelListagemComponentShown(evt);
            }
        });

        tblEquipe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID da equipe", "Nome da equipe", "Descrição da equipe"
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
        tblEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquipeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipe);

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(painelListagem, "card3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("EDITAR EQUIPE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nome da equipe:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Descrição equipe:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar cadastro");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(btnApagar)
                                .addGap(30, 30, 30))
                            .addComponent(cpNomEquipe)
                            .addComponent(cpDesEquipe)))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cpNomEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDesEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnApagar))
                .addGap(37, 37, 37))
        );

        add(painelEdicao, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Equipe eqp = new Equipe();
       
       
        eqp.setNomEqp(cpNomEquipe.getText());
        eqp.setDesEqp(cpDesEquipe.getText());
        eqp.setIdEqp(this.id);
        
        //Inseri o cliente no banco de dados
        Dao dao = new Dao();
        try {
            dao.alterar(eqp);
            JOptionPane.showMessageDialog(null, "Equipe inserida com sucesso !");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao inserir equipe !");
            Logger.getLogger(PainelCadastEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void painelListagemComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelListagemComponentShown
        this.popularTabela();
    }//GEN-LAST:event_painelListagemComponentShown

    private void preencherFormulario(int codigoEquipe) {
        Dao dao = new Dao();

        try {
            Equipe equipe = dao.getEquipe(codigoEquipe);
            cpNomEquipe.setText(equipe.getNomEqp());
            cpDesEquipe.setText(equipe.getDesEqp());
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao obter equipes");
            Logger.getLogger(ListagemEquip.class.getName()).log(Level.SEVERE, TOOL_TIP_TEXT_KEY);
        }

        this.id = codigoEquipe;
    }
    
    
    
    private void tblEquipeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquipeMouseClicked
         int linha = tblEquipe.getSelectedRow();

        if (linha != -1) {
            String codigo = tblEquipe.getValueAt(linha, 0).toString();
            int codigoEquipe = Integer.parseInt(codigo);
            this.preencherFormulario(codigoEquipe);
            this.add(painelListagem, "painelListagem");
            this.cl.show(this, "painelEdicao");

        }

    }//GEN-LAST:event_tblEquipeMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja realmente eliminar esta equipe ?", "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (opcaoSelecionada == 0) {
            Dao dao = new Dao();

            try {
                dao.eliminar(this.id);
                this.limparTabela();
                
                this.cl.show(this, "painelListagem");
            } catch (SQLException ex) {
                Logger.getLogger(ListagemEquip.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnApagarActionPerformed
    
        
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField cpDesEquipe;
    private javax.swing.JTextField cpNomEquipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JTable tblEquipe;
    // End of variables declaration//GEN-END:variables
}
