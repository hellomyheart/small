/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 21:37
 **/
public class BMI {
    public static void main(String[] args) {
        double height =50,length=1.75;
        double bmi=height/length/length;
        if  (bmi<=18.5){
            System.out.println("过轻");
        } else if (bmi<=25){
            System.out.println("正常");
        } else if (bmi<=28){
            System.out.println("过重");
        } else if (bmi<=32){
            System.out.println("肥胖");
        } else {
            System.out.println("非常肥胖");
        }
    }


}
