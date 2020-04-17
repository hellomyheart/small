
public class SalaryIncome implements Income {
    double salary;
    double per;

    SalaryIncome (double salary,double per){
        this.salary=salary;
        this.per=per;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getPer() {
        return this.per;
    }
}
