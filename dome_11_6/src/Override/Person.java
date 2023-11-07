package Override;

/**
 * ClassName：Person
 * Package:Override
 * Description:Person类，包括属性/ private (name、age），构造器、方法say(返
 * 回自我介绍的字符串）
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 14:14
 * @Version:v1.0
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String say(){
        return "name=" + name + "age=" + age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
