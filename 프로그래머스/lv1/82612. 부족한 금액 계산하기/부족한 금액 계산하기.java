class Solution {
    public long solution(int price, int money, int count) {
        long temp = 0;
        for(int i = 1; i <= count; i++){
            temp += price * i;
        }
        if(temp - money <= 0) return 0;
        return temp - money;
    }
}