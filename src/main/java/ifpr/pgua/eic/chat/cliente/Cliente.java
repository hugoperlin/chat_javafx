package ifpr.pgua.eic.chat.cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Cliente {

    private String nome;
    private String ipServidor;
    private int portaServidor;
    private boolean conectado;

    private Socket socket;

    private InputStream in;
    private InputStreamReader inR;
    private BufferedReader bfR;

    private OutputStream ou;
    private OutputStreamWriter ouW;
    private BufferedWriter bfW;

    public Cliente(String nome, String ipServidor, int portaServidor) throws IOException {

        this.nome = nome;
        this.ipServidor = ipServidor;
        this.portaServidor = portaServidor;
        this.conectado = false;
    }

    public void conectar() throws IOException{
        //TODO Criar socket e streams
        //enviar mensagem com o nome
        
    }

    public String recebeMensagem() throws IOException {
        
        //TODO Ler uma mensagem
        
        return null;
    }

    public void enviaMensagem(String msg) throws IOException {
        //TODO Enviar uma mensagem

    }

    public boolean isConectado(){
        return conectado;
    }

    public void sair() throws IOException {
        
        //TODO fechar tudo    
    
    }

}
