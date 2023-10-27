class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        if(n > s) return new int[]{-1};
        int idx = 0;

        while(n > 0) {
            int num = s/n;
            s -= num;
            answer[idx++] = num;
            n--;
        }
        return answer;
    }
}