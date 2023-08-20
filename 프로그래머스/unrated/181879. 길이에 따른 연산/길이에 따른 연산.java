class Solution {
    public int solution(int[] num_list) {
        boolean flag = false;
        int temp = 1;
        if(num_list.length > 10){
            temp = 0;
            flag = true;
        }
        for(int n : num_list){
            if(flag) temp += n;
            else temp *= n;
        }
        return temp;
    }
}