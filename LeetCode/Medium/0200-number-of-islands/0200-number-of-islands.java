class Solution {
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public int numIslands(char[][] grid) {
        int answer = 0;
        visited = new boolean[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    answer++;
                    dfs(j, i, grid);
                }
            }
        }
        return answer;
    }

    public static void dfs(int x, int y, char[][] map){
        visited[y][x] = true;
        for(int i = 0; i < dx.length; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < 0 || ny < 0 || nx >= map[0].length || ny >= map.length || visited[ny][nx]) continue;
            if(map[ny][nx] == '1'){
                dfs(nx , ny, map);
            }
        }
    }

}