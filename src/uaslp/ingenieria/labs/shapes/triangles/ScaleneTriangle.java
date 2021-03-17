package uaslp.ingenieria.labs.shapes.triangles;
import uaslp.ingenieria.labs.Shape;
import uaslp.ingenieria.labs.shapes.Triangle;

import java.util.*;

public class ScaleneTriangle extends Triangle {
    private int a;
    private int b;
    private int c;
    private double s;

    public String getName() {
        return "Scalene Triangle ";
    }

    public ScaleneTriangle(int a, int b, int c) {
        this.a = a;
        this.b=b;
        this.c=c;
    }

    public double getPerimeter() {
        return a+b+c;
    }

    public double getArea() {
        s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
