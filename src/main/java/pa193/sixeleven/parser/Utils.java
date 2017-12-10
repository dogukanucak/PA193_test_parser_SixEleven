package pa193.sixeleven.parser;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Utils {

public int hexToInt(String hex){ // Converts Hex to Int Value
        try
        {
            return Integer.parseInt(reverseHex(hex), 16);
        }
        catch(Exception e)
        {
            System.err.println("Block Format is Invalid");
            return -1;
        }
}

public long hexToLong(String hex){  // Converts Hex to Long Value
       try
       {   
	return Long.parseLong(reverseHex(hex), 16);
       }
       catch(Exception e)
       {
          System.err.println("Block Format is Invalid");
          return -1;
       }
	
}

public String reverseHex(String hex)  // Converts Hex Values From Reverse Order
{  
	int i;
        StringBuffer buf = new StringBuffer();
	for(i = hex.length() - 2; i >= 0 ; i -= 2){
		buf.append(hex.toCharArray()[i]);
                buf.append(hex.toCharArray()[i + 1]);
	}	
	
	return buf.toString();
	
}

public String timestampToDate(String hex){  // Convert Hex Value To TimeStamp
	long ts = hexToLong(hex);
	Date date = new Date((ts-(2*60*60)) * 1000L); //to convert Unix time to date time
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	return dateFormat.format(date);
	

}
public void displayBlock(SixElevenBlock block) // For Only Single 
{
   if(block != null && block.ifValid())
    {
        block.Parse_Hex(block.getblockhexstring());
    	System.out.println("Magic ID : " + block.getMagic_id());
    	System.out.println("Header Length : " + block.getHeader_length());
    	System.out.println("Version : " + block.getVersion());
    	System.out.println("Previous Hash : " + block.getPrevious_hash());
    	System.out.println("Transaction Merkle Root : " + block.getMerkle_hash());
    	System.out.println("Timestamp : " + block.getTime_stamp());
    	System.out.println("Difficulty : " + block.getDifficulty());
    	System.out.println("Nonce : " + block.getNonce());
    	System.out.println("Transaction Count : " + block.getTransaction_count());
    	System.out.println("Transaction Version : " + block.getTransaction_version());
    	System.out.println("Input Count : " + block.getInput_count());
    	System.out.println("Transaction Hash : " + block.getTransaction_hash());
    	System.out.println("Transaction Index : " + block.getTransaction_index());
    	System.out.println("vNumber : " + block.getvNumber());
    	System.out.println("Script Length : " + block.getScript_length());
    	System.out.println("Raw Byte Data For The Input : " +  block.getRaw_script());
    	System.out.println("Sequence Number : " +  block.getSequence_number());
    	System.out.println("Number Of Outputs : " +  block.getNumber_of_outputs());
    	System.out.println("Value Out : " +  block.getValue());
    	System.out.println("Output Script Length : " +  block.getOutput_script_length());
    	System.out.println("Output Script : " + block.getOutput_script());
    	System.out.println("Transaction Lock Time : " +  block.getTransaction_lock_time());
        
    }
   


}
public void displayBlock(ArrayList<SixElevenBlock> blockarray) // Get List of Blocks and Parse Them
{
    for(SixElevenBlock block:blockarray)
    {
    if(block != null)
    {
        block.Parse_Hex(block.getblockhexstring());
        if(block.ifValid())
        {
            System.out.println("---------------------------------------------");            
            System.out.println("Magic ID : " + block.getMagic_id());
            System.out.println("Header Length : " + block.getHeader_length());
            System.out.println("Version : " + block.getVersion());
            System.out.println("Previous Hash : " + block.getPrevious_hash());
            System.out.println("Transaction Merkle Root : " + block.getMerkle_hash());
            System.out.println("Timestamp : " + block.getTime_stamp());
            System.out.println("Difficulty : " + block.getDifficulty());
            System.out.println("Nonce : " + block.getNonce());
            System.out.println("Transaction Count : " + block.getTransaction_count());
            System.out.println("Transaction Version : " + block.getTransaction_version());
            System.out.println("Input Count : " + block.getInput_count());
            System.out.println("Transaction Hash : " + block.getTransaction_hash());
            System.out.println("Transaction Index : " + block.getTransaction_index());
            System.out.println("vNumber : " + block.getvNumber());
            System.out.println("Script Length : " + block.getScript_length());
            System.out.println("Raw Byte Data For The Input : " +  block.getRaw_script());
            System.out.println("Sequence Number : " +  block.getSequence_number());
            System.out.println("Number Of Outputs : " +  block.getNumber_of_outputs());
            System.out.println("Value Out : " +  block.getValue());
            System.out.println("Output Script Length : " +  block.getOutput_script_length());
            System.out.println("Output Script : " + block.getOutput_script());
            System.out.println("Transaction Lock Time : " +  block.getTransaction_lock_time());
        }
    } 
   }  
   
 }

}
