class Solution {
    int answer = 0;
    public int solution(int[] nums) {
        combination(nums, 0, new boolean[nums.length], 0, new int[3]);
        return answer;
    }
    
    public boolean isPrime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    
    public void combination(int[] nums, int start, boolean visited[], int depth, int[] arr) {
        if(depth == 3){
            int sum = 0;
            for(int n : arr){
                sum += n;
            }
            if(isPrime(sum)){
                answer++;
            }
            return;
        }
        for(int i = start; i < nums.length; i++) {
            if(!visited[i]) {
                arr[depth] = nums[i];
                visited[i] = true;
                combination(nums, i + 1, visited, depth + 1, arr);
                visited[i] = false;
            }
        }
        
    }
}