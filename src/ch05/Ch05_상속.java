package ch05;

//부모 클래스
class Anima {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

//자식 클래스 Anima 클래스를 상속 extends<이게 상속클래스
class Dog extends Anima {
    //생성자는 클래스명과 똑같고 리턴이 없음
    //그중에 디폴트 생성자는 입력변수가 없음(생략가능)
    Dog() {
        System.out.println("도그객체 생성!");
    }

    void sleep() {
        System.out.println(this.name + "뿌우웅꺼억뿌지직");
    }
}

class HouseDog extends Dog {

    void sleep() {

        System.out.println(this.name + "뿌우웅꺼억뿌지직 집강아지루나");
    }

    //메소드는 이름외에 리턴타입과 입력변수가 똑같지 않으면 새로운 메서드임
    void sleep(int hour) {
        System.out.println(this.name + "zzz in home" + hour + "시간");
    }
}

public class Ch05_상속 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("luna");
        System.out.println(dog.name);
        dog.sleep();


        Anima a = new Dog(); //상속관계일때 부모타입으로 선언 자식 객체 사용 가능
        //Dog c = new Anima(); //자식 타입 선언하고 부모객체는 안됨

        //메서드 오버라이딩 : 부모 메서드와 똑같은 이름의 메서드를 새로 만듬
        HouseDog hd = new HouseDog();
        hd.setName("똥개");
        hd.sleep();

        //메서드 오버로딩(overloading) : 이름은 같지만 입력변수가 틀리다(다른메서드)
        hd.sleep(8);
    }
}
