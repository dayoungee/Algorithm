class Solution {
    public long solution(int[] sequence) {
        long answer = Integer.MIN_VALUE;
        long[] dp = new long[sequence.length + 1];
        long max = 0, min = 0;
        for(int i = 0; i < sequence.length; i++) {
            if(i % 2 == 1) sequence[i] *= -1;
            dp[i+1] = dp[i] + sequence[i];
            max = Math.max(dp[i+1], max);
            min = Math.min(dp[i+1], min);
        }
        
        return max - min;
    }
}