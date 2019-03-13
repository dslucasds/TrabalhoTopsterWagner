package br.SisAgenda;

import java.awt.CardLayout;

public class PainelListagemColab extends javax.swing.JPanel {

    private CardLayout cl;
    //private int codigoCliente;
    private int CodColab;
    
    public PainelListagemColab() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PListagemColab = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tipo", "Nome", "Endereço", "Bairro", "E-Mail", "Login", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        PListagemColab.setViewportView(jTable1);

        add(PListagemColab, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PListagemColab;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
