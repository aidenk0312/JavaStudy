package study_6;

/**
 * 인덱스가 0부터 시작하는 정수 배열 nums와 양수 diff가 주어졌을 때,
 * 조건에 맞는 산술 삼중 배열(arithmetic triplet)의 개수를 반환하는
 * 함수 arithmeticTriplets()를 작성
 * 이를 구현하기 위해 먼저 배열을 순회하면서 두 요소의 차이가 diff인 쌍을 찾은 다음, 해당 쌍과 연속하는 산술 삼중 배열이 있는지 확인
 */

public class study113 {
    public static class Solution {
        public int arithmeticTriplets(int[] nums, int diff) {
            int count = 0;

            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[j] - nums[i] == diff) {
                        for (int k = j + 1; k < nums.length; k++) {
                            if (nums[k] - nums[j] == diff) {
                                count++;
                            }
                        }
                    }
                }
            }

            return count;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 7, 9};
        int diff = 2;

        System.out.println(solution.arithmeticTriplets(nums, diff));
    }
}