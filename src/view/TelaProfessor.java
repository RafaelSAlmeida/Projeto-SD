/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import com.google.gson.Gson;
import controller.ProcessadorCliente;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.ProfessorVO;

/**
 *
 * @author Rauch
 */
public class TelaProfessor extends javax.swing.JFrame {
    
    ProcessadorCliente processador;
    Gson gson;

    public TelaProfessor(ProcessadorCliente processador) {
        initComponents();
        gson = new Gson();
        this.processador = processador;
        setLocationRelativeTo(null);
    }
    
    private void controleCrud(boolean b) {
        jButtonCancelar.setEnabled(!b);
        jButtonIncluir.setEnabled(b);
        jButtonEditar.setEnabled(b);
        jButtonExcluir.setEnabled(b);
        jButtonGravar.setEnabled(!b);
        jButtonPesquisar.setEnabled(b);
        habilitaCampo(!b);
    }
    
     private void limpaCampo() {
        jTextFieldCodigo.setText("");
        jTextFieldDepartamento.setText("");
        jTextFieldDisciplina.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldIdade.setText("");
        jTextFieldLinhaPesquisa.setText("");
        jTextFieldNome.setText("");
        jTextFieldRA.setText("");
    }
    
    private void habilitaCampo(boolean c) {
        jTextFieldCodigo.setEnabled(c);
        jTextFieldDepartamento.setEnabled(c);
        jTextFieldDisciplina.setEnabled(c);
        jTextFieldEndereco.setEnabled(c);
        jTextFieldIdade.setEnabled(c);
        jTextFieldLinhaPesquisa.setEnabled(c);
        jTextFieldNome.setEnabled(c);
        jTextFieldRA.setEnabled(c);
    }
    
    private String montarMensagem(int protocolo, ProfessorVO professorVO, String nomeTabela) {
        return "" + protocolo + "#" + nomeTabela + "#" + gson.toJson(professorVO);
    }
    
    private String tratarMensagemServidor(String msg) {
        String[] quebra = msg.split(Pattern.quote("#"));
        if (quebra[0].equals("5")) {
            return quebra[1];
        } else {
            return quebra[2];
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

        jButtonIncluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldRA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldDepartamento = new javax.swing.JTextField();
        jTextFieldLinhaPesquisa = new javax.swing.JTextField();
        jTextFieldDisciplina = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonIncluir.setText("Incluir");
        jButtonIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIncluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonGravar.setText("Gravar");
        jButtonGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("RA");

        jLabel4.setText("Nome");

        jLabel5.setText("Idade");

        jLabel6.setText("Endereço");

        jLabel7.setText("Departamento");

        jLabel8.setText("Linhas de Pesquisa");

        jLabel9.setText("Disciplinas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPesquisar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(296, 296, 296))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jTextFieldCodigo)
                            .addComponent(jTextFieldRA)
                            .addComponent(jTextFieldIdade)
                            .addComponent(jTextFieldEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDepartamento)
                            .addComponent(jTextFieldLinhaPesquisa)
                            .addComponent(jTextFieldDisciplina))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIncluir)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonPesquisar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldLinhaPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIncluirActionPerformed
        controleCrud(false);
        limpaCampo();
    }//GEN-LAST:event_jButtonIncluirActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        controleCrud(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarActionPerformed
        String mensagem;
        String retornoServidor = "";
        ProfessorVO professorvo = new ProfessorVO();

        professorvo.setDepartamento(jTextFieldDepartamento.getText());
        professorvo.setDisciplinas(jTextFieldDisciplina.getText());
        professorvo.setEndereco(jTextFieldEndereco.getText());
        professorvo.setIdade(Integer.parseInt(jTextFieldIdade.getText()));
        professorvo.setLinha_pesquisa(jTextFieldLinhaPesquisa.getText());
        professorvo.setNome(jTextFieldNome.getText());
        professorvo.setRA(Integer.parseInt(jTextFieldRA.getText()));      

        if (jTextFieldCodigo.getText().equals("")) { // se não possui codigo é uma inserção (id preenche automatico no bd)
            mensagem = montarMensagem(1, professorvo, "professor");
        } else {
            professorvo.setProfessor_id(Integer.parseInt(jTextFieldCodigo.getText()));
            mensagem = montarMensagem(2, professorvo, "disciplina");
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
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover o registro?", "Confirmação", JOptionPane.YES_NO_OPTION) == 0){
            if (jTextFieldCodigo.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Selecione o registro que deseja remover antes de efetuar a operação.", "Erro", JOptionPane.ERROR_MESSAGE);
            }else{
                String mensagem;
                String retornoServidor = "";
                ProfessorVO professorvo = new ProfessorVO();
                
                professorvo.setProfessor_id(Integer.parseInt(jTextFieldCodigo.getText()));
                professorvo.setDepartamento(jTextFieldDepartamento.getText());
                professorvo.setDisciplinas(jTextFieldDisciplina.getText());
                professorvo.setEndereco(jTextFieldEndereco.getText());
                professorvo.setIdade(Integer.parseInt(jTextFieldIdade.getText()));
                professorvo.setLinha_pesquisa(jTextFieldLinhaPesquisa.getText());
                professorvo.setNome(jTextFieldNome.getText());
                professorvo.setRA(Integer.parseInt(jTextFieldRA.getText()));
                
                mensagem = montarMensagem(3, professorvo, "professor");
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
        ProfessorVO professorvo = new ProfessorVO();
        
        String termoBusca = "";
        termoBusca = JOptionPane.showInputDialog("Digite o NOME DA DISCIPLINA que deseja buscar:");

        if (!termoBusca.equals("")) {
            //vou modificar esta parte
            professorvo.setDepartamento("");
            professorvo.setDisciplinas("");
            professorvo.setEndereco("");
            //professorvo.setIdade("");
            professorvo.setLinha_pesquisa("");
            //professorvo.setRA("");
            professorvo.setProfessor_id(0);
            professorvo.setNome(termoBusca);
            
            mensagem = montarMensagem(4, professorvo, "professor");
            processador.enviarMensagem(mensagem);
            while (!processador.isRecebeuMsg()) {
                /* gambiarra para aguardar o retorno do servidor :D */
            }
            professorvo = gson.fromJson(tratarMensagemServidor(processador.getConteudoRecebido()), ProfessorVO.class);

            if (professorvo != null) {
                jTextFieldCodigo.setText("" + professorvo.getProfessor_id());
                jTextFieldDepartamento.setText(professorvo.getDepartamento());
                jTextFieldDisciplina.setText(professorvo.getDisciplinas());
                jTextFieldEndereco.setText(professorvo.getEndereco());
                jTextFieldIdade.setText("" + professorvo.getIdade());
                jTextFieldLinhaPesquisa.setText(professorvo.getLinha_pesquisa());
                jTextFieldNome.setText(professorvo.getNome());
                jTextFieldRA.setText("" + professorvo.getRA());
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 //new TelaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonIncluir;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldDepartamento;
    private javax.swing.JTextField jTextFieldDisciplina;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldLinhaPesquisa;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRA;
    // End of variables declaration//GEN-END:variables
}