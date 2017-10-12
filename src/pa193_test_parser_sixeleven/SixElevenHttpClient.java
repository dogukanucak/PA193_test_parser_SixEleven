package pa193_test_parser_sixeleven;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dogukan
 */
public class SixElevenHttpClient {  // Singleton Class
    private static SixElevenHttpClient instance = null;
    protected SixElevenHttpClient ()
    {
    
    }
    public static SixElevenHttpClient getInstance()
    {
        if(instance == null)
        {
          instance = new SixElevenHttpClient();
        }
        
        return instance;
    }
    private String baseUrl= "https://be.611.to/";
     
    // GET METHODS
     public String getcurrentblock() throws UnirestException
     {
        GetRequest request = Unirest.get(baseUrl+"chain/SixEleven/q/getblockcount");        
        HttpResponse<String> response = request.asString();
        return response.getBody();
     }
}
