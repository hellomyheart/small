/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-13 00:06
 **/
public class Main {
    public static void main(String[] args) {
        int[][] scores={
                {82,90,91},
                {56,89,65},
                {99,98,97}
        };
        double average=0;
        for (int i=0;i<scores.length;i++)
            for (int j=0;j<scores[i].length;j++)
                average+=scores[i][j];
        System.out.println(average/9);
    }
}
