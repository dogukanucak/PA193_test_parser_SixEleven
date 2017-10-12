/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa193_test_parser_sixeleven;

/**
 *
 * @author dogukan
 */
public class SixElevenBlock {

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAddressbalance() {
        return addressbalance;
    }

    public void setAddressbalance(int addressbalance) {
        this.addressbalance = addressbalance;
    }

    public String getPublickey_hash() {
        return publickey_hash;
    }

    public void setPublickey_hash(String publickey_hash) {
        this.publickey_hash = publickey_hash;
    }

    public int getBlocknumber() {
        return blocknumber;
    }

    public void setBlocknumber(int blocknumber) {
        this.blocknumber = blocknumber;
    }

    public String getDifficult() {
        return difficult;
    }

    public void setDifficult(String difficult) {
        this.difficult = difficult;
    }
    
    private String address;
    private int addressbalance;
    private String publickey_hash; // shows the public key hash in an adress
    private int blocknumber;
    private String difficult;
    
    
    
    
}
