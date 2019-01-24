
package exemple2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class Principal {

    public static void main(String[] args) {
        try {
            URL a1 = new URL("https://docs.oracle.com/javase/8/docs/api/java/net/URL.html");
            System.out.println("File: "+a1.getFile());
            System.out.println("Host: "+a1.getHost());
            System.out.println("Protocol: "+a1.getProtocol());
            System.out.println("Port: "+a1.getDefaultPort());
            
            BufferedReader in = new BufferedReader(
            new InputStreamReader(a1.openStream()));
            String linia;
            while((linia=in.readLine())!=null){
                System.out.println(linia);
            }
            
        } catch (Exception ex) {
            System.out.println("Recurs no accessible");
        }
    }
    
}
