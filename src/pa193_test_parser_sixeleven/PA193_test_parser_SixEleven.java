/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193_test_parser_sixeleven;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.async.Callback;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import junit.framework.*;


/**
 *
 * @author dogukan, deniz
 */
public class PA193_test_parser_SixEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnirestException {
        // TODO code application logic here
//        GetRequest request = Unirest.get("https://be.611.to/chain/SixEleven/q/getblockcount");        
//        HttpResponse<String> response = request.asString();
//        System.out.println(response.getBody());
          SixElevenHttpClient client = SixElevenHttpClient.getInstance();
          System.out.println(client.getcurrentblock());
          

        
    }
    

    
}
