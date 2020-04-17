
/**
 * 稿费收入税率是20%
 */
public class RoyaltyIncome implements Income {

    double salary;

    RoyaltyIncome (double salary){
        this.salary=salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public double getPer() {
        return 0.2;
    }
}
