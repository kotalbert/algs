package intro;

public class BoolArray {

	public static void main(String[] args) {
		int a[][] = {
				{1,0,1}
				, {0,1,0}
				, {1,1,1}
				
		};
		
		print_bool_array(a);

	}
	
	public static void print(int i) {
		
		if (i==0) System.out.print(' ');
		else System.out.print('*');
		
		
	}
	
	public static void print_bool_array(int[][] a) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				print(a[i][j]);
			}
			
			System.out.println();
		}
		
	}
	
	

}
