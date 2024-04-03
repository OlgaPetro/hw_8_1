package ru.сourses.geometry.d2;



public class Line {
    private int x;

    private Point pointStart;
    private Point pointEnd;

    public Line(Point pointStart, Point pointEnd) {
        this.pointStart = pointStart;
        this.pointEnd = pointEnd;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.pointStart = new Point(x1, y1);
        this.pointEnd = new Point(x2, y2);;
    }


    public Point getPointStart() {
        return pointStart;
    }

    public Point getPointEnd() {
        return pointEnd;
    }

    public void setPointStart(int x1, int y1) {
        this.pointStart = new Point(x1, y1);;
    }

    public void setPointEnd(int x2, int y2){
        this.pointEnd = new Point(x2, y2);
    }

    public double getLength(){
        // d = sqrt((x2 — x1)^2 + (y2 — y1)^2)
        double xPow =Math.pow((pointEnd.getX() - pointStart.getX()), 2);
        double yPow =Math.pow((pointEnd.getY() - pointStart.getY()), 2);
        return Math.sqrt(xPow + yPow);
    }

    @Override
    public String toString() {
        return "Линия от " + pointStart + " до " + pointEnd;
    }

}
