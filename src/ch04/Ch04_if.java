package ch04;

import java.util.ArrayList;

public class Ch04_if {
    public static void main(String[] args) {
        /* crtl + shift + / 여러줄 주석 */
        /* if 문 */
        int money = 2000;
        boolean hasCard = true;
        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");

            //if조건에 리스트 contains(리스트에 값이 있으면 참)
            ArrayList<String> pocket = new ArrayList<>();
            pocket.add("paper");
            pocket.add("ket");
            pocket.add("cellphone");
            pocket.add("money");

            if (pocket.contains("money")) {
                System.out.println("현금으로 택시를 타고간다");
            } else if (hasCard) {
                System.out.println("카드로 택시를 타고간다.");
            } else {
                System.out.println("걸어가라");
            }
        }
    }
}
