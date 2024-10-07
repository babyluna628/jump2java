package 연습_메소드;

public class Pork {
    public static void main(String[] args) {
        /*1.칼로리 계산을 위해 메소드 호출*/
        double result = calculateCalory(540);
        System.out.printf("삼겹살3인분:%.2f kcal", result);
                /*3.결과를 출력*/
    }
    /*2.칼로리 계산 메소드 정의*/
    private static double calculateCalory(int pork3){
        return 5.179*pork3;
    }
}
