package Exercise;

/**
 * ClassName：Computer
 * Package:Exercise
 * Description:Computer父类
 * Author：MQQQ
 *
 * @Create:2023/11/7 - 12:18
 * @Version:v1.0
 */
public class Computer {
    private String cpu;
    private int memory;//内存
    private int disk;//硬盘
    //构造器
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    //返回Computer信息
    public String getDetails(){
        return "cpu=" + cpu + "内存=" + memory + "硬盘=" + disk ;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
