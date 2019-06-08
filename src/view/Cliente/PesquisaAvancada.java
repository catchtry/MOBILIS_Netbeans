
package view.Cliente;

import Controller.ClienteController;
import ViewModel.Cliente.CidadeVM;
import ViewModel.Cliente.EstadoVM;
import ViewModel.Cliente.IClienteVM;
import ViewModel.Cliente.TipoDePessoa;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
import view.MainView;

public class PesquisaAvancada extends javax.swing.JFrame {
    
    private IClienteVM cliente;
    private TipoDePessoa tipoDePessoa;
    private ClienteController clienteController;
 
    public PesquisaAvancada() {
        initComponents();
        limparCamposDaTela();
        carregarComboBoxUfComListaDeEstados();
    }

    private void carregarComboBoxUfComListaDeEstados() {
        List<EstadoVM> estados;
        estados = clienteController.GetEstados();
        cbxUf.addItem("Selecione");
        for (EstadoVM estado : estados) {
            cbxUf.addItem(estado.getNome());
        }
    }
    
    private void carregarComboBoxCidadeComListaDeCidades() {
        if (cbxUf.getSelectedIndex() == 0) {
            limparComboBoxCidadeEAdicionarOpcaoSelecione();
        }
        if (cbxUf.getSelectedIndex() > 0) {
            limparComboBoxCidadeEAdicionarOpcaoSelecione();
            EstadoVM estadoSelecionado;
            estadoSelecionado = clienteController.GetEstadoById(cbxUf.getSelectedIndex() - 1);
            for (CidadeVM cidade : estadoSelecionado.getListaDeCidades()) {
                cbxCidade.addItem(cidade.getNome());
            }
        }
    }
    
    private void limparComboBoxCidadeEAdicionarOpcaoSelecione() {
        cbxCidade.removeAllItems();
        cbxCidade.addItem("Selecione");
    }
    
    private void preencherCamposDaTelaComOsDadosDoObjetoCliente(IClienteVM cliente){
        
        cbxUf.setSelectedItem(cliente.getInformacoesGerais().getEndereco().getUf());
        
        txtNome.setText(cliente.getInformacoesGerais().getNome());

    }
    
    private void limparCamposDaTela(){
        rbnPessoaFisica.setSelected(false);
        rbnPessoaJuridica.setSelected(false);
        txtCPF_CNPJ.setText("");
        cbxCidade.setSelectedIndex(-1);
        cbxUf.setSelectedIndex(-1);
        txtNome.setText("");
                
    }
    
    private void setMascaraCNPJ(){  
        try {
            MaskFormatter mascaraCNPJ = new MaskFormatter("###.###.###/####-##");
            
            txtCPF_CNPJ.setFormatterFactory(null);  
            txtCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraCNPJ));
        } catch (ParseException ex) {
            Logger.getLogger(PesquisaAvancada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setMascaraCPF(){
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            
            txtCPF_CNPJ.setFormatterFactory(null);  
            txtCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraCPF));
        } catch (ParseException ex) {
            Logger.getLogger(PesquisaAvancada.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    private void recarregarComboBoxCidadeComListaDeCidadesDepoisDaReopcao(java.awt.event.ItemEvent evt){
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            carregarComboBoxCidadeComListaDeCidades();
        }
    }
    
    private void acaoRadioButtonPessoaFisica(){
        rbnPessoaJuridica.setSelected(false);
        setMascaraCPF();
        tipoDePessoa = TipoDePessoa.FISICA;
    }
    
    private void acaoRadioButtonPessoaJuridica(){
        rbnPessoaFisica.setSelected(false);
        setMascaraCNPJ();
        tipoDePessoa = TipoDePessoa.JURIDICA;
    }
    
    private void acaoBotaoHome(){
        MainView mainview = new MainView();
        mainview.setVisible(true);
        this.dispose();
    }
    
    private void acaoBotaoPesquisar(){
        cliente = clienteController.lerCliente(tipoDePessoa, txtCPF_CNPJ.getText());
        preencherCamposDaTelaComOsDadosDoObjetoCliente(cliente);
    }
    
    private void recuperarInformacoesDaTelaEAtribuirAoContatoDoCliente() {
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rbnPessoaFisica = new javax.swing.JRadioButton();
        rbnPessoaJuridica = new javax.swing.JRadioButton();
        lblCpfCnpj = new javax.swing.JLabel();
        txtCPF_CNPJ = new javax.swing.JFormattedTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        cbxUf = new javax.swing.JComboBox();
        cbxCidade = new javax.swing.JComboBox();
        lblUF2 = new javax.swing.JLabel();
        lblCidade2 = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTResultado = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa Avançada", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(868, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(868, 760));

        jPanel2.setBackground(new java.awt.Color(0, 44, 107));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Filtros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 44, 107));

        rbnPessoaFisica.setBackground(new java.awt.Color(255, 255, 255));
        rbnPessoaFisica.setForeground(new java.awt.Color(0, 44, 107));
        rbnPessoaFisica.setText("Pessoa Física");
        rbnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPessoaFisicaActionPerformed(evt);
            }
        });

        rbnPessoaJuridica.setBackground(new java.awt.Color(255, 255, 255));
        rbnPessoaJuridica.setForeground(new java.awt.Color(0, 44, 107));
        rbnPessoaJuridica.setText("Pessoa Jurídica");
        rbnPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPessoaJuridicaActionPerformed(evt);
            }
        });

        lblCpfCnpj.setForeground(new java.awt.Color(0, 44, 107));
        lblCpfCnpj.setText("CPF / CNPJ : ");

        lblNome.setForeground(new java.awt.Color(0, 44, 107));
        lblNome.setText("Nome / Razão :");

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lupa_20x20.png"))); // NOI18N
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.setContentAreaFilled(false);
        btnPesquisar.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        cbxUf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxUfItemStateChanged(evt);
            }
        });

        lblUF2.setForeground(new java.awt.Color(0, 44, 107));
        lblUF2.setText("UF :");

        lblCidade2.setForeground(new java.awt.Color(0, 44, 107));
        lblCidade2.setText("Cidade :");

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCpfCnpj)
                    .addComponent(rbnPessoaFisica)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rbnPessoaJuridica)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCidade2)
                            .addComponent(lblUF2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnPessoaFisica)
                    .addComponent(rbnPessoaJuridica))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCpfCnpj)
                        .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCidade2)))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnPesquisa)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 44, 107))); // NOI18N

        jTResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CPF / CNPJ", "Nome / Razão", "Telefone", "Celular", "Cidade", "UF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTResultado);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaFisicaActionPerformed
        acaoRadioButtonPessoaFisica();
    }//GEN-LAST:event_rbnPessoaFisicaActionPerformed

    private void rbnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaJuridicaActionPerformed
        acaoRadioButtonPessoaJuridica();
    }//GEN-LAST:event_rbnPessoaJuridicaActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
       
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
       acaoBotaoHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        acaoBotaoPesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void cbxUfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxUfItemStateChanged
        recarregarComboBoxCidadeComListaDeCidadesDepoisDaReopcao(evt);
    }//GEN-LAST:event_cbxUfItemStateChanged

  
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
            java.util.logging.Logger.getLogger(PesquisaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaAvancada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox cbxCidade;
    private javax.swing.JComboBox cbxUf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTResultado;
    private javax.swing.JLabel lblCidade2;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblUF2;
    private javax.swing.JRadioButton rbnPessoaFisica;
    private javax.swing.JRadioButton rbnPessoaJuridica;
    private javax.swing.JFormattedTextField txtCPF_CNPJ;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
