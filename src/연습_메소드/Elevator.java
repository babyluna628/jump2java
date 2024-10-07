package 연습_메소드;

public class Elevator {
    public static void main(String[] args) {
        int a = 13;
        int b = 7;
        int c = 10;

        System.out.printf("%d층 -> %s 엘레베이터\n",a,guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n",b,guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n",c,guide(c));
    }
    public static String guide(int level) {
        if(level<=10){
            return "저층";
        }else{
            return "고층";
        }
    }

}
