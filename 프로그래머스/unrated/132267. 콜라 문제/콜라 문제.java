class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            answer += (n / a) * b;
            int bottle = n % a;
            n = (n / a) * b + bottle;
        }
        
        return answer;
    }
}