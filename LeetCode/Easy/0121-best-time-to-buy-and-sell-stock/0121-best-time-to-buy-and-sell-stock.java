class Solution {
    public int maxProfit(int[] prices) {
        int minPrices = Integer.MAX_VALUE, answer = 0;
        for(int p : prices){
            minPrices = Math.min(minPrices, p);
            answer = Math.max(answer, p - minPrices);
        }
        return answer;
    }
}