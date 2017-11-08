/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193_test_parser_sixeleven;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



/**
 *
 * @author dogukan, deniz
 */
public class PA193_test_parser_SixEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        

        Utils util = new Utils();
    	//SixElevenBlock s = new SixElevenBlock("f9beb611d700000001000100524c85a744672dd9a3c2e794c5ed473f1d98c6d493801572529bc8c3960000006e318b64ee63ac50723af6ccb324a4a84f1fcd8e25f185a7e527b3568f1daca2c86fd655f0ff0f1e000351520101000000010000000000000000000000000000000000000000000000000000000000000000ffffffff0704f0ff0f1e0108ffffffff010003d8390e0000004341043d85d6355c84738ca498482525e6ac032a4bce87ec3b4d97104eaa8be708591d5acdfca0fc1d0c940e5a33223bf4b158816ee3492fbc00b2a26ba9ef12b44cbfac00000000");
        //SixElevenBlock s2 = new SixElevenBlock("11beb611d700000001000100524c85a744672dd9a3c2e794c5ed473f1d98c6d493801572529bc8c3960000006e318b64ee63ac50723af6ccb324a4a84f1fcd8e25f185a7e527b3568f1daca2c86fd655f0ff0f1e000351520101000000010000000000000000000000000000000000000000000000000000000000000000ffffffff0704f0ff0f1e0108ffffffff010003d8390e0000004341043d85d6355c84738ca498482525e6ac032a4bce87ec3b4d97104eaa8be708591d5acdfca0fc1d0394045a33223bf4b158816ee3492fbc00b2a26ba9ef12b44cbfac00000000");
    	ArrayList<SixElevenBlock> elements = new ArrayList<>();
        
        BufferedReader br = new BufferedReader (new FileReader ("testblk.txt"));
        String line;
       while( (line = br.readLine() ) != null) {
            elements.add(new SixElevenBlock(line));
      }            
        
        util.displayBlock(elements);
    	
    }
    

    
}
