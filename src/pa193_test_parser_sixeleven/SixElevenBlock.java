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
    private String version;
    private String previous_hash;
    private String time_stamp;
    private double difficulty;
    private int nonce;
    private int transcation_count;
    private int transcation_version;
    private int input_count;
    private String transcation_hash;
    private int transcation_index;
    private int script_length;
    private int input_script_length;
    private int sequence_number;
    private int number_of_outputs;
    private double value;
    private int output_script_length;
    private int transcation_long_time;
    private String blockhexstring;
    
    public SixElevenBlock(String blockhexstring)
    {
       this.blockhexstring = blockhexstring;    
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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPrevious_hash() {
        return previous_hash;
    }

    public void setPrevious_hash(String previous_hash) {
        this.previous_hash = previous_hash;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public int getNonce() {
        return nonce;
    }

    public void setNonce(int nonce) {
        this.nonce = nonce;
    }

    public int getTranscation_count() {
        return transcation_count;
    }

    public void setTranscation_count(int transcation_count) {
        this.transcation_count = transcation_count;
    }

    public int getTranscation_version() {
        return transcation_version;
    }

    public void setTranscation_version(int transcation_version) {
        this.transcation_version = transcation_version;
    }

    public int getInput_count() {
        return input_count;
    }

    public void setInput_count(int input_count) {
        this.input_count = input_count;
    }

    public String getTranscation_hash() {
        return transcation_hash;
    }

    public void setTranscation_hash(String transcation_hash) {
        this.transcation_hash = transcation_hash;
    }

    public int getTranscation_index() {
        return transcation_index;
    }

    public void setTranscation_index(int transcation_index) {
        this.transcation_index = transcation_index;
    }

    public int getScript_length() {
        return script_length;
    }

    public void setScript_length(int script_length) {
        this.script_length = script_length;
    }

    public int getInput_script_length() {
        return input_script_length;
    }

    public void setInput_script_length(int input_script_length) {
        this.input_script_length = input_script_length;
    }

    public int getSequence_number() {
        return sequence_number;
    }

    public void setSequence_number(int sequence_number) {
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

    public int getTranscation_long_time() {
        return transcation_long_time;
    }

    public void setTranscation_long_time(int transcation_long_time) {
        this.transcation_long_time = transcation_long_time;
    }
    
    public void Parse_Hex(String hexstring)
    
    {
      if(hexValid(hexstring))
      
      {
           
      
      
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
