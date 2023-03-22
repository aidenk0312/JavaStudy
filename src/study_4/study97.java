package study_4;

public class study97 {
    static class Calculator {
        // 정수 덧셈 메소드
        public int add(int a, int b) {
            return a + b;
        }

        // 실수 덧셈 메소드
        public double add(double a, double b) {
            return a + b;
        }

        // 세 개의 정수 덧셈 메소드
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // 세 개의 실수 덧셈 메소드
        public double add(double a, double b, double c) {
            return a + b + c;
        }

        // 두 개의 정수 곱셈 메소드
        public int multiplication(int a, int b) {
            return a * b;
        }

        // 두 개의 정수 나눗셈 메소드
        public int division(int a, int b) {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int intResult1 = calculator.add(1, 2);
        double doubleResult1 = calculator.add(1.0, 2.0);
        int intResult2 = calculator.add(1, 2, 3);
        double doubleResult2 = calculator.add(1.0, 2.0, 3.0);
        int intResult3 = calculator.multiplication(2, 2);
        int intResult4 = calculator.division(4, 2);

        System.out.println("두 개 정수 덧셈: " + "1 + 2 = " + intResult1);
        System.out.println("두 개 실수 덧셈: " + "1.0 + 2.0 = " + doubleResult1);
        System.out.println("세 개 정수 덧셈: " + "1 + 2 + 3 = " + intResult2);
        System.out.println("세 개 실수 덧셈: " + "1.0 + 2.0 + 3.0 = " + doubleResult2);
        System.out.println("두 개 정수 곱셈: " + "2 * 2 = " + intResult3);
        System.out.println("두 개 정수 나눗셈: " + "4 / 2 = " + intResult4);
    }
}

