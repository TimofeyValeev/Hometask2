package Task1;

public class Circle extends Figure2D{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double area() {

        return Math.PI* Math.pow(radius,2);
    }

    @Override
    double perimeter() {
        return 2*radius*Math.PI;
    }


}
