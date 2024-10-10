package ch05_7;

interface Predator {
    //추상메서드(구현이 되지 않은 메서드로 {몸통}없음)
    //리턴타입,이름,() 안에 내용없어도 만들어야함
    String getFood();
}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() {
        return "낙지탕탕이";
    }

}

class Lion extends Animal implements Predator {
    public String getFood() {
        return "탕후루";
    }
}

class HyunJoo{
    public void feed(Predator p) {
        System.out.println("먹이주기"+p.getFood());
    }
}

public class Ch05_인터페이스 {
    public static void main(String[] args) {
        Tiger 호랑이 = new Tiger();
        Lion 사자 = new Lion();
        HyunJoo 현주 = new HyunJoo();
        현주.feed(호랑이);//인터페이스 타입 객체 입력(구현한 클래스 객체)
        현주.feed(사자);

    }
}
