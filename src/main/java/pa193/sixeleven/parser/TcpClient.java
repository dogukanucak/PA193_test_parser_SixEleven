package pa193.sixeleven.parser;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author dogukan
 */
public class TcpClient {
    private final String host;
    private final int portnumber;
    private boolean connected = false;
    private Socket s = null;

    TcpClient(String host, int portnumber) {
        this.host = host;
        this.portnumber = portnumber;
        s = new Socket();
    }

    public void connect() throws IOException {

        if (!connected) {
            try {
                s.connect(new InetSocketAddress(host, portnumber));
            }

            //Host not found
            catch (UnknownHostException e) {
                System.err.println("Don't know about host : " + host);
                System.exit(1);
            }
            connected = true;
            System.out.println("Connected");
        } else {
            System.out.println("Already Connected...");
        }
    }

    public void close() throws IOException {
        if (connected) {
            s.close();
            connected = false;
            System.out.println("Connection is Closed....");
        }
    }

    public void getStream() throws IOException {
        if (connected) {

            OutputStream out = s.getOutputStream();
            //String str ="\\357\\277\\275\\357\\277\\275\\357\\277\\275\\021version";

            byte buf[] = hexStringToByteArray("f9beb61176657273696f6e00000000005500000059f18defacee00000100000000000000a8a7f55900000000010000000000000000000000000000000000ffff33ff333221d5010000000000000000000000000000000000ffff93fbc54b21d5d59c21be9687613700d4e10200");
            out.write(buf);
            String response = "";

            InputStream in = s.getInputStream();
            int c = 0;

            while ((c = in.read()) != -1) {
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("blockchain.dat", true))) {

                    bw.write(c);
                    System.out.print(Integer.toHexString(c));
                    response += (char) c;
                } catch (IOException e) {

                    e.printStackTrace();

                }
            }

        }

//         System.out.println("");
//         out.write(response.getBytes());
//
//         while ((c = in.read()) != -1)
//         {
//           
//           System.out.print(Integer.toHexString(c));
//           response+=(char) c;    
//         }
//         
//         System.out.println(response);
    }

    private static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
}
