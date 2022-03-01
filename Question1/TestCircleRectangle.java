package Question1;

public class TestCircleRectangle {
    public static void main(String [] args){
        Circle Circle = new Circle();
        System.out.println("A circle " + Circle.toString());
        System.out.println("The color is " + Circle.getColor());
        System.out.println("The radius is " + Circle.getRadius());
        System.out.println("The area is " + Circle.getArea());
        System.out.println("The diameter is " + Circle.getDiameter());

        Rectangle Rectangle = new Rectangle();
        System.out.println("\nA rectangle " + Rectangle.toString());
        System.out.println("The area is " + Rectangle.getArea());
        System.out.println("The perimeter is " + Rectangle.getPerimeter());

    }   
}
