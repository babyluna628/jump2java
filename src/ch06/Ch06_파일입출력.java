package ch06;

import java.io.*;

public class Ch06_파일입출력 {
    public static void main(String[] args) throws IOException {
        /*파일 쓰기*/
//        FileOutputStream output = new FileOutputStream("c:/Temp/out.txt");
//        for(int i =1;i<11; i++){
//            String data = i+"번쨰 줄입니다. \r'n"; //\r\n 커서를 한줄 앞으로띄움
//            output.write(data.getBytes()); //바이트로 쓰기
//        }
//        output.close();
        /*FileWriter 문자열을 바로 쓸수있음*/
//        FileWriter fw = new FileWriter("c:/Temp/out.txt");
//        for(int i =1;i<11; i++){
//            String data = i+ "번째 줄입니다. \r'n";
//            fw.write(data); //문자열을 바로 입력함
//        }
//        fw.close();

        /*PrintWriter 는 println 메서드 사용*/
//        PrintWriter fw = new PrintWriter("c:/Temp/out.txt",true);
//        for(int i=1;i<11;i++){
//            String data = i+"번째 줄입니다.\r\n";
//            fw.println(data);//문자열을 바로 입력
//        }
//        pw.close();
        // }
//        PrintWriter pw = new PrintWriter(new FileWriter("c:/Temp/out1.txt", true));
//        for (int i = 1; i < 11; i++) {
//            String data = i + "번째줄입니다.";
//            pw.println(data);
//        }

//        FileInputStream input = new FileInputStream("c:/Temp/out.txt");
//        byte[]buf=new byte[1024];//1024바이트배열
//        input.read(buf);
//        String s = new String(buf);
//        System.out.println(s);
//        input.close();
        /*문자열 단위로 읽는방법 :
        * 파일리더로 문자하나씩 읽고 버퍼리더로 한꺼번에 읽음*/
        BufferedReader br = new BufferedReader(new FileReader("c:/Temp/abc.txt"));
        while(true) {
            String line = br.readLine(); //한줄씩 읽음
            if (line == null) break; //더이상 읽을 줄(라인)이 없을떄 반복문 빠져나감
            System.out.println(line);
        }
        br.close();

    }
}
