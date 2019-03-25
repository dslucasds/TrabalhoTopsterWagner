package br.SisAgenda;

import br.SisAgenda.dao.Dao;
import br.SisAgenda.modelo.Equipe;
import br.SisAgenda.modelo.Tarefa;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListagemTarefaColab extends javax.swing.JPanel {

    private CardLayout cl;
    private int id;
    private Tarefa tarefaGlobal;

    public ListagemTarefaColab() {
         initComponents();

        this.add(painelListagemTarefaColab, "painelListagemTarefa");
        this.add(painelEdiçãoAgendaColab, "painelEdiçaoTarefColab");

        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagemTarefa");

       
    }

    private void popularTabelaTarefa() {
        Dao trf = new Dao();
        List<Tarefa> listaTarefa;

        try {
            listaTarefa = trf.listarTarefa();

            DefaultTableModel model = (DefaultTableModel) tblTarefa.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaTarefa.size(); i++) {
                Tarefa t = listaTarefa.get(i);
                if (t.getEquipe() == 0) {
                    lista.add(new Object[]{t.getColab(), t.getTitAge(),
                        t.getDesAge(), t.getDataCri(), t.getDataEnt(), t.getEquipe()});
                }
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter as tarefas do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemTarefaColab.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void limparTabelaTarefa() {
        ((DefaultTableModel) tblTarefa.getModel()).setNumRows(0);
        tblTarefa.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagemTarefaColab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarefa = new javax.swing.JTable();
        painelEdiçãoAgendaColab = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblDataFinal = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblTituloAdicionarTarefa = new javax.swing.JLabel();
        cpTitulo = new javax.swing.JTextField();
        cpDescricao = new javax.swing.JTextField();
        cpDataEntrega = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        cpTipoId = new javax.swing.JTextField();
        ApagarBtn = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        painelListagemTarefaColab.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                painelListagemTarefaColabComponentShown(evt);
            }
        });

        tblTarefa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Colaborador", "Título", "Descrição", "Data Inicial", "Data de Entrega", "Id Equipe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTarefaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTarefa);

        javax.swing.GroupLayout painelListagemTarefaColabLayout = new javax.swing.GroupLayout(painelListagemTarefaColab);
        painelListagemTarefaColab.setLayout(painelListagemTarefaColabLayout);
        painelListagemTarefaColabLayout.setHorizontalGroup(
            painelListagemTarefaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
            .addGroup(painelListagemTarefaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
        );
        painelListagemTarefaColabLayout.setVerticalGroup(
            painelListagemTarefaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
            .addGroup(painelListagemTarefaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );

        add(painelListagemTarefaColab, "card2");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Título:");

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblDataFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataFinal.setText("Nova Data de Entrega:");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblTituloAdicionarTarefa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloAdicionarTarefa.setText("EDITAR TAREFAS COLABORADORES");

        cpTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpTituloActionPerformed(evt);
            }
        });

        try {
            cpDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDataEntregaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        ApagarBtn.setText("APAGAR");
        ApagarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdiçãoAgendaColabLayout = new javax.swing.GroupLayout(painelEdiçãoAgendaColab);
        painelEdiçãoAgendaColab.setLayout(painelEdiçãoAgendaColabLayout);
        painelEdiçãoAgendaColabLayout.setHorizontalGroup(
            painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdiçãoAgendaColabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloAdicionarTarefa)
                .addGap(119, 119, 119))
            .addGroup(painelEdiçãoAgendaColabLayout.createSequentialGroup()
                .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdiçãoAgendaColabLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(jLabel2)
                            .addComponent(lblTitulo)))
                    .addComponent(lblDataFinal))
                .addGap(32, 32, 32)
                .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelEdiçãoAgendaColabLayout.createSequentialGroup()
                        .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelEdiçãoAgendaColabLayout.createSequentialGroup()
                                .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(painelEdiçãoAgendaColabLayout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(ApagarBtn)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        painelEdiçãoAgendaColabLayout.setVerticalGroup(
            painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdiçãoAgendaColabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAdicionarTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cpTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataFinal)
                    .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(painelEdiçãoAgendaColabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ApagarBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        add(painelEdiçãoAgendaColab, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String QualTipoTarefa = "Colaborador";

        this.tarefaGlobal.setTitAge(cpTitulo.getText());
        this.tarefaGlobal.setDesAge(cpDescricao.getText());
        
        //this.tarefaGlobal.setDataEnt(cpDataEntrega.getText());
        
        //provavelmente tenho q mudar o dao do inserir pq nao ocorre nenhuma mudança na data de criaçao
        //somente na de entrega
        Dao dao = new Dao();
        try {
            dao.alterarTarefaColaborador(this.tarefaGlobal);
            javax.swing.JOptionPane.showMessageDialog(null, "Tarefa alterada com sucesso !");
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Falha ao alterar uma Tarefa !");
            Logger.getLogger(PainelCadastEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void preencherFormulario(Tarefa tarefa) {
        cpTitulo.setText(tarefa.getTitAge());
        cpDescricao.setText(tarefa.getDesAge());
        cpDataEntrega.setText(tarefa.getDataEnt());
        this.tarefaGlobal = tarefa;
    }

    private void cpTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpTituloActionPerformed

    private void cpDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataEntregaActionPerformed

    private void ApagarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarBtnActionPerformed
        Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja realmente eliminar esta tarefa ?", "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (opcaoSelecionada == 0) {
            Dao dao = new Dao();

            try {
                dao.eliminarTarefaColaborador(this.tarefaGlobal);
                this.limparTabelaTarefa();

                this.cl.show(this, "painelListagemTarefaColab");
            } catch (SQLException ex) {
                Logger.getLogger(ListagemTarefaColab.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_ApagarBtnActionPerformed

    /**/
    private void tblTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTarefaMouseClicked
        int linha = tblTarefa.getSelectedRow();

        if (linha != -1) {
            String idColaborador = tblTarefa.getValueAt(linha, 0).toString();
            String idEquipe = tblTarefa.getValueAt(linha, 5).toString();

            int idColaboradorInt = Integer.parseInt(idColaborador);
            int idEquipeInt = Integer.parseInt(idEquipe);

            Tarefa trf = new Tarefa();
            trf.setColab(idColaboradorInt);
            trf.setTitAge(tblTarefa.getValueAt(linha, 1).toString());
            trf.setDesAge(tblTarefa.getValueAt(linha, 2).toString());
            trf.setDataCri(tblTarefa.getValueAt(linha, 3).toString());
            trf.setDataEnt(tblTarefa.getValueAt(linha, 4).toString());
            trf.setEquipe(idEquipeInt);

            this.preencherFormulario(trf);
            this.add(painelListagemTarefaColab, "painelListagemTarefa");
            this.cl.show(this, "painelEdiçaoTarefColab");
        }
    }//GEN-LAST:event_tblTarefaMouseClicked

    private void painelListagemTarefaColabComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_painelListagemTarefaColabComponentShown
        this.popularTabelaTarefa();
    }//GEN-LAST:event_painelListagemTarefaColabComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApagarBtn;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField cpDataEntrega;
    private javax.swing.JTextField cpDescricao;
    private javax.swing.JTextField cpTipoId;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAdicionarTarefa;
    private javax.swing.JPanel painelEdiçãoAgendaColab;
    private javax.swing.JPanel painelListagemTarefaColab;
    private javax.swing.JTable tblTarefa;
    // End of variables declaration//GEN-END:variables
}
