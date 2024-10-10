package ch05_8;

//추상 클래스abstract 키워드를 클래스 앞에 적음
abstract class Animal {
    //    필드변수
    int a = 0;
    String k = "동물";
    //추상 메소드
    public abstract void color();
    public abstract void height();
    //일반 메소드
    public void printNmae(String nmae) {
        System.out.println(nmae);
    }
}
//추상 클래스를 상속받은 클래스는 추상메소를 구현해야함(안하면 에러남)
class Cat extends Animal {

    @Override
    public void color() {
        System.out.println("꼬양이 색");
    }

    @Override
    public void height() {
        System.out.println("꼬양이 키");
    }
}

public class Ch05_추상클래스 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.color();
        cat.height();
        cat.printNmae("꼬양이");

    }
}
