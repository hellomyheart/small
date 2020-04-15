/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 19:50
 **/
public class Equation {
    public static void main(String[] args) {
        double a=1.0;
        var b=3.0;
        var c =-4.0;
        double r1,r2;
        r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);


        System.out.println(r1 == 1&& r2 == -4 ? "成功":"失败");
    }
}
