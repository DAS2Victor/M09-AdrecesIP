package exemple1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Principal {

    public static void main(String[] args) {
        try {
            InetAddress ipLocal = InetAddress.getLocalHost();
            System.out.println(ipLocal.getHostAddress());
            System.out.println(ipLocal.getHostName());
            System.out.println(ipLocal.toString());

            InetAddress ipGoogle = InetAddress.getByName("www.google.com");
            System.out.println(ipGoogle.toString());

            InetAddress ipOpenDNS = InetAddress.getByName("208.67.222.222");
            System.out.println(ipOpenDNS.toString());
            
            InetAddress[] google = InetAddress.getAllByName("google.com");

            for (InetAddress addr : google) {
                System.out.println(addr.getHostAddress());
            }
        } catch (UnknownHostException ex) {
            System.out.println("Host no trobat");
        }

    }

}
