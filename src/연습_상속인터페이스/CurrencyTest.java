package 연습_상속인터페이스;


public class CurrencyTest {
    public static void main(String[] args) {
        KRW krw = new KRW(1500,"원");
        USD usd = new USD(100.50,"달러");
        EUR eur = new EUR(260.87,"유로");
        JPY jpy = new JPY(1400,"엔");

        Currency[]currencies={krw,usd,eur,jpy};

        for (Currency c : currencies) {

            System.out.println(c.toString());
        }
    }
}
class Currency{
    public double amount;
    public String nation;
    public Currency(double amount, String nation) {
        this.amount = amount;
        this.nation = nation;
    }
}
class KRW extends Currency{
    public KRW(double amount, String nation) {
        super(amount,nation);
    }
    public String toString() {
        return String.format("KRW:%.2f%S",amount,nation);
    }
}
class USD extends Currency{
    public USD(double amount, String nation) {
        super( amount,nation);
    }
    public String toString() {
        return String.format("USD:%.2f%S",amount,nation);
    }
}
class EUR extends Currency{
    public EUR(double amount, String nation) {
        super( amount,nation);
    }
    public String toString() {
        return String.format("EUR:%.2f%S",amount,nation);
    }
}
class JPY extends Currency{
    public JPY(double amount, String nation) {
        super( amount,nation);
    }
    public String toString() {
        return String.format("JPY:%.2f%S",amount,nation);
    }
}