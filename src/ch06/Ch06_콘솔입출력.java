package ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch06_콘솔입출력 {
    public static void main(String[] args) throws IOException {
       // InputStream in = System.in;//콘솔 키보드 입력받기

//        int a;
//        a = in.read();
//        char b = (char) a;
//        System.out.println("입력된 값은 :" + a);
//        System.out.println("문자는:" + b);
//        int a;
//        int b;
//        int c;
//
//        a = in.read();
//        b = in.read();
//        c = in.read();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        byte[] a = new byte[3];
//        in.read(a); //입력 byte 배열의 갯수만큼 읽어서 배열에 입력됨.
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        for (byte b : a) {
//            System.out.println(b);
//        }
        /*inputStreamReader 입력 문자를 그대로 받음*/
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        char[] a = new char[3];
//        reader.read(a);
//        System.out.println(a);

        /*BufferedReader : 문자열 일기*/
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//
//        String line = br.readLine();
//        System.out.println(line);

        /*Scanner 다양한 값을 읽을수있음*/
        Scanner sc = new Scanner(System.in);
        //System.out.println(sc.next());
        // int x = sc.nextInt();
        //double x = sc.nextDouble();
        String s = sc.nextLine();//enter 키값 이전까지 문자열로 끊어서
        System.out.println(s);
        sc.close(); //더이상 사용안할때 스캐너를 종료함.

    }
}
