package dataabstraction;

import edu.princeton.cs.algs4.Point2D;

public 	class PointsDistAgreagator {
	
	private Point2D p1;
	private Point2D p2;
	
	double dist = 0.0;
	
	public void addPoint(Point2D p) {
		
		if (p1 == null) {p1 = p; return;}
		if (p2 == null) {
			p2 = p;
			dist = p1.distanceTo(p2);
			return;
		
		}
		
		
		double dist1 = p1.distanceTo(p);
		double dist2 = p2.distanceTo(p);
		
		if ((dist1 < dist2) & (dist1 < dist)) {
			p1 = p;
			dist = dist1;
		}
		else if ((dist2 < dist1) & (dist2 < dist)) {
			p2 = p;
			dist = dist2;
		}
		
	} 	
	
	public String toString() {
		
		return p1.toString() + p2.toString() + dist;
		
	}

}