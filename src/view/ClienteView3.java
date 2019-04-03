
package view;


public class ClienteView3 extends javax.swing.JFrame {

    public ClienteView3() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConfig = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        ClienteMenu = new javax.swing.JPanel();
        btnApagarCliente = new javax.swing.JButton();
        btnEditarrCliente = new javax.swing.JButton();
        btnAdicionarCliente = new javax.swing.JButton();
        btnPesquisarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(868, 690));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(868, 690));

        btnConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home_1.png"))); // NOI18N
        btnConfig.setBorderPainted(false);
        btnConfig.setContentAreaFilled(false);
        btnConfig.setMaximumSize(new java.awt.Dimension(50, 50));
        btnConfig.setMinimumSize(new java.awt.Dimension(50, 50));
        btnConfig.setPreferredSize(new java.awt.Dimension(50, 50));
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 44, 107));

        ClienteMenu.setBackground(new java.awt.Color(255, 255, 255));
        ClienteMenu.setPreferredSize(new java.awt.Dimension(816, 550));

        btnApagarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnApagarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnApagarCliente.setText("Apagar");
        btnApagarCliente.setMaximumSize(new java.awt.Dimension(147, 41));
        btnApagarCliente.setMinimumSize(new java.awt.Dimension(147, 41));
        btnApagarCliente.setPreferredSize(new java.awt.Dimension(147, 41));

        btnEditarrCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEditarrCliente.setForeground(new java.awt.Color(0, 44, 107));
        btnEditarrCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        btnEditarrCliente.setText("Editar");
        btnEditarrCliente.setMaximumSize(new java.awt.Dimension(147, 41));
        btnEditarrCliente.setMinimumSize(new java.awt.Dimension(147, 41));
        btnEditarrCliente.setPreferredSize(new java.awt.Dimension(147, 41));
        btnEditarrCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarrClienteActionPerformed(evt);
            }
        });

        btnAdicionarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAdicionarCliente.setForeground(new java.awt.Color(0, 44, 107));
        btnAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAdicionarCliente.setText("Cadastrar");
        btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarClienteActionPerformed(evt);
            }
        });

        btnPesquisarCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnPesquisarCliente.setForeground(new java.awt.Color(0, 44, 107));
        btnPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mag-glass.png"))); // NOI18N
        btnPesquisarCliente.setText("Pesquisar");
        btnPesquisarCliente.setMaximumSize(new java.awt.Dimension(147, 41));
        btnPesquisarCliente.setMinimumSize(new java.awt.Dimension(147, 41));
        btnPesquisarCliente.setPreferredSize(new java.awt.Dimension(147, 41));

        javax.swing.GroupLayout ClienteMenuLayout = new javax.swing.GroupLayout(ClienteMenu);
        ClienteMenu.setLayout(ClienteMenuLayout);
        ClienteMenuLayout.setHorizontalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarrCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(157, 157, 157))
        );
        ClienteMenuLayout.setVerticalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ClienteMenuLayout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditarrCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApagarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
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
                .addComponent(ClienteMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        new main3().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed

        CadastroClienteView3 cliente = new CadastroClienteView3(); // Cria novo objeto do tipo JFrame
        cliente.setVisible(true);  // Torna o JFrame visivel
        this.dispose();  // Fecha o JFrame anterior
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

    private void btnEditarrClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarrClienteActionPerformed
        EditarClienteView3 cliente = new EditarClienteView3(); // Cria novo objeto do tipo JFrame
        cliente.setVisible(true);  // Torna o JFrame visivel
        this.dispose();
    }//GEN-LAST:event_btnEditarrClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteView3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteView3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ClienteMenu;
    private javax.swing.JButton btnAdicionarCliente;
    private javax.swing.JButton btnApagarCliente;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnEditarrCliente;
    private javax.swing.JButton btnPesquisarCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
