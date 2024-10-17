package 연습_자바API;

import java.util.ArrayList;

public class TotalChickenPrice {
    public static void main(String[] args) {
        ArrayList<Chicken> order = new ArrayList<Chicken>();

        /*주문한 치킨을 ArrayList에 담기*/
        order.add(new Chicken("로스트치킨",9900));
        order.add(new Chicken("파닭치킨",12900));
        order.add(new Chicken("마늘치킨",13900));

        /*ArrayList 를 순회 총합*/
        int sum = 0;
        for (Chicken chicken : order) {
            sum += chicken.getPrice();
        }

        System.out.printf("총합:%d원\n",sum);

    }
}
class Chicken {
    private String name;
    private int price;

    public Chicken(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
