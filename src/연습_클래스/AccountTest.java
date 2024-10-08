package 연습_클래스;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("123-45",10000);
        Account b = new Account("567-89",10000);

        //송금: 3천원씩 a계좌에서 b계좌로
        boolean result = true;
        while(result) {
            result = a.transfer(b,3000 );
        }
        //결과출력
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
class Account {
    String num; //계좌번호
    int balance; //잔액
    public Account(String num, int balance) {
        this.num = num;
        this.balance = balance;
    }
    public String toString() {
        return String.format("Account{num=%s, balance=%d}", num, balance);
    }
    public boolean transfer(Account target, int amount) {
        if(balance < amount) {
            return false;
        }
        target.balance += amount;
        balance -= amount;
        return true;
    }
}
