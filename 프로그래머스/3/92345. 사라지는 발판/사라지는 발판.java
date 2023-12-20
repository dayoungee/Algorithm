class Solution {
    int[][] map;
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int solution(int[][] board, int[] aloc, int[] bloc) {
        map = board;
        return dfs(aloc[0], aloc[1], bloc[0], bloc[1]);
    }
    
    private int dfs(int x1, int y1, int x2, int y2) {
        if(map[x1][y1] == 0) return 0;
        int ret = 0;
        for(int[] dir : dirs) {
            int nx = x1 + dir[0];
            int ny = y1 + dir[1];
            if(nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length || map[nx][ny] == 0) continue;
            
            map[x1][y1] = 0;
            int temp = dfs(x2, y2, nx, ny) + 1;
            map[x1][y1] = 1;
            
            if(ret % 2 == 0 && temp % 2 == 1)
                ret = temp;
            else if(ret % 2 == 0 && temp % 2 == 0) 
                ret = ret > temp ? ret : temp;
            else if(ret % 2 == 1 && temp % 2 == 1)
                ret = ret < temp ? ret : temp;
            
        }
        return ret;
    }
}