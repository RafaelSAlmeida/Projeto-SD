/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.google.gson.Gson;
import controller.ProcessadorCliente;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.DisciplinaVO;

/**
 *
 * @author Cleberson
 */
public class Disciplina extends javax.swing.JFrame {

    ProcessadorCliente processador;
    Gson gson;

    public Disciplina(ProcessadorCliente processador) {
        initComponents();
        gson = new Gson();
        this.processador = processador;
        setLocationRelativeTo(null);
    }

    private void controleCrud(boolean b) {
        jButtonCancelar.setEnabled(!b);
        jButtonInclur.setEnabled(b);
        jButtonEditar.setEnabled(b);
        jButtonExcluir.setEnabled(b);
        jButtonGravar.setEnabled(!b);
        jButtonPesquisar.setEnabled(b);
        habilitaCampo(!b);
    }

    private void limpaCampo() {
        jTextAreaEmenta.setText("");
        jTextFieldCodigo.setText("");
        jTextFieldDependencia.setText("");
        jTextFieldModelo.setText("");
        jTextFieldpreRequisito.setText("");
        jTextFieldtituloDisciplina.setText("");
    }

    private void habilitaCampo(boolean c) {
        jTextAreaEmenta.setEnabled(c);
        jTextFieldDependencia.setEnabled(c);
        jTextFieldModelo.setEnabled(c);
        jTextFieldpreRequisito.setEnabled(c);
        jTextFieldtituloDisciplina.setEnabled(c);
    }

    private String montarMensagem(int protocolo, DisciplinaVO disciplinaVO, String nomeTabela) {
        return "" + protocolo + "#" + nomeTabela + "#" + gson.toJson(disciplinaVO);
    }

