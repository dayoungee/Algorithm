class Solution {
    public int arrayPairSum(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        int i = (nums.length % 2 == 0) ? 0 : 1;
        for(;i < nums.length; i=i+2){
            answer += nums[i];
        }
        return answer;
    }
}