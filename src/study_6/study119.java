package study_6;

public class study119 {
    public String solution(int n, int x, int y) {
        StringBuilder answer = new StringBuilder("0");

        while (answer.length() < (1 << n)) { // 2^n
            StringBuilder change = new StringBuilder();
            for (int i = 0; i < answer.length(); i++) {
                change.append(answer.charAt(i) == '1' ? '0' : '1');
            }
            answer.append(change);
        }
        return answer.toString().substring(x - 1, y);
    }

    public static void main(String[] args) {
        study119 solution = new study119();

        int n1 = 4, x1 = 3, y1 = 7;
        String result1 = solution.solution(n1, x1, y1);
        System.out.println(result1); // "10100"

        int n2 = 5, x2 = 1, y2 = 16;
        String result2 = solution.solution(n2, x2, y2);
        System.out.println(result2); // "0110100110010110"
    }
}
