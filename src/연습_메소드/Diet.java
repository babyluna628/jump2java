package 연습_메소드;

public class Diet {
    public static void main(String[] args) {
        double w = 57;
        double t = 1.67;

        double bmi = calculate(w,t);

        System.out.printf("BMI: %.2f(%.1fkg,%.2fm\n",bmi,w,t);
        System.out.printf("결과:%s입니다.\n",result(bmi));
        }
        public static double calculate(double weight, double tall) {
        return weight/(tall*tall);
        }
        public static String result(double bmi) {
        if (bmi < 18.5) {
            return "저체중";
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            return "정상";
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            return "과체중";
        }
        else {
            return "비만";
        }
        }
    }

