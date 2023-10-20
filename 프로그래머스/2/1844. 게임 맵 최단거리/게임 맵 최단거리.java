import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[][] visited = new int[maps.length][maps[0].length];
        bfs(maps, visited);
        int answer = visited[maps.length - 1][maps[0].length - 1];
        return answer == 0 ? -1 : answer;
    }
    
    public void bfs(int[][] maps, int[][] visited) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, 0));
        visited[0][0] = 1;
        
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        while(!q.isEmpty()) {
            Pair pair = q.poll();
            for(int i = 0; i < 4; i++) {
                int nX = pair.x + dx[i];
                int nY = pair.y + dy[i];
                
                if(nX >= maps.length || nY >= maps[0].length || nX < 0 || nY < 0 || maps[nX][nY] == 0) continue;
                
                if(visited[nX][nY] == 0) {
                    visited[nX][nY] = visited[pair.x][pair.y] + 1;
                    q.add(new Pair(nX, nY));
                }
            }
        }
        
    }
}

class Pair {
    int x;
    int y;
    
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}