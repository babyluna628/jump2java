package 연습_자바API;

import java.util.ArrayList;

public class TotalPrice {
    public static void main(String[] args) {
        /*1.구매상품객체*/
        Item a =  new Item("스트라이프셔츠",49900);
        Item b = new Item("슬림면바지",58900);
        Item c =  new Item("스니커즈",46900);
        /*2.장바구니에 상품담으셈*/
        Cart myCart = new Cart();
        myCart.add(a);
        myCart.add(b);
        myCart.add(c);
        System.out.printf("총합:%d원",myCart.totalPrice());
    }
}
class Cart{
    private ArrayList<Item> list;
    public Cart(){
        this.list = new ArrayList<Item>();
    }
    public void add(Item item){
        list.add(item);
    }
    /*3.장바구니 총합 메소드 완성*/
    public  int totalPrice(){
        int sum = 0;
        for (Item item : list) {
            sum+= item.getPrice();
            
        }
        return  sum;
    }
}
class  Item{
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
}