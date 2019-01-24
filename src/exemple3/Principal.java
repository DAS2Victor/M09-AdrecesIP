
package exemple3;

import java.io.IOException;

import java.net.SocketException;


public class Principal {

    public static void main(String[] args) throws SocketException, IOException {
        Servidor s1 = new Servidor(5555);
        s1.runServer(); 
    }
    
}
