class Solution {
    public long solution(int[] sequence) {
        long[] dp1 = new long[sequence.length];
        long[] dp2 = new long[sequence.length];
        dp1[0] = sequence[0];
        dp2[0] = sequence[0] * -1;
        long answer = Math.max(dp1[0], dp2[0]);
        for(int i = 1; i < sequence.length; i++) {
            if(i % 2 == 0) {
                dp1[i] = Math.max(dp1[i-1] + sequence[i], sequence[i]);
                dp2[i] = Math.max(dp2[i-1] + sequence[i] * -1, sequence[i] * -1);
            } else {
                dp1[i] = Math.max(dp1[i-1] + sequence[i] * -1, sequence[i] * -1);
                dp2[i] = Math.max(dp2[i-1] + sequence[i], sequence[i]);
            } 
            answer = Math.max(answer, Math.max(dp1[i], dp2[i]));
        }
        
        return answer;
    }
}