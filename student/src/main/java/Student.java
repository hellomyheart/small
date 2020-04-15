/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 20:02
 **/
public class Student {
    public static void main(String[] args) {
        int age = 7;
        boolean isPrimaryStudent = age > 6 && (age < 12 || age == 12) ? true : false;
        System.out.println(age+" is " +isPrimaryStudent);
    }
}
