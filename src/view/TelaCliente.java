package view;

import controller.ProcessadorCliente;
import View.Disciplina;
import java.awt.Color;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Gian
 */
public class TelaCliente extends javax.swing.JFrame {

    ProcessadorCliente processador;
    boolean conectado = false;
    int portaServidor = 0;
    InetAddress enderecoServidor = null;

    public TelaCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static void gravarLog(JTextPane pane, String mensagem, Color corMensagem) {
        SimpleAttributeSet set = new SimpleAttributeSet();
        StyleConstants.setForeground(set, corMensagem);
        Document doc = pane.getStyledDocument();

        try {
            doc.insertString(doc.getLength(), " " + mensagem, set);
            StyleConstants.setForeground(set, Color.BLACK);
        } catch (BadLocationException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a gravação de log.\n"
                    + "Mensagem a ser inserida: " + mensagem + "\n"
                    + "Mensagem de erro: " + e.getMessage());
        }
    }

    private void btnConectar() {
        jTextFieldPorta.setEnabled(conectado);
        jTextFieldEnderecoIp.setEnabled(conectado);
        if (conectado) {
            jButtonConectar.setText("Conectar");
            gravarLog(jTextPaneLog, "O recebimento de mensagens foi interrompido (Thread).\n", Color.blue);
        } else {
            jButtonConectar.setText("Desconectar");
        }
        conectado = !conectado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelAbas = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jTabbedPaneAbas = new javax.swing.JTabbedPane();
        jPanelConteudo = new javax.swing.JPanel();
        jButtonDisciplinas = new javax.swing.JButton();
        jButtonAlunos = new javax.swing.JButton();
        jButtonProfessor = new javax.swing.JButton();
        jButtonSalas = new javax.swing.JButton();
        jButtonAulas1 = new javax.swing.JButton();
        jPanelLogs = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneLog = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jPanelHeader = new javax.swing.JPanel();
        jPanelCabecalho = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPorta = new javax.swing.JTextField();
        jButtonConectar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEnderecoIp = new javax.swing.JTextField();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cliente - Sistemas Distribuídos/Engenharia de Software");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jTabbedPaneAbas.setForeground(new java.awt.Color(255, 0, 0));

        jButtonDisciplinas.setText("Disciplinas");
        jButtonDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisciplinasActionPerformed(evt);
            }
        });

        jButtonAlunos.setText("Alunos");
        jButtonAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlunosActionPerformed(evt);
            }
        });

        jButtonProfessor.setText("Professores");
        jButtonProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfessorActionPerformed(evt);
            }
        });

        jButtonSalas.setText("Salas");
        jButtonSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalasActionPerformed(evt);
            }
        });

        jButtonAulas1.setText("Aulas");
        jButtonAulas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAulas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelConteudoLayout = new javax.swing.GroupLayout(jPanelConteudo);
        jPanelConteudo.setLayout(jPanelConteudoLayout);
        jPanelConteudoLayout.setHorizontalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAlunos, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDisciplinas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSalas, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAulas1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConteudoLayout.setVerticalGroup(
            jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConteudoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDisciplinas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAulas1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        jTabbedPaneAbas.addTab("Gestão", jPanelConteudo);

        jPanelLogs.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jScrollPane1.setViewportView(jTextPaneLog);

        jButton1.setText("Limpar Logs");
        jButton1.setToolTipText("Limpa todas as informações de logs que estão impressas na interface.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogsLayout = new javax.swing.GroupLayout(jPanelLogs);
        jPanelLogs.setLayout(jPanelLogsLayout);
        jPanelLogsLayout.setHorizontalGroup(
            jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanelLogsLayout.setVerticalGroup(
            jPanelLogsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLogsLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneAbas.addTab("Logs", jPanelLogs);

        javax.swing.GroupLayout jPanelAbasLayout = new javax.swing.GroupLayout(jPanelAbas);
        jPanelAbas.setLayout(jPanelAbasLayout);
        jPanelAbasLayout.setHorizontalGroup(
            jPanelAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPaneAbas)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanelAbasLayout.setVerticalGroup(
            jPanelAbasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAbasLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jTabbedPaneAbas)
                .addContainerGap())
        );

        getContentPane().add(jPanelAbas, java.awt.BorderLayout.CENTER);

        jPanelCabecalho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 255)));

        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Porta:");

        jTextFieldPorta.setText("12345");

        jButtonConectar.setText("Conectar");
        jButtonConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConectarActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Endereço IP:");

        jTextFieldEnderecoIp.setText("192.168.1.3");

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCabecalhoLayout = new javax.swing.GroupLayout(jPanelCabecalho);
        jPanelCabecalho.setLayout(jPanelCabecalhoLayout);
        jPanelCabecalhoLayout.setHorizontalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCabecalhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEnderecoIp, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConectar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButtonFechar))
        );
        jPanelCabecalhoLayout.setVerticalGroup(
            jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCabecalhoLayout.createSequentialGroup()
                .addGroup(jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jTextFieldPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jTextFieldEnderecoIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonConectar))
                    .addComponent(jButtonFechar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelHeader, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConectarActionPerformed
        if (!conectado) {
            try {
                this.portaServidor = Integer.parseInt(getjTextFieldPorta().getText());
            } catch (Exception e) {
                getjTextFieldPorta().requestFocus();
                getjTextFieldPorta().selectAll();
                JOptionPane.showMessageDialog(null, "O valor digitado para a PORTA deve conter apenas números. Por favor verifique.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
                this.enderecoServidor = InetAddress.getByName(jTextFieldEnderecoIp.getText());
            } catch (UnknownHostException ex) {
                jTextFieldEnderecoIp.requestFocus();
                jTextFieldEnderecoIp.selectAll();
                JOptionPane.showMessageDialog(null, "O endereço IP digitado está incorreto. Por favor verifique.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            processador = new ProcessadorCliente(this.enderecoServidor, this.portaServidor, this);
        }
        btnConectar();
    }//GEN-LAST:event_jButtonConectarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextPaneLog.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        try {
            processador.setServidorLigado(false);
            processador.getReceberMensagem().interrupt();
            processador.getDatagramSocket().close();
        } catch(Exception e) {}
        JOptionPane.showMessageDialog(null, "Pressione OK para encerrar...");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisciplinasActionPerformed
        Disciplina disciplina = new Disciplina(processador);
        disciplina.setVisible(true);
    }//GEN-LAST:event_jButtonDisciplinasActionPerformed

    private void jButtonAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlunosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlunosActionPerformed

    private void jButtonProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProfessorActionPerformed

    private void jButtonSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalasActionPerformed

    private void jButtonAulas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAulas1ActionPerformed
        Aulas aula = new Aulas(processador);
        aula.setVisible(true);
    }//GEN-LAST:event_jButtonAulas1ActionPerformed

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TelaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAlunos;
    private javax.swing.JButton jButtonAulas1;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonDisciplinas;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonProfessor;
    private javax.swing.JButton jButtonSalas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelAbas;
    private javax.swing.JPanel jPanelCabecalho;
    private javax.swing.JPanel jPanelConteudo;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelLogs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPaneAbas;
    private javax.swing.JTextField jTextFieldEnderecoIp;
    private javax.swing.JTextField jTextFieldPorta;
    private javax.swing.JTextPane jTextPaneLog;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTextFieldPorta
     */
    public javax.swing.JTextField getjTextFieldPorta() {
        return jTextFieldPorta;
    }

    /**
     * @return the jTextPaneLog
     */
    public javax.swing.JTextPane getjTextPaneLog() {
        return jTextPaneLog;
    }
}
