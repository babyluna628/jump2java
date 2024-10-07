package ch05;

class sample {
    //메서드 입력 매개변수 a,b
    int sum(int a, int b) {
        return a + b;
    }

    //리턴값이 없는 메서드
    void sum2(int a, int b) {
        System.out.println(a + "와" + b + "의 합은" + (a + b) + "입니다.");
        System.out.printf("%d와 %d의합은 %d입니다.%n", a, b, a + b);
    }

    //입력은 없고 문자열 "hi"가 반환됨.
    String say() {
        return "Hi";
    }
    //입력 리턴없는 메서드
    void hello(){
        System.out.println("헬로우!");
    }
    //리턴으로 빠져나오기(메서드에서 리턴을 만나면 종료됨)
    void sayNick(String nick){
        if("바보".equals(nick)||"등신".equals(nick)){
            return; //종료 바보or등신 으로하면 종료
        }
        System.out.println("나의 별명은" + nick + "입니다.");
    }
    //메서드 안에  선언 변수 효력범위(메서드 안에서만 사용)
    int varTest(int a){
        a++;
        return a;

    }
}

public class Ch05_메서드 {

    public static void main(String[] args) {


        sample sample = new sample();
        //객체,메소드명 =>메서드호출 이때 전달하는 입력값을 인수(arguments)
        int c = sample.sum(3, 4);
        System.out.println(c);

        String say = sample.say();
        System.out.println(say);
        sample.sum2(3, 4);
        System.out.println();//한칸띄우는용 %n <-이것도 한칸띄우는특수키
        sample.hello();

        sample.sayNick("현주");
        sample.sayNick("루나");
        sample.sayNick("바보"); //출력안됨
        sample.sayNick("바보현주");

        int a =1;
        a = sample.varTest(a);
        System.out.println(a);
    }
}
