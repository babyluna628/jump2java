package ch07_4;

import java.io.*;

public class Ch07_예외처리 {
    public static void main(String[] args) throws IOException {
        //파일 찾기 예외처리
        BufferedReader br = new BufferedReader(new FileReader
                ("C:\\Users\\it\\IdeaProjects\\jump2java\\없는파일.txt"));
        //파일 읽을수 없을 경우 예외처
        br.readLine();
        br.close();
        //산술에 문제
        try {
            int c= 4/0;  //예외 발생 코드는 try 문에 입력
        } catch (ArithmeticException e) {
            System.out.println("수학예외 0 으로 나누는 에러 발생!");
        } finally {
            System.out.println("에러 발생하든 안하든 실행됨");
        }  //ctrl + alt + t 누르면 감싸기 됨 try/catch
        //실행중에 예외발생 실행하면 여기서 끝나버림 밑에는 실행안됨

        //배열에 인덱스 번호가 틀림 (실행중 발생함)
        try {
            int[]a={1,2,3};
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 넘기는 예외!"+e.getMessage());
        }finally {
            System.out.println("에러 발생하든 안하든 실행됨");
        }
        System.out.println("프로그램 종료");


    }
}
