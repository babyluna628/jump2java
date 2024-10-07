package 연습_메소드;

public class Gamble {
    public static void main(String[] args) {
        double dollar = dice() + dice() +dice();
        double won = exchange(dollar);
        int result = dice();

        System.out.printf("획득 금액: $%.f(%.0f원)",dollar,won);
    }
    public static int dice(){
//        Math.random()메소드 활용하여 1~6 사이 정수를 반환
        return (int)(Math.random()*6)+1;

    }

    public static double exchange(double dollar){
        /*입력받은 달러를 환전하여 반환*/
        return dollar;
    }
}
