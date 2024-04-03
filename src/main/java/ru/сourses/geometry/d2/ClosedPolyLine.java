package ru.сourses.geometry.d2;

public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point[] points) {
        super(points);
    }

    @Override
    public double getLength() {
        double length = super.getLength();
        length += new Line(getPoints()[0], getPoints()[getPoints().length - 1]).getLength();
        return length;
    }
}