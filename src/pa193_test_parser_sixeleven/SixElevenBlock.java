/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193_test_parser_sixeleven;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author dogukan
 */
public class SixElevenBlock {

    private String magic_id; 
    private int header_length;
    private int version;
    private String previous_hash;
    private String merkle_hash;
    private String time_stamp;
    private String difficulty;
    private int nonce;
    private int transaction_count;
    private int transaction_version;
    private int input_count;
    private String transaction_hash;
    private String transaction_index;
    private int vNumber;
    private int script_length;
    private String raw_script;
    private String sequence_number;
    private int number_of_outputs;
    private double value;
    private int output_script_length;
    private String output_script;
    private int transaction_lock_time;
    private String blockhexstring;
    private Utils utils = null;
    private boolean blockvalid = false;
    
    public SixElevenBlock(String blockhexstring)
    {
       this.blockhexstring = blockhexstring;
       blockvalid = hexValid(blockhexstring);
       utils = new Utils();
    }    
    
    public boolean ifValid()
    {
      return blockvalid;
    }
    
    public String getblockhexstring()
    {
    	return blockhexstring;
    }

    public String getMagic_id() {
        return magic_id;
    }

    public void setMagic_id(String magic_id) {
        this.magic_id = magic_id;
    }

    public int getHeader_length() {
        return header_length;
    }

    public void setHeader_length(int header_length) {
        this.header_length = header_length;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getPrevious_hash() {
        return previous_hash;
    }

    public void setPrevious_hash(String previous_hash) {
        this.previous_hash = previous_hash;
    }
    
    public String getMerkle_hash() {
        return merkle_hash;
    }

    public void setMerkle_hash(String merkle_hash) {
        this.merkle_hash = merkle_hash;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public int getTransaction_count() {
        return transaction_count;
    }

    public void setTransaction_count(int transaction_count) {
        this.transaction_count = transaction_count;
    }

    public int getTransaction_version() {
        return transaction_version;
    }

    public void setTransaction_version(int transaction_version) {
        this.transaction_version = transaction_version;
    }

    public int getInput_count() {
        return input_count;
    }

    public void setInput_count(int input_count) {
        this.input_count = input_count;
    }

    public String getTransaction_hash() {
        return transaction_hash;
    }

    public void setTransaction_hash(String transaction_hash) {
        this.transaction_hash = transaction_hash;
    }

    public String getTransaction_index() {
        return transaction_index;
    }

    public void setTransaction_index(String transaction_index) {
        this.transaction_index = transaction_index;
    }
      
    public int getvNumber() {
        return vNumber;
    }

    public void setvNumber(int vNumber) {
        this.vNumber = vNumber;
    }

    public int getScript_length() {
        return script_length;
    }

    public void setScript_length(int script_length) {
        this.script_length = script_length;
    }

    public String getRaw_script() {
        return raw_script;
    }

    public void setRaw_script(String raw_script) {
        this.raw_script = raw_script;
    }

    public String getSequence_number() {
        return sequence_number;
    }

    public void setSequence_number(String sequence_number) {
        this.sequence_number = sequence_number;
    }

    public int getNumber_of_outputs() {
        return number_of_outputs;
    }

    public void setNumber_of_outputs(int number_of_outputs) {
        this.number_of_outputs = number_of_outputs;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getOutput_script_length() {
        return output_script_length;
    }

    public void setOutput_script_length(int output_script_length) {
        this.output_script_length = output_script_length;
    }
    
    public String getOutput_script() {
        return output_script;
    }

    public void setOutput_script(String output_script) {
        this.output_script = output_script;
    }

    public int getTransaction_lock_time() {
        return transaction_lock_time;
    }

    public void setTransaction_lock_time(int transaction_lock_time) {
        this.transaction_lock_time = transaction_lock_time;
    }
    
    public void Parse_Hex(String hexstring)
    
    {
      if(hexValid(hexstring))
      
      {
    	  System.out.println("Parsing the block...");
    	  setMagic_id(blockhexstring.substring(0, 8));
    	  setHeader_length(utils.hexToInt(blockhexstring.substring(8, 16)));
    	  setVersion(utils.hexToInt(blockhexstring.substring(16, 24)));
    	  setPrevious_hash(utils.reverseHex(blockhexstring.substring(24, 24 + 64)));
    	  setPrevious_hash(utils.reverseHex(blockhexstring.substring(24, 24 + 64)));
    	  setMerkle_hash(utils.reverseHex(blockhexstring.substring(88, 88 + 64)));
    	  setTime_stamp(utils.timestampToDate(blockhexstring.substring(152, 152 + 8)));
    	  setDifficulty(utils.reverseHex(blockhexstring.substring(160, 160 + 8)));
    	  setNonce(utils.hexToInt(blockhexstring.substring(168, 168 + 8)));
    	  setTransaction_count(utils.hexToInt(blockhexstring.substring(176, 176 + 2)));
    	  setTransaction_version(utils.hexToInt(blockhexstring.substring(178, 178 + 8)));
    	  setInput_count(utils.hexToInt(blockhexstring.substring(186, 186 + 2)));
    	  setTransaction_hash(utils.reverseHex(blockhexstring.substring(188, 188 + 64)));
    	  setTransaction_index(utils.reverseHex(blockhexstring.substring(252, 252 + 8)));
    	  setvNumber(utils.hexToInt(blockhexstring.substring(260, 260 + 4)));
    	  //check second difficulty
    	  setScript_length(utils.hexToInt(blockhexstring.substring(272, 272 + 2)));
    	  setRaw_script(utils.reverseHex(blockhexstring.substring(274, 274 + 2)));
    	  setSequence_number(utils.reverseHex(blockhexstring.substring(276, 276 + 8)));
    	  setNumber_of_outputs(utils.hexToInt(blockhexstring.substring(284, 284 + 2)));
    	  setValue(utils.hexToLong(blockhexstring.substring(286, 286 + 16)) / 100000000); //mili
    	  setOutput_script_length(utils.hexToInt(blockhexstring.substring(302, 302 + 2)));
    	  int x = 2*getOutput_script_length();
    	  setOutput_script(utils.reverseHex(blockhexstring.substring(304, 304 + x)));
    	  setTransaction_lock_time(utils.hexToInt(blockhexstring.substring(304 + x, 304 + x + 8)));
      }    
    }
    
    private boolean hexValid(String hexstring)
    
    {
      String pattern = "f9beb611[0-9a-fA-F]+";
     // Create a Pattern object
      Pattern r = Pattern.compile(pattern);
      // Now create matcher object.
      Matcher m = r.matcher(hexstring);      
      return m.find();                
    }
  
    
    
    
}
