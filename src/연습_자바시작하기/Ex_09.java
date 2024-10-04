package 연습_자바시작하기;

public class Ex_09 {
    public static void main(String[] args) {
        //속도(m/s) = 거리m / 시간s
        double meter = 100;
        double sec = 18;
        double sisok = meter/sec;
        System.out.println((sisok*3600)/1000+"km/h");
    }
}
