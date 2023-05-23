class Solution {
     public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutation(result, nums, new boolean[nums.length], 0, nums.length, new Integer[nums.length]);
        return result;
    }

    public void permutation(List<List<Integer>> result, int[] nums, boolean[] visited, int depth, int r, Integer[] make) {
        if (depth == r) {
            result.add(Arrays.asList(make.clone()));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                make[depth] = nums[i];
                permutation(result, nums, visited, depth + 1, r, make);
                visited[i] = false;
            }
        }
    }
}