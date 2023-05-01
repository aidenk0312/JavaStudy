package study_6;

// 직사각형 넓이: 가로 길이 * 세로 길이

import java.util.Arrays;

public class study117 {
    class Solution {
        public int solution(int chicken) {
            int answer = chicken;
            int couponsChicken = 0;

            while (chicken >= 10) {
                couponsChicken = chicken / 10;
                answer += couponsChicken;
                chicken = chicken % 10 + couponsChicken;
            }
        return  answer;
        }
    }
}