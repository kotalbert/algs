package matrix;

/**
 * Vector class for matrix library
 */
public class Vector {

	private double[] v;
	private int len = 0;
	
	/** Indicating, where to put value to be appended,
	 * if > len, then don't append new values
	 * */
	private int append_index = 0;
	
	Vector(double[] v) {

		this.len = v.length;
		this.append_index = this.len;
		
		this.v = new double[len];
		for (int i = 0; i < len; i++) {
			this.v[i] = v[i];
		}

	}

	Vector(int len) {

		this.len = len;
		this.v = new double[len];

	}
	
	/**Append parameter to the next 
	 * available array item
	 * */
	public void append(double x) {
		if (append_index < len) {
			v[append_index] = x;
			append_index++;
		}
		
	}
	
	public double[] get_array() {
		
		return v;
		
	}

	public String toString() {

		String out = "[";

		for (int i = 0; i < v.length - 1; i++) {
			out += Double.toString(v[i]) + ",";
		}

		out += Double.toString(v[v.length - 1]) + "]";

		return out;

	}

	
	public int len() {return v.length;}
	public double get(int i){
		//TODO: add index check
		return v[i];}
	
	public static void main(String[] args) {

		// Constructor test.
		Vector v1 = new Vector(10);
		System.out.println(v1.toString());
		double[] d = { 1.1, 2.2, 3.3 };
		Vector v2 = new Vector(d);
		System.out.println(v2.toString());
		
		// Appending test
		
		for (int i = 0; i < 20; i++) {
			v1.append(i);
			
		}
		System.out.println(v1.toString());
		
		

	}

}
