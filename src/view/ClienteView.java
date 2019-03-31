/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author ht3000231
 */
public class ClienteView extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public ClienteView() {
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

        ClienteBarraMenu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblCliente = new javax.swing.JLabel();
        ClienteMenu = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnVeiculo = new javax.swing.JButton();
        btnCompra = new javax.swing.JButton();
        btnVenda = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenu = new javax.swing.JMenu();
        btnUsuario = new javax.swing.JMenu();
        btnConfiguracoes = new javax.swing.JMenu();
        btnAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cliente");
        setPreferredSize(new java.awt.Dimension(1024, 628));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/filter.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mag-glass.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(50, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(50, 50));

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
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ClienteBarraMenuLayout.setVerticalGroup(
            ClienteBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteBarraMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteBarraMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnCliente.setText("Cadastrar");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnVeiculo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mag-glass.png"))); // NOI18N
        btnVeiculo.setText("Pesquisar");

        btnCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
        btnCompra.setText("Apagar");

        btnVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        btnVenda.setText("Editar");

        javax.swing.GroupLayout ClienteMenuLayout = new javax.swing.GroupLayout(ClienteMenu);
        ClienteMenu.setLayout(ClienteMenuLayout);
        ClienteMenuLayout.setHorizontalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClienteMenuLayout.setVerticalGroup(
            ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClienteMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(ClienteMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        btnMenu.setText("Menu");
        jMenuBar1.add(btnMenu);

        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man-user.png"))); // NOI18N
        btnUsuario.setText("Usuário");
        jMenuBar1.add(btnUsuario);

        btnConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings-gears.png"))); // NOI18N
        btnConfiguracoes.setText("Configurações");
        jMenuBar1.add(btnConfiguracoes);

        btnAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        btnAjuda.setText("Ajuda");
        jMenuBar1.add(btnAjuda);

        setJMenuBar(jMenuBar1);

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
                .addGap(0, 209, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        CadastroView cliente = new CadastroView(); // Cria novo objeto do tipo JFrame
        cliente.setVisible(true);  // Torna o JFrame visivel
        this.dispose();  // Fecha o JFrame anterior
    }//GEN-LAST:event_btnClienteActionPerformed

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
    private javax.swing.JMenu btnAjuda;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCompra;
    private javax.swing.JMenu btnConfiguracoes;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenu btnUsuario;
    private javax.swing.JButton btnVeiculo;
    private javax.swing.JButton btnVenda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCliente;
    // End of variables declaration//GEN-END:variables
}
