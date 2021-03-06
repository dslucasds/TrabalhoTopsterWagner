package br.SisAgenda;

import br.SisAgenda.dao.Dao;
import br.SisAgenda.modelo.Colaborador;
import br.SisAgenda.modelo.Equipe;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.table.DefaultTableModel;

public class PainelListagemColab extends javax.swing.JPanel {

    private CardLayout cl;
    //private int codigoCliente;
    private int CodColab;

    public PainelListagemColab() {
        initComponents();
        ComboBoxTipoColab.addItem("Administrador");
        ComboBoxTipoColab.addItem("Usuário");
       
        this.add(PainelListagem, "PainelListagem");
        this.add(PainelEdicaoListagem,"PainelEdicaoListagem");
        

        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "PainelListagem");
        
        this.popularTabelaColaborador();
       
    }

    private void popularTabelaColaborador() {
        Dao col = new Dao();
        List<Colaborador> listaColaborador;

        try {
            listaColaborador = col.listarColaborador();

            DefaultTableModel model = (DefaultTableModel) tblColab.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaColaborador.size(); i++) {
                Colaborador c = listaColaborador.get(i);
                lista.add(new Object[]{c.getIdDoColab(),
                    c.getTipoUsuario(), c.getNomeColaborador(), c.getEnderecoColaborador(),
                    c.getBairroColaborador(), c.getEmailColaborador(),
                    c.getLoginColaborador(), c.getSenhaColaborador()});
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter o colaborador do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(PainelListagemColab.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void limparTabelaColaborador() {
        ((DefaultTableModel) tblColab.getModel()).setNumRows(0);
        tblColab.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelListagem = new javax.swing.JPanel();
        PListagemColab = new javax.swing.JScrollPane();
        tblColab = new javax.swing.JTable();
        PainelEdicaoListagem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNomeColab = new javax.swing.JTextField();
        ComboBoxTipoColab = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jEndColab = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBairroColab = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jEmailColab = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLoginColab = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSenhaColab = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jIdentEqp = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        PListagemColab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PListagemColabMouseClicked(evt);
            }
        });
        PListagemColab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PListagemColabComponentShown(evt);
            }
        });

        tblColab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Nome", "Endereço", "Bairro", "E-Mail", "Login", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblColab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColabMouseClicked(evt);
            }
        });
        PListagemColab.setViewportView(tblColab);

        javax.swing.GroupLayout PainelListagemLayout = new javax.swing.GroupLayout(PainelListagem);
        PainelListagem.setLayout(PainelListagemLayout);
        PainelListagemLayout.setHorizontalGroup(
            PainelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PListagemColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PainelListagemLayout.setVerticalGroup(
            PainelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PListagemColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(PainelListagem, "card3");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Editar Colaborador");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tipo do Colaborador:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nome:");

        jNomeColab.setText("Nome do Colaborador");
        jNomeColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeColabActionPerformed(evt);
            }
        });

        ComboBoxTipoColab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo"}));
        ComboBoxTipoColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxTipoColabActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        jEndColab.setText("Endereço do colaborador");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Bairro:");

        jBairroColab.setText("Bairro Colaborador");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("E-Mail:");

        jEmailColab.setText("Email colab");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Editar Login");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Login:");

        jLoginColab.setText("Login Do Colab");
        jLoginColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginColabActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Senha:");

        jSenhaColab.setText("Senha do Colab");
        jSenhaColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSenhaColabActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ID da equipe:");

        jIdentEqp.setText("(Deixar 0 se não pertencer a nenhuma)");
        jIdentEqp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jIdentEqpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PainelEdicaoListagemLayout = new javax.swing.GroupLayout(PainelEdicaoListagem);
        PainelEdicaoListagem.setLayout(PainelEdicaoListagemLayout);
        PainelEdicaoListagemLayout.setHorizontalGroup(
            PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(PainelEdicaoListagemLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelEdicaoListagemLayout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jEmailColab))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelEdicaoListagemLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jBairroColab))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelEdicaoListagemLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jEndColab))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelEdicaoListagemLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboBoxTipoColab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelEdicaoListagemLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jNomeColab, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(PainelEdicaoListagemLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jIdentEqp)))
                .addGap(115, 115, 115))
            .addGroup(PainelEdicaoListagemLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelEdicaoListagemLayout.createSequentialGroup()
                        .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLoginColab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSenhaColab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8)
                    .addGroup(PainelEdicaoListagemLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btnSalvar)
                        .addGap(30, 30, 30)
                        .addComponent(btnApagar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelEdicaoListagemLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PainelEdicaoListagemLayout.setVerticalGroup(
            PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEdicaoListagemLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxTipoColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNomeColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jEndColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jBairroColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEmailColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jIdentEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLoginColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSenhaColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelEdicaoListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnApagar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        add(PainelEdicaoListagem, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeColabActionPerformed

    private void ComboBoxTipoColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTipoColabActionPerformed

    private void jLoginColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginColabActionPerformed

    private void jSenhaColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenhaColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSenhaColabActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String TipoCol = (String)ComboBoxTipoColab.getSelectedItem();
        Colaborador Col = new Colaborador();
        Col.setTipoUsuario(TipoCol);
        Col.setNomeColaborador(jNomeColab.getText());
        Col.setEnderecoColaborador(jEndColab.getText());
        Col.setBairroColaborador(jBairroColab.getText());
        Col.setEmailColaborador(jEmailColab.getText());
        Col.setLoginColaborador(jLoginColab.getText());
        Col.setSenhaColaborador(jSenhaColab.getText());
        Col.setCodEquipe(jIdentEqp.getText());
        Col.setIdDoColab(this.CodColab);

        Dao dao = new Dao();
        try {
            dao.alterar(Col);
            javax.swing.JOptionPane.showMessageDialog(null, "Colaborador atualizado com sucesso!");
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Falha ao atualizar o colaborador !");
            Logger.getLogger(PainelCadastColab.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void PListagemColabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PListagemColabComponentShown
        this.popularTabelaColaborador();
    }//GEN-LAST:event_PListagemColabComponentShown

     private void preencherFormulario(int codigoCol) {
        Dao dao = new Dao();

        try {
            Colaborador col = dao.getColaborador(codigoCol);
            jNomeColab.setText(col.getNomeColaborador());
            jEndColab.setText(col.getEnderecoColaborador());
            jBairroColab.setText(col.getBairroColaborador());
            jEmailColab.setText(col.getEmailColaborador());
            jLoginColab.setText(col.getLoginColaborador());
            jSenhaColab.setText(col.getSenhaColaborador());

        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "erro ao obter o colaborador");
            Logger.getLogger(PainelListagemColab.class.getName()).log(Level.SEVERE, TOOL_TIP_TEXT_KEY);
        }

        this.CodColab = codigoCol;
    }

    
    private void PListagemColabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PListagemColabMouseClicked

    }//GEN-LAST:event_PListagemColabMouseClicked

    private void tblColabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColabMouseClicked
         int linha = tblColab.getSelectedRow();
         
        if (linha != -1) {
            String codigo = tblColab.getValueAt(linha, 0).toString();
            int codigoColab = Integer.parseInt(codigo);
            this.preencherFormulario(codigoColab);
            this.CodColab = codigoColab;
            this.add(PainelListagem, "PainelListagem");
            this.cl.show(this, "PainelEdicaoListagem");

        }
    }//GEN-LAST:event_tblColabMouseClicked

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = javax.swing.JOptionPane.showOptionDialog(null, "Deseja realmente eliminar este colaborador ?", "Atenção!", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (opcaoSelecionada == 0) {
            Dao dao = new Dao();

            try {
                dao.eliminarColaborador(this.CodColab);
                this.limparTabelaColaborador();
                this.popularTabelaColaborador();
                
                this.cl.show(this, "PainelListagem");
            } catch (SQLException ex) {
                Logger.getLogger(PainelListagemColab.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void jIdentEqpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIdentEqpMouseClicked
        jIdentEqp.setText("");
    }//GEN-LAST:event_jIdentEqpMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipoColab;
    private javax.swing.JScrollPane PListagemColab;
    private javax.swing.JPanel PainelEdicaoListagem;
    private javax.swing.JPanel PainelListagem;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField jBairroColab;
    private javax.swing.JTextField jEmailColab;
    private javax.swing.JTextField jEndColab;
    private javax.swing.JTextField jIdentEqp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLoginColab;
    private javax.swing.JTextField jNomeColab;
    private javax.swing.JTextField jSenhaColab;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblColab;
    // End of variables declaration//GEN-END:variables

}
