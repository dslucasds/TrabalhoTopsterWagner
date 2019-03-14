/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.SisAgenda;

import br.SisAgenda.modelo.Tarefa;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PainelCadastTarefa extends javax.swing.JPanel {

    /**
     * Creates new form PainelCadastTarefa
     */
    public PainelCadastTarefa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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

        try {
            cpDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/#### ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDataFinal)
                            .addComponent(lblDataInicial))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cpDataInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(cpDataEntrega))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescricao)
                            .addComponent(lblTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpTitulo)
                            .addComponent(cpDescricao))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblTituloAdicionarTarefa)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAdicionarTarefa)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(cpTitulo))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(cpDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataInicial)
                    .addComponent(cpDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataFinal)
                    .addComponent(cpDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Tarefa tr = new Tarefa();
        
        tr.setTitAge(cpTitulo.getText());
        tr.setDesAge(cpDescricao.getText());
        
        String dataCri = cpDataInicial.getText();
        dataCri = dataCri.replaceAll("/" , "");
        dataCri = dataCri.replaceAll(":" , "");
        System.out.println(dataCri);
        String dataEnt = cpDataEntrega.getText();
        dataEnt = dataEnt.replaceAll("/" , "");
        dataEnt = dataEnt.replaceAll(":" , "");
        System.out.println(dataEnt);
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField cpDataEntrega;
    private javax.swing.JFormattedTextField cpDataInicial;
    private javax.swing.JTextField cpDescricao;
    private javax.swing.JTextField cpTitulo;
    private javax.swing.JLabel lblDataFinal;
    private javax.swing.JLabel lblDataInicial;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloAdicionarTarefa;
    // End of variables declaration//GEN-END:variables
}
