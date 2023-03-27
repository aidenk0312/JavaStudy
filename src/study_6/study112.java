package study_6;

/**
 *  각 블록에 건물이 있고 각 건물의 높이를 나타내는 n x n 행렬이 주어졌을 때,
 *  건물의 높이를 증가시키면서 동시에 4방향 스카이라인을 변경하지 않는 최대 총 합을 찾는
 *  함수 maxIncreaseKeepingSkyline()를 작성.
 *  이를 구현하기 위해 각 행과 열에서 가장 높은 건물을 찾은 다음, 해당 건물의 높이를 높일 수 있는 최대 금액을 계산
 */

public class study112 {
    public static class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {
            int n = grid.length;
            int[] rowMax = new int[n];
            int[] colMax = new int[n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                    colMax[j] = Math.max(colMax[j], grid[i][j]);
                }
            }

            int totalIncrease = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    totalIncrease += Math.min(rowMax[i], colMax[j]) - grid[i][j];
                }
            }

            return totalIncrease;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
                {3, 0, 8, 4},
                {2, 4, 5, 7},
                {9, 2, 6, 3},
                {0, 3, 1, 0}
        };

        System.out.println(solution.maxIncreaseKeepingSkyline(grid));
    }
}
