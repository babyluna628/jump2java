package 연습_자바시작하기;

public class Ex01_06 {
    public static void main(String[] args) {
        String name = "홍팍"; //문자열 변수생성
        int age = 18; //정수형 변수생성
        double h = 176.4; //실수형 변수생성
        boolean isStart = true; //논리현 변수 생성
        //결과출력
        System.out.println("이름:" + name);
        System.out.println("나이:" + age);
        System.out.println("신장:" + "cm");
        System.out.println("입문자입니까?" + isStart);
        //
        int math = 96;
        int sc = 88;
        int en = 76;

        System.out.println("수학:" + math);
        System.out.println("과학:" + sc);
        System.out.println("영어:" + en);
        //
        double a = 8.62;
        double b = 10.23;
        double c = 12.48;
        double d = 7.82;
        double e = 9.54;

        System.out.println(a + b + c + d + e + "$");
        //
        int x = 8000;
        int y = 160;
        System.out.println(x * y);
        //
        int euro = 52;
        int dollar = 32;
        double euroToKwnRate = 1281.62664;
        double dollarToKwnRate = 1091.70306;


        double kwn = euro * euroToKwnRate + dollar * dollarToKwnRate;
        System.out.printf("환전결과: %.0f원",kwn);
        System.out.println(" ");
        //

        double inchToCm = 2.54;
        int inch = 32;
        double cm = inch*inchToCm;
        System.out.println(cm+"cm");//15.24

        //






    }
}
