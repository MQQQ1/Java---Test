package Override;

/**
 * ClassName：Test
 * Package:Override
 * Description:在main中调用say方法输出自我介绍
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 14:28
 * @Version:v1.0
 */
public class Test {
    public static void main(String[] args) {
        Student jack = new Student("jack", 18, 2205, 100);
        System.out.println(jack.say());
    }
}
