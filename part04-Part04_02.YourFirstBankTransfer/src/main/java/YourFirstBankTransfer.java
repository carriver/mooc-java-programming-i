
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        Account account1 = new Account("My account", 0.0);
        Account account2 = new Account("Matthews account", 1000.00);

        account2.withdrawal(100);
        account1.deposit(100);

        System.out.println(account1);
        System.out.println(account2);

    }
}
