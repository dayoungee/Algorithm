class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int b = 0;
        for(int n : num_list){
            if(n % 2 == 1) sb1.append(n);
            else sb2.append(n);
        }
        return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
    }
}