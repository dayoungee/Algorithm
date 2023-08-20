class Solution {
    public int solution(int[] num_list) {
        int a = 0;
        int b = 1;
        for(int n : num_list){
            a += n;
            b *= n;
        }
    
        if(a * a > b) return 1;
        else return 0;
    }
}