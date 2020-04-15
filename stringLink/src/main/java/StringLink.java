
/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 20:44
 **/
public class StringLink {
    public static void main(String[] args) {
        int a =72,b=105,c=65281;
        String s =(char)a+""+(char)b+""+(char)c;
        System.out.println(s);

        String[] names={"ABC","XYZ","ZOO"};
        s=names[1];
        names[1]="cat";
        System.out.println(s);



    }
}
