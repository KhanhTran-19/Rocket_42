import java.util.Date;

public class Exercise2 {
    public static void Question1() {
        Account[] accounts = new Account[5];
        for(int i = 0; i < accounts.length; i++) {
            accounts[i].id = i+1;
            accounts[i].email = String.format("Email %d", i + 1);
            accounts[i].username = String.format("User name %d", i + 1);
            accounts[i].fullname = String.format("Full name %d", i + 1);
            accounts[i].createDate = new Date();
        }

        for(Account account: accounts)
            System.out.println(account);
    }
}
