/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import classes.Automovel;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Guilherme
 */
public class NewJFrame extends javax.swing.JFrame {
        private Automovel automovel;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        automovel = new Automovel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfPlaca = new javax.swing.JTextField();
        lbModelo = new javax.swing.JLabel();
        tfModelo = new javax.swing.JTextField();
        btAdicionar = new javax.swing.JButton();
        lbDataFabricacao = new javax.swing.JLabel();
        tfDataFabricacao = new javax.swing.JTextField();
        lbMotorizacao = new javax.swing.JLabel();
        cbMotorizacao = new javax.swing.JComboBox<>();
        lbValorBasico = new javax.swing.JLabel();
        tfValorBasico = new javax.swing.JTextField();
        pnCategoria = new javax.swing.JPanel();
        rbPasseio = new javax.swing.JRadioButton();
        rbUtilitario = new javax.swing.JRadioButton();
        rbCarga = new javax.swing.JRadioButton();
        lbAliquota = new javax.swing.JLabel();
        tfAliquota = new javax.swing.JTextField();
        btCalcularValorTotal = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbImposto = new javax.swing.JLabel();
        tfImposto = new javax.swing.JTextField();
        lbValorTotalCompra = new javax.swing.JLabel();
        tfValorTotalCompra = new javax.swing.JTextField();
        lbDadosAutomovel = new javax.swing.JLabel();
        spDadosAutomovel = new javax.swing.JScrollPane();
        taDadosAutomovel = new javax.swing.JTextArea();
        btExibir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Automóveis");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Placa:");

        tfPlaca.setBackground(new java.awt.Color(0, 0, 102));
        tfPlaca.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfPlaca.setForeground(new java.awt.Color(255, 255, 0));
        tfPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPlacaActionPerformed(evt);
            }
        });
        tfPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPlacaKeyReleased(evt);
            }
        });

        lbModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbModelo.setText("Modelo:");

        btAdicionar.setBackground(new java.awt.Color(204, 204, 204));
        btAdicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btAdicionar.setText("Adicionar");
        btAdicionar.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createCompoundBorder()));
        btAdicionar.setEnabled(false);
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        lbDataFabricacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDataFabricacao.setText("Data de Fabricação:");

        lbMotorizacao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMotorizacao.setText("Motorização:");

        cbMotorizacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbMotorizacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "1.1", "1.2", "1.3" }));
        cbMotorizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMotorizacaoActionPerformed(evt);
            }
        });

        lbValorBasico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbValorBasico.setText("Valor básico");

        pnCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        pnCategoria.setForeground(new java.awt.Color(255, 255, 255));

        rbPasseio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbPasseio.setText("Passeio");

        rbUtilitario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbUtilitario.setText("Utilitário");

        rbCarga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbCarga.setText("Carga");

        javax.swing.GroupLayout pnCategoriaLayout = new javax.swing.GroupLayout(pnCategoria);
        pnCategoria.setLayout(pnCategoriaLayout);
        pnCategoriaLayout.setHorizontalGroup(
            pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbPasseio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(rbUtilitario)
                .addGap(61, 61, 61)
                .addComponent(rbCarga)
                .addGap(43, 43, 43))
        );
        pnCategoriaLayout.setVerticalGroup(
            pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPasseio)
                    .addComponent(rbUtilitario)
                    .addComponent(rbCarga))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lbAliquota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbAliquota.setText("Alíquota de Imposto");

        tfAliquota.setEnabled(false);
        tfAliquota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfAliquotaKeyReleased(evt);
            }
        });

        btCalcularValorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCalcularValorTotal.setText("Calcular Valor Total");
        btCalcularValorTotal.setEnabled(false);
        btCalcularValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularValorTotalActionPerformed(evt);
            }
        });

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btLimpar.setForeground(new java.awt.Color(255, 0, 0));
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lbImposto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbImposto.setText("Imposto a Pagar");

        tfImposto.setEditable(false);
        tfImposto.setBackground(new java.awt.Color(204, 204, 204));

        lbValorTotalCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbValorTotalCompra.setText("Valor Total de Compra");

        tfValorTotalCompra.setEditable(false);
        tfValorTotalCompra.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfImposto)
                    .addComponent(lbImposto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValorTotalCompra)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(tfValorTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbImposto)
                    .addComponent(lbValorTotalCompra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfImposto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotalCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbDadosAutomovel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDadosAutomovel.setText("Dados do Automóvel");

        taDadosAutomovel.setEditable(false);
        taDadosAutomovel.setColumns(20);
        taDadosAutomovel.setRows(5);
        spDadosAutomovel.setViewportView(taDadosAutomovel);

        btExibir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExibir.setText("Exibir");
        btExibir.setEnabled(false);
        btExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExibirActionPerformed(evt);
            }
        });
        btExibir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btExibirKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(tfAliquota, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lbAliquota)
                                        .addGap(18, 18, 18)))
                                .addComponent(btCalcularValorTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimpar)))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spDadosAutomovel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbModelo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(93, 93, 93)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(lbDataFabricacao)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(8, 8, 8)
                                            .addComponent(tfDataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbMotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbMotorizacao))
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbValorBasico)
                                        .addComponent(tfValorBasico, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbDadosAutomovel)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDataFabricacao)
                    .addComponent(lbMotorizacao)
                    .addComponent(lbValorBasico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfDataFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfValorBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMotorizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAliquota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAliquota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                        .addComponent(btCalcularValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDadosAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spDadosAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExibir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        try{
        String categoria = null;
        if(rbPasseio.isSelected()){
            categoria = "Passeio";
        }else if(rbUtilitario.isSelected()){
            categoria = "Utilitário";
        }else if(rbCarga.isSelected()){
            categoria = "Carga";
        }
        automovel.setPlaca(tfPlaca.getText()); 
        automovel.setModelo(tfModelo.getText());
        automovel.setDataFabricacao(tfDataFabricacao.getText());
        automovel.setMotorizacao(cbMotorizacao.getSelectedItem().toString());
        automovel.setValorBasico(Double.parseDouble(tfValorBasico.getText()));
        automovel.setCategoria(categoria);
        tfAliquota.setEnabled(true);
        }catch(Exception e){
            System.out.println("Por favor, preencha todos os dados");
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os dados", "Advertência", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAdicionarActionPerformed

    private void btCalcularValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularValorTotalActionPerformed
        try{
        double impostos = automovel.calcularImposto(Double.parseDouble(tfAliquota.getText()));
        double total = automovel.valorTotalDoVeiculo(Double.parseDouble(tfAliquota.getText()));
        tfImposto.setText(Double.toString(impostos));
        tfValorTotalCompra.setText(Double.toString(total));
        btExibir.setEnabled(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas números", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btCalcularValorTotalActionPerformed

    private void cbMotorizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMotorizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMotorizacaoActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
            tfAliquota.setText("");
            tfPlaca.setText("");
            tfDataFabricacao.setText("");
            tfImposto.setText("");
            tfModelo.setText("");
            tfImposto.setText("");
            tfValorBasico.setText("");
            tfValorTotalCompra.setText("");
            rbPasseio.setSelected(false);
            rbCarga.setSelected(false);
            rbUtilitario.setSelected(false);
            taDadosAutomovel.setText("");
            cbMotorizacao.setSelectedIndex(-1);
            tfPlaca.requestFocus();
            btAdicionar.setEnabled(false);
            tfAliquota.setEnabled(false);
            btCalcularValorTotal.setEnabled(false);
            btExibir.setEnabled(false);
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExibirActionPerformed
        if(automovel != null){
           taDadosAutomovel.setText(automovel.exibirInformacoes()); 
        }  
    }//GEN-LAST:event_btExibirActionPerformed

    private void tfPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPlacaKeyReleased
        if(!tfPlaca.getText().isEmpty()){
            btAdicionar.setEnabled(true);
        }
    }//GEN-LAST:event_tfPlacaKeyReleased

    private void tfPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPlacaActionPerformed

    private void tfAliquotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAliquotaKeyReleased
        if(!tfAliquota.getText().isEmpty()){
            btCalcularValorTotal.setEnabled(true);
        }
    }//GEN-LAST:event_tfAliquotaKeyReleased

    private void btExibirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btExibirKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btExibirKeyReleased

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btCalcularValorTotal;
    private javax.swing.JButton btExibir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox<String> cbMotorizacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbAliquota;
    private javax.swing.JLabel lbDadosAutomovel;
    private javax.swing.JLabel lbDataFabricacao;
    private javax.swing.JLabel lbImposto;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbMotorizacao;
    private javax.swing.JLabel lbValorBasico;
    private javax.swing.JLabel lbValorTotalCompra;
    private javax.swing.JPanel pnCategoria;
    private javax.swing.JRadioButton rbCarga;
    private javax.swing.JRadioButton rbPasseio;
    private javax.swing.JRadioButton rbUtilitario;
    private javax.swing.JScrollPane spDadosAutomovel;
    private javax.swing.JTextArea taDadosAutomovel;
    private javax.swing.JTextField tfAliquota;
    private javax.swing.JTextField tfDataFabricacao;
    private javax.swing.JTextField tfImposto;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPlaca;
    private javax.swing.JTextField tfValorBasico;
    private javax.swing.JTextField tfValorTotalCompra;
    // End of variables declaration//GEN-END:variables
}
