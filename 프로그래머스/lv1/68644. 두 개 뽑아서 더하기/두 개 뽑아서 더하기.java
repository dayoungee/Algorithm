import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        int cnt = 0;
        while(iter.hasNext()) {
            answer[cnt++] = iter.next();
        }

        Arrays.sort(answer);
        return answer;
    }
}