package matrix;

import matrix.DimMismatch;

public class Matrix {

	/**
	 * Matrix class body
	 */

	/** Values of the matrix */
	private double[][] block;

	/** m: row number */
	private int m = 0;

	/** n: column number */
	private int n = 0;

	/** Create empty matrix i x j */
	Matrix(int i, int j) {

		block = new double[i][j];
		m = i;
		n = j;
	}

	/** Create matrix from two-dim array */
	Matrix(double[][] block) {

		m = block.length;
		n = block[0].length;

		this.block = block.clone();

	}

	/** Get row number */
	public int get_m() {
		return m;
	};

	/** Get column number */
	public int get_n() {
		return n;
	}

	public double get(int i, int j) {
		// TODO: add index check
		return block[i][j];

	}

	/** Get i-th row as Vector */
	private Vector get_row(int i) {

		// TODO: add index check
		Vector v = new Vector(n); // row lenght = number of columns

		for (int j = 0; j < n; j++) {
			v.append(get(i, j));
		}

		return v;
	}

	/** Get j-th column as a Vector */
	private Vector get_col(int j) {

		// TODO: add index check
		Vector v = new Vector(m); // column lengh = number of rows
		for (int i = 0; i < m; i++) {
			v.append(get(i, j));
		}

		return v;
	}

	public String toString() {

		StringBuilder out = new StringBuilder();

		for (int i = 0; i < m; i++) {
			out.append("|");
			for (int j = 0; j < n; j++) {
				out.append(block[i][j]);
				out.append(",");

			}
			out.append("|");
			out.append("\n");
		}

		return out.toString();

	}

	/** Insert x at i-j intersection */
	private void insert(int i, int j, double x) {

		// TODO: add index check
		block[i][j] = x;

	}

	public double[][] get_array() {
		return block;
	}

	/**
	 * Static methods.
	 */

	static double dot(double[] x, double[] y) throws DimMismatch {

		Vector vx = new Vector(x);
		Vector vy = new Vector(y);

		if (vx.len() != vy.len())
			throw new DimMismatch("Vector length does not match.");

		double sum = 0;

		for (int i = 0; i < vx.len(); i++) {
			sum += vx.get(i) * vy.get(i);
		}

		return sum;
	}

	static double[][] mult(double[][] a, double[][] b) throws DimMismatch {

		Matrix A = new Matrix(a);
		Matrix B = new Matrix(b);

		/**
		 * Check dimensions: A: m x m B: n x p AB: m x p
		 */

		if (A.get_n() != B.get_m()) {
			throw new DimMismatch("Matricies cannot be multiplied.");
		}

		Matrix AB = new Matrix(A.get_m(), B.get_n());

		for (int i = 0; i < AB.get_m(); i++) {

			for (int j = 0; j < AB.get_n(); j++) {

				Vector row = A.get_row(i);
				Vector col = B.get_col(j);

				double x = dot(row.get_array(), col.get_array());
				AB.insert(i, j, x);

			}

		}

		return AB.get_array();

	}

	static double[][] transpose(double[][] a) {
		
		Matrix X = new Matrix(a);
		Matrix X_t = new Matrix(X.get_n(), X.get_m());
		
		// Fill columns of X_t with X rows.
		
		for (int i = 0; i < X.get_m(); i++) {
			
			Vector row = X.get_row(i);
			for (int j = 0; j < X.get_n(); j++) {
				
				X_t.insert(j,i, row.get(j));
				
			}
			
			
		}
		
		
		return X_t.get_array();
	}

	static double[] mult(double[] y, double[][] a) {
		return y;

	}

	static void p(Object o) {

		System.out.println(o);

	}

	static void pm(double[][] x) {
		
		Matrix m = new Matrix(x);
		p(m.toString());
		
	}
	
	static String hl = "*********";

	static void test_dot() {

		double[] x = { 1, 2, 3, 4 };
		double[] y = { 9, 8, 7, 4 };

		try {
			double dot = dot(x, y);
			p("Testing: dot(x,y).");
			p(dot);
			p(hl);
		} catch (DimMismatch e) {
			// TODO Auto-generated catch block
			e.prnt_msg();
			p(hl);
		}

	}

	static void test_matrix() {

		double[][] dd = { { 1, 2 }, { 3, 4 } };

		double[][] dd2 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 },
				{ 20, 21, 22, 23, 23, 25, 26, 27, 28, 29 } };

		Matrix m2 = new Matrix(dd2);

		Matrix m = new Matrix(dd);
		p("Testing Matrix");
		p(m);
		p(m2);
		p(hl);

		Vector c0 = m2.get_col(0);
		Vector r0 = m2.get_row(0);
		p("Testing row/column getter");
		p("col0: " + c0);
		p("row0: " + r0);
		p(hl);

	}

	static void test_mult() {

		p("Testing matrix multiplication");

		double[][] d1 = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		double[][] d2 = { { 1, 2, 3 }, { 3, 4, 5 } };

		try {
			double[][] mlt = mult(d1, d2);
			pm(mlt);

		} catch (DimMismatch e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		p(hl);

	}

	static void test_transpose() {
		
		p("Testing transpose");
		
		double[][] x = {
				{1,2,3,4,5}
				, {7,8,9,10,11}
		};
		
		double[][] x_t = transpose(x);
		pm(x_t);
		
		
		p(hl);

	}

	public static void main(String[] args) {

		test_dot();
		test_matrix();
		test_mult();
		test_transpose();

	}

}
