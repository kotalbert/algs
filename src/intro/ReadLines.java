package intro;
import java.io.IOException;
import java.util.Scanner;

import utils.Utils;

	class Item {
		
		String item_name;
		int item_int;
		double item_double;
		
		public String toString() {
			
			
			return item_name + "---"
					+ Integer.toString(item_int) + "---"
					+ Double.toString(item_double) + "***"
					;
			
		}
		
	}
public class ReadLines {
	


	
	public static void main(String[] args) throws IOException {
		
		String s = Utils.read_txt_file("test_data.txt");
		
		
		
		
		Scanner scanner = new Scanner(s);
		while (scanner.hasNextLine()) {
			
			String line = scanner.nextLine();
			Scanner s_line = new Scanner(line);
			
			Item item = new Item();
			
			item.item_name = s_line.next();
			item.item_int = s_line.nextInt();
			item.item_double = Double.parseDouble(s_line.next());
			
			s_line.close();
			
			
			System.out.println(item.toString());
			
			
			
		}
		
		scanner.close();
	}

}
