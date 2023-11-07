package Polymorphism;

/**
 * ClassName：Test
 * Package:Polymorphism
 * Description:测试类
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 23:42
 * @Version:v1.0
 */
public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("哈吉米", "喵喵喵");
        Food Fish = new Food("金鱼");
        Master jack = new Master("jack");
        jack.feed(cat , Fish);

        Dog dog = new Dog("金毛", "汪汪汪");
        Food bone = new Food("Bone");
        Master jack1 = new Master("jack");
        jack1.feed(dog, bone);
    }
}
