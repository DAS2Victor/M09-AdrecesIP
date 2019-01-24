package exemple3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Emissor {

    public static void main(String[] args) throws UnknownHostException,
            SocketException, IOException {

        //Paquet emissor
        byte[] missatge = "Missatge".getBytes();
        InetAddress adrecaDesti = InetAddress.getByName("localhost");
        int portDesti = 5555;
        DatagramPacket packet = new DatagramPacket(missatge,
                missatge.length,
                adrecaDesti,
                portDesti);
        
        //Sòcol temporal que realitza l'enviament
        DatagramSocket socket = new DatagramSocket();
        
        //Enviament del missatge
        socket.send(packet);

    }

}
