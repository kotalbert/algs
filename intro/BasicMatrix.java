package intro;

public class BasicMatrix {

	public static void main(String[] args) {
		
		int twodim[][] = {
				{0,1,2,3,4}
				, {5,6,7,8,9}
				
		};

		
		int twodim_i = twodim.length;
		int twodim_j = twodim[0].length;
		
		System.out.printf("i: %d\n", twodim_i );
		System.out.printf("j: %d\n", twodim_j );
	
		for (int i = 0; i < twodim.length; i++) {
			
			for (int j = 0; j < twodim[0].length; j++) {
				
				System.out.printf("i:%d j:%d xij: %d\n", i,j,twodim[i][j]);
				
			}
			
			int[][] pseudo = new int[3][1];
			pseudo[0][0] = 1;
			
			
			
		}
	
	}

}
