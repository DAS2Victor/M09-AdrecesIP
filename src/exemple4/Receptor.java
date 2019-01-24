package exemple4;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Receptor {

    public static void main(String[] args) throws UnknownHostException,
            SocketException, IOException {

        DatagramSocket socket = new DatagramSocket(5555);

        while (true) {
            byte[] missatge = new byte[1024];
            DatagramPacket packet = new DatagramPacket(missatge, missatge.length);
            socket.receive(packet);

            String text = new String(missatge);
            System.out.println("IP: " + packet.getAddress()
                    + " Text: " + text);
        }

    }

}
