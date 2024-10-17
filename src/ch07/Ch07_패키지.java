package ch07;

import ch07.house.*;
import ch07.house.HousePark;

import java.util.*; //*뜻이 모두이니 다 임포트해란말

public class Ch07_패키지 {
    public static void main(String[] args) {
        String str = "미리 임포트된패키지 java.lang";
        ArrayList<Integer>List = new ArrayList<>();
        double pi = Math.PI;
        Random r = new Random();
        HashMap<Integer,Integer> map = new HashMap<>();

        HouseKim kim = new HouseKim();
        HousePark park = new HousePark();
    }
}
