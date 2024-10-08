package 연습_클래스;

import java.awt.*;

public class ChinesRestaurant {
    public static void main(String[] args) {
        Menu jjajang = new Menu("짜장",4900);
        Menu jjambbong = new Menu("짬뽕",5900);
        Menu tangsook = new Menu("탕수육",13900);

        //메뉴조합하여 주문생성
        Menu[] menuArr = {jjajang,jjambbong,tangsook};
        Order order = new Order(123,menuArr);

        System.out.printf("주문 합계: %d원\n",order.totalPrice());
    }
}

class Order{
    int orderNum;
    Menu[] menus;

    public Order(int i, Menu[] arr) {
        orderNum = i;
        menus = arr;
    }
    public int totalPrice() {
        int sum=0;
        for(int i=0; i<menus.length; i++) {
            sum +=menus[i].price;
        }
        return sum;
    }
}
class Menu{
    String name;
    int price;
    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
