package com.bridgelabz.linecomparison;

public class Line {
    Point p1, p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double length() {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Line)) return false;
        Line other = (Line) obj;
        return Double.compare(this.length(), other.length()) == 0;
    }

	private double length() {
		// TODO Auto-generated method stub
		return 0;
	}

}


