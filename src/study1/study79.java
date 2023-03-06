package study1;
// 카페인 권고량 함수
// 나이, 몸무게를 매개변수로 받는다.
// 나이가 14세 미만이면,
// 1일 카페인 최대 섭취량 : 0mg
// 나이가 14세 이상, 20세 미만이면,
// 1일 카페인 최대 섭취량 : 몸무게 × 2.5mg
// 나이가 20세 이상이면,
// 1일 카페인 최대 섭취량 : 400mg
// 출력 : “식약처에서 권고하는 당신의 1일 카페인 최대 섭취량은 000.00 mg 입니다.”

public class study79 {
    public static void main(String[] args) {
        caffeine(27, 80);
    }

    public static int caffeine(int age, int weight) {
        double maxCaffeine = 0.0;
        if (age < 14) {
            maxCaffeine = 0.0;
        } else if (age > 14 && age < 20) {
            maxCaffeine = weight * 2.5;
        } else {
            maxCaffeine = 400;
        }
        System.out.printf("식약처에서 권고하는 당신의 1일 카페인 최대 섭취량은 %.2f mg 입니다.\n", maxCaffeine);
        return 0;
    }
}
