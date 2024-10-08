package 연습_클래스;

class Point{
    int x;
    int y;
    Point(int _x, int _y){
        x = _x;
        y = _y;
    }
    String toStr(){
        return String.format("(%d,%d)", x, y);
    }
    static double distance(Point p,Point q){
        double dx = p.x - q.x;
        double dy = p.y - q.y;
        return Math.sqrt((dx*dx) + (dy*dy));
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);
        double distance = p1.distance(p1,p2);
        System.out.printf("두 점 A%s,B%s사이의 거리: %.2f", p1.toStr(), p2.toStr(), distance);

    }
}
