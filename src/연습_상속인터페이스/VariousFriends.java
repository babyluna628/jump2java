package 연습_상속인터페이스;

public class VariousFriends {
    public static void main(String[] args) {
      /*  Artist kim = new Artist("뮤지션 김씨");
        Architect lee = new Architect("건축가 이씨");
        Developer park = new Developer("개발자 박씨");
        Lawyer choi = new Lawyer("변호사 최씨");

        Friend[]friends = {kim,lee,park,choi};
        for(Friend f : friends){
            f.dearFriend();
        }*/
    }
}
interface Friend{
    abstract void dearFriend();
}
