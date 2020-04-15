import java.util.Scanner;
/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-12 21:15
 **/
public class Grade {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner scanner = new Scanner(System.in);
        // 打印提示
        System.out.print("请输入第一次成绩: ");
        // 读取一行输入并获取整数
        int first_grade = scanner.nextInt();
        // 打印提示
        System.out.print("请输入第二次成绩: ");
        // 读取一行输入并获取整数
        int last_grade = scanner.nextInt();
        // 格式化输出
        System.out.printf("成绩提高了, %.2f%%\n", (last_grade*1.0/first_grade-1)*100);


    }
}
