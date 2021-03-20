package Pointpackage;

public class Point {
    private double X;
    private double Y;

    public Point(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public double getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "(" + X + ", " + Y + ')';
    }
}
