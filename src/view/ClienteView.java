
package view;

import Controller.ClienteController;
import java.awt.Color;


public class ClienteView extends javax.swing.JFrame {

    ClienteController clienteController = new ClienteController();
    
    public ClienteView() {
        initComponents();
        getContentPane().setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ClienteBarraMenu = new javax.swing.JPanel();
        btnDeletarCliente_2 = new javax.swing.JButton();
        btnEditarCliente_2 = new javax.swing.JButton();
        btnFiltrarCliente = new javax.swing.JButton();
        btnPesquisarCliente_2 = new javax.swing.JButton();
        btnCadastrarCliente_2 = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        ClienteMenu = new javax.swing.JPanel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnPesquisarCliente = new javax.swing.JButton();
        btnDeletarCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(1024, 628));

        ClienteBarraMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnDeletarCliente_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnDeletarCliente_2.setBorderPainted(false);
        btnDeletarCliente_2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnDeletarCliente_2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnDeletarCliente_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnDeletarCliente_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarCliente_2ActionPerformed(evt);
            }
        });

        btnEditarCliente_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        btnEditarCliente_2.setBorderPainted(false);
        btnEditarCliente_2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnEditarCliente_2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnEditarCliente_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEditarCliente_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCliente_2ActionPerformed(evt);
            }
        });

        btnFiltrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filter.png"))); // NOI18N
        btnFiltrarCliente.setBorderPainted(false);
        btnFiltrarCliente.setMaximumSize(new java.awt.Dimension(50, 50));
        btnFiltrarCliente.setMinimumSize(new java.awt.Dimension(50, 50));
        btnFiltrarCliente.setPreferredSize(new java.awt.Dimension(50, 50));
        btnFiltrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarClienteActionPerformed(evt);
            }
        });

        btnPesquisarCliente_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mag-glass.png"))); // NOI18N
        btnPesquisarCliente_2.setBorderPainted(false);
        btnPesquisarCliente_2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPesquisarCliente_2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPesquisarCliente_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPesquisarCliente_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCliente_2ActionPerformed(evt);
            }
        });

        btnCadastrarCliente_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnCadastrarCliente_2.setBorderPainted(false);
        btnCadastrarCliente_2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnCadastrarCliente_2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnCadastrarCliente_2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnCadastrarCliente_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCliente_2ActionPerformed(evt);
            }
        });

        lblCliente.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lblCliente.setText("Cliente");

        javax.swing.GroupLayout ClienteBarraMenuLayout = new javax.swing.GroupLayout(ClienteBarraMenu);
        ClienteBarraMenu.setLayout(ClienteBarraMenuLayout);
        ClienteBarraMenuLayout.setHorizontalGroup(
            ClienteBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteBarraMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                .addComponent(btnCadastrarCliente_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisarCliente_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarCliente_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeletarCliente_2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ClienteBarraMenuLayout.setVerticalGroup(
            ClienteBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteBarraMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarCliente_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesquisarCliente_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFiltrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarCliente_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletarCliente_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ClienteMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnCadastrarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnPesquisarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mag-glass.png"))); // NOI18N
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarClienteActionPerformed(evt);
            }
        });

        btnDeletarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnDeletarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnDeletarCliente.setText("Apagar");
        btnDeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteMenuLayout = new javax.swing.GroupLayout(ClienteMenu);
        ClienteMenu.setLayout(ClienteMenuLayout);
        ClienteMenuLayout.setHorizontalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClienteMenuLayout.setVerticalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ClienteBarraMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(ClienteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ClienteBarraMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(ClienteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 230, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
       
        CadastroClienteView cadastroCliente = new CadastroClienteView(clienteController); // Cria novo objeto do tipo JFrame
        cadastroCliente.setVisible(true);  // Torna o JFrame visivel
        this.dispose();  // Fecha o JFrame anterior
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        //EditarClienteView editarCliente = new EditarClienteView(clienteController);
        //editarCliente.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarClienteActionPerformed

    private void btnDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarClienteActionPerformed

    private void btnCadastrarCliente_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCliente_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarCliente_2ActionPerformed

    private void btnPesquisarCliente_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCliente_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarCliente_2ActionPerformed

    private void btnFiltrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFiltrarClienteActionPerformed

    private void btnEditarCliente_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCliente_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCliente_2ActionPerformed

    private void btnDeletarCliente_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarCliente_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarCliente_2ActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClienteBarraMenu;
    private javax.swing.JPanel ClienteMenu;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarCliente_2;
    private javax.swing.JButton btnDeletarCliente;
    private javax.swing.JButton btnDeletarCliente_2;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarCliente_2;
    private javax.swing.JButton btnFiltrarCliente;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JButton btnPesquisarCliente_2;
    private javax.swing.JLabel lblCliente;
    // End of variables declaration//GEN-END:variables
}
