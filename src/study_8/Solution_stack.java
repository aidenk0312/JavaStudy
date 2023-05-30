package study_8;

import java.util.*;

class Solution_stack {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution_stack solution = new Solution_stack();

        String s1 = "()()";
        boolean result1 = solution.solution(s1);
        System.out.println(result1); // t

        String s2 = "(())()";
        boolean result2 = solution.solution(s2);
        System.out.println(result2); // t

        String s3 = ")()(";
        boolean result3 = solution.solution(s3);
        System.out.println(result3); // f

        String s4 = "(()(";
        boolean result4 = solution.solution(s4);
        System.out.println(result4); // f
    }
}