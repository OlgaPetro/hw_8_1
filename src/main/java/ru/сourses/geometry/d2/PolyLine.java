package ru.сourses.geometry.d2;

public class PolyLine {
    private Point[] points;

    public PolyLine(Point[] points) {
        this.points = points;
    }

    public Point[] getPoints() {
        return points;
    }


    public double getLength() {
        double length = 0;

        for (int i = 0; i < points.length - 1; i++) {
            length += new Line(points[i], points[i+1]).getLength();
        }

        return length;
    }

    public Line[] getLines() {
        Line[] lines = new Line[points.length - 1];

        for (int i = 0; i < points.length - 1; i++) {
            lines[i] = new Line(points[i], points[i+1]);
        }

        return lines;
    }


    @Override
    public String toString() {
        String result  = "";
        result = result + "Линия [";

        for (int i = 0; i < points.length; i++) {
            result = result + points[i];

            if (i != points.length - 1) {
                result = result + ", ";
            }
        }

        result = result + "]";

        return result;
    }

}