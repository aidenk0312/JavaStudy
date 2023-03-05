// 중첩 배열을 매개변수로 넘겨받아 모든 원소를 더하는 nested_sum 함수를 작성하라.
// 이 함수는 다음과 같이 동작해야 한다. 배열 대신 dynamic array사용가능

public class study80 {
    public static void main(String[] args) {
        int[][] t = {{1, 2}, {3}, {4, 5, 6}};
        int sum = nested_sum(t);
        System.out.println(sum);
    }

    public static int nested_sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
