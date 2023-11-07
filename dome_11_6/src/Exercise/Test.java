package Exercise;

/**
 * ClassName：Test
 * Package:Exercise
 * Description:
 * 编写Computer类，包含CPU、内存、硬盘等属性，getDetails方法用于返回
 * Computer#si#4EE
 * 编写PC子类，继承Computer类，添加特有属性【品牌brand】
 * 编写NotePad子类，继承Computer类，添加特有属性 【color】
 * 编写Test类，在main方法中创建PC和NotePad对象，分别给对象中特有的属性
 * 赋值，以及从Computer类继承的属性赋值，并使用方法并打印输出信息
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 13:25
 * @Version:v1.0
 */
public class Test {
    public static void main(String[] args) {
        PC pc = new PC("Intel",8,512,"Lenovo");
        pc.information_brand();

        NotePad notePad = new NotePad("APPLE",16,256,"SanDisk","Black");
        notePad.information_color();
    }
}
