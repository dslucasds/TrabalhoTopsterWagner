/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.SisAgenda;

import br.SisAgenda.dao.Dao;
import br.SisAgenda.modelo.Colaborador;
import com.sun.org.apache.bcel.internal.generic.CPInstruction;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class PainelCadastColab extends javax.swing.JPanel {

    /**
     * Creates new form PainelColab
     */
    public PainelCadastColab() {
        initComponents();
        ComboBoxTipoColab.addItem("Administrador");
        ComboBoxTipoColab.addItem("Usuário");
        
        jNomeColab.setText("");
        jEndColab.setText("");
        jBairroColab.setText("");
        jEmailColab.setText("");
        jLoginColab.setText("");
        jSenhaColab.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jButtonCadast = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jIdentEqp = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Cadastro Colaborador");

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
        jLabel8.setText("Cadastrar Login");

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

        jButtonCadast.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadast.setText("Cadastrar");
        jButtonCadast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastActionPerformed(evt);
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
        jIdentEqp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIdentEqpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLoginColab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSenhaColab, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jButtonCadast))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jIdentEqp))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jEmailColab))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jBairroColab))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jEndColab))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ComboBoxTipoColab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jNomeColab))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBoxTipoColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNomeColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jEndColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jBairroColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jEmailColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jIdentEqp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLoginColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSenhaColab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonCadast)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jNomeColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNomeColabActionPerformed

    private void ComboBoxTipoColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxTipoColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxTipoColabActionPerformed

    private void jSenhaColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenhaColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSenhaColabActionPerformed

    private void jLoginColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginColabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginColabActionPerformed

    private void jButtonCadastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastActionPerformed
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
        
         Dao dao = new Dao();
        try {
            dao.inserir(Col);
            javax.swing.JOptionPane.showMessageDialog(null, "Colaborador inserido com sucesso !");
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(null, "Falha ao inserir um colaborador !");
            Logger.getLogger(PainelCadastEquipe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCadastActionPerformed

    private void jIdentEqpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIdentEqpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jIdentEqpActionPerformed

    private void jIdentEqpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jIdentEqpMouseClicked
        jIdentEqp.setText("");
    }//GEN-LAST:event_jIdentEqpMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxTipoColab;
    private javax.swing.JTextField jBairroColab;
    private javax.swing.JButton jButtonCadast;
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
    // End of variables declaration//GEN-END:variables
}
