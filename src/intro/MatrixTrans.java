package intro;

public class MatrixTrans {

	public static void main(String[] args) {
		int[][] a = {
				{0,1,2,3,4}
				, {5,6,7,8,9}
				};
		
		int[][] t = transpose_array(a);
		System.out.println(t);

	}
	
	static public int[][] transpose_array(int a[][]) {
		
		int n = a.length;
		int m = a[0].length;
		
		int[][] t = new int[m][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				t[j][i]=a[i][j];
				
			}
		}
		
		
		return t;
		
		
	}

}
