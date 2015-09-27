package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utils {

	public static void prntln(Object o) {
		
		System.out.println(o);
		
	}
	
	public static String read_txt_file(String f_name) throws IOException {
		
		 String everything;
		
		BufferedReader br = new BufferedReader(new FileReader(f_name));
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    everything = sb.toString();
		} finally {
		    br.close();
		}
		
		return everything;
		
	}
	
}
