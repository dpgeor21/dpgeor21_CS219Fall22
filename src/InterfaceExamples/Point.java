package InterfaceExamples;

public class Point implements Distance{
    private double y;
    private double x;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY(){
        return y;
    }

    @Override
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x,2) + Math.pow(this.y - p.y,2));
    }
}
