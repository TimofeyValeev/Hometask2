package Task3;

public class Fahrenheit implements Converter {
    public Fahrenheit(){
    }

    @Override
    public double convert(double celsius) {
        return 1.8* celsius + 32;
    }
}
