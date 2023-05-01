package study_6;

/**
 * 각 정수 i (0 <= i <= n)에 대해 이진 표현에서 1의 개수를 계산하여 길이가 n + 1인 배열에
 * 저장해 반환하는 함수 countBits()를 작성
 * 이를 구현하기 위해 비트 연산을 사용하여 각 숫자의 이진 표현에서 1의 개수를 세어야함
 *
 */
public class study111 {
    public static class Solution {
        public int[] countBits(int n) {
            int[] result = new int[n + 1];

            for (int i = 0; i <= n; i++) {
                result[i] = countOnes(i);
            }

            return result;
        }

        private int countOnes(int num) {
            int count = 0;

            while (num != 0) {
                count += num & 1; // 비트 연산을 사용하여 마지막 비트가 1인지 확인
                num >>= 1; // 오른쪽으로 비트 이동 (num을 2로 나눈 것과 같음)
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result = solution.countBits(5);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}