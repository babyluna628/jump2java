package 연습_메소드;

public class Gamble2 {
    // 주사위를 던지는 메소드
    public static int rollDice() {
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        final double EXCHANGE_RATE = 1082.25108; // 1달러당 원화 환율
        int totalDollars = 0;

        System.out.println("주사위 게임 시작!");

        // 3번의 주사위 던지기
        for (int i = 1; i <= 3; i++) {
            int diceResult = rollDice();
            totalDollars += diceResult;
            System.out.println(i + "번째 주사위 결과: " + diceResult + "달러 획득");
        }

        // 총 획득 달러 출력
        System.out.println("총 획득한 달러: " + totalDollars + "달러");

        // 원화로 환전
        double wonAmount = totalDollars * EXCHANGE_RATE;

        // 결과 출력 (소수점 둘째 자리까지 반올림)
        System.out.printf("환전 결과: %.0f원", wonAmount);
    }
}
