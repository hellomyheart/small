/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 22:25
 **/
public class DoWhile {
    public static void main(String[] args) {
        int sum = 0;
        int m = 20, n = 100;
        do sum += m;
        while (m++ < n);
        System.out.println(sum);
    }
}
