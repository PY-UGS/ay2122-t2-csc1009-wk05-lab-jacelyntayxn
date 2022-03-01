package Question2;
import java.lang.Math;

public abstract class Shape {
    protected double dim1;
    protected double dim2;
    double PI = Math.PI;

    public Shape(double dim1 ,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract double area();



    
}
