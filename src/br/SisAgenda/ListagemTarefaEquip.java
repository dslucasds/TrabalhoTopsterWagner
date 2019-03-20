package br.SisAgenda;

import java.awt.CardLayout;


public class ListagemTarefaEquip extends javax.swing.JPanel {
    
    private CardLayout cl;
    private int id;
    
    public ListagemTarefaEquip() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagemTarefaEqp = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Equipe", "Titulo", "Descrição", "Data de Criação", "Data de Entrega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

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
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel painelListagemTarefaEqp;
    // End of variables declaration//GEN-END:variables
}
