package Rectangle;

import java.awt.geom.Area;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width + height) * 2;
    }

    public double diagonal() {
        return Math.sqrt((Math.pow(height, 2) + Math.pow(width, 2)));
    }

    public String result() {
        return "AREA = " + String.format("%.2f%n", area()) + "PERIMETER = " + String.format("%.2f%n", perimeter()) + "DIAGONAL =" + String.format("%.2f%n", diagonal());
    }

}


