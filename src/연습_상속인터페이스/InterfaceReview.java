package 연습_상속인터페이스;

import java.util.ArrayList;

public class InterfaceReview {
    public static void main(String[] args) {
        Sounding dog = new Dog();
        Sounding baby = new Baby();
        Sounding tiger= new Tiger();
        Sounding robot = new Robot();

        ArrayList<Sounding>list = new ArrayList<Sounding>();
        list.add(dog);
        list.add(baby);
        list.add(tiger);
        list.add(robot);

        //소리내기
        for (int i = 0; i < list.size(); i++) {
            list.get(i).sound();
        }
    }
}
interface Sounding{
    void sound();//소리내기 추상메서드
}
class Dog implements Sounding{
    public void sound(){
        System.out.println("Doge:가즈아!");
    }
}
class Baby implements Sounding{
    public void sound(){
        System.out.println("Baby:응애!");
    }
}
class Tiger implements Sounding{
    public void sound(){
        System.out.println("Doge:가즈아!");
    }
}
class Robot implements Sounding{
    public void sound(){
        System.out.println("BabyDoge:응애!");
    }
}
