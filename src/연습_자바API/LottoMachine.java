package 연습_자바API;

import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;

public class LottoMachine {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 45; i++) {
            numbers.add(i);//1~45
        }
        Collections.shuffle(numbers);
        int[]picked = new int[6];
        for (int i = 0; i < 6; i++) {
            picked[i] = numbers.get(i);
        }
        System.out.printf("로또1등번호:%s",Arrays.toString(picked));
    }
}
