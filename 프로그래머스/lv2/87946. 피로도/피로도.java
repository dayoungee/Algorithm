import java.util.*;

class Solution {
    static boolean[] visited;
    static int max = 0;

    void dfs(int k, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {
            int a = dungeons[i][0];
            int b = dungeons[i][1];

            if (visited[i] || k < a) {
                continue;
            }
            visited[i] = true;
            dfs(k - b, dungeons, cnt + 1);
            // 다른 케이스를 위해 방문 취소
            visited[i] = false;
        }
        max = Math.max(max, cnt);
    }

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return max;
    }
}