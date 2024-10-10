package 연습_상속인터페이스;

import java.util.ArrayList;

public class DrinkTest {
    public static void main(String[] args) {
        Juice j = new Juice();
        Coffee c = new Coffee();
        Beer b = new Beer();
        Water w = new Water();
        Tea t = new Tea();


        //부모 클래스 타입배열생성
        Drink[] drinks = {j, c, b, w, t};

        //모든 음료 주문
        for (Drink d : drinks) {
            d.ordered();
        }
    }
}

class Drink {
    String name;
    double price;

    public void ordered() {
        System.out.println("주문되었습니다.");
    }
}

class Juice extends Drink {
}

class Coffee extends Drink {
}

class Beer extends Drink {
}

class Water extends Drink {
}

class Tea extends Drink {
}
