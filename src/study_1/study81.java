package study_1;
// 숫자로 구성된 배열을 매개변수로 받아서 누적 합계를 반환하는 cumsum 함수(메소드)를 작성하라.
// 즉, 새로운 배열에서 i번째 원소는 원본 리스트에서 i+1 원소까지의 합계가 된다. 이 함수(메소드)는 다음과 같이 동작해야 한다.
// ( 배열 대신 dynamic array사용 가능 )

import java.util.Arrays;

public class study81 {
    public static void main(String[] args) {
        int[] t = {1, 2, 3};
        int[] cumsum = cumsum(t);
        System.out.println(Arrays.toString(cumsum));
    }

    public static int[] cumsum(int[] arr) {
        int[] cumsum = new int[arr.length];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            cumsum[i] = sum;
        }
        return cumsum;
    }
}
