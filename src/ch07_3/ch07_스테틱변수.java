package ch07_3;

class Counter{
    //스테택 변수는 공유됨
    static int count = 0;

     Counter(){
         count++; //카운트값 1증가
         System.out.println(count);
     }
     public static int getCount(){
         return count;
     }
}

public class ch07_스테틱변수 {
    public static void main(String[] args) {
        Counter.count =10;
        System.out.println(Counter.getCount());
        double pi = Math.PI;
    Counter c1 = new Counter();
    Counter c2 = new Counter();
    Counter c3 = new Counter();
    }
}
