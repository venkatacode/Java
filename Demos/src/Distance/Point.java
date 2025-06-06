package Distance;

public class Point {

	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Method to obtain distance of a point w.r.t origin
	public double distance() {
		// code here
		return (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)));

	}

	// Method to obtain distance of a point w.r.t another point
	public double distance(Point point) {
		// code here
		return (Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2)));

	}

}

class Tester {
	public static void main(String[] args) {
		// code here
		Point p1 = new Point(2, 3);
		System.out.println("the origin was:" + p1.distance());
		Point p2 = new Point(5, 6);
		System.out.println("the data from point to point was:" + p2.distance(p1));
	}
}
