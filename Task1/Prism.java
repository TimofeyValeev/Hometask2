package Task1;

public class Prism {
    private double height;
    private Figure2D basis;
    public Prism(double height, Figure2D basis){
        this.height = height;
        this.basis = basis;
    }

    public double volume(){
        return height* basis.area();
    }

    public double surface(){
       return 2*basis.area()  + basis.perimeter() * height;
    }
}
