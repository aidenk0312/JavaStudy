package study_8;

import java.util.*;

public class Solution_list {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deployCounts = new ArrayList<>();

        int deployCount = 0;
        int prevDeployDay = 0;

        for (int i = 0; i < progresses.length; i++) {
            int remainProgress = 100 - progresses[i]; // 남은 진도
            int deployDay = (int) Math.ceil(remainProgress / (double) speeds[i]); // 작업 배포 날

            if (i == 0 || deployDay > prevDeployDay) { // 변화 시점 확인
                prevDeployDay = deployDay;
                deployCounts.add(deployCount);
                deployCount = 1;
            } else {
                deployCount++;
            }
        }
        deployCounts.add(deployCount);

        int[] answer = new int[deployCounts.size() - 1];
        for (int i = 0; i < deployCounts.size() - 1; i++) {
            answer[i] = deployCounts.get(i + 1);
        }
        return answer;
    }
}
