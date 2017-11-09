/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193_test_parser_sixeleven;



import java.io.BufferedReader;
import java.io.File;
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
      	ArrayList<SixElevenBlock> blocklist = new ArrayList<>();    
        File file = new File("testblk.txt");
        if(file.exists() && !file.isDirectory()) // Simple Check If File Is Exists
        { 
        BufferedReader br = new BufferedReader (new FileReader (file));
        String line;
       while( (line = br.readLine() ) != null)
       {
            blocklist.add(new SixElevenBlock(line));
       }                    
        util.displayBlock(blocklist);
        }
        
        else
        {
            System.out.println("testblk.txt could not find.....");
        }
    }   
    
}
//To produce random inputs, we used: cat /dev/urandom | tr -dc '0-9a-fA-F' | fold -w 446 | head -n 1 command 
// This produces random data with the same size
// Also we concatenated the date with correct block magic id"f9beb611"
