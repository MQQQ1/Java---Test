package extend;

/**
 * ClassName：Animal
 * Package:extend
 * Description:Animal父类
 *
 * @Create:2023/11/6 - 23:18
 * @Version:v1.0
 */
public class Animal {
    public String name;
    public int age;
    public String yelling;//叫声

    public void Animal(String yelling) {
        this.yelling = yelling;
    }
    public void information(){
        System.out.println("宠物名：" +name + "年龄" + age + "叫声：" + yelling);
    }
}

