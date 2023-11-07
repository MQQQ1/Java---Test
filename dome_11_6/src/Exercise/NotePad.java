package Exercise;

/**
 * ClassName：NotePad
 * Package:Exercise
 * Description:NotePad类
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 13:13
 * @Version:v1.0
 */
public class NotePad extends PC{
    private String color;

    public NotePad(String cpu, int memory, int disk, String brand, String color) {
        super(cpu, memory, disk, brand);
        this.color = color;
    }
    public void information_color(){
        System.out.println(getDetails() + getBrand() + "color=" + color);
    }
}
