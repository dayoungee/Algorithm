class Solution {
    public int solution(int num) {
        if(num == 1) return 0;
        int cnt = 0;
        long num1 = num;
        while(cnt < 500){
            if(num1 % 2 == 0) num1 /= 2;
            else num1 = num1 * 3 + 1;
            cnt++;
            if(num1 == 1) return cnt;
        }
        return -1;
    }
}