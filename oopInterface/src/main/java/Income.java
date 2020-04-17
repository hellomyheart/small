
/**
 * 定义接口Income
 */
public interface Income {

    double getSalary();
    double getPer();
    default double getTax(){
        return getSalary()*getPer();
    };
}
