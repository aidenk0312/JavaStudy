package study_5;

class CalculatorEx {
    private int addCnt; // 덧셈
    private int subtractionCnt; // 뺄셈
    private int multiplicationCnt; // 곱셈
    private int divisionCnt; // 나눗셈

    public int add(int a, int b) {
        addCnt++;
        return a + b;
    }

    public int subtraction(int a, int b) {
        subtractionCnt++;
        return a - b;
    }

    public int multiplication(int a, int b) {
        multiplicationCnt++;
        return a * b;
    }

    public int division(int a, int b) {
        divisionCnt++;
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public void printCount() {
        System.out.println("덧셈: " + addCnt + "회");
        System.out.println("뺄셈: " + subtractionCnt + "회");
        System.out.println("곱셈: " + multiplicationCnt + "회");
        System.out.println("나눗셈: " + divisionCnt + "회");
    }
}

public class study104 {
    public static void main(String[] args) {
        CalculatorEx calculatorEx = new CalculatorEx();

        calculatorEx.add(5, 3);
        calculatorEx.add(5, 3);
        calculatorEx.subtraction(5, 3);
        calculatorEx.multiplication(5, 3);
        calculatorEx.division(0, 0);

        calculatorEx.printCount();
    }
}
