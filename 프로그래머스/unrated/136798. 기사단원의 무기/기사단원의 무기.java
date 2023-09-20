class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int div = findDivisors(i);
            System.out.println(div);
            if(div > limit) answer += power;
            else answer += div;
        }
        return answer;
    }
    
    public int findDivisors(int number) {
        int cnt = 0;
        for(int i = 1; i <= Math.sqrt(number); i++) {
            if(i * i == number) cnt++;
            else if(number % i == 0) cnt += 2;
        }
        return cnt;
    }
}