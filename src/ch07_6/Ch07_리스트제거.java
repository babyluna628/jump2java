package ch07_6;

import java.util.*;

public class Ch07_리스트제거 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        //6보다 작은숫자는 제거
        list.removeIf(x->x<6);
        //출력
        list.forEach(x -> System.out.println(x));
        //아이템을 리턴값으로 바꿈
        list.replaceAll(n->n*n);
        list.forEach(x -> System.out.println(x));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
