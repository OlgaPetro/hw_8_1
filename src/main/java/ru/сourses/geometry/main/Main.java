package ru.сourses.geometry.main;

import ru.сourses.geometry.d2.Point;
import ru.сourses.geometry.d2.PolyLine;

public class Main {
    public static void main(String[] args) {
        //1. Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        Point pointOne = new Point(1, 5);
        Point pointSecond = new Point(2, 8);
        Point pointThird = new Point(5, 3);
        Point pointFifth = new Point(8, 9);

        Point[] points = {pointOne, pointSecond, pointThird, pointFifth};
        PolyLine polyLine = new PolyLine(points);
        System.out.println("Ломаная создана: " + polyLine);
    }
}