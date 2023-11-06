package encap;

/**
 * ClassName：Encapsulation01
 * Package:encap
 * Description:java封装
 *
 * @Create:2023/11/6 - 18:38
 * @Version:v1.0
 */
public class Account {
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器 1.无参构造器  2.有参构造器
    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }
    //姓名(二到四）
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("您输入的名字有误，请输入正确的姓名，默认姓名：张三");
            this.name = "张三";
        }
    }

    public double getBalance() {
        return balance;
    }
    //余额（必须大于20）
    public void setBalance(double balance) {
        if(balance > 20){
            this.balance = balance;
        }else {
            System.out.println("余额需大于20，默认余额为100");
            this.balance = 100;
        }
    }

    public String getPwd() {
        return pwd;
    }
    //密码（必须为六位）
    public void setPwd(String pwd) {
        if (pwd.length() == 6){
            this.pwd = pwd;
        }else {
            System.out.println("密码必须是六位，默认密码为：‘123456");
            this.pwd = "123456";
        }
    }
    //显示账号信息
    public void shoeInfo(){
        System.out.println("name=" + name + "balance" + balance + "pwd" + pwd);
    }
}

