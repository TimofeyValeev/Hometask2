package Task1;

public class Test {
    public static void main(String[] args) {


        Circle circle1 = new Circle(5);
        Triangle triangle1 = new Triangle(3, 3 , 3);
        Rectangular rectangular1 = new Rectangular(6, 8);
        Trapezoid trapezoid1 = new Trapezoid(8, 10, 4, 3, 2);

        Prism prism1 = new Prism(5, circle1);
        Prism prism2 = new Prism(4, triangle1);
        Prism prism3 = new Prism(3, rectangular1);
        Prism prism4 = new Prism(6, trapezoid1);

        System.out.println(circle1.area());
        System.out.println(trapezoid1.area());
        System.out.println(triangle1.area());
        System.out.println(rectangular1.area());

        System.out.println("----------------");
        System.out.println(prism1.volume());
        System.out.println(prism1.surface());
        System.out.println("----------------");
        System.out.println(prism2.volume());
        System.out.println(prism2.surface());
        System.out.println("----------------");
        System.out.println(prism3.volume());
        System.out.println(prism3.surface());
        System.out.println("----------------");
        System.out.println(prism4.volume());
        System.out.println(prism4.surface());


    }
}