package ch03;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch03_형변환과final {
    public static void main(String[] args) {
        String num = "123"; //문자열
        int n = Integer.parseInt(num);
        System.out.println(n);
        String num2 = "3.123"; //문자열
        Double.parseDouble(num2);
        Double n2 = Double.parseDouble(num2);
        System.out.println(n2);

        //반대로 정수를 문자열로 변환한다.
        int n3 = 456;
        String num3 = ""+n;//1.문자열 더하기 숫자는 문자열이됨!
        System.out.println(num3);
        String num4 = String.valueOf(n3); //2.String.valueOf(정수)
        String num5 = Integer.toString(n3);//3.Integer.toString(정수)

        //문자열 =>실수
        String num6 = "123.456";
        double d = Double.parseDouble(num6);

        //정수와 실수 변환
        int n4 = 123;
        double d2 = n4; //정수 =>실수 (자동변환)
        System.out.println(d2);
        //실수 => 정수 바로안됨!
        double d3 = 123.456;
        int n5 = (int) d3; //캐스팅(변환타입)
        System.out.println(n5);

        //형변환시 주의점 (변환될 타입과 문자열 내용이 틀리면 오류)
        String num7 = "123.456";
        double n6 = Double.parseDouble(num7);

        //final 키워드는 값을 한번만 설정 고정값 바꿀수 없음.
        final int n7 = 123;
        //n7 = 456;
        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a","b"));
        a.add("c");
        System.out.println(a);


    }
}
