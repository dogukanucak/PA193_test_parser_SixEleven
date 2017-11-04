/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193_test_parser_sixeleven;


import com.mashape.unirest.http.exceptions.UnirestException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 *
 * @author dogukan, deniz
 */
public class PA193_test_parser_SixEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnirestException, IOException {
        
        TcpClient tcp_client = new TcpClient("51.255.51.50",8661);
        tcp_client.connect();
        tcp_client.getStream();
          
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Something To Close.....");
        String s = br.readLine();

//         SixElevenHttpClient client = SixElevenHttpClient.getInstance();
//          System.out.println(client.getcurrentblock());
          

        
    }
    

    
}
