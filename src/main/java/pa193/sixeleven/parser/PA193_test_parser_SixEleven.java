package pa193.sixeleven.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author dogukan, deniz
 *         To produce random inputs, we used: cat /dev/urandom | tr -dc '0-9a-fA-F' | fold -w 446 | head -n 1 command
 *         This produces random data with the same size
 *         Also we concatenated the date with correct block magic id"f9beb611"
 */
public class PA193_test_parser_SixEleven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Utils util = new Utils();
        ArrayList<SixElevenBlock> blocklist = new ArrayList<>();
        File file = new File("testblk.txt");
        //Simple Check If File Is Exists
        if (file.exists() && !file.isDirectory()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                blocklist.add(new SixElevenBlock(line));
            }
            util.displayBlock(blocklist);
        } else {
            System.out.println("testblk.txt could not find.....");
        }
    }
}
