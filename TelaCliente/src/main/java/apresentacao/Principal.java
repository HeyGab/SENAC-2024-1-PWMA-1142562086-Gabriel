package apresentacao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author niuzi
 */
public final class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();

        ManipulaInterface("Navegar");

    }

    private boolean cpfExisteNaTabela(String cpf) {
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String cpfNaTabela = (String) modelo.getValueAt(i, 1); // Índice 1 representa a coluna do CPF
            if (cpf.equals(cpfNaTabela)) {
                return true; // CPF já existe na tabela
            }
        }
        return false; // CPF não existe na tabela
    }

    public void LoadTable() {
        DefaultTableModel tabela = (DefaultTableModel) tblCliente.getModel();
        Object[] dados = {txtNome.getText(), txtCpf.getText(), txtEmail.getText(), txtFone.getText(),
            txtIdade.getText(), txtNumero.getText(), txtCelular.getText(), txtCep.getText(), txtBairro.getText(),
            txtEstado.getText(), txtCidade.getText(), txtRua.getText()};

        tabela.addRow(dados);

    }

    public void ManipulaInterface(String modo) {
        switch (modo) {

            case "Navegar" -> {
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(false);
                txtNome.setEnabled(false);
                txtCpf.setEnabled(false);
                txtEmail.setEnabled(false);
                txtFone.setEnabled(false);
                txtIdade.setEnabled(false);
                txtNumero.setEnabled(false);
                txtCelular.setEnabled(false);
                txtCep.setEnabled(false);
                txtBairro.setEnabled(false);
                txtEstado.setEnabled(false);
                txtCidade.setEnabled(false);
                txtRua.setEnabled(false);
                jrMasculino.setEnabled(false);
                jrFeminino.setEnabled(false);
            }
            case "Novo" -> {
                btnNovo.setEnabled(false);
                btnSalvar.setEnabled(true);
                btnExcluir.setEnabled(false);
                btnEditar.setEnabled(false);
                txtNome.setEnabled(true);
                txtCpf.setEnabled(true);
                txtEmail.setEnabled(true);
                txtFone.setEnabled(true);
                txtIdade.setEnabled(true);
                txtNumero.setEnabled(true);
                txtCelular.setEnabled(true);
                txtCep.setEnabled(true);
                txtBairro.setEnabled(true);
                txtEstado.setEnabled(true);
                txtCidade.setEnabled(true);
                txtRua.setEnabled(true);
                jrMasculino.setEnabled(true);
                jrFeminino.setEnabled(true);
            }

            case "Editar" -> {
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(true);
                btnEditar.setEnabled(true);
                txtNome.setEnabled(true);
                txtCpf.setEnabled(true);
                txtEmail.setEnabled(true);
                txtFone.setEnabled(true);
                txtIdade.setEnabled(true);
                txtNumero.setEnabled(true);
                txtCelular.setEnabled(true);
                txtCep.setEnabled(true);
                txtBairro.setEnabled(true);
                txtEstado.setEnabled(true);
                txtCidade.setEnabled(true);
                txtRua.setEnabled(true);
                jrMasculino.setEnabled(true);
                jrFeminino.setEnabled(true);
            }

            case "Excluir" -> {
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(true);
                btnEditar.setEnabled(false);
                txtNome.setEnabled(false);
                txtCpf.setEnabled(false);
                txtEmail.setEnabled(false);
                txtFone.setEnabled(false);
                txtIdade.setEnabled(false);
                txtNumero.setEnabled(false);
                txtCelular.setEnabled(false);
                txtCep.setEnabled(false);
                txtBairro.setEnabled(false);
                txtEstado.setEnabled(false);
                txtCidade.setEnabled(false);
                txtRua.setEnabled(false);
                jrMasculino.setEnabled(false);
                jrFeminino.setEnabled(false);
            }
            case "Selecao" -> {
                btnNovo.setEnabled(true);
                btnSalvar.setEnabled(false);
                btnExcluir.setEnabled(true);
                btnEditar.setEnabled(true);
                txtNome.setEnabled(false);
                txtCpf.setEnabled(false);
                txtEmail.setEnabled(false);
                txtFone.setEnabled(false);
                txtIdade.setEnabled(false);
                txtNumero.setEnabled(false);
                txtCelular.setEnabled(false);
                txtCep.setEnabled(false);
                txtBairro.setEnabled(false);
                txtEstado.setEnabled(false);
                txtCidade.setEnabled(false);
                txtRua.setEnabled(false);
                jrMasculino.setEnabled(false);
                jrFeminino.setEnabled(false);
            }
            default ->
                JOptionPane.showMessageDialog(null, "Modo inválido");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jrMasculino = new javax.swing.JRadioButton();
        jrFeminino = new javax.swing.JRadioButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtFone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        txtBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNome.setToolTipText("");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 255));
        jLabel1.setFont(new java.awt.Font("Quartz", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(73, 188, 227));
        jLabel1.setText("Cadastro de clientes");

        txtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeActionPerformed(evt);
            }
        });

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME");
        jLabel2.setToolTipText("");

        jLabel3.setText("CPF");

        jLabel4.setText("CIDADE");

        jLabel5.setText("FIXO");

        jLabel6.setText("IDADE");

        jrMasculino.setText("Masculino");
        jrMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrMasculinoActionPerformed(evt);
            }
        });

        jrFeminino.setText("Feminino");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        try {
            txtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtFone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoneActionPerformed(evt);
            }
        });

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) 9####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel7.setText("CELULAR");

        jLabel8.setText("CEP");

        jLabel9.setText("E-MAIL");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CPF", "FONE", "CIDADE", "E-MAIL", "CELULAR", "IDADE", "BAIRRO", "ESTADO", "NUMERO", "SEXO", "CEP", "Rua"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblClienteMouseReleased(evt);
            }
        });
        tblCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblClienteKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCliente);

        txtBairro.setToolTipText("");

        jLabel10.setText("BAIRRO");
        jLabel10.setToolTipText("");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        jLabel11.setText("Rua");

        jLabel12.setText("ESTADO");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jLabel13.setText("Numero");

        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(txtFone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumero))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(379, 379, 379)
                                        .addComponent(jLabel14)
                                        .addGap(67, 67, 67))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtEstado)
                                                    .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtCep, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtRua)
                                                    .addComponent(txtCidade))))
                                        .addGap(63, 63, 63)
                                        .addComponent(jrMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(jrFeminino, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jrFeminino)
                    .addComponent(jrMasculino))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtFoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoneActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked

        int row = tblCliente.getSelectedRow();
        if (row != -1) {
            // Obtém os dados da linha selecionada
            String nome = tblCliente.getValueAt(row, 0).toString();
            String cpf = tblCliente.getValueAt(row, 1).toString();
            String fone = tblCliente.getValueAt(row, 2).toString();
            String cidade = tblCliente.getValueAt(row, 3).toString();
            String email = tblCliente.getValueAt(row, 4).toString();
            String celular = tblCliente.getValueAt(row, 5).toString();
            String idade = tblCliente.getValueAt(row, 6).toString();
            String bairro = tblCliente.getValueAt(row, 7).toString();
            String estado = tblCliente.getValueAt(row, 8).toString();
            String numero = tblCliente.getValueAt(row, 9).toString();
            String rua = tblCliente.getValueAt(row, 10).toString();
            String cep = tblCliente.getValueAt(row, 11).toString();

            // Preenche os campos de texto com os dados obtidos
            txtNome.setText(nome);
            txtCpf.setText(cpf);
            txtFone.setText(fone);
            txtCidade.setText(cidade);
            txtEmail.setText(email);
            txtCelular.setText(celular);
            txtIdade.setText(idade);
            txtBairro.setText(bairro);
            txtEstado.setText(estado);
            txtNumero.setText(numero);
            txtRua.setText(rua);
            txtCep.setText(cep);

        }
        ManipulaInterface("Selecao");


    }//GEN-LAST:event_tblClienteMouseClicked

    private void tblClienteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseReleased

    }//GEN-LAST:event_tblClienteMouseReleased

    private void tblClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyPressed

    }//GEN-LAST:event_tblClienteKeyPressed

    private void tblClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblClienteKeyReleased

    }//GEN-LAST:event_tblClienteKeyReleased

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtFone.setText("");
        txtIdade.setText("");
        txtNumero.setText("");
        txtCelular.setText("");
        txtCep.setText("");
        txtBairro.setText("");
        txtEstado.setText("");
        txtCidade.setText("");
        txtRua.setText("");

        ManipulaInterface("Novo");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        // Obter o CPF do formulário
        String cpf = txtCpf.getText();

        // Verificar se o CPF já existe na tabela
        if (cpfExisteNaTabela(cpf)) {
            JOptionPane.showMessageDialog(null, "O CPF já existe na tabela.");
            return; // Impede a adição de CPF duplicado
        }

        String genero;
        if (jrMasculino.isSelected()) {
            genero = "Masculino";
        } else if (jrFeminino.isSelected()) {
            genero = "Feminino";
        } else {
            genero = "NÃO INFORMADO";
        }

        DefaultTableModel tabela = (DefaultTableModel) tblCliente.getModel();
        Object[] dados = {txtNome.getText(), txtCpf.getText(), txtFone.getText(), txtCidade.getText(),
            txtEmail.getText(), txtCelular.getText(), txtIdade.getText(), txtBairro.getText(), txtEstado.getText(),
            txtNumero.getText(), genero, txtCep.getText(), txtRua.getText()};

        tabela.addRow(dados);

        //Limpa o campo dee texto
        txtNome.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtFone.setText("");
        txtIdade.setText("");
        txtNumero.setText("");
        txtCelular.setText("");
        txtCep.setText("");
        txtBairro.setText("");
        txtEstado.setText("");
        txtCidade.setText("");
        txtRua.setText("");

        // Restaurar os botões para o estado "Navegar"
        ManipulaInterface("Navegar");
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        if (tblCliente.getSelectedRow() != -1) {
            DefaultTableModel tabela = (DefaultTableModel) tblCliente.getModel();
            tabela.removeRow((tblCliente.getSelectedRow()));
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Produto para excluir!");
        }

        ManipulaInterface("Excluir");
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        String genero;
        if (jrMasculino.isSelected()) {
            genero = "Masculino";
        } else if (jrFeminino.isSelected()) {
            genero = "Feminino";
        } else {
            genero = "NÃO INFORMADO";
        }
        if (tblCliente.getSelectedRow() != -1) {
            tblCliente.setValueAt(txtNome.getText(), tblCliente.getSelectedRow(), 0);
            tblCliente.setValueAt(txtCpf.getText(), tblCliente.getSelectedRow(), 1);
            tblCliente.setValueAt(txtFone.getText(), tblCliente.getSelectedRow(), 2);
            tblCliente.setValueAt(txtCidade.getText(), tblCliente.getSelectedRow(), 3);
            tblCliente.setValueAt(txtEmail.getText(), tblCliente.getSelectedRow(), 4);
            tblCliente.setValueAt(txtCelular.getText(), tblCliente.getSelectedRow(), 5);
            tblCliente.setValueAt(txtIdade.getText(), tblCliente.getSelectedRow(), 6);
            tblCliente.setValueAt(txtBairro.getText(), tblCliente.getSelectedRow(), 7);
            tblCliente.setValueAt(txtEstado.getText(), tblCliente.getSelectedRow(), 8);
            tblCliente.setValueAt(txtNumero.getText(), tblCliente.getSelectedRow(), 9);
            tblCliente.setValueAt(genero, tblCliente.getSelectedRow(), 10);
            tblCliente.setValueAt(txtCep.getText(), tblCliente.getSelectedRow(), 11);
            tblCliente.setValueAt(txtRua.getText(), tblCliente.getSelectedRow(), 12);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Produto para editar!");
        }

        ManipulaInterface("Editar");

    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRuaActionPerformed

    private void jrMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrMasculinoActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jrFeminino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JFormattedTextField txtFone;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables

    private void rowsRemoved(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
