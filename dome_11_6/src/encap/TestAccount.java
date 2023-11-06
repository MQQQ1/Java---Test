package encap;

/**
 * ClassName：TestAccount
 * Package:encap
 * Description:Test
 *
 * @Create:2023/11/6 - 19:29
 * @Version:v1.0
 */
public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(600);
        account.setPwd("333666");
        account.shoeInfo();
    }
}
