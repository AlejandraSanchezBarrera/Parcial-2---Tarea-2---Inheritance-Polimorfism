package uaslp.ingenieria.labs.shapes.triangles;

import uaslp.ingenieria.labs.Shape;
import uaslp.ingenieria.labs.shapes.Triangle;

public class IsoscelesTriangle extends Triangle {
    private int side;
    private int base;
    private double h;

    public String getName() {
        return "Isosceles Triangle ";
    }

    public IsoscelesTriangle(int side, int base) {
        this.side = side;
        this.base=base;
    }

    public double getPerimeter() {
        return (side*2)+base;
    }

    public double getArea() {
        h=(Math.sqrt(3)/2)*side;
        return (h*base)/2;
    }
}
