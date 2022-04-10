package Task3;

public class Kelvin implements Converter{
    private double kelvin ;

    public Kelvin(){
    }

    @Override
    public double convert(double celsius) {
        return celsius + 273;
    }
}
