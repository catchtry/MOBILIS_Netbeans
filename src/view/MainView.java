
package view;

import view.Venda.VendaView;
import view.Cliente.ClienteView;
import view.Compra.CompraView;
import view.Veiculo.VeiculoView;

public class MainView extends javax.swing.JFrame {

 
    public MainView() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConfig = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ClienteMenu = new javax.swing.JPanel();
        btnCompra = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(868, 750));
        setPreferredSize(new java.awt.Dimension(868, 750));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mobilis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(868, 690));

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/config_48x48.png"))); // NOI18N
        btnConfig.setBorderPainted(false);
        btnConfig.setContentAreaFilled(false);
        btnConfig.setMaximumSize(new java.awt.Dimension(50, 50));
        btnConfig.setMinimumSize(new java.awt.Dimension(50, 50));
        btnConfig.setPreferredSize(new java.awt.Dimension(50, 50));

        jPanel2.setBackground(new java.awt.Color(0, 44, 107));

        ClienteMenu.setBackground(new java.awt.Color(255, 255, 255));
        ClienteMenu.setPreferredSize(new java.awt.Dimension(816, 550));

        btnCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCompra.setForeground(new java.awt.Color(0, 44, 107));
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrinho.png"))); // NOI18N
        btnCompra.setText("Compra");
        btnCompra.setMaximumSize(new java.awt.Dimension(147, 41));
        btnCompra.setMinimumSize(new java.awt.Dimension(147, 41));
        btnCompra.setPreferredSize(new java.awt.Dimension(147, 41));
        btnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraActionPerformed(evt);
            }
        });

        btnVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVenda.setForeground(new java.awt.Color(0, 44, 107));
        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/etiqueta.png"))); // NOI18N
        btnVenda.setText("Venda");
        btnVenda.setMaximumSize(new java.awt.Dimension(147, 41));
        btnVenda.setMinimumSize(new java.awt.Dimension(147, 41));
        btnVenda.setPreferredSize(new java.awt.Dimension(147, 41));
        btnVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaActionPerformed(evt);
            }
        });

        btnCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(0, 44, 107));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ClientesTamGrande.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setMaximumSize(new java.awt.Dimension(147, 41));
        btnCliente.setMinimumSize(new java.awt.Dimension(147, 41));
        btnCliente.setPreferredSize(new java.awt.Dimension(147, 41));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnVeiculo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVeiculo.setForeground(new java.awt.Color(0, 44, 107));
        btnVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        btnVeiculo.setText("Veículo");
        btnVeiculo.setMaximumSize(new java.awt.Dimension(147, 41));
        btnVeiculo.setMinimumSize(new java.awt.Dimension(147, 41));
        btnVeiculo.setPreferredSize(new java.awt.Dimension(147, 41));
        btnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteMenuLayout = new javax.swing.GroupLayout(ClienteMenu);
        ClienteMenu.setLayout(ClienteMenuLayout);
        ClienteMenuLayout.setHorizontalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteMenuLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClienteMenuLayout.setVerticalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteMenuLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClienteMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ClienteMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(780, Short.MAX_VALUE)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 975, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed

        ClienteView cliente = new ClienteView(); // Cria novo objeto do tipo JFrame
        cliente.setVisible(true);  // Torna o JFrame visivel
        this.dispose();  // Fecha o JFrame anterior
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaActionPerformed
        VendaView venda = new VendaView(); // Cria novo objeto do tipo JFrame
        venda.setVisible(true);  // Torna o JFrame visivel
        this.dispose();
    }//GEN-LAST:event_btnVendaActionPerformed

    private void btnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeiculoActionPerformed
        VeiculoView veiculo = new VeiculoView(); // Cria novo objeto do tipo JFrame
        veiculo.setVisible(true);  // Torna o JFrame visivel
        this.dispose();
    }//GEN-LAST:event_btnVeiculoActionPerformed

    private void btnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraActionPerformed
        CompraView compra = new CompraView(); // Cria novo objeto do tipo JFrame
        compra.setVisible(true);  // Torna o JFrame visivel
        this.dispose();
    }//GEN-LAST:event_btnCompraActionPerformed

  
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClienteMenu;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCompra;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnVeiculo;
    private javax.swing.JButton btnVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
