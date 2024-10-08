package 연습_클래스;

public class MinerTest {
    public static void main(String[] args) {
        /*두 광부 객체*/
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");
        /*코인 채굴*/
        //채굴 메소드를 사용해 각각의 객체의 코인수늘리기
        malon.mine();
        malon.mine();
        gloria.mine();
        gloria.mine();
        gloria.mine();


        /*객체 정보 출력*/
        System.out.println(malon.toString());
        System.out.println(gloria.toString());
    }
}

class Miner{
    //필드 (인스턴스 변수)
    String name;
    int coins;

    //생성자
    public Miner(String str){
        name = str;
        coins = 0;
    }
    //메소드(인스턴스 메소드)-객체의 정보를 문자열로 반환
    public String toString(){
        return String.format("Miner{name='%s', coins=%d}", name, coins);
    }
    //메소드(인스턴스 메소드) - 코인채굴
    public  void mine(){
        coins +=1;
    }
}
