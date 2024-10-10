package 연습_상속인터페이스;

public class WizardTest {
    public static void main(String[] args) {
        GreatWizard gandalf = new GreatWizard("간달프",100,100,100);
        System.out.println(gandalf.toString());
        gandalf.energeVolt();
    }
}
class Novice{
    protected String name;
    protected int hp;

    public Novice(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String toString() {
        return String.format("[Novice]%s(HP:%d",this.name,this.hp);
    }
}
class Wizard extends Novice{
    protected int mp;
    public Wizard(String name,int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
    public void energeVolt() {
        System.out.printf("%s의 에너지볼트!\n",this.name);
    }
}
class GreatWizard extends Wizard{
    /*보호막속성필드추가*/
    /*생성자완성*/
    int shield;
    public GreatWizard(String name, int hp, int mp, int shield) {

        super(name, hp, mp);
        this.shield = shield;
    }
    /*tostring()메소드를 오버라이딩*/
    public String toString() {
        return String.format("[대마법사]간달프(HP:%d,MP:%d,SHIELD:%d)",hp,mp,shield);
    }
    /*에너지볼트를 오버라이딩*/
    public void energeVolt() {
        System.out.printf("간달프의 에너지볼트!(대마법사 버프로 데미지 +추가)\n",name);
    }
}

