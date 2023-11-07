package Polymorphism;

/**
 * ClassName：Master
 * Package:Polymorphism
 * Description:主人类 Master
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 23:35
 * @Version:v1.0
 */
public class Master {
    public String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //喂食方法
    public void feed(Animal animal,Food food){
        System.out.println("主人" + name + "给" + animal.getName() + "吃" + food.getName() + animal.getName() + "开心地：" + animal.getYelling());
    }
}
