package Task2;

public class HourWage extends Wage{
    private double ratePerHour;

    public HourWage(double ratePerHour){
        this.ratePerHour = ratePerHour;
    }

    @Override
    double salaryCalculation() {
        return 20.8*8* ratePerHour ;
    }

}
