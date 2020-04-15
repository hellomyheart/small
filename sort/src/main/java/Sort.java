import java.util.Arrays;

/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 23:15
 **/
public class Sort {
    public static void main(String[] args) {
        int[] ns = {28, 12, 5, 6, 1, 56, 21, 34, 78, 54};
        System.out.println(Arrays.toString(ns));

        for (int i=0;i<ns.length-1;i++){
            for (int j=0;j<ns.length-1-i;j++){
                if (ns[j]<ns[j+1])
                {
                    int temp= ns[j];
                    ns[j]=ns[j+1];
                    ns[j+1]=temp;
                }
            }
        }


        System.out.println(Arrays.toString(ns));
    }
}