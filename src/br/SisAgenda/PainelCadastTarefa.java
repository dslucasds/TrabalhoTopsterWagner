package br.SisAgenda;

import br.SisAgenda.dao.Dao;
import br.SisAgenda.modelo.Tarefa;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PainelCadastTarefa extends javax.swing.JPanel {

    public PainelCadastTarefa() {
        initComponents();

        jComboBoxAddPara.addItem("Colaborador");
        jComboBoxAddPara.addItem("Equipe");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblDataInicial = new javax.swing.JLabel();
        lblDataFinal = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lblTituloAdicionarTarefa = new javax.swing.JLabel();
        cpTitulo = new javax.swing.JTextField();
        cpDescricao = new javax.swing.JTextField();
        cpDataInicial = new javax.swing.JFormattedTextField();
        cpDataEntrega = new javax.swing.JFormattedTextField();
        jComboBoxAddPara = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpTipoId = new javax.swing.JTextField();

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTitulo.setText("Título:");

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescricao.setText("Descrição:");

        lblDataInicial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataInicial.setText("Data Inicial:");

        lblDataFinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDataFinal.setText("Data Entrega:");

        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblTituloAdicionarTarefa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTituloAdicionarTarefa.setText("ADICIONAR TAREFA");

        cpTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpTituloActionPerformed(evt);
            }
        });

        try {
            cpDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####/##/## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpDataInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpDataInicialActionPerformed(evt);
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

        jComboBoxAddPara.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione"}));
        jComboBoxAddPara.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxAddParaItemStateChanged(evt);
            }
        });
        jComboBoxAddPara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAddParaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Adicionar Para:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDataFinal)
                                    .addComponent(lblDataInicial))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvar))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)
                                .addComponent(jComboBoxAddPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblTitulo)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblTituloAdicionarTarefa)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAdicionarTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAddPara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(cpTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDataFinal)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar)))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Tarefa tr = new Tarefa();
        String QualTipoTarefa = jComboBoxAddPara.getSelectedItem().toString();
       
        tr.setTitAge(cpTitulo.getText());
        tr.setDesAge(cpDescricao.getText());

        //inserçao de dados pro Sql
        if (QualTipoTarefa.equals("Equipe")) {
            int ide = Integer.parseInt(cpTipoId.getText());
            tr.setEquipe(ide);
            int idec = 0;
            tr.setColab(idec);
        } else if (QualTipoTarefa.equals("Colaborador")) {
            int idce = 0;
            tr.setEquipe(idce);
            int idc = Integer.parseInt(cpTipoId.getText());
            tr.setColab(idc);
        }
        tr.setDataCri(cpDataInicial.getText());
        tr.setDataEnt(cpDataEntrega.getText());
        tr.setTitAge(cpTitulo.getText());
        tr.setDesAge(cpDescricao.getText());
        
        Dao dao = new Dao();
        try {
            dao.inserir(tr);
            javax.swing.JOptionPane.showMessageDialog(null, "tarefa inserida com sucesso !");
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Falha ao inserir uma Tarefa !");
            Logger.getLogger(PainelCadastTarefa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cpDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataEntregaActionPerformed

    private void cpTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpTituloActionPerformed

    private void jComboBoxAddParaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAddParaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAddParaActionPerformed

    private void jComboBoxAddParaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxAddParaItemStateChanged
        String QualTipoTarefa = jComboBoxAddPara.getSelectedItem().toString();
        if (QualTipoTarefa.equals("Colaborador")) {
            System.out.println(QualTipoTarefa);
        } else if (QualTipoTarefa.equals("Equipe")) {
            System.out.println(QualTipoTarefa);
        }
    }//GEN-LAST:event_jComboBoxAddParaItemStateChanged

    private void cpDataInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpDataInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpDataInicialActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField cpDataEntrega;
    private javax.swing.JFormattedTextField cpDataInicial;
    private javax.swing.JTextField cpDescricao;
    private javax.swing.JTextField cpTipoId;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JComboBox<String> jComboBoxAddPara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAdicionarTarefa;
    // End of variables declaration//GEN-END:variables
}
