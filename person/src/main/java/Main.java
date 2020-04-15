/**
 * @program: small
 * @description:
 * @author: syj
 * @create: 2020-04-13 09:22
 **/
public class Main {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("小明");
        ming.setAge(12);
        System.out.println(ming.getAge());
        Person wang = new Person("小王");
        System.out.println(wang.getName());
        Person hong=new Person();
        hong.setName("xiao","hong");
        System.out.println(hong.getName());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setName(String name1,String name2) {
        this.name = name1+name2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
