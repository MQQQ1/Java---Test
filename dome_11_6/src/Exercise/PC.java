package Exercise;

/**
 * ClassName：PC
 * Package:Exercise
 * Description:PC类
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 13:06
 * @Version:v1.0
 */
public class PC extends Computer{
    private String brand;//品牌

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void information_brand(){
        System.out.println(getDetails() + "品牌=" + brand);
    }
}
