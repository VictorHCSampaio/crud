/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author victor
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() throws ClassNotFoundException {
        initComponents();
//        obterProdutos((DefaultTableModel)tabelaProdutos.getModel());
        obterCategorias();
        tipoTxt.setVisible(false);
    }

    public static void obterProdutos(DefaultTableModel modeloTab){
        modeloTab.setNumRows(0);
        java.util.List<Object []> produtos = controle.ProdutoControle.obterTodos();
        for (Object[] p : produtos){
            modeloTab.addRow(p);
        }       
    }    
    
    public void obterId(DefaultTableModel modeloTab) throws ClassNotFoundException, SQLException{
        modeloTab.setNumRows(0);
        String id = idprodutotxt.getText();        
        if(id.equals("") || controle.ProdutoControle.consultarId(id) == null){            
            mensagemLbl.setText("Nenhum dado foi encontrado!");            
        }else{
        modelo.Produto p = controle.ProdutoControle.consultarId(id);
        Object[] data = new Object[]{p.getId(), p.getNome(), p.getCategoria(), p.getValidade(), p.getQtd_estoque(), p.getFabricacao(), p.getTipo(), p.getFornecedor(), p.getQtd_entrada(), p.getPreco()};
        modeloTab.addRow(data);
        mensagemLbl.setText("Um dado foi consultado");
        }                         
    }
    
    public void obterCategorias() throws ClassNotFoundException{
        java.util.List<String> categs = controle.CategoriaControle.listarTodas();
        for(String c : categs){
            categoriaCmb.addItem(c);
        }
    }
    
    public void esvaziarCampos(){
        nomeprodutoTxt.setText("");
        validadeprodutoTxt.setText("");
        qtdestoqueTxt.setText("");
        fabricacaoTxt.setText("");
        tipoTxt.setText("");
        fornecedorTxt.setText("");
        qtdentradaTxt.setText("");
        precoTxt.setText("");
        idprodutotxt.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        painelBotoes = new javax.swing.JPanel();
        nomeprodutoLbl = new javax.swing.JLabel();
        categoriaCmb = new javax.swing.JComboBox<>();
        categoriaLbl = new javax.swing.JLabel();
        inserirprodutoBtn = new javax.swing.JButton();
        mensagemLbl = new javax.swing.JLabel();
        nomeprodutoTxt = new javax.swing.JTextField();
        excluirBtn = new javax.swing.JButton();
        consultartodosbtn = new javax.swing.JButton();
        consultaridbtn = new javax.swing.JButton();
        idprodutotxt = new javax.swing.JTextField();
        atualizarbtn = new javax.swing.JButton();
        categoriaLbl1 = new javax.swing.JLabel();
        validadeprodutoTxt = new javax.swing.JTextField();
        categoriaLbl2 = new javax.swing.JLabel();
        qtdestoqueTxt = new javax.swing.JTextField();
        categoriaLbl3 = new javax.swing.JLabel();
        fabricacaoTxt = new javax.swing.JTextField();
        categoriaLbl4 = new javax.swing.JLabel();
        tipoTxt = new javax.swing.JTextField();
        categoriaLbl5 = new javax.swing.JLabel();
        fornecedorTxt = new javax.swing.JTextField();
        categoriaLbl6 = new javax.swing.JLabel();
        qtdentradaTxt = new javax.swing.JTextField();
        categoriaLbl7 = new javax.swing.JLabel();
        precoTxt = new javax.swing.JTextField();
        categoriaLbl8 = new javax.swing.JLabel();
        tipocb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "Categoria", "Validade", "qtd_estoque", "Fabricacao", "Tipo", "Fornecedor", "qtd_entrada", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaProdutos.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabelaProdutosAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);

        nomeprodutoLbl.setText("Nome do produto");

        categoriaCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaCmbActionPerformed(evt);
            }
        });

        categoriaLbl.setText("Categoria do produto");

        inserirprodutoBtn.setText("Inserir");
        inserirprodutoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirprodutoBtnActionPerformed(evt);
            }
        });

        mensagemLbl.setText("Mensagem...");

        nomeprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeprodutoTxtActionPerformed(evt);
            }
        });

        excluirBtn.setText("Excluir");
        excluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirBtnActionPerformed(evt);
            }
        });

        consultartodosbtn.setText("Consultar todos");
        consultartodosbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultartodosbtnActionPerformed(evt);
            }
        });

        consultaridbtn.setText("Consultar por id");
        consultaridbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaridbtnActionPerformed(evt);
            }
        });

        idprodutotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idprodutotxtActionPerformed(evt);
            }
        });

        atualizarbtn.setText("Update");
        atualizarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarbtnActionPerformed(evt);
            }
        });

        categoriaLbl1.setText("Validade do Produto");

        validadeprodutoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeprodutoTxtActionPerformed(evt);
            }
        });

        categoriaLbl2.setText("Quantidade de Estoque");

        qtdestoqueTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdestoqueTxtActionPerformed(evt);
            }
        });

        categoriaLbl3.setText("Fabricação");

        fabricacaoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fabricacaoTxtActionPerformed(evt);
            }
        });

        categoriaLbl4.setText("Tipo do Produto");

        tipoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTxtActionPerformed(evt);
            }
        });

        categoriaLbl5.setText("Fornecedor");

        fornecedorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorTxtActionPerformed(evt);
            }
        });

        categoriaLbl6.setText("Quantidade na entrada");

        qtdentradaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtdentradaTxtActionPerformed(evt);
            }
        });

        categoriaLbl7.setText("Preço do produto");

        precoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoTxtActionPerformed(evt);
            }
        });

        categoriaLbl8.setText("ID para consulta");

        tipocb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Perecível", "Perecível" }));

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addComponent(inserirprodutoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarbtn)
                        .addGap(5, 5, 5)
                        .addComponent(consultartodosbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultaridbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(excluirBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mensagemLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addComponent(categoriaLbl4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipocb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                                .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(categoriaLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(categoriaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(categoriaLbl1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(validadeprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(nomeprodutoLbl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nomeprodutoTxt))
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(categoriaLbl2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtdestoqueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(categoriaLbl3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fabricacaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(categoriaLbl5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addComponent(categoriaLbl6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtdentradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelBotoesLayout.createSequentialGroup()
                                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(categoriaLbl7)
                                            .addComponent(categoriaLbl8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(precoTxt)
                                            .addComponent(idprodutotxt))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );

        painelBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {categoriaCmb, categoriaLbl, categoriaLbl1, categoriaLbl2, categoriaLbl3, categoriaLbl4, categoriaLbl5, categoriaLbl6, categoriaLbl7, fabricacaoTxt, fornecedorTxt, nomeprodutoLbl, nomeprodutoTxt, precoTxt, qtdentradaTxt, qtdestoqueTxt, tipoTxt, tipocb, validadeprodutoTxt});

        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeprodutoLbl)
                    .addComponent(nomeprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLbl1)
                    .addComponent(validadeprodutoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLbl2)
                    .addComponent(qtdestoqueTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLbl3)
                    .addComponent(fabricacaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLbl4)
                    .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipocb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLbl5)
                    .addComponent(fornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLbl6)
                    .addComponent(qtdentradaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLbl7)
                    .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idprodutotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaLbl8))
                .addGap(18, 18, 18)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserirprodutoBtn)
                    .addComponent(mensagemLbl)
                    .addComponent(excluirBtn)
                    .addComponent(consultartodosbtn)
                    .addComponent(consultaridbtn)
                    .addComponent(atualizarbtn))
                .addContainerGap())
        );

        painelBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idprodutotxt, precoTxt});

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 35)); // NOI18N
        jLabel1.setText("Cadastro de Produtos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 320, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inserirprodutoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirprodutoBtnActionPerformed
        controle.ProdutoControle pcon = new controle.ProdutoControle();
        String[] Dados = new String[9];
        Dados[0] = nomeprodutoTxt.getText();
        Dados[1] = categoriaCmb.getSelectedItem().toString();
        Dados[2] = validadeprodutoTxt.getText();
        Dados[3] = qtdestoqueTxt.getText();
        Dados[4] = fabricacaoTxt.getText();
        Dados[5] = tipocb.getSelectedItem().toString();
        Dados[6] = fornecedorTxt.getText();
        Dados[7] = qtdentradaTxt.getText();
        Dados[8] = precoTxt.getText();
        try {
            pcon.inserirProduto(Dados);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }        
        esvaziarCampos();
        obterProdutos((DefaultTableModel)tabelaProdutos.getModel());
        JOptionPane.showMessageDialog(this, "Seu dado foi cadastrado com sucesso !");
        mensagemLbl.setText("Cadastrado com sucesso");
    }//GEN-LAST:event_inserirprodutoBtnActionPerformed

    private void nomeprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeprodutoTxtActionPerformed

    private void categoriaCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaCmbActionPerformed

    private void excluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirBtnActionPerformed

        String[] dados = new String[3];
        int linhaselecionada = -1;
        linhaselecionada = tabelaProdutos.getSelectedRow();
        if(linhaselecionada >= 0){
            nomeprodutoTxt.setText((String) tabelaProdutos.getValueAt(linhaselecionada, 1));
            dados[0] = (tabelaProdutos.getValueAt(linhaselecionada, 0)).toString();
            dados[1] = (String)(tabelaProdutos.getValueAt(linhaselecionada, 1));
            dados[2] = (tabelaProdutos.getValueAt(linhaselecionada, 2)).toString();
            try {
                controle.ProdutoControle.excluir(dados);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "linha " +linhaselecionada+ " id= " +dados[0]+ " Nome= " +dados[1]+ " id_categ= " +dados[2]+ " sera removida");
            ((DefaultTableModel)tabelaProdutos.getModel()).removeRow(linhaselecionada);
        }else JOptionPane.showMessageDialog(this, "É necessário selecionar uma linha");
    }//GEN-LAST:event_excluirBtnActionPerformed

    private void tabelaProdutosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabelaProdutosAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaProdutosAncestorAdded

    private void consultartodosbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultartodosbtnActionPerformed
        obterProdutos((DefaultTableModel)tabelaProdutos.getModel());
        mensagemLbl.setText("Todos os dados foram consultados");        
        esvaziarCampos();
    }//GEN-LAST:event_consultartodosbtnActionPerformed

    private void consultaridbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaridbtnActionPerformed
        try {
            obterId((DefaultTableModel)tabelaProdutos.getModel());            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        esvaziarCampos();
    }//GEN-LAST:event_consultaridbtnActionPerformed

    private void idprodutotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idprodutotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idprodutotxtActionPerformed

    private void atualizarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarbtnActionPerformed
        String[] dados = new String[10];
        int linhaselecionada = -1;
        linhaselecionada = tabelaProdutos.getSelectedRow();
        if(linhaselecionada >= 0){                     
            dados[0] = nomeprodutoTxt.getText();
            dados[1] = categoriaCmb.getSelectedItem().toString();
            dados[2] = validadeprodutoTxt.getText();
            dados[3] = qtdestoqueTxt.getText();
            dados[4] = fabricacaoTxt.getText();
            dados[5] = tipocb.getSelectedItem().toString();
            dados[6] = fornecedorTxt.getText();
            dados[7] = qtdentradaTxt.getText();
            dados[8] = precoTxt.getText();
            dados[9] = (tabelaProdutos.getValueAt(linhaselecionada, 0)).toString();
            try{
                controle.ProdutoControle.update(dados);
            }catch(ClassNotFoundException ex){
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }catch (SQLException ex){
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "linha " +linhaselecionada+ " id= " +dados[9]+ " Nome= " +dados[0]+ " id_categ= " +dados[1]+ " sera atualizada");
        }else JOptionPane.showMessageDialog(this, "É necessário selecionar uma linha");
        obterProdutos((DefaultTableModel)tabelaProdutos.getModel());
    }//GEN-LAST:event_atualizarbtnActionPerformed

    private void validadeprodutoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeprodutoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeprodutoTxtActionPerformed

    private void qtdestoqueTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdestoqueTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdestoqueTxtActionPerformed

    private void fabricacaoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fabricacaoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fabricacaoTxtActionPerformed

    private void tipoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTxtActionPerformed

    private void fornecedorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedorTxtActionPerformed

    private void qtdentradaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtdentradaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtdentradaTxtActionPerformed

    private void precoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoTxtActionPerformed

    private void tabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutosMouseClicked
        String[] dados = new String[9];
        int linhaselecionada = -1;
        linhaselecionada = tabelaProdutos.getSelectedRow();
        if(linhaselecionada >= 0){
            nomeprodutoTxt.setText((String) tabelaProdutos.getValueAt(linhaselecionada, 1));            
            dados[0] = (String)(tabelaProdutos.getValueAt(linhaselecionada, 1));
            dados[1] = (tabelaProdutos.getValueAt(linhaselecionada, 2)).toString();
            dados[2] = (String)(tabelaProdutos.getValueAt(linhaselecionada, 3));
            dados[3] = (tabelaProdutos.getValueAt(linhaselecionada, 4)).toString();
            dados[4] = (String)(tabelaProdutos.getValueAt(linhaselecionada, 5));
            dados[5] = (String)(tabelaProdutos.getValueAt(linhaselecionada, 6));
            dados[6] = (String)(tabelaProdutos.getValueAt(linhaselecionada, 7));
            dados[7] = (tabelaProdutos.getValueAt(linhaselecionada, 8)).toString();
            dados[8] = (tabelaProdutos.getValueAt(linhaselecionada, 9)).toString();
            
            modelo.dao.CategoriaDao cdao = new modelo.dao.CategoriaDao();        
            int idcat = (Integer.parseInt(dados[1]));   
            java.util.List<String> categs;
            try {
                categs = controle.CategoriaControle.listarTodas();
                String cat = categs.get(idcat - 1);
                categoriaCmb.setSelectedItem(cat);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            nomeprodutoTxt.setText(dados[0]);            
            validadeprodutoTxt.setText(dados[2]);
            qtdestoqueTxt.setText(dados[3]);
            fabricacaoTxt.setText(dados[4]);
            tipocb.setSelectedItem(dados[5]);
            fornecedorTxt.setText(dados[6]);
            qtdentradaTxt.setText(dados[7]);
            precoTxt.setText(dados[8]);
        }                
    }//GEN-LAST:event_tabelaProdutosMouseClicked

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JanelaPrincipal().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(JanelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarbtn;
    private javax.swing.JComboBox<String> categoriaCmb;
    private javax.swing.JLabel categoriaLbl;
    private javax.swing.JLabel categoriaLbl1;
    private javax.swing.JLabel categoriaLbl2;
    private javax.swing.JLabel categoriaLbl3;
    private javax.swing.JLabel categoriaLbl4;
    private javax.swing.JLabel categoriaLbl5;
    private javax.swing.JLabel categoriaLbl6;
    private javax.swing.JLabel categoriaLbl7;
    private javax.swing.JLabel categoriaLbl8;
    private javax.swing.JButton consultaridbtn;
    private javax.swing.JButton consultartodosbtn;
    private javax.swing.JButton excluirBtn;
    private javax.swing.JTextField fabricacaoTxt;
    private javax.swing.JTextField fornecedorTxt;
    private javax.swing.JTextField idprodutotxt;
    private javax.swing.JButton inserirprodutoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mensagemLbl;
    private javax.swing.JLabel nomeprodutoLbl;
    private javax.swing.JTextField nomeprodutoTxt;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JTextField precoTxt;
    private javax.swing.JTextField qtdentradaTxt;
    private javax.swing.JTextField qtdestoqueTxt;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JComboBox<String> tipocb;
    private javax.swing.JTextField validadeprodutoTxt;
    // End of variables declaration//GEN-END:variables
}
