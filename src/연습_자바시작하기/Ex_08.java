package 연습_자바시작하기;

public class Ex_08 {
    public static void main(String[] args) {
        int totalSec = 7582;
        int hours = 7582 / 3600; //
        int min = (7582%(3600))/60; //
        int sec = 7582%60; //
        System.out.printf("%d초는 %d시간 %d분 %d초입니다.",totalSec,hours,min,sec );
    }
}
