package Question1;

public class GeometricObject {
    protected String color;
    protected boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        color = "white";
        filled = false;
    }
    
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        dateCreated = new java.util.Date();
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + getDateCreated() + " \ncolor: " + color + " and filled: " + filled;
    }

    
    
}   
