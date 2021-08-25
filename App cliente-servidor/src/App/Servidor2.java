package App;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Servidor2 implements Runnable {

    private int puerto;
    private String mensaje;

    public Servidor2(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }

    @Override
    public void run() {
        //Host del servidor
        String HOST = "127.0.0.1";
        //Puerto del servidor
        DataOutputStream out;

        try {
            //Creo el socket para conectarme con el cliente
            Socket sc = new Socket(HOST, puerto);

            out = new DataOutputStream(sc.getOutputStream());

            //Envio un mensaje al cliente
            out.writeUTF(mensaje);

            sc.close();

        } catch (IOException ex) {
            Logger.getLogger(Servidor2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addObserver(Cliente1 cliente1) {
    }
}
