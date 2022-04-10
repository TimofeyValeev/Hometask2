package Task2;

public class FixWage extends Wage{
    private double fixSalary;
    public FixWage(double fixSalary){
        this.fixSalary = fixSalary;
    }
    @Override
    double salaryCalculation() {
        return fixSalary ;
    }
}
