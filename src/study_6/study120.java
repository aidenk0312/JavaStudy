package study_6;

import java.util.ArrayList;
import java.util.List;

class User {
    String nickname;
    int score;

    User(String nickname, int score) {
        this.nickname = nickname;
        this.score = score;
    }
}

public class study120 {
    public int solution(int K, String[] user_scores) {
        int answer = 0;
        List<User> ranking = new ArrayList<>();

        for (String user_score : user_scores) {
            String[] split = user_score.split(" ");
            String nickname = split[0];
            int score = Integer.parseInt(split[1]);
            boolean updated = false;

            for (int i = 0; i < ranking.size(); i++) {
                User user = ranking.get(i);
                if (user.nickname.equals(nickname)) {
                    if (user.score < score) {
                        ranking.remove(i);
                        updated = true;
                        break;
                    } else {
                        updated = false;
                        break;
                    }
                }
            }
            if (updated || ranking.stream().noneMatch(user -> user.nickname.equals(nickname))) {
                User newUSer = new User(nickname, score);
                int pos = ranking.size();
                for (int i = 0; i < ranking.size(); i++) {
                    if (ranking.get(i).score < score) {
                        pos = i;
                        break;
                    }
                }
                ranking.add(pos, newUSer);
                if (pos < K) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        study120 s = new study120();

        int K1 = 3;
        String[] user_scores1 = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
        int result1 = s.solution(K1, user_scores1);
        System.out.println("1: " + result1); // 4

        int K2 = 3;
        String[] user_scores2 = {"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"};
        int result2 = s.solution(K2, user_scores2);
        System.out.println("2: " + result2); // 3

        int K3 = 2;
        String[] user_scores3 = {"cheries2 200", "alex111 100", "coco 150", "lpuyo 120"};
        int result3 = s.solution(K3, user_scores3);
        System.out.println("3: " + result3); // 3
    }
}