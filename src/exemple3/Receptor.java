package exemple3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Receptor {

    public static void main(String[] args) throws UnknownHostException,
            SocketException, IOException {
        
        //Paquet receptor
        int portAEscoltar = 5555;
        byte[] missatge = new byte[1024];
        DatagramPacket packet = new DatagramPacket(missatge,missatge.length);
        
        //Sòcol que escolta
        DatagramSocket socket = new DatagramSocket(portAEscoltar);      
        
        //recepció d'un paquet
        socket.receive(packet);
        
        //Imprimir missatge
        String text = new String(missatge);
        System.out.println(text);
        socket.close();
        
    }

}
