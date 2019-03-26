package br.SisAgenda;

import br.SisAgenda.dao.Dao;
import br.SisAgenda.modelo.Tarefa;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ListagemTarefaEquip extends javax.swing.JPanel {

    private CardLayout cl;
    private int id;
     private Tarefa tarefaGlobal;

    public ListagemTarefaEquip() {
        initComponents();

        this.add(painelListagemTarefaEqp, "painelListagemTarefaEqp");
        this.add(painelEdiçãoAgendaEquip, "painelEdiçãoAgendaEquip");
        
        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagemTarefaEqp");
        
        this.popularTabelaTarefa();
       
    }

    private void popularTabelaTarefa() {
        Dao trf = new Dao();
        List<Tarefa> listaTarefa;

        try {
            listaTarefa = trf.listarTarefa();

            DefaultTableModel model = (DefaultTableModel) TblTarefEqp.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaTarefa.size(); i++) {
                Tarefa t = listaTarefa.get(i);
                if (t.getColab() == 0) {
                    lista.add(new Object[]{t.getEquipe(), t.getTitAge(),
                        t.getDesAge(), t.getDataCri(), t.getDataEnt(),t.getColab()});
                }
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter as tarefas das equipes do banco de dados!";
            javax.swing.JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemTarefaEquip.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
         private void limparTabelaTarefa() {
        ((DefaultTableModel) TblTarefEqp.getModel()).setNumRows(0);
        TblTarefEqp.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagemTarefaEqp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TblTarefEqp = new javax.swing.JTable();
        painelEdiçãoAgendaEquip = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblDataFinal = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblTituloAdicionarTarefa = new javax.swing.JLabel();
        cpTitulo = new javax.swing.JTextField();
        cpDescricao = new javax.swing.JTextField();
        cpDataEntrega = new javax.swing.JFormattedTextField();
        btnApagar = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        TblTarefEqp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Equipe", "Titulo", "Descrição", "Data Inicial", "Data de Entrega", "ID Colaborador"
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
        TblTarefEqp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblTarefEqpMouseClicked(evt);
            }
        });
        TblTarefEqp.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TblTarefEqpComponentShown(evt);
            }
        });
        jScrollPane2.setViewportView(TblTarefEqp);

        javax.swing.GroupLayout painelListagemTarefaEqpLayout = new javax.swing.GroupLayout(painelListagemTarefaEqp);
        painelListagemTarefaEqp.setLayout(painelListagemTarefaEqpLayout);
        painelListagemTarefaEqpLayout.setHorizontalGroup(
            painelListagemTarefaEqpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        painelListagemTarefaEqpLayout.setVerticalGroup(
            painelListagemTarefaEqpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        add(painelListagemTarefaEqp, "card3");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Título:");

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblDataFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataFinal.setText("Data Entrega:");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblTituloAdicionarTarefa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloAdicionarTarefa.setText("EDITAR TAREFAS DA EQUIPE");

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

        btnApagar.setText("APAGAR");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdiçãoAgendaEquipLayout = new javax.swing.GroupLayout(painelEdiçãoAgendaEquip);
        painelEdiçãoAgendaEquip.setLayout(painelEdiçãoAgendaEquipLayout);
        painelEdiçãoAgendaEquipLayout.setHorizontalGroup(
            painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDataFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                        .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(lblDescricao))
                        .addContainerGap(320, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnApagar)
                        .addGap(46, 46, 46))))
            .addGroup(painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(lblTituloAdicionarTarefa)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelEdiçãoAgendaEquipLayout.setVerticalGroup(
            painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAdicionarTarefa)
                .addGap(36, 36, 36)
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataFinal)
                    .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnApagar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        add(painelEdiçãoAgendaEquip, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String QualTipoTarefa = "Equipe";
        
        this.tarefaGlobal.setTitAge(cpTitulo.getText());
        this.tarefaGlobal.setDesAge(cpDescricao.getText());
        
        //this.tarefaGlobal.setDataEnt(cpDataEntrega.getText());
        
        //provavelmente tenho q mudar o dao do inserir pq nao ocorre nenhuma mudança na data de criaçao
        //somente na de entrega
        Dao dao = new Dao();
        try {
            dao.alterarTarefaEquipe(this.tarefaGlobal);
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

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = javax.swing.JOptionPane.showOptionDialog(null, "Deseja realmente eliminar esta tarefa ?", "Atenção!", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (opcaoSelecionada == 0) {
            Dao dao = new Dao();

            try {
                dao.eliminarTarefaEquipe(this.tarefaGlobal);
                this.limparTabelaTarefa();

                this.cl.show(this, "painelListagemTarefaEquip");
            } catch (SQLException ex) {
                Logger.getLogger(ListagemTarefaEquip.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnApagarActionPerformed

    private void TblTarefEqpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblTarefEqpMouseClicked
        
        
        
        int linha = TblTarefEqp.getSelectedRow();

        if (linha != -1) {
            String idColaborador = TblTarefEqp.getValueAt(linha, 5).toString();
            String idEquipe = TblTarefEqp.getValueAt(linha, 0).toString();

            int idColaboradorInt = Integer.parseInt(idColaborador);
            int idEquipeInt = Integer.parseInt(idEquipe);

            Tarefa trf = new Tarefa();
            trf.setEquipe(idEquipeInt);
            trf.setTitAge(TblTarefEqp.getValueAt(linha, 1).toString());
            trf.setDesAge(TblTarefEqp.getValueAt(linha, 2).toString());
            trf.setDataCri(TblTarefEqp.getValueAt(linha, 3).toString());
            trf.setDataEnt(TblTarefEqp.getValueAt(linha, 4).toString());
            trf.setColab(idColaboradorInt);

            this.preencherFormulario(trf);
            this.add(painelListagemTarefaEqp, "painelListagemTarefaEqp");
            this.cl.show(this, "painelEdiçãoAgendaEquip");
        }
    }//GEN-LAST:event_TblTarefEqpMouseClicked

    private void TblTarefEqpComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TblTarefEqpComponentShown
       this.popularTabelaTarefa();
    }//GEN-LAST:event_TblTarefEqpComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblTarefEqp;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField cpDataEntrega;
    private javax.swing.JTextField cpDescricao;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAdicionarTarefa;
    private javax.swing.JPanel painelEdiçãoAgendaEquip;
    private javax.swing.JPanel painelListagemTarefaEqp;
    // End of variables declaration//GEN-END:variables
}
