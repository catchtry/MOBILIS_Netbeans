
package view;

import Controller.ClienteController;
import ViewModel.Cliente.CidadeVM;
import ViewModel.Cliente.EstadoVM;
import ViewModel.Cliente.IClienteVM;
import ViewModel.Cliente.PessoaFisicaVM;
import ViewModel.Cliente.PessoaJuridicaVM;
import ViewModel.Cliente.TipoDePessoa;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;


public class EditarClienteView extends javax.swing.JFrame {

    private ClienteController clienteController;
    private IClienteVM cliente;
    private TipoDePessoa tipoDePessoa;
    
    public EditarClienteView(ClienteController clienteController) {
        initComponents();
        this.clienteController = clienteController;
        limparCampos();
        loadComboBoxUf(); 
        testeCadastro();
        
        
    }

     private void verificaSeEhPessoaFisicaOuJuridicaEAtribuiCPFOuCNPJ(){
        /*if(rbnPessoaFisica.isSelected()){
            cliente = new PessoaFisicaVM();
            ((PessoaFisicaVM)cliente).setCpf(txtCPF_CNPJ.getText());
            tipoDePessoa = TipoDePessoa.PESSOA_FISICA;
        }
        
        if(rbnPessoaJuridica.isSelected()){
            cliente = new PessoaJuridicaVM();   
            ((PessoaJuridicaVM)cliente).setCnpj(txtCPF_CNPJ.getText());
            tipoDePessoa = TipoDePessoa.PESSOA_JURIDICA;
        }*/
    }
     
    private void recuperaInformacoesEAtribuiContato(){
        cliente.getInformacoesGerais().setContato(txtTelefone.getText(), txtCelular.getText(), txtEmail.getText());
    }
    
    private void recuperaInformacoesEAtribuiEndereco(){
       
        cliente.getInformacoesGerais().setEndereco(txtCep.getText(), txtLogradouro.getText(), 
                                                   Integer.parseInt(txtNumero.getText()), txtBairro.getText(), 
                                                   cbxCidade.getSelectedItem().toString(),
                                                   cbxUf.getSelectedItem().toString(),                                                  
                                                   txtComplemento.getText());
    }
    
    private void preencheCampos(IClienteVM cliente){
        
        cbxCidade.setSelectedItem(cliente.getInformacoesGerais().getEndereco().getCidade());
        cbxUf.setSelectedItem(cliente.getInformacoesGerais().getEndereco().getUf());
        txtNome.setText(cliente.getInformacoesGerais().getNome());
        txtCep.setText(cliente.getInformacoesGerais().getEndereco().getCep());
        txtLogradouro.setText(cliente.getInformacoesGerais().getEndereco().getLogradouro());
        txtNumero.setText(Integer.toString(cliente.getInformacoesGerais().getEndereco().getNumero()));
        txtBairro.setText(cliente.getInformacoesGerais().getEndereco().getBairro());
        txtComplemento.setText(cliente.getInformacoesGerais().getEndereco().getComplemento());
        txtTelefone.setText(cliente.getInformacoesGerais().getContato().getTelefone());
        txtCelular.setText(cliente.getInformacoesGerais().getContato().getCelular());
        txtEmail.setText(cliente.getInformacoesGerais().getContato().getEmail());
                
    }
    
    private void recuperaInformacoesDaTelaEPreencheObjetoCliente(){
        
        verificaSeEhPessoaFisicaOuJuridicaEAtribuiCPFOuCNPJ();
        
        cliente.getInformacoesGerais().setNome(txtNome.getText());
        
        recuperaInformacoesEAtribuiEndereco();
        
        recuperaInformacoesEAtribuiContato();
        
        
         
    }
    
    private void limparCampos(){
        
        rbnPessoaFisica.setSelected(false);
        rbnPessoaJuridica.setSelected(false);
        txtCPF_CNPJ.setText("");
        cbxCidade.setSelectedIndex(-1);
        cbxUf.setSelectedIndex(-1);
        txtNome.setText("");
        txtCep.setText("");
        txtLogradouro.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtComplemento.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
                
    }
    
