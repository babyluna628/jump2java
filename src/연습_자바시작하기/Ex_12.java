package 연습_자바시작하기;

public class Ex_12 {
    public static void main(String[] args) {
        int num=37411;
        int oneDigit=num%10;
        int tenDigit=(num%100)/10;
        int hundredDigit=(num%1000)/100;
        int thoundsDigit=(num%10000)/1000;
        int tenthoundsDigit=num/10000;
        System.out.println(oneDigit+tenDigit+hundredDigit+thoundsDigit+tenthoundsDigit);
    }
}
