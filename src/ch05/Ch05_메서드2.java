package ch05;

//같은 패키지안에선 같은클래스를 못만듬
class sample2 {
    int a; //객체 변수

    void varTest(sample2 s) {
        s.a++;
    }
}

class Updater{
    void update(Counter c){
        c.count++;
    }
}

class Counter{
    int count = 0;
}

public class Ch05_메서드2 {
    public static void main(String[] args) {
        sample2 s1 = new sample2();
        sample2 s2 = new sample2();
        s1.a = 1;
        s2.a = 2;
        s1.varTest(s2); //s2.a=3
        s1.varTest(s1); //s1.a=2
        System.out.println(s1.a);
        System.out.println(s2.a);

        Counter c = new Counter();
        System.out.println("업데이트 전:" +c.count);
        Updater u = new Updater();
        u.update(c);
        System.out.println("업데이트 후:"+c.count);
    }
}
