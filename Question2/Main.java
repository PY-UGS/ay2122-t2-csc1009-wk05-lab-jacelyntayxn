package Question2;

public class Main {
    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Circle c = new Circle(5, 5);
        Ellipse e = new Ellipse(7,7);
        Shape figreShape;
        figreShape = r;
        System.out.println("Inside Area for Rectangle");
        System.out.println("Area is " + String.format("%.2f",figreShape.area()));
        figreShape = t;
        System.out.println("Inside Area for Triangle");
        System.out.println("Area is " + String.format("%.2f",figreShape.area()));
        figreShape = c;
        System.out.println("Inside Area for Circle");
        System.out.println("Area is " + String.format("%.2f",figreShape.area()));
        figreShape = e;
        System.out.println("Inside Area for Ellipse");
        System.out.println("Area is " + String.format("%.2f",figreShape.area()));
    }
}
