package 연습_자바시작하기;

public class Ex_14 {
    public static void main(String[] args) {
        int price = 152365;
        int oman = price/50000;
        int man = (price-(oman*50000))/10000;
        int ochun = (price-(oman*50000)-(man*10000))/5000;
        int chun = (price-(oman*50000)-(man*10000)-(ochun*5000))/1000;
        int discounted = price-(oman*50000)-(man*10000)-(ochun*5000)-(chun*1000);
        int totalCnt = oman+man+ochun+chun;

        System.out.printf("5만원 * %d\n",oman);
        System.out.printf("1만원 * %d\n",man);
        System.out.printf("5천원 * %d\n",ochun);
        System.out.printf("천원 * %d\n",chun);
        System.out.println("------------");
        System.out.printf("총 장수:%d장 \n",totalCnt);
        System.out.printf("금액: %d원\n",price - discounted);
        System.out.printf("할인: %d\n",discounted);
    }
}
