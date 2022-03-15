package ifpr.pgua.eic.chat.cliente;

import java.io.IOException;

import ifpr.pgua.eic.chat.App;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    private TextField tfIpServidor;

    @FXML
    private TextField tfPortaServidor;

    @FXML
    private TextField tfNome;

    @FXML
    private Circle crIndicador;

    @FXML
    private TextArea taMensagens;

    @FXML
    private TextField tfMensagem;

    @FXML
    private Button btConectar;

    @FXML
    private Button btEnviar;

    private Cliente cliente;

    public void initialize() {
        ajustaComponentes(false);
    }

    @FXML
    private void conectar() {
        try {
            if (cliente != null && cliente.isConectado()) {
                cliente.sair();
                ajustaComponentes(false);
            } else {

                String ipServidor = tfIpServidor.getText();
                String portaServidor = tfPortaServidor.getText();
                String nome = tfNome.getText();

                //TODO criar cliente e conectar


                //TODO criar thread para atualizar o textarea

                ajustaComponentes(true);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private Runnable atualizador(){
        //TODO enquanto cliente estiver conectados
        //ler mensagem e atualizar o textarea

        return null;
    }


    @FXML
    private void enviar(){
        String msg = tfMensagem.getText();
        //TODO enviar mensagem
        
    }

    private void ajustaComponentes(boolean conectado){
        crIndicador.getStyleClass().remove(!conectado?"nao-conectado":"conectado");
        crIndicador.getStyleClass().add(conectado?"conectado":"nao-conectado");
        btEnviar.setDisable(!conectado);
        tfMensagem.setDisable(!conectado);
        taMensagens.setDisable(!conectado);

        tfIpServidor.setDisable(conectado);
        tfPortaServidor.setDisable(conectado);
        tfNome.setDisable(conectado);

        btConectar.setText(!conectado?"Conectar":"Desconectar");
    }

}
