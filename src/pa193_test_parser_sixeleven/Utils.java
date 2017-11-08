package pa193_test_parser_sixeleven;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Utils {

public int hexToInt(String hex){
	return Integer.parseInt(reverseHex(hex), 16);
	
}

public long hexToLong(String hex){
	return Long.parseLong(reverseHex(hex), 16);
	
}

public String reverseHex(String hex)
{  String reverse="";
	int i;
	for(i = hex.length() - 2; i >= 0 ; i -= 2){
		reverse +=  hex.toCharArray()[i];
		reverse +=  hex.toCharArray()[i + 1];
	}	
	
	return reverse;
	
}

public String timestampToDate(String hex){
	long ts = hexToLong(hex);
	
	System.out.println(hex);
	Date date = new Date(ts);
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	return dateFormat.format(date);
	

}

}
