package Interface;

public class Rectangle implements IShape{
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return getLength() * getWidth();
    }
    public double getPerimeter(){
        return (getLength()+getWidth()) *2;
    }
}
