package EX1;

public class Line {
	
	Point p1;
	Point p2;
	public Line(Point p1,Point p2) {
		this.p1=p1;
		this.p2=p2;
	}
	
	 public Line(Line line) {
	        this.p1 = new Point(line.p1.getX(), line.p1.getY());
	        this.p2 = new Point(line.p2.getX(), line.p2.getY());
	    }
	 
	 @Override
	    public String toString() {
	        return "Line from " + p1 + " to " + p2;
	    }
}
