package Question1;

import java.lang.Math;

public class Circle extends GeometricObject {

    protected double radius;

    public Circle(){
        radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public double getDiameter(){
        return 2 * radius;
    }

    public void printCircle(){
        System.out.println("A circle " + getDateCreated());
        System.out.println("color: " + getColor() + " and filled: " + isFilled());
        System.out.println("The color is " + getColor());
        System.out.println("The radius is " + getRadius());
        System.out.println("The area is " + getArea());
        System.out.println("The diameter is " + getDiameter());
        System.out.println("The radius is " + getRadius());
    }

}
