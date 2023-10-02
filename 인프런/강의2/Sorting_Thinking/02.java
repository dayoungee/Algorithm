import java.util.*;
class Solution {
    public int[] solution(int[] nums){
        int[] answer = new int[nums.length / 2];
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int n : nums) {
            set.add(n*2);
        }
        int idx = 0;
        for(int n : nums) {
            if(set.contains(n)) continue;
            answer[idx++] = n;
        }
        return answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new int[]{1, 10, 2, 3, 5, 6})));
        System.out.println(Arrays.toString(T.solution(new int[]{1, 1, 6, 2, 2, 7, 3, 14})));
        System.out.println(Arrays.toString(T.solution(new int[]{14, 4, 2, 6, 3, 10, 10, 5, 5, 7, 7, 14})));
    }
}