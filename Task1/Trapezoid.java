package Task1;

public class Trapezoid extends Figure2D{
    private double a;
    private double b ;
    private double h;
    private double c;
    private double d;


    public Trapezoid(double a, double b, double c, double d, double h){
        this.a = a;
        this.b = b;
        this.h = h;
        this.c = c;
        this.d = d;
    }

    @Override
    double area() {
        return (a+b)/2 * h;
    }

    @Override
    double perimeter() {
        return a + b + c + d;
    }

}
