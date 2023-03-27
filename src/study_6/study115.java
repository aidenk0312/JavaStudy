package study_6;

import java.util.*;

/**
 * 연속적인 숫자를 제거한 후 남은 숫자들을 반환
 */

public class study115 {
    public static class Solution {
        public int[] solution(int[] arr) {
            ArrayList<Integer> resultList = new ArrayList<>();
            int previous = -1;

            for (int num : arr) {
                if (num != previous) {
                    resultList.add(num);
                    previous = num;
                }
            }

            int[] answer = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                answer[i] = resultList.get(i);
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        int[] result1 = solution.solution(arr1);
        int[] result2 = solution.solution(arr2);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }
}