package interfacegrafica;

import javax.swing.JOptionPane;
import java.util.Iterator;
import classededados.Aluno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import persistencia.*;
//import persistencia.OrdenarPorNome;
//import persistencia.OrdenarPorCursoENome;

public class Janela extends javax.swing.JFrame {

    public Janela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton5 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGridAlunos = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();

        jToggleButton5.setText("jToggleButton5");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setText("Nome");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTableGridAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "curso", "situacao", "enfase"
            }
        ));
        jScrollPane1.setViewportView(jTableGridAlunos);

        jToggleButton2.setText("Curso e nome");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jToggleButton3.setText("Situacao e nome");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        jToggleButton4.setText("Situacao, curso e nome");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton6.setText("Enfase, curso e nome");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton7.setText("Curso, enfase e nome");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });

        jToggleButton8.setText("Enfase e nome");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton10.setText("Sobrenome");
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton10))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void imprimirNaGrid(ArrayList<Aluno> dados){
        try{
            DefaultTableModel model =  (DefaultTableModel) jTableGridAlunos.getModel();
            model.setNumRows(0);
            int pos = 0;
            while(pos < dados.size()){
                String[] linha = new String[4];
                Aluno obj = dados.get(pos);
                linha[0]= obj.getNome();
                linha[1]= obj.getCurso();
                linha[2]= obj.getSituacao();
                linha[3]= obj.getEnfase();
                model.addRow(linha);
                pos++;
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try{
            
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorNome objeto = new OrdenarPorNome(nome);
            imprimirNaGrid(objeto.listagemDeAlunosNome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        try{
            String curso = "./src/dados/RelatorioDasEnfases.csv";
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorCursoENome objeto = new OrdenarPorCursoENome(curso, nome);
            imprimirNaGrid(objeto.listagemDeAlunosCursoENome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        try{
            String situacao = "./src/dados/RelatorioDasEnfases.csv";
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorSituacaoENome objeto = new OrdenarPorSituacaoENome(situacao, nome);
            imprimirNaGrid(objeto.listagemDeAlunosSituacaoENome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        try{
            String situacao = "./src/dados/RelatorioDasEnfases.csv";
            String curso = "./src/dados/RelatorioDasEnfases.csv";
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorSituacaoCursoENome objeto = new OrdenarPorSituacaoCursoENome(situacao, curso, nome);
            imprimirNaGrid(objeto.listagemDeAlunosSituacaoCursoENome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        try{
            String enfase = "./src/dados/RelatorioDasEnfases.csv";
            String curso = "./src/dados/RelatorioDasEnfases.csv";
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorEnfaseCursoENome objeto = new OrdenarPorEnfaseCursoENome(enfase, curso, nome);
            imprimirNaGrid(objeto.listagemDeAlunosEnfaseCursoENome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
                try{
            String curso = "./src/dados/RelatorioDasEnfases.csv";
            String enfase = "./src/dados/RelatorioDasEnfases.csv";
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorCursoEnfaseENome objeto = new OrdenarPorCursoEnfaseENome(curso, enfase, nome);
            imprimirNaGrid(objeto.listagemDeAlunosCursoEnfaseENome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        try{
            String enfase = "./src/dados/RelatorioDasEnfases.csv";
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorEnfaseENome objeto = new OrdenarPorEnfaseENome(enfase, nome);
            imprimirNaGrid(objeto.listagemDeAlunosEnfaseENome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
/*        try{
            String enfase = "./src/dados/RelatorioDasEnfases.csv";
            String nome = "./src/dados/RelatorioDasEnfases.csv";
            OrdenarPorSobrenome objeto = new OrdenarPorSobrenome(nome);
            imprimirNaGrid(objeto.listagemDeAlunosSobrenome());
        }catch(Exception erro){
            JOptionPane.showMessageDialog(rootPane, erro);
       }*/
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGridAlunos;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
