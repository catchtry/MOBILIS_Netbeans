
package view.Compra;

import view.Cliente.*;
import Controller.ClienteController;
import view.MainView;


public class CompraView extends javax.swing.JFrame {
    
    public CompraView() {
        initComponents();
    }

    private void acaoBotaoHome(){
        MainView mainview = new MainView();
        mainview.setVisible(true);
        this.dispose();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ClienteMenu = new javax.swing.JPanel();
        btnApagarCompra = new javax.swing.JButton();
        btnEditarCompra = new javax.swing.JButton();
        btnAdicionarCompra = new javax.swing.JButton();
        btnPesquisarCompra = new javax.swing.JButton();
        btnHome1 = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(868, 690));

        jPanel2.setBackground(new java.awt.Color(0, 44, 107));

        ClienteMenu.setBackground(new java.awt.Color(255, 255, 255));
        ClienteMenu.setPreferredSize(new java.awt.Dimension(816, 550));

        btnApagarCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnApagarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnApagarCompra.setText("Apagar");
        btnApagarCompra.setMaximumSize(new java.awt.Dimension(147, 41));
        btnApagarCompra.setMinimumSize(new java.awt.Dimension(147, 41));
        btnApagarCompra.setPreferredSize(new java.awt.Dimension(147, 41));

        btnEditarCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditarCompra.setForeground(new java.awt.Color(0, 44, 107));
        btnEditarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        btnEditarCompra.setText("Editar");
        btnEditarCompra.setMaximumSize(new java.awt.Dimension(147, 41));
        btnEditarCompra.setMinimumSize(new java.awt.Dimension(147, 41));
        btnEditarCompra.setPreferredSize(new java.awt.Dimension(147, 41));
        btnEditarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCompraActionPerformed(evt);
            }
        });

        btnAdicionarCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAdicionarCompra.setForeground(new java.awt.Color(0, 44, 107));
        btnAdicionarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdicionarCompra.setText("Cadastrar");
        btnAdicionarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCompraActionPerformed(evt);
            }
        });

        btnPesquisarCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPesquisarCompra.setForeground(new java.awt.Color(0, 44, 107));
        btnPesquisarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mag-glass.png"))); // NOI18N
        btnPesquisarCompra.setText("Pesquisar");
        btnPesquisarCompra.setMaximumSize(new java.awt.Dimension(147, 41));
        btnPesquisarCompra.setMinimumSize(new java.awt.Dimension(147, 41));
        btnPesquisarCompra.setPreferredSize(new java.awt.Dimension(147, 41));
        btnPesquisarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ClienteMenuLayout = new javax.swing.GroupLayout(ClienteMenu);
        ClienteMenu.setLayout(ClienteMenuLayout);
        ClienteMenuLayout.setHorizontalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteMenuLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClienteMenuLayout.setVerticalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteMenuLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_48x48.png"))); // NOI18N
        btnHome1.setBorderPainted(false);
        btnHome1.setContentAreaFilled(false);
        btnHome1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnHome1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnHome1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 780, Short.MAX_VALUE)
                        .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_48x48.png"))); // NOI18N
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setMaximumSize(new java.awt.Dimension(50, 50));
        btnHome.setMinimumSize(new java.awt.Dimension(50, 50));
        btnHome.setPreferredSize(new java.awt.Dimension(50, 50));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 975, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(893, 893, 893)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(894, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(350, 350, 350)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private ClienteController clienteController = new ClienteController();

    
    private void btnAdicionarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCompraActionPerformed

        CadastroRegistroDeCompraView cadastroCompra = new CadastroRegistroDeCompraView(clienteController); // Cria novo objeto do tipo JFrame
        cadastroCompra.setVisible(true);  // Torna o JFrame visivel
        this.dispose();  // Fecha o JFrame anterior
    }//GEN-LAST:event_btnAdicionarCompraActionPerformed

    private void btnEditarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCompraActionPerformed
        EditarRegistroDeCompraView edicaoRegistroDeCompraView = new EditarRegistroDeCompraView(clienteController); // Cria novo objeto do tipo JFrame
        edicaoRegistroDeCompraView.setVisible(true);  // Torna o JFrame visivel
        this.dispose();
    }//GEN-LAST:event_btnEditarCompraActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        acaoBotaoHome();
    }//GEN-LAST:event_btnHome1ActionPerformed

    private void btnPesquisarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarCompraActionPerformed
        PesquisaAvancada pesquisaAvancada = new PesquisaAvancada(); // Cria novo objeto do tipo JFrame
        pesquisaAvancada.setVisible(true);  // Torna o JFrame visivel
        this.dispose();
    }//GEN-LAST:event_btnPesquisarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CompraView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClienteMenu;
    private javax.swing.JButton btnAdicionarCompra;
    private javax.swing.JButton btnApagarCompra;
    private javax.swing.JButton btnEditarCompra;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHome1;
    private javax.swing.JButton btnPesquisarCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
