package classes;

import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    
    //Atributos
    CozinhaSingleton pedidos = CozinhaSingleton.getCozinhaSingleton();    
    
    public TelaPrincipal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAtendente1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAtendente2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAtendente3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAtendente4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonAtendente1 = new javax.swing.JButton();
        jButtonAtendente2 = new javax.swing.JButton();
        jButtonAtendente3 = new javax.swing.JButton();
        jButtonAtendente4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Controlador de pedidos para Restaurante");

        jLabel2.setText("Atendente 1:");

        jLabel3.setText("Atendente 2:");

        jLabel4.setText("Atendente 3:");

        jTextFieldAtendente3.setMinimumSize(new java.awt.Dimension(69, 22));

        jLabel5.setText("Atendente 4:");

        jLabel6.setText("Fila de Pedidos na Cozinha: ");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonAtendente1.setText("Salvar");
        jButtonAtendente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtendente1ActionPerformed(evt);
            }
        });

        jButtonAtendente2.setText("Salvar");
        jButtonAtendente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtendente2ActionPerformed(evt);
            }
        });

        jButtonAtendente3.setText("Salvar");
        jButtonAtendente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtendente3ActionPerformed(evt);
            }
        });

        jButtonAtendente4.setText("Salvar");
        jButtonAtendente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtendente4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAtendente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAtendente1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAtendente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAtendente2))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAtendente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldAtendente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldAtendente4)
                            .addComponent(jButtonAtendente4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1))))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAtendente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldAtendente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAtendente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAtendente4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtendente1)
                    .addComponent(jButtonAtendente2)
                    .addComponent(jButtonAtendente3)
                    .addComponent(jButtonAtendente4))
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtendente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtendente1ActionPerformed
        // TODO add your handling code here:
        try {
            Atendente atendente1 = new Atendente (Integer.parseInt(jTextFieldAtendente1.getText()), pedidos);
            atendente1.setMostrarPedidos(jTextFieldAtendente1.getText()+" - Atendente 1");
            jTextArea1.append(atendente1.getMostrarPedidos());
            jTextFieldAtendente1.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Insira o número do pedido.");
        }        
    }//GEN-LAST:event_jButtonAtendente1ActionPerformed

    private void jButtonAtendente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtendente2ActionPerformed
        // TODO add your handling code here:
        try {
            Atendente atendente2 = new Atendente (Integer.parseInt(jTextFieldAtendente2.getText()), pedidos);
            atendente2.setMostrarPedidos(jTextFieldAtendente2.getText()+" - Atendente 2");
            jTextArea1.append(atendente2.getMostrarPedidos());
            jTextFieldAtendente2.setText("");
        } catch (Exception e) {            
            JOptionPane.showMessageDialog(this, "Insira o número do pedido.");
        }
        
    }//GEN-LAST:event_jButtonAtendente2ActionPerformed

    private void jButtonAtendente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtendente3ActionPerformed
        // TODO add your handling code here:
        try {
            Atendente atendente3 = new Atendente (Integer.parseInt(jTextFieldAtendente3.getText()), pedidos);
            atendente3.setMostrarPedidos(jTextFieldAtendente3.getText() + " - Atendente 3");
            jTextArea1.append(atendente3.getMostrarPedidos());
            jTextFieldAtendente3.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Insira o número do pedido.");
        }
        
    }//GEN-LAST:event_jButtonAtendente3ActionPerformed

    private void jButtonAtendente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtendente4ActionPerformed
        // TODO add your handling code here:
        try {
            Atendente atendente4 = new Atendente (Integer.parseInt(jTextFieldAtendente4.getText()), pedidos);
            atendente4.setMostrarPedidos(jTextFieldAtendente4.getText()+ " - Atendente 4");
            jTextArea1.append(atendente4.getMostrarPedidos());
            jTextFieldAtendente4.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Insira o número do pedido.");
        }
        
    }//GEN-LAST:event_jButtonAtendente4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtendente1;
    private javax.swing.JButton jButtonAtendente2;
    private javax.swing.JButton jButtonAtendente3;
    private javax.swing.JButton jButtonAtendente4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAtendente1;
    private javax.swing.JTextField jTextFieldAtendente2;
    private javax.swing.JTextField jTextFieldAtendente3;
    private javax.swing.JTextField jTextFieldAtendente4;
    // End of variables declaration//GEN-END:variables
}
