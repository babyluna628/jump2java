package 연습_메소드;

public class Gasoline {
    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double efficiency = calcEfficiency(gasoline,distance);
        System.out.printf("연비:%.2f km/L", efficiency);
    }
    public static double calcEfficiency(double gasoline,double distance){
        return distance / gasoline;
    }
}
