package controller;

import java.awt.Color;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import view.TelaCliente;

/**
 *
 * @author Gian
 */
public class ProcessadorCliente {

    TelaCliente telaCliente;
    private DatagramSocket datagramSocket = null;
    DatagramPacket datagramPacket = null;
    InetAddress enderecoServidor = null;
    int portaServidor = 0;
    byte[] tamanhoPacote = null;
    private String conteudoRecebido;
    private boolean recebeuMsg = false;

    private boolean servidorLigado = true;

    public ProcessadorCliente(InetAddress endereco, int porta, TelaCliente telaCliente) {
        this.enderecoServidor = endereco;
        this.portaServidor = porta;
        this.telaCliente = telaCliente;
        estabelecerConexao();
    }

    /**
     * Método responsável por criar o socket na porta desejada e inicializar a
     * thread de recebimento.
     */
    private void estabelecerConexao() {
        try {
            this.datagramSocket = new DatagramSocket();
            gravarLog("----------\nSocket criado\n", Color.blue);
        } catch (SocketException ex) {
            gravarLog("Não foi possível criar o Socket. Mensagem de erro: " + ex.getMessage() + "\n", Color.red);
            return;
        }
        getReceberMensagem().start();
    }

    /**
     * Thread responsável por receber as mensagens no servidor.
     */
    private Thread receberMensagem = new Thread() {
        @Override
        public void run() {
            super.run();
            gravarLog("A thread de recebimento de mensagens foi inicializada.\n", Color.blue);
            while (servidorLigado) {
                try {
                    tamanhoPacote = new byte[1024];
                    datagramPacket = new DatagramPacket(tamanhoPacote, tamanhoPacote.length);
                    getDatagramSocket().receive(datagramPacket);
                    conteudoRecebido = new String(datagramPacket.getData());
                    recebeuMsg = true;
                    gravarLog("Mensagem RECEBIDA = " + getConteudoRecebido().trim() + "\n", Color.darkGray);
                } catch (IOException ex) {
                }
            }
        }
    };

    /**
     * Método responsável por enviar a mensagem para o destino selecionado.
     *
     * @param mensagem mensagem em texto puro que será enviada.
     * @param ipDestino ip do destino da mensagem.
     * @param portaDestino porta de destino da mensagem.
     */
    public void enviarMensagem(String mensagem) {
        try {
            this.datagramPacket = new DatagramPacket(mensagem.getBytes(), mensagem.length(), enderecoServidor, portaServidor);
            this.getDatagramSocket().send(datagramPacket);
            gravarLog("Mensagem ENVIADA: " + mensagem + "\n", Color.black);
        } catch (IOException ex) {
            gravarLog("Falha ao enviar mensagem para o Servidor.\n"
                    + "Mensagem: " + mensagem + "\n"
                    + "Mensagem de erro: " + ex.getMessage() + "\n", Color.RED);
        } finally {
            this.datagramPacket = new DatagramPacket(tamanhoPacote, tamanhoPacote.length);
        }
    }

    /**
     * Método que grava na interface os logs que são passados.
     *
     * @param mensagem Mensagem que será gravada.
     * @param corTexto Cor do texto que será exibido. (Color.<cor desejada>)
     */
    public void gravarLog(String mensagem, Color corTexto) {
        telaCliente.gravarLog(telaCliente.getjTextPaneLog(), mensagem, corTexto);
    }

    /**
     * @return the receberMensagem
     */
    public Thread getReceberMensagem() {
        return receberMensagem;
    }

    /**
     * @param servidorLigado the servidorLigado to set
     */
    public void setServidorLigado(boolean servidorLigado) {
        this.servidorLigado = servidorLigado;
    }

    /**
     * @return the datagramSocket
     */
    public DatagramSocket getDatagramSocket() {
        return datagramSocket;
    }

    /**
     * @return the conteudoRecebido
     */
    public String getConteudoRecebido() {
        recebeuMsg = false;
        return conteudoRecebido.trim();
    }

    /**
     * @return the recebeuMsg
     */
    public boolean isRecebeuMsg() {
        return recebeuMsg;
    }
}
