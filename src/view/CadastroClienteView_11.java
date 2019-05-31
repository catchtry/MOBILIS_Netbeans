
package view;

import Controller.ClienteController;
import ViewModel.Cliente.CidadeVM;
import ViewModel.Cliente.ClienteFactoryVM;
import ViewModel.Cliente.EstadoVM;
import ViewModel.Cliente.IClienteVM;
import ViewModel.Cliente.TipoDePessoa;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class CadastroClienteView extends javax.swing.JFrame {

    private ClienteController clienteController;
    private IClienteVM cliente;
    private TipoDePessoa tipoDePessoa;
    private ClienteFactoryVM clienteFactory;
  
    public CadastroClienteView(ClienteController clienteController,ClienteFactoryVM clienteFactory) {
        initComponents();
        this.clienteController = clienteController;
        this.clienteFactory = clienteFactory;
        limparCamposDaTela();
        carregarComboBoxUfComListaDeEstados();
        getContentPane().setBackground(Color.white);
    }
    
     private void limparCamposDaTela(){
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
    
    private void setMascaraCNPJ(){  
        try {
            MaskFormatter mascaraCNPJ = new MaskFormatter("###.###.###/####-##");
            
            txtCPF_CNPJ.setFormatterFactory(null);  
            txtCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraCNPJ));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setMascaraCPF(){
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            
            txtCPF_CNPJ.setFormatterFactory(null);  
            txtCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraCPF));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void recuperarInformacoesDaTelaEAtribuirAoContatoDoCliente() {
        cliente.getInformacoesGerais().setContato(txtTelefone.getText(), 
                                                   txtCelular.getText(), 
                                                   txtEmail.getText());
    }

    private void recuperarInformacoesDaTelaEAtribuirAoEnderecoDoCliente() {
        cliente.getInformacoesGerais().setEndereco(txtCep.getText(), txtLogradouro.getText(),
                                                   Integer.parseInt(txtNumero.getText()), txtBairro.getText(),
                                                   cbxCidade.getSelectedItem().toString(),
                                                   cbxUf.getSelectedItem().toString(),
                                                   txtComplemento.getText());
    }

    private void recuperarInformacoesDaTelaEPreencherObjetoCliente() {
        
        cliente = clienteFactory.instanciarClienteConformeOTipoDePessoa(tipoDePessoa,txtCPF_CNPJ.getText());
        
        
        cliente.getInformacoesGerais().setNome(txtNome.getText());
        recuperarInformacoesDaTelaEAtribuirAoEnderecoDoCliente();
        recuperarInformacoesDaTelaEAtribuirAoContatoDoCliente();
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
        jPanel9 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JFormattedTextField();
        lblUF8 = new javax.swing.JLabel();
        cbxUF = new javax.swing.JComboBox();
        lblMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblUF4 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        lblUF5 = new javax.swing.JLabel();
        txtChassi = new javax.swing.JFormattedTextField();
        lblUF9 = new javax.swing.JLabel();
        txtPlaca1 = new javax.swing.JFormattedTextField();
        lblUF7 = new javax.swing.JLabel();
        txtPlaca3 = new javax.swing.JFormattedTextField();
        lblUF3 = new javax.swing.JLabel();
        cbxCombustivel = new javax.swing.JComboBox();
        lblUF2 = new javax.swing.JLabel();
        cbxCategoria = new javax.swing.JComboBox();
        lblPortas1 = new javax.swing.JLabel();
        lblQuilometragem = new javax.swing.JLabel();
        txtCor = new javax.swing.JTextField();
        lblCambio = new javax.swing.JLabel();
        cbxCondicao = new javax.swing.JComboBox();
        lblCondicao = new javax.swing.JLabel();
        cbxCategoria2 = new javax.swing.JComboBox();
        lblPortas = new javax.swing.JLabel();
        cbxPortas = new javax.swing.JComboBox();
        cbxCategoria1 = new javax.swing.JComboBox();
        txtChassi1 = new javax.swing.JFormattedTextField();
        lblCambio1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(868, 760));

        jPanel2.setBackground(new java.awt.Color(0, 44, 107));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proprietário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 44, 107))); // NOI18N
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
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbnPessoaJuridica))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbnPessoaFisica)
                    .addComponent(rbnPessoaJuridica))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpfCnpj)
                    .addComponent(txtCPF_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 44, 107))); // NOI18N

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblPlaca.setForeground(new java.awt.Color(0, 44, 107));
        lblPlaca.setText("Placa:");

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        lblUF8.setForeground(new java.awt.Color(0, 44, 107));
        lblUF8.setText("UF:");

        cbxUF.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxUFItemStateChanged(evt);
            }
        });
        cbxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUFActionPerformed(evt);
            }
        });

        lblMarca.setForeground(new java.awt.Color(0, 44, 107));
        lblMarca.setText("Marca:");

        lblUF4.setForeground(new java.awt.Color(0, 44, 107));
        lblUF4.setText("Modelo:");

        lblUF5.setForeground(new java.awt.Color(0, 44, 107));
        lblUF5.setText("Chassi:");

        txtChassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChassiActionPerformed(evt);
            }
        });

        lblUF9.setForeground(new java.awt.Color(0, 44, 107));
        lblUF9.setText("Ano:");

        txtPlaca1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca1ActionPerformed(evt);
            }
        });

        lblUF7.setForeground(new java.awt.Color(0, 44, 107));
        lblUF7.setText("Renavan:");

        txtPlaca3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca3ActionPerformed(evt);
            }
        });

        lblUF3.setForeground(new java.awt.Color(0, 44, 107));
        lblUF3.setText("Combustível:");

        cbxCombustivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCombustivelItemStateChanged(evt);
            }
        });
        cbxCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCombustivelActionPerformed(evt);
            }
        });

        lblUF2.setForeground(new java.awt.Color(0, 44, 107));
        lblUF2.setText("Categoria:");

        cbxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoriaItemStateChanged(evt);
            }
        });
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });

        lblPortas1.setForeground(new java.awt.Color(0, 44, 107));
        lblPortas1.setText("Cor:");

        lblQuilometragem.setForeground(new java.awt.Color(0, 44, 107));
        lblQuilometragem.setText("Quilometragem:");

        lblCambio.setForeground(new java.awt.Color(0, 44, 107));
        lblCambio.setText("Câmbio:");

        cbxCondicao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCondicaoItemStateChanged(evt);
            }
        });
        cbxCondicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCondicaoActionPerformed(evt);
            }
        });

        lblCondicao.setForeground(new java.awt.Color(0, 44, 107));
        lblCondicao.setText("Condição:");

        cbxCategoria2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoria2ItemStateChanged(evt);
            }
        });
        cbxCategoria2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoria2ActionPerformed(evt);
            }
        });

        lblPortas.setForeground(new java.awt.Color(0, 44, 107));
        lblPortas.setText("Nº Portas:");

        cbxPortas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPortasItemStateChanged(evt);
            }
        });
        cbxPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPortasActionPerformed(evt);
            }
        });

        cbxCategoria1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoria1ItemStateChanged(evt);
            }
        });
        cbxCategoria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoria1ActionPerformed(evt);
            }
        });

        txtChassi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChassi1ActionPerformed(evt);
            }
        });

        lblCambio1.setForeground(new java.awt.Color(0, 44, 107));
        lblCambio1.setText("Restrições:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lblCambio1)
                        .addGap(14, 14, 14)
                        .addComponent(cbxCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(lblUF5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addComponent(lblUF8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPlaca1)
                                            .addComponent(cbxUF, 0, 74, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(lblMarca)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(lblUF7)
                                                .addGap(17, 17, 17)
                                                .addComponent(txtPlaca3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                                .addComponent(lblCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                                .addComponent(lblUF2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addComponent(lblPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblUF9)
                                                    .addComponent(lblQuilometragem))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel9Layout.createSequentialGroup()
                                                .addComponent(txtChassi1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPortas1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbxPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblUF4))
                                    .addComponent(lblCambio))
                                .addGap(34, 34, 34))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(lblUF3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCombustivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCondicao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUF4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPlaca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPlaca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCondicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPortas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtChassi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuilometragem)
                            .addComponent(cbxCategoria)
                            .addComponent(lblUF2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPlaca)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarca)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(265, 265, 265)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCondicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPortas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxCategoria1)
                    .addComponent(lblCambio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.getAccessibleContext().setAccessibleName("Selecionar Proprietário");

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
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        acaoBotaoHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void rbnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaJuridicaActionPerformed
        acaoRadioButtonPessoaJuridica();
    }//GEN-LAST:event_rbnPessoaJuridicaActionPerformed

    private void rbnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaFisicaActionPerformed
        acaoRadioButtonPessoaFisica();
    }//GEN-LAST:event_rbnPessoaFisicaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        recuperarInformacoesDaTelaEPreencherObjetoCliente();
        limparCamposDaTela();
        clienteController.salvarCliente(tipoDePessoa, cliente);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ClienteView clienteView = new ClienteView();
        clienteView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void cbxUFItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxUFItemStateChanged
        recarregarComboBoxCidadeComListaDeCidadesDepoisDaReopcao(evt);
    }//GEN-LAST:event_cbxUFItemStateChanged

    private void cbxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUFActionPerformed

    private void txtChassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChassiActionPerformed

    private void txtPlaca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca1ActionPerformed

    private void txtPlaca3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca3ActionPerformed

    private void cbxCombustivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCombustivelItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCombustivelItemStateChanged

    private void cbxCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCombustivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCombustivelActionPerformed

    private void cbxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaItemStateChanged

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void cbxCondicaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCondicaoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCondicaoItemStateChanged

    private void cbxCondicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCondicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCondicaoActionPerformed

    private void cbxCategoria2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoria2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoria2ItemStateChanged

    private void cbxCategoria2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoria2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoria2ActionPerformed

    private void cbxPortasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPortasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPortasItemStateChanged

    private void cbxPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPortasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPortasActionPerformed

    private void txtChassi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChassi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChassi1ActionPerformed

    private void cbxCategoria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoria1ActionPerformed

    private void cbxCategoria1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoria1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoria1ItemStateChanged

  
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
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxCategoria;
    private javax.swing.JComboBox cbxCategoria1;
    private javax.swing.JComboBox cbxCategoria2;
    private javax.swing.JComboBox cbxCombustivel;
    private javax.swing.JComboBox cbxCondicao;
    private javax.swing.JComboBox cbxPortas;
    private javax.swing.JComboBox cbxUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCambio1;
    private javax.swing.JLabel lblCondicao;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPortas;
    private javax.swing.JLabel lblPortas1;
    private javax.swing.JLabel lblQuilometragem;
    private javax.swing.JLabel lblUF2;
    private javax.swing.JLabel lblUF3;
    private javax.swing.JLabel lblUF4;
    private javax.swing.JLabel lblUF5;
    private javax.swing.JLabel lblUF7;
    private javax.swing.JLabel lblUF8;
    private javax.swing.JLabel lblUF9;
    private javax.swing.JRadioButton rbnPessoaFisica;
    private javax.swing.JRadioButton rbnPessoaJuridica;
    private javax.swing.JFormattedTextField txtCPF_CNPJ;
    private javax.swing.JFormattedTextField txtChassi;
    private javax.swing.JFormattedTextField txtChassi1;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPlaca;
    private javax.swing.JFormattedTextField txtPlaca1;
    private javax.swing.JFormattedTextField txtPlaca3;
    // End of variables declaration//GEN-END:variables

   
}
