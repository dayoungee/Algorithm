class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        // 왼쪽 곱셈
        for(int i = 1; i < nums.length; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        // 오른족 곱셈
        int n = 1;
        for(int i = nums.length -1; i>=0; i--){
            answer[i] *= n;
            n *= nums[i];
        }
        return answer;
    }
}