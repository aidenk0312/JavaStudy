package study_6;

// 직사각형 넓이: 가로 길이 * 세로 길이

import java.util.Arrays;

public class study116 {
    class Solution {
        public int solution(int[][] dots) {
           int[] x = new int[4];
           int[] y = new int[4];

            for (int i = 0; i < 4; i++) {
                x[i] = dots[i][0];
                y[i] = dots[i][1];
            }

            Arrays.sort(x);
            Arrays.sort(y);

            int width = x[3] - x[0];
            int height = y[3] - y[0];

            int answer = width * height;

            return answer;
        }
    }
}
