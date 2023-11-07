package Polymorphism;

/**
 * ClassName：Animal
 * Package:Polymorphism
 * Description:动物父类
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 23:31
 * @Version:v1.0
 */
public class Animal {
    private String name;
    private String yelling;

    public Animal(String name, String yelling) {
        this.name = name;
        this.yelling = yelling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYelling() {
        return yelling;
    }

    public void setYelling(String yelling) {
        this.yelling = yelling;
    }
}
