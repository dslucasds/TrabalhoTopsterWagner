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

    public ListagemTarefaEquip() {
        initComponents();

        this.add(painelListagemTarefaEqp, "painelListagemTarefaEqp");
        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagemTarefaEqp");

        //ainda nao tem essa função
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
                        t.getDesAge(), t.getDataCri(), t.getDataEnt(),});
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
        btnEditar = new javax.swing.JButton();
        lblTituloAdicionarTarefa = new javax.swing.JLabel();
        cpTitulo = new javax.swing.JTextField();
        cpDescricao = new javax.swing.JTextField();
        cpDataEntrega = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        cpTipoId = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        TblTarefEqp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Equipe", "Titulo", "Descrição", "Data Inicial", "Data de Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
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

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        javax.swing.GroupLayout painelEdiçãoAgendaEquipLayout = new javax.swing.GroupLayout(painelEdiçãoAgendaEquip);
        painelEdiçãoAgendaEquip.setLayout(painelEdiçãoAgendaEquipLayout);
        painelEdiçãoAgendaEquipLayout.setHorizontalGroup(
            painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblTitulo)
                    .addComponent(lblDescricao))
                .addContainerGap(320, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addComponent(lblDataFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloAdicionarTarefa)
                    .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(117, 117, 117))
        );
        painelEdiçãoAgendaEquipLayout.setVerticalGroup(
            painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdiçãoAgendaEquipLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAdicionarTarefa)
                .addGap(8, 8, 8)
                .addGroup(painelEdiçãoAgendaEquipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(painelEdiçãoAgendaEquip, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Tarefa tr = new Tarefa();
        //String QualTipoTarefa = jComboBoxAddPara.getSelectedItem().toString();

        tr.setTitAge(cpTitulo.getText());
        tr.setDesAge(cpDescricao.getText());

            int ide = Integer.parseInt(cpTipoId.getText());
            tr.setEquipe(ide);
            int idec = 0;
            tr.setColab(idec);
       

        tr.setDataEnt(cpDataEntrega.getText());
        tr.setTitAge(cpTitulo.getText());
        tr.setDesAge(cpDescricao.getText());

        Dao dao = new Dao();
        try {
            dao.inserir(tr);
            javax.swing.JOptionPane.showMessageDialog(null, "tarefa Alternada com sucesso !");
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Falha ao Alterar uma Tarefa !");
            Logger.getLogger(PainelCadastEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cpTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpTituloActionPerformed

    private void cpDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataEntregaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblTarefEqp;
    private javax.swing.JButton btnEditar;
    private javax.swing.JFormattedTextField cpDataEntrega;
    private javax.swing.JTextField cpDescricao;
    private javax.swing.JTextField cpTipoId;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAdicionarTarefa;
    private javax.swing.JPanel painelEdiçãoAgendaEquip;
    private javax.swing.JPanel painelListagemTarefaEqp;
    // End of variables declaration//GEN-END:variables
}
