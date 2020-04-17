/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-17 10:24
 **/
public class Main {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "测试成功" : "测试失败");
    }
    static String buildInsertSql(String table, String[] fields) {

        String[] temps=new String[fields.length];
        for (int i = 0; i < temps.length; i++)
            temps[i]="?";
        StringBuilder s=new StringBuilder(1000);
        s.append("INSERT INTO ")
                .append(table)
                .append(" (")
                .append(String.join(", ",fields))
                .append(") VALUES (")
                .append(String.join(", ",temps))
                .append(")");
        return s.toString();
    }
}