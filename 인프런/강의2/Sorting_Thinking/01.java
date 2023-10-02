import java.util.*;
class Solution {
    public int[] solution(int[] nums){
        List<Integer> list = new ArrayList<>();
        for(int n : nums) {
            list.add(n);
        }
        list.sort((o1, o2) -> {
            int cnt1 = Integer.bitCount(o1);
            int cnt2 = Integer.bitCount(o2);
            if(cnt1 == cnt2) {
                return o1 - o2;
            } else return cnt1 - cnt2;
        });
        return list.stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args){
        Solution T = new Solution();
        System.out.println(Arrays.toString(T.solution(new int[]{5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(T.solution(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(T.solution(new int[]{12, 5, 7, 23, 45, 21, 17})));
    }
}