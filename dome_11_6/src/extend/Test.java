package extend;

import javax.lang.model.element.VariableElement;

/**
 * ClassName：Extends01
 * Package:extend
 * Description:测试类
 *
 * @Create:2023/11/6 - 22:19
 * @Version:v1.0
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "柯基";
        dog.age = 2;
        dog.yelling = "汪汪汪";
        dog.information();
        dog.state();

        Cat cat = new Cat();
        cat.name = "哈基米";
        cat.age = 3;
        cat.yelling = "喵喵喵";
        cat.information();
        cat.state();
    }
}
