package ifpr.pgua.eic.chat.servidor;

import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Vector;

public class AppServer {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(12345);
        Vector<BufferedWriter> clientes = new Vector<>();

        while(true){
            System.out.println("Aguardando conexão...");
            Socket con = server.accept();
            System.out.println(con.getRemoteSocketAddress());
            Thread t = new Thread(new Server(con,clientes));
            t.start();
        }
    }
}
