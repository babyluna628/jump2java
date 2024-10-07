package 연습_메소드;

import jdk.dynalink.beans.StaticClass;

public class RareItem {
    public static void main(String[] args) {
        wear(2400, 2000);
        wear(3800, 100);
    }

    public static void wear(int hp, int mp) {

        if (hp >= 2000 && mp >= 2000) {
            System.out.println("아이템 장착완료!");
        } else {
            System.out.println("아이템을 착용할 수 없습니다.");
        }
    }
}
