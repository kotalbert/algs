package dataabstraction;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdRandom;


public class Point2Dclient {

		
		
	public static void main(String[] args) {
	
		PointsDistAgreagator agr = new PointsDistAgreagator();
		
		int N = 10;
		for (int i = 0; i < N; i++) {
			double x = StdRandom.uniform(N);
			double y = StdRandom.uniform(N);
			
			agr.addPoint(new Point2D(x,y));
			
			
		}
		
		
		StdOut.println("Closest points");
		StdOut.println(agr.toString());

		
	}

}
