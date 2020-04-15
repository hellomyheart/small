
/**
 * 定义抽象类Income
 */
public abstract class Income {
    public double salary;
    public double tax;
    public Income(double salary,double per){
        this.salary=salary;
        this.tax=salary*per;
    }

    public double getSalary() {
        return salary;
    }

    public double getTax() {
        return tax;
    }
}
