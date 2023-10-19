class Solution {
    static private int[] unf;
    public int solution(int n, int[][] computers) {
        unf = new int[n];
        for(int i = 0; i < n; i++) unf[i] = i;
        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < computers.length - 1; j++) {
                if(computers[i][j] == 1 && i != j) {
                    union(i, j);
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < n; i++) {
            if(unf[i] == i) answer++;
        }
        
        
        return answer;
    }
    
    public static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if(fa != fb) unf[fa] = fb;
    }
    
    public static int find(int v) {
        if(v == unf[v]) return v;
        else return unf[v] = find(unf[v]);
    }
}