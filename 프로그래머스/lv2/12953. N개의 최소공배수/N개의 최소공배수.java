class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i ++){
            answer = answer * arr[i] / gcd(answer, arr[i]);
        }
        return answer;
    }
    
    private int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    private int gcd(int a, int b) {
        int bigger = Math.max(a, b);
        int smaller = Math.min(a, b);

        return smaller == 0 ? bigger : gcd(smaller, bigger % smaller);
    }
}