import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int start = Integer.MIN_VALUE;
        Arrays.sort(routes, (int[] arr1, int[] arr2) -> {
           return arr1[1] - arr2[1]; 
        });
        
        for(int[] arr : routes) {
            if(start < arr[0]) {
                start = arr[1];
                answer++;
            }
        }
        
        return answer;
    }
}