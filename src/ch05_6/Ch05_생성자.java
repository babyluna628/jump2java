package ch05_6;

class Animal{
    Animal(){
        System.out.println("동물 객체 생성!");
    }
    String name;
    void setName(String name){
        this.name = name;
    }
    }
    class Dog extends Animal{
    Dog(){
        System.out.println("도그 객체 생성!");
    }
    void sleep(){
        System.out.println(this.name +"zzz");
    }
}

public class Ch05_생성자 {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
