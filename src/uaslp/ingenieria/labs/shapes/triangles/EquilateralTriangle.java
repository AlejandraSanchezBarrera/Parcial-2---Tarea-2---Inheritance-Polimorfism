package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.Shape;
import uaslp.ingenieria.labs.shapes.Triangle;

public class EquilateralTriangle extends Triangle {
    private int side;

    public String getName() {
        return "Equilateral Triangle ";
    }

    public EquilateralTriangle(int side) {
        this.side=side;
    }

    public double getPerimeter() {
        return side*3;
    }

    public double getArea() {
        return (side*side*Math.sqrt(3))/4;
    }
}
