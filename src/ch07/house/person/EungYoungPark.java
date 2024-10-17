package ch07.house.person;

import ch07.house.HousePark;

public class EungYoungPark extends HousePark {
    public static void main(String[] args) {
        EungYoungPark e = new EungYoungPark();
        //다른패키지에서 접근안되지만 상속하면 가능
        System.out.println(e.lastname);
    }
}