    private String tratarMensagemServidor(String msg) {
        String[] quebra = msg.split(Pattern.quote("#"));
        if (quebra[0].equals("5")) {
            return quebra[1];
        } else {
            return quebra[2];
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCrud = new javax.swing.JPanel();
        jButtonInclur = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jPanelConteudo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldpreRequisito = new javax.swing.JTextField();
        jTextFieldDependencia = new javax.swing.JTextField();
        jTextFieldtituloDisciplina = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaEmenta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gestão de Disciplinas");

        jPanelCrud.setLayout(new javax.swing.BoxLayout(jPanelCrud, javax.swing.BoxLayout.LINE_AXIS));

        jButtonInclur.setText("Incluir");
        jButtonInclur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInclurActionPerformed(evt);
            }
        });
        jPanelCrud.add(jButtonInclur);

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanelCrud.add(jButtonEditar);

        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });
        jPanelCrud.add(jButtonGravar);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanelCrud.add(jButtonCancelar);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        jPanelCrud.add(jButtonExcluir);

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });
        jPanelCrud.add(jButtonPesquisar);

        getContentPane().add(jPanelCrud, java.awt.BorderLayout.PAGE_START);

        jLabel1.setText("Codigo");

        jLabel2.setText("Pré-requisito");

        jLabel3.setText("Dependencia");

        jLabel4.setText("Título");

        jLabel5.setText("Método de Avaliação");

        jLabel6.setText("Ementa");

        jTextFieldCodigo.setForeground(new java.awt.Color(0, 0, 204));
        jTextFieldCodigo.setEnabled(false);

        jTextFieldpreRequisito.setEnabled(false);

        jTextFieldDependencia.setEnabled(false);

        jTextFieldtituloDisciplina.setEnabled(false);

        jTextFieldModelo.setEnabled(false);

        jTextAreaEmenta.setColumns(20);
        jTextAreaEmenta.setRows(5);
        jTextAreaEmenta.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaEmenta);

        javax.swing.GroupLayout jPanelConteudoLayout = new javax.swing.GroupLayout(jPanelConteudo);
        jPanelConteudo.setLayout(jPanelConteudoLayout);
        jPanelConteudoLayout.setHorizontalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConteudoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldpreRequisito)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldtituloDisciplina)
                    .addComponent(jTextFieldDependencia, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelConteudoLayout.setVerticalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConteudoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldpreRequisito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldDependencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldtituloDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelConteudo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInclurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInclurActionPerformed
        controleCrud(false);
        limpaCampo();
    }//GEN-LAST:event_jButtonInclurActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        controleCrud(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        String mensagem;
        String retornoServidor = "";
        DisciplinaVO disciplinavo = new DisciplinaVO();

        disciplinavo.setDependencia(jTextFieldDependencia.getText());
        disciplinavo.setEmenta(jTextAreaEmenta.getText());
        disciplinavo.setMetodo_avaliacao(jTextFieldModelo.getText());
        disciplinavo.setPre_requisito(jTextFieldpreRequisito.getText());
        disciplinavo.setTitulo(jTextFieldtituloDisciplina.getText());

        if (jTextFieldCodigo.getText().equals("")) { // se não possui codigo é uma inserção (id preenche automatico no bd)
            mensagem = montarMensagem(1, disciplinavo, "disciplina");
        } else {
            disciplinavo.setDisciplina_id(Integer.parseInt(jTextFieldCodigo.getText()));
            mensagem = montarMensagem(2, disciplinavo, "disciplina");
        }

        processador.enviarMensagem(mensagem);
        while (!processador.isRecebeuMsg()) {
            /* gambiarra para aguardar o retorno do servidor :D */
        }

        retornoServidor = processador.getConteudoRecebido();
        JOptionPane.showMessageDialog(null, tratarMensagemServidor(retornoServidor), "Resposta do Servidor", JOptionPane.INFORMATION_MESSAGE);

        controleCrud(true);
        limpaCampo();
    }//GEN-LAST:event_jButtonGravarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        controleCrud(true);
        limpaCampo();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o registro?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0) {
            if (jTextFieldCodigo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Selecione o registro que deseja remover antes de efetuar a operação.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                String mensagem;
                String retornoServidor = "";
                DisciplinaVO disciplinavo = new DisciplinaVO();

                disciplinavo.setDisciplina_id(Integer.parseInt(jTextFieldCodigo.getText()));
                disciplinavo.setDependencia(jTextFieldDependencia.getText());
                disciplinavo.setEmenta(jTextAreaEmenta.getText());
                disciplinavo.setMetodo_avaliacao(jTextFieldModelo.getText());
                disciplinavo.setPre_requisito(jTextFieldpreRequisito.getText());
                disciplinavo.setTitulo(jTextFieldtituloDisciplina.getText());

                mensagem = montarMensagem(3, disciplinavo, "disciplina");
                processador.enviarMensagem(mensagem);
                while (!processador.isRecebeuMsg()) {
                    /* gambiarra para aguardar o retorno do servidor :D */
                }
                retornoServidor = processador.getConteudoRecebido();
                JOptionPane.showMessageDialog(null, tratarMensagemServidor(retornoServidor), "Resposta do Servidor", JOptionPane.INFORMATION_MESSAGE);
                limpaCampo();
            }
        }
        controleCrud(true);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String mensagem;
        String retornoServidor = "";
        DisciplinaVO disciplinavo = new DisciplinaVO();

        String termoBusca = "";
        termoBusca = JOptionPane.showInputDialog("Digite o NOME DA DISCIPLINA que deseja buscar:");

        if (!termoBusca.equals("")) {
            // -- Estou setando tudo pra evitar de travar. Não precisa (eu acho).
            disciplinavo.setDependencia("");
            disciplinavo.setEmenta("");
            disciplinavo.setMetodo_avaliacao("");
            disciplinavo.setPre_requisito("");
            disciplinavo.setDisciplina_id(0);
            // --
            disciplinavo.setTitulo(termoBusca);
            
            mensagem = montarMensagem(4, disciplinavo, "disciplina");
            processador.enviarMensagem(mensagem);
            while (!processador.isRecebeuMsg()) {
                /* gambiarra para aguardar o retorno do servidor :D */
            }
            disciplinavo = gson.fromJson(tratarMensagemServidor(processador.getConteudoRecebido()), DisciplinaVO.class);

            if (disciplinavo != null) {
                jTextAreaEmenta.setText(disciplinavo.getEmenta());
                jTextFieldCodigo.setText("" + disciplinavo.getDisciplina_id());
                jTextFieldDependencia.setText(disciplinavo.getDependencia());
                jTextFieldModelo.setText(disciplinavo.getMetodo_avaliacao());
                jTextFieldpreRequisito.setText(disciplinavo.getPre_requisito());
                jTextFieldtituloDisciplina.setText(disciplinavo.getTitulo());
            }
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Disciplina().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonInclur;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JPanel jPanelCrud;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaEmenta;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDependencia;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldpreRequisito;
    private javax.swing.JTextField jTextFieldtituloDisciplina;
    // End of variables declaration//GEN-END:variables
}
