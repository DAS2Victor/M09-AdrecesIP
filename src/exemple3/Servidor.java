package exemple3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Servidor {

    DatagramSocket socket;

    public Servidor(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void runServer() throws IOException {
        byte[] receivingData = new byte[1024];
        byte[] sendingData;
        InetAddress clientIP;
        int clientPort;


        while (true) {
            DatagramPacket packet = new DatagramPacket(receivingData, 1024);
            socket.receive(packet);
            sendingData = processData(packet.getData(), packet.getLength());
            clientIP = packet.getAddress();
            clientPort = packet.getPort();
            packet = new DatagramPacket(sendingData, sendingData.length,
                    clientIP, clientPort);
            socket.send(packet);
        }
    }

    private byte[] processData(byte[] data, int length) {
        System.out.println(new String(data));
        String resposta = "Bona tarda " + new String(data)+"!!!";
        return resposta.getBytes();
    }
}
