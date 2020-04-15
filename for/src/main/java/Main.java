/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 22:42
 **/
public class Main {
    public static void main(String[] args) {
        int[] ns={1,4,9,16,25};
        int sum=0;
        for (int i=ns.length-1;i>=0;i--) {
            System.out.println(ns[i]);
            sum+=ns[i];
        }
        System.out.println(sum);

        double pi=0;
        for (int i=0;i<=900000000;i++)
            pi+=Math.pow(-1,i)*1/(2*i+1);
        System.out.println(4*pi);
    }
}