    private void testeCadastro(){
        //rbnPessoaFisica.setSelected(true);
        rbnPessoaJuridica.setSelected(false);
        txtCPF_CNPJ.setText("123.456.789-10");
        cbxUf.setSelectedIndex(1);
        cbxCidade.setSelectedIndex(1);
        txtNome.setText("Laís");
        txtCep.setText("13183-761");
        txtLogradouro.setText("Rua dos Melros");
        txtNumero.setText("83");
        txtBairro.setText("Chácara Recreio Alvorada");
        txtComplemento.setText("IFSP");
        txtTelefone.setText("(19) 2222-9637");
        txtCelular.setText("(19) 99851-7455");
        txtEmail.setText("laisjkl@hotmail.com");
    }
    
    private void loadComboBoxUf(){
        
        List<EstadoVM> estados;
        estados = clienteController.GetEstados();
        cbxUf.addItem("Selecione");
        
        for(EstadoVM estado : estados) {
            cbxUf.addItem(estado.getNome());
        }
    }
    
private void loadComboBoxCidade(){
        
        if(cbxUf.getSelectedIndex() == 0){
            limpaComboBoxEAdicionaOpcaoSelecione();
        }
        
        if(cbxUf.getSelectedIndex() > 0){
            limpaComboBoxEAdicionaOpcaoSelecione();
            EstadoVM estadoSelecionado;
            estadoSelecionado = clienteController.GetEstadoById(cbxUf.getSelectedIndex() - 1);
            
        for(CidadeVM cidade : estadoSelecionado.getListaDeCidades()){
            cbxCidade.addItem(cidade.getNome());
        }
    }
}
    
private void limpaComboBoxEAdicionaOpcaoSelecione(){
    cbxCidade.removeAllItems();
    cbxCidade.addItem("Selecione");
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        CadastroClienteMenuView = new javax.swing.JPanel();
        CadastroClienteView = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        rbnPessoaFisica = new javax.swing.JRadioButton();
        rbnPessoaJuridica = new javax.swing.JRadioButton();
        lblCpfCnpj = new javax.swing.JLabel();
        txtCPF_CNPJ = new javax.swing.JFormattedTextField();
        btnPesquisar1 = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblEndereco = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        cbxUf = new javax.swing.JComboBox();
        cbxCidade = new javax.swing.JComboBox();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mobilis - editar");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(868, 758));
        setPreferredSize(new java.awt.Dimension(868, 758));
        setSize(new java.awt.Dimension(868, 758));

        CadastroClienteMenuView.setBackground(new java.awt.Color(255, 255, 255));
        CadastroClienteMenuView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        CadastroClienteMenuView.setMinimumSize(new java.awt.Dimension(868, 758));
        CadastroClienteMenuView.setPreferredSize(new java.awt.Dimension(868, 758));

        CadastroClienteView.setBackground(new java.awt.Color(0, 44, 107));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        jPanel1.setPreferredSize(new java.awt.Dimension(481, 140));

        rbnPessoaFisica.setBackground(new java.awt.Color(255, 255, 255));
        rbnPessoaFisica.setText("Pessoa Física");
        rbnPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPessoaFisicaActionPerformed(evt);
            }
        });

        rbnPessoaJuridica.setBackground(new java.awt.Color(255, 255, 255));
        rbnPessoaJuridica.setText("Pessoa Jurídica");
        rbnPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnPessoaJuridicaActionPerformed(evt);
            }
        });

        lblCpfCnpj.setText("CPF / CNPJ : ");

        btnPesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Lupa_20x20.png"))); // NOI18N
        btnPesquisar1.setBorderPainted(false);
        btnPesquisar1.setContentAreaFilled(false);
        btnPesquisar1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnPesquisar1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnPesquisar1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnPesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisar1ActionPerformed(evt);
            }
        });

        lblNome.setText("Nome / Razão :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbnPessoaFisica)
                    .addComponent(lblNome)
                    .addComponent(lblCpfCnpj))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rbnPessoaJuridica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnPessoaFisica)
                    .addComponent(rbnPessoaJuridica))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblCpfCnpj))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jPanel2.setPreferredSize(new java.awt.Dimension(758, 210));

        lblEndereco.setText("Logradouro:");

        lblNumero.setText("Número:");

        lblBairro.setText("Bairro :");

        lblCep.setText("CEP :");

        lblUF.setText("UF :");

        lblCidade.setText("Cidade :");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbxUf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxUfItemStateChanged(evt);
            }
        });
        cbxUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUfActionPerformed(evt);
            }
        });

        lblComplemento.setText("Complemento: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblNumero)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblComplemento)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtComplemento))
                                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCep)
                                    .addComponent(cbxUf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblBairro))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCep)
                            .addComponent(lblUF)
                            .addComponent(lblCidade))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato"));

        jLabel1.setText("Tel. :");

        jLabel2.setText("Cel. :");

        jLabel3.setText("E-mail :");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnSalvar1.setText("Cancelar");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(504, 504, 504)
                        .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(81, 81, 81)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnSalvar1))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout CadastroClienteViewLayout = new javax.swing.GroupLayout(CadastroClienteView);
        CadastroClienteView.setLayout(CadastroClienteViewLayout);
        CadastroClienteViewLayout.setHorizontalGroup(
            CadastroClienteViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClienteViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CadastroClienteViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CadastroClienteViewLayout.setVerticalGroup(
            CadastroClienteViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClienteViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CadastroClienteMenuViewLayout = new javax.swing.GroupLayout(CadastroClienteMenuView);
        CadastroClienteMenuView.setLayout(CadastroClienteMenuViewLayout);
        CadastroClienteMenuViewLayout.setHorizontalGroup(
            CadastroClienteMenuViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClienteMenuViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CadastroClienteView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CadastroClienteMenuViewLayout.setVerticalGroup(
            CadastroClienteMenuViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CadastroClienteMenuViewLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(CadastroClienteView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroClienteMenuView, javax.swing.GroupLayout.PREFERRED_SIZE, 806, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CadastroClienteMenuView, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUfActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        recuperaInformacoesDaTelaEPreencheObjetoCliente();
        limparCampos();
        clienteController.salvarCliente(tipoDePessoa, cliente);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbxUfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxUfItemStateChanged
        int state = evt.getStateChange();
        if(state == ItemEvent.SELECTED){
  
           loadComboBoxCidade();
        }
    }//GEN-LAST:event_cbxUfItemStateChanged

    private void rbnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaFisicaActionPerformed
        rbnPessoaJuridica.setSelected(false);
        setMascaraCPF();
    }//GEN-LAST:event_rbnPessoaFisicaActionPerformed

    private void rbnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaJuridicaActionPerformed
        rbnPessoaFisica.setSelected(false);
        setMascaraCNPJ();
    }//GEN-LAST:event_rbnPessoaJuridicaActionPerformed

    private void btnPesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisar1ActionPerformed
        cliente = clienteController.lerCliente(tipoDePessoa, txtCPF_CNPJ.getText());
        preencheCampos(cliente);
    }//GEN-LAST:event_btnPesquisar1ActionPerformed

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void setMascaraCNPJ(){
        
        try {
            MaskFormatter mascaraCNPJ = new MaskFormatter("###.###.###/####-##");
            
            txtCPF_CNPJ.setFormatterFactory(null);  
            txtCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraCNPJ));
        } catch (ParseException ex) {
            Logger.getLogger(EditarClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setMascaraCPF(){
        
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            
            txtCPF_CNPJ.setFormatterFactory(null);  
            txtCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraCPF));
        } catch (ParseException ex) {
            Logger.getLogger(EditarClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(EditarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CadastroClienteMenuView;
    private javax.swing.JPanel CadastroClienteView;
    private javax.swing.JButton btnPesquisar1;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbxCidade;
    private javax.swing.JComboBox cbxUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblUF;
    private javax.swing.JRadioButton rbnPessoaFisica;
    private javax.swing.JRadioButton rbnPessoaJuridica;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF_CNPJ;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
