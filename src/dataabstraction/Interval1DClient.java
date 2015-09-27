package dataabstraction;

import java.util.ArrayList;
import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;


public class Interval1DClient {
	
	static Interval1D intervalFactory() {
		final int MAX = 100;
		int x = StdRandom.uniform(MAX);
		int y = StdRandom.uniform(x, MAX);
		
		return new Interval1D(x, y);
		
	}
	
	public static void main(String[] args) {
		
		int N = 100;
		
		ArrayList<Interval1D> intervals = new ArrayList<Interval1D>() ;
		
		for (int i = 0; i < N; i++) {
			
			intervals.add(intervalFactory());
			
			
		}
		
		// Print intersecting intervals
		for (int i = 0; i < intervals.size(); i++) {
			
			Interval1D intrv1 = intervals.get(i);
			
			for (int j = i+1; j < intervals.size(); j++) {
				Interval1D intrv2 = intervals.get(j);
				
				if (intrv1.intersects(intrv2)) {
				
					StdOut.println(intrv1+ " " + intrv2);
					
				}
				}
				
			}
			
		}

		
		
		
		
	}
