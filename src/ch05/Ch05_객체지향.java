package ch05;

/** 슬래시별별은 설명서같은 주석
 *별도의 계산기 클래스
 */
class calculator{
    int result = 0; //변수

    //클래스 안의 함수를 메소드라 함

    /**
     * 정수를 입력해 더해준 결과값을 리턴
     * @param num 입력 정수
     * @return result 결과
     */
    int add(int num){
    result +=num;
    return result;
    }
}
 class Animal{
    String name; //객체변수
 }

public class Ch05_객체지향 {
    public static void main(String[] args) {
        calculator cal1 = new calculator(); //계산기1 객체 생성.
        calculator cal2 = new calculator(); //계산기2 객체

        System.out.println(cal1.add(3)); //3
        System.out.println(cal1.add(4)); //7

        System.out.println(cal2.add(3)); //3
        System.out.println(cal2.add(7)); //10

        //클래스로 객체(Object)를 만든다.
        //클래스로 만든 객체를 인스턴스(instance)라고한다.
        Animal cat = new Animal(); //객체1 같은 클래스지만 다른객체
        Animal dog = new Animal(); //객체2
        Animal pig = new Animal(); //객체3


        System.out.println(cat.name);
        System.out.println(pig.name);

    }
}
