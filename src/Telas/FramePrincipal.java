package Telas;

import br.SisAgenda.ListagemEquip;
import br.SisAgenda.ListagemTarefaColab;
import br.SisAgenda.ListagemTarefaEquip;
import br.SisAgenda.PainelCadastColab;
import br.SisAgenda.PainelCadastEquipe;
import br.SisAgenda.PainelCadastTarefa;
import br.SisAgenda.PainelListagemColab;
import java.awt.CardLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import javax.swing.JFrame;

public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();

        PainelCadastColab cadColab = new PainelCadastColab();
        PainelCadastEquipe cadEquipe = new PainelCadastEquipe();
        PainelCadastTarefa cadTaref = new PainelCadastTarefa();

        ListagemEquip lisEquip = new ListagemEquip();
        ListagemTarefaColab lisTaref = new ListagemTarefaColab();
        ListagemTarefaEquip lisTarefEqp = new ListagemTarefaEquip();

        //os paineis de cadastros
        painelPrincipal.add(cadColab, "PainelCadastColab");
        painelPrincipal.add(cadEquipe, "PainelCadastEquipe");
        painelPrincipal.add(cadTaref, "PainelCadastTarefa");

        //Paineis de Listagens
        painelPrincipal.add(lisEquip, "ListagemEquip");
        painelPrincipal.add(lisTaref, "ListagemTarefas");
        painelPrincipal.add(lisTarefEqp, "ListagemTarefasEqp");
        

        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "telaPadrao");

        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jJanelaColab = new javax.swing.JMenu();
        jMenuCadCol = new javax.swing.JMenuItem();
        jListarColab = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jCadastroEquipe = new javax.swing.JMenuItem();
        jListarEquipe = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jAddTarefa = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jAgendaColab = new javax.swing.JMenuItem();
        jAgendaEquipes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelPrincipal.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/SisAgenda/imgs/hqdefault.jpg"))); // NOI18N
        painelPrincipal.add(jLabel2, "card2");

        jJanelaColab.setText("Colaborador");

        jMenuCadCol.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuCadCol.setText("Cadastrar Colaborador");
        jMenuCadCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadColActionPerformed(evt);
            }
        });
        jJanelaColab.add(jMenuCadCol);

        jListarColab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jListarColab.setText("Listar Colaboradores");
        jListarColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarColabActionPerformed(evt);
            }
        });
        jJanelaColab.add(jListarColab);

        jMenuBar1.add(jJanelaColab);

        jMenu2.setText("Equipes");

        jCadastroEquipe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jCadastroEquipe.setText("Cadastrar Equipe");
        jCadastroEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastroEquipeActionPerformed(evt);
            }
        });
        jMenu2.add(jCadastroEquipe);

        jListarEquipe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jListarEquipe.setText("Listar Equipe");
        jListarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarEquipeActionPerformed(evt);
            }
        });
        jMenu2.add(jListarEquipe);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tarefas");

        jAddTarefa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jAddTarefa.setText("Adicionar Tarefas");
        jAddTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddTarefaActionPerformed(evt);
            }
        });
        jMenu3.add(jAddTarefa);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Agenda");

        jAgendaColab.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jAgendaColab.setText("Colaboradores");
        jAgendaColab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgendaColabActionPerformed(evt);
            }
        });
        jMenu1.add(jAgendaColab);

        jAgendaEquipes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jAgendaEquipes.setText("Equipes");
        jAgendaEquipes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgendaEquipesActionPerformed(evt);
            }
        });
        jMenu1.add(jAgendaEquipes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadColActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "PainelCadastColab");
    }//GEN-LAST:event_jMenuCadColActionPerformed

    private void jAgendaColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgendaColabActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "ListagemTarefas");
    }//GEN-LAST:event_jAgendaColabActionPerformed

    private void jAddTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddTarefaActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "PainelCadastTarefa");
    }//GEN-LAST:event_jAddTarefaActionPerformed

    private void jListarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarEquipeActionPerformed
        ListagemEquip lisEquip = new ListagemEquip();
        painelPrincipal.add(lisEquip, "ListagemEquip");

        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "ListagemEquip");
    }//GEN-LAST:event_jListarEquipeActionPerformed

    private void jCadastroEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastroEquipeActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "PainelCadastEquipe");
    }//GEN-LAST:event_jCadastroEquipeActionPerformed

    private void jListarColabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarColabActionPerformed
        PainelListagemColab LisColab = new PainelListagemColab();
        painelPrincipal.add(LisColab, "PainelListagemColaboradores");

        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "PainelListagemColaboradores");
    }//GEN-LAST:event_jListarColabActionPerformed

    private void jAgendaEquipesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgendaEquipesActionPerformed
        CardLayout cl = (CardLayout) painelPrincipal.getLayout();
        cl.show(painelPrincipal, "ListagemTarefasEqp");
    }//GEN-LAST:event_jAgendaEquipesActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAddTarefa;
    private javax.swing.JMenuItem jAgendaColab;
    private javax.swing.JMenuItem jAgendaEquipes;
    private javax.swing.JMenuItem jCadastroEquipe;
    private javax.swing.JMenu jJanelaColab;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jListarColab;
    private javax.swing.JMenuItem jListarEquipe;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadCol;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}
