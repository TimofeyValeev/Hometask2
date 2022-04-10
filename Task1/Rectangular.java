package Task1;

public class Rectangular extends Figure2D {
    private double a ;
    private double b;
    public Rectangular(double a, double b){
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return a*b;
    }

    @Override
    double perimeter() {
        return 2*(a+b);
    }
}
