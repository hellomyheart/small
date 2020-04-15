/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 22:16
 **/
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20;
        int n = 100;
        while (m <= n) {
            sum += m;
            m++;
        }
        System.out.println(sum);
    }
}
