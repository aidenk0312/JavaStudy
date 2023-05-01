package study_6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class study118 {
    public int[] solution(int[] card) {
        int[] answer = new int[2];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < card.length; i++) {
            if(set.contains(card[i])) {
                set.remove(card[i]);
            } else {
                set.add(card[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        answer[0] = it.next();
        answer[1] = it.next();

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        study118 study = new study118();

        int[] card1 = {1, 3, 2, 5, 3, 1};
        int[] result1 = study.solution(card1);
        System.out.println(Arrays.toString(result1)); // [2, 5]

        int[] card2 = {1, 2, 3, 4, 4, 3, 2, 5};
        int[] result2 = study.solution(card2);
        System.out.println(Arrays.toString(result2)); // [1, 5]
    }
}