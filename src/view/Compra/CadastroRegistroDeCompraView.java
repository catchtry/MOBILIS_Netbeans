
package view.Compra;

import view.Cliente.ClienteView;
import Controller.ClienteController;
import Controller.CompraController;
import ViewModel.Cliente.CidadeVM;
import ViewModel.Cliente.EstadoVM;
import ViewModel.Cliente.TipoDePessoa;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.MaskFormatter;
import view.MainView;

public class CadastroRegistroDeCompraView extends javax.swing.JFrame {

    private ClienteController clienteController;
    private TipoDePessoa tipoDePessoa;
    private CompraController compraController;
  
    public CadastroRegistroDeCompraView(ClienteController clienteController) {
        initComponents();
        this.clienteController = clienteController;
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
        txtRestricao.setText("");
        txtPlaca.setText("");
        txtBairro.setText("");
        txtQuilometragem.setText("");
        txtValorDeCompra.setText("");
        txtValorDeVenda.setText("");
                
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
            Logger.getLogger(CadastroRegistroDeCompraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setMascaraCPF(){
        try {
            MaskFormatter mascaraCPF = new MaskFormatter("###.###.###-##");
            
            txtCPF_CNPJ.setFormatterFactory(null);  
            txtCPF_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(mascaraCPF));
        } catch (ParseException ex) {
            Logger.getLogger(CadastroRegistroDeCompraView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void recuperarInformacoesDaTelaEPreencherObjetoCompra() {

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
        jPanel6 = new javax.swing.JPanel();
        lblEndereco2 = new javax.swing.JLabel();
        txtRestricao = new javax.swing.JTextField();
        lblNumero2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        lblBairro2 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblComplemento2 = new javax.swing.JLabel();
        txtQuilometragem = new javax.swing.JTextField();
        lblUF2 = new javax.swing.JLabel();
        lblCidade2 = new javax.swing.JLabel();
        cbxCidade = new javax.swing.JComboBox();
        cbxUf = new javax.swing.JComboBox();
        lblUF3 = new javax.swing.JLabel();
        cbxNumeroDePortas = new javax.swing.JComboBox();
        lblUF4 = new javax.swing.JLabel();
        lblUF5 = new javax.swing.JLabel();
        cbxOrigem = new javax.swing.JComboBox();
        txtRenavan = new javax.swing.JTextField();
        lblUF6 = new javax.swing.JLabel();
        txtLotacaoMaxima = new javax.swing.JTextField();
        lblUF7 = new javax.swing.JLabel();
        txtCilindradas = new javax.swing.JTextField();
        lblUF8 = new javax.swing.JLabel();
        cbxMarca = new javax.swing.JComboBox();
        lblUF9 = new javax.swing.JLabel();
        cbxModelo = new javax.swing.JComboBox();
        lblUF10 = new javax.swing.JLabel();
        cbxAnoDeFabricacao = new javax.swing.JComboBox();
        lblUF11 = new javax.swing.JLabel();
        cbxAnoDoModelo = new javax.swing.JComboBox();
        lblUF12 = new javax.swing.JLabel();
        cbxVersao = new javax.swing.JComboBox();
        cbxCategoria = new javax.swing.JComboBox();
        lblUF13 = new javax.swing.JLabel();
        lblUF14 = new javax.swing.JLabel();
        cbxCor = new javax.swing.JComboBox();
        lblUF15 = new javax.swing.JLabel();
        cbxCombustivel = new javax.swing.JComboBox();
        lblUF16 = new javax.swing.JLabel();
        cbxCambio = new javax.swing.JComboBox();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtValorDeCompra = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        cbxFichaDeAtendimento = new javax.swing.JComboBox();
        txtValorDeVenda = new javax.swing.JFormattedTextField();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Registro de Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(868, 760));

        jPanel2.setBackground(new java.awt.Color(0, 44, 107));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 44, 107))); // NOI18N
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
                .addContainerGap(350, Short.MAX_VALUE))
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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 44, 107))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 44, 107));
        jPanel6.setPreferredSize(new java.awt.Dimension(758, 210));

        lblEndereco2.setForeground(new java.awt.Color(0, 44, 107));
        lblEndereco2.setText("Opcionais:");

        lblNumero2.setForeground(new java.awt.Color(0, 44, 107));
        lblNumero2.setText("Placa:");

        lblBairro2.setForeground(new java.awt.Color(0, 44, 107));
        lblBairro2.setText("Chassi:");

        lblComplemento2.setForeground(new java.awt.Color(0, 44, 107));
        lblComplemento2.setText("Quilometragem:");

        lblUF2.setForeground(new java.awt.Color(0, 44, 107));
        lblUF2.setText("UF :");

        lblCidade2.setForeground(new java.awt.Color(0, 44, 107));
        lblCidade2.setText("Restrições:");

        cbxUf.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxUfItemStateChanged(evt);
            }
        });

        lblUF3.setForeground(new java.awt.Color(0, 44, 107));
        lblUF3.setText("Nº De Portas :");

        cbxNumeroDePortas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxNumeroDePortasItemStateChanged(evt);
            }
        });

        lblUF4.setForeground(new java.awt.Color(0, 44, 107));
        lblUF4.setText("Renavan:");

        lblUF5.setForeground(new java.awt.Color(0, 44, 107));
        lblUF5.setText("Origem:");

        cbxOrigem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxOrigemItemStateChanged(evt);
            }
        });

        lblUF6.setForeground(new java.awt.Color(0, 44, 107));
        lblUF6.setText("Lotação Máxima:");

        lblUF7.setForeground(new java.awt.Color(0, 44, 107));
        lblUF7.setText("Cilindradas:");

        lblUF8.setForeground(new java.awt.Color(0, 44, 107));
        lblUF8.setText("Marca:");

        cbxMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMarcaItemStateChanged(evt);
            }
        });

        lblUF9.setForeground(new java.awt.Color(0, 44, 107));
        lblUF9.setText("Modelo:");

        cbxModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxModeloItemStateChanged(evt);
            }
        });

        lblUF10.setForeground(new java.awt.Color(0, 44, 107));
        lblUF10.setText("Ano de Fabricação:");

        cbxAnoDeFabricacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAnoDeFabricacaoItemStateChanged(evt);
            }
        });

        lblUF11.setForeground(new java.awt.Color(0, 44, 107));
        lblUF11.setText("Ano de Modelo:");

        cbxAnoDoModelo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAnoDoModeloItemStateChanged(evt);
            }
        });

        lblUF12.setForeground(new java.awt.Color(0, 44, 107));
        lblUF12.setText("Versão:");

        cbxVersao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxVersaoItemStateChanged(evt);
            }
        });

        cbxCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCategoriaItemStateChanged(evt);
            }
        });

        lblUF13.setForeground(new java.awt.Color(0, 44, 107));
        lblUF13.setText("Categoria:");

        lblUF14.setForeground(new java.awt.Color(0, 44, 107));
        lblUF14.setText("Cor:");

        cbxCor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCorItemStateChanged(evt);
            }
        });

        lblUF15.setForeground(new java.awt.Color(0, 44, 107));
        lblUF15.setText("Combustível:");

        cbxCombustivel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCombustivelItemStateChanged(evt);
            }
        });

        lblUF16.setForeground(new java.awt.Color(0, 44, 107));
        lblUF16.setText("     Câmbio:");

        cbxCambio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCambioItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblUF12)
                                .addGap(503, 503, 503)
                                .addComponent(lblUF11)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(lblCidade2)
                                                .addGap(25, 25, 25)
                                                .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(txtRestricao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblUF14))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblUF3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUF6, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblUF9, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxNumeroDePortas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuilometragem)
                            .addComponent(txtLotacaoMaxima)
                            .addComponent(cbxModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxAnoDoModelo, 0, 113, Short.MAX_VALUE)
                            .addComponent(cbxCor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUF4)
                            .addComponent(lblBairro2)
                            .addComponent(lblEndereco2)
                            .addComponent(lblUF7))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(txtPlaca)
                                .addGap(32, 32, 32)
                                .addComponent(lblUF2)
                                .addGap(31, 31, 31)
                                .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblUF5)
                                .addGap(18, 18, 18)
                                .addComponent(cbxOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblUF8)
                                .addGap(18, 18, 18)
                                .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtRenavan, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxVersao, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblUF10)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxAnoDeFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblUF15)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblUF13)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblUF16)
                                .addGap(18, 18, 18)
                                .addComponent(cbxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblComplemento2)))))
                .addGap(42, 42, 42))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero2)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF2)
                    .addComponent(cbxNumeroDePortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro2)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento2)
                    .addComponent(txtQuilometragem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUF4)
                    .addComponent(cbxOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF5)
                    .addComponent(txtRenavan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF6)
                    .addComponent(txtLotacaoMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUF7)
                    .addComponent(txtCilindradas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF8)
                    .addComponent(cbxModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxAnoDeFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF10)
                    .addComponent(lblUF11)
                    .addComponent(cbxAnoDoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxVersao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF13)
                    .addComponent(cbxCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUF14)
                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEndereco2)
                        .addComponent(txtRestricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUF16))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblUF15)))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Registro de Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 44, 107))); // NOI18N

        jLabel4.setText("Ficha de Atendimento:");

        jLabel5.setText("Valor de Compra:");

        txtValorDeCompra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        jLabel6.setText("Valor de Venda:");

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

        cbxFichaDeAtendimento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxFichaDeAtendimentoItemStateChanged(evt);
            }
        });

        txtValorDeVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxFichaDeAtendimento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValorDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtValorDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxFichaDeAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtValorDeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar)
                        .addComponent(btnSalvar))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtValorDeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
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
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
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
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addGap(11, 11, 11)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(18, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbxUfItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxUfItemStateChanged
        recarregarComboBoxCidadeComListaDeCidadesDepoisDaReopcao(evt);
    }//GEN-LAST:event_cbxUfItemStateChanged

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        ClienteView clienteView = new ClienteView();
        clienteView.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        recuperarInformacoesDaTelaEPreencherObjetoCompra();
        limparCamposDaTela();
        compraController.salvarCompra();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        acaoBotaoHome();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void rbnPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaFisicaActionPerformed
        acaoRadioButtonPessoaFisica();
    }//GEN-LAST:event_rbnPessoaFisicaActionPerformed

    private void rbnPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnPessoaJuridicaActionPerformed
        acaoRadioButtonPessoaJuridica();
    }//GEN-LAST:event_rbnPessoaJuridicaActionPerformed

    private void cbxFichaDeAtendimentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxFichaDeAtendimentoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxFichaDeAtendimentoItemStateChanged

    private void cbxNumeroDePortasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxNumeroDePortasItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNumeroDePortasItemStateChanged

    private void cbxOrigemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxOrigemItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxOrigemItemStateChanged

    private void cbxMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMarcaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxMarcaItemStateChanged

    private void cbxModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxModeloItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxModeloItemStateChanged

    private void cbxAnoDeFabricacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAnoDeFabricacaoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAnoDeFabricacaoItemStateChanged

    private void cbxAnoDoModeloItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAnoDoModeloItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAnoDoModeloItemStateChanged

    private void cbxVersaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxVersaoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxVersaoItemStateChanged

    private void cbxCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCategoriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaItemStateChanged

    private void cbxCorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCorItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCorItemStateChanged

    private void cbxCombustivelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCombustivelItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCombustivelItemStateChanged

    private void cbxCambioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCambioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCambioItemStateChanged

  
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
            java.util.logging.Logger.getLogger(CadastroRegistroDeCompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroRegistroDeCompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroRegistroDeCompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroRegistroDeCompraView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxAnoDeFabricacao;
    private javax.swing.JComboBox cbxAnoDoModelo;
    private javax.swing.JComboBox cbxCambio;
    private javax.swing.JComboBox cbxCategoria;
    private javax.swing.JComboBox cbxCidade;
    private javax.swing.JComboBox cbxCombustivel;
    private javax.swing.JComboBox cbxCor;
    private javax.swing.JComboBox cbxFichaDeAtendimento;
    private javax.swing.JComboBox cbxMarca;
    private javax.swing.JComboBox cbxModelo;
    private javax.swing.JComboBox cbxNumeroDePortas;
    private javax.swing.JComboBox cbxOrigem;
    private javax.swing.JComboBox cbxUf;
    private javax.swing.JComboBox cbxVersao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblBairro2;
    private javax.swing.JLabel lblCidade2;
    private javax.swing.JLabel lblComplemento2;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblEndereco2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblUF10;
    private javax.swing.JLabel lblUF11;
    private javax.swing.JLabel lblUF12;
    private javax.swing.JLabel lblUF13;
    private javax.swing.JLabel lblUF14;
    private javax.swing.JLabel lblUF15;
    private javax.swing.JLabel lblUF16;
    private javax.swing.JLabel lblUF2;
    private javax.swing.JLabel lblUF3;
    private javax.swing.JLabel lblUF4;
    private javax.swing.JLabel lblUF5;
    private javax.swing.JLabel lblUF6;
    private javax.swing.JLabel lblUF7;
    private javax.swing.JLabel lblUF8;
    private javax.swing.JLabel lblUF9;
    private javax.swing.JRadioButton rbnPessoaFisica;
    private javax.swing.JRadioButton rbnPessoaJuridica;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF_CNPJ;
    private javax.swing.JTextField txtCilindradas;
    private javax.swing.JTextField txtLotacaoMaxima;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtQuilometragem;
    private javax.swing.JTextField txtRenavan;
    private javax.swing.JTextField txtRestricao;
    private javax.swing.JFormattedTextField txtValorDeCompra;
    private javax.swing.JFormattedTextField txtValorDeVenda;
    // End of variables declaration//GEN-END:variables

   
}
