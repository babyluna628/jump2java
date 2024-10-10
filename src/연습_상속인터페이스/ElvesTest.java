package 연습_상속인터페이스;

public class ElvesTest {
    public static void main(String[] args) {
        Elf elf = new Elf("루나",100);
        HighElf high = new HighElf("현주",300,100);
        ElfLord lord = new ElfLord("루나",50000,10000,3000);

        Elf[]elves = {elf,high,lord};
        for (int i = 0; i < elves.length; i++) {
            System.out.println(elves[i].toString());
        }
        //forEach 배열에 있는걸 한번씩 다 반복  단축어 iter
        for (Elf e : elves) {
            System.out.println(e.toString());
        }
    }
}
class Elf{
    String name;
    int hp;
    public Elf(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public String toString() {
        return String.format("[쫄병]Name:%s,HP:%d", name, hp);
    }
}
class HighElf extends Elf{
    int mp;
    public HighElf(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
    }
    public String toString() {
        return  String.format("[쫄병2]Name:%s,HP:%d,MP:%d", name,hp, mp);
    }
}
class ElfLord extends HighElf{
    int shield;
    public ElfLord(String name, int hp,int mp, int shield) {
        super(name,hp,mp);
        this.shield = shield;
    }
    public String toString() {
        return String.format("[대장]Name:%s,HP:%d,MP:%d,Shield:%d", name, hp,mp, shield);
    }
}