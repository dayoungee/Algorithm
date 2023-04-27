class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[k];
        for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2)->
            map.get(o2) - map.get(o1)
        );

        for(int i = 0; i < k; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}