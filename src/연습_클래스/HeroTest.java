package 연습_클래스;

public class HeroTest {
    public static void main(String[] args) {
        Hero luna = new Hero("루나");
        Hero hyunjoo= new Hero("현주");

        Hero.battle(luna,hyunjoo);
    }
}
class Hero{
    String name;
    int hp;
    public Hero(String name){
        this.name = name;
        this.hp = 30;
    }
    void punch(Hero enemy){
        int random = (int) (Math.random()*10)+1;
        enemy.hp -= random;
    }
    public static void battle(Hero a, Hero b){
        boolean firstAttack = true;//퍼스트어택이 참이면 a가펀치날림
        while (a.hp>0 && b.hp>0){
            if(firstAttack){
                a.punch(b);
                System.out.printf("[%s]의 펀치%n",a.name);
                System.out.printf("%s:%d/30%n",b.name,b.hp);
            }
            else{
                b.punch(a);
                System.out.printf("[%s]의 펀치%n",b.name);
                System.out.printf("%s:%d/30%n",a.name,a.hp);
            }
            firstAttack = !firstAttack;
        }
    }

}
