package ch07.house;

public class HousePark {
    /*protected는 같은 패키지+상속+이클래스를 상속받은 클래스*/
    protected String lastname="park";
    public static void main(String[] args) {
        //같은 패키지의 클래스는 IMPORT 안함(자동임)
        //같은 패키지 안에는 동일한 이름의 클래스가 있을수 없음
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
    }
}
