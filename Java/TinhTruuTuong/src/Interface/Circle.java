package Interface;

public class Circle implements IShape{

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    private double PI = 3.14;
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double  getArea(){
        return PI * getRadius() * getRadius();
    }
    public double getPerimeter(){
        return 2 * PI * radius;
    }
}
