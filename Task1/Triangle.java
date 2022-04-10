package Task1;

public class Triangle extends Figure2D {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double hP() {
        return (a + b + c) / 2;
    }

    @Override
    double area() {
        return Math.sqrt(hP()*(hP()-a)*(hP()-b)*(hP()-c));
    }

    @Override
    double perimeter() {
        return a+b+c;
    }

}
