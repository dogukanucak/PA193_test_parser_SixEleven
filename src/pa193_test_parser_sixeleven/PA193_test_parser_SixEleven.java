/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193_test_parser_sixeleven;



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
    public static void main(String[] args) throws IOException {
        
        /*TcpClient tcp_client = new TcpClient("51.255.51.50",8661);
        tcp_client.connect();
        tcp_client.getStream();
          
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Something To Close.....");
        String s = br.readLine();*/


    	SixElevenBlock s = new SixElevenBlock("f9beb611d700000001000100524c85a744672dd9a3c2e794c5ed473f1d98c6d493801572529bc8c3960000006e318b64ee63ac50723af6ccb324a4a84f1fcd8e25f185a7e527b3568f1daca2c86fd655f0ff0f1e000351520101000000010000000000000000000000000000000000000000000000000000000000000000ffffffff0704f0ff0f1e0108ffffffff010003d8390e0000004341043d85d6355c84738ca498482525e6ac032a4bce87ec3b4d97104eaa8be708591d5acdfca0fc1d0c940e5a33223bf4b158816ee3492fbc00b2a26ba9ef12b44cbfac00000000");
    	s.Parse_Hex(s.getblockhexstring());
    	System.out.println("Magic ID : " + s.getMagic_id());
    	System.out.println("Header Length : " + s.getHeader_length());
    	System.out.println("Version : " + s.getVersion());
    	System.out.println("Previous Hash : " + s.getPrevious_hash());
    	System.out.println("Transaction Merkle Root : " + s.getMerkle_hash());
    	System.out.println("Timestamp : " + s.getTime_stamp());
    	System.out.println("Difficulty : " + s.getDifficulty());
    	System.out.println("Nonce : " + s.getNonce());
    	System.out.println("Transaction Count : " + s.getTransaction_count());
    	System.out.println("Transaction Version : " + s.getTransaction_version());
    	System.out.println("Input Count : " + s.getInput_count());
    	System.out.println("Transaction Hash : " + s.getTransaction_hash());
    	System.out.println("Transaction Index : " + s.getTransaction_index());
    	System.out.println("vNumber : " + s.getvNumber());
    	System.out.println("Script Length : " + s.getScript_length());
    	System.out.println("Raw Byte Data For The Input : " +  s.getRaw_script());
    	System.out.println("Sequence Number : " +  s.getSequence_number());
    	System.out.println("Number Of Outputs : " +  s.getNumber_of_outputs());
    	System.out.println("Value Out : " +  s.getValue());
    	System.out.println("Output Script Length : " +  s.getOutput_script_length());
    	System.out.println("Output Script : " +  s.getOutput_script());
    	System.out.println("Transaction Lock Time : " +  s.getTransaction_lock_time());
    	//System.out.println(s.getMagic_id() +" "+ s.getHeader_length() +" "+ s.getVersion() +" " + s.getPrevious_hash() + " " + s.getMerkle_hash() + " " + s.getTime_stamp() + " " + s.getDifficulty() + " " + s.getNonce() + " " + s.getTransaction_count() + " " + s.getTransaction_version() + " " + s.getInput_count() + " " + s.getTransaction_hash() + " " +  s.getTransaction_index() + " " + s.getvNumber() + " " + s.getScript_length() + " " + s.getRaw_script()+ " " + s.getSequence_number() + " " + s.getNumber_of_outputs() + " " + s.getValue() + " " + s.getOutput_script_length() + " " +  s.getOutput_script() + " " + s.getTransaction_lock_time());
    }
    

    
}
