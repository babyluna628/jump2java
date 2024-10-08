package 연습_클래스;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();

        c.r =4.0;
        c.h =5.0;
        double pi = Math.PI;

        System.out.printf("원기둥의 부피:%.2f\n",c.getVolume());
        System.out.printf("원기둥의 겉넓이:%.2f\n",c.getArea());
    }
}
class Cylinder {
    double r;
    double h;

    double getVolume() {
        return Math.PI*r*r*h;
    }
    double getArea() {
        return 2*Math.PI*r*(r+h);
    }
}
