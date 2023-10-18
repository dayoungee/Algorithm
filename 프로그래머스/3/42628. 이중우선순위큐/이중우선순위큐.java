import java.util.*;


class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(String s : operations) {
            String[] arr = s.split(" ");
            if(arr[0].equals("I")) {
                minQueue.add(Integer.parseInt(arr[1]));
                maxQueue.add(Integer.parseInt(arr[1]));
            } else if(!minQueue.isEmpty() && !maxQueue.isEmpty()) {
                int num = Integer.parseInt(arr[1]);
                if(num < 0) {
                    int minNum = minQueue.remove();
                    maxQueue.remove(minNum);
                }
                else {
                    int maxNum = maxQueue.remove();
                    minQueue.remove(maxNum);
                }
            }
        }
        int minNum = 0, maxNum = 0;
        if(!maxQueue.isEmpty()) maxNum = maxQueue.poll();
        if(!minQueue.isEmpty()) minNum = minQueue.poll();

        return new int[] {maxNum, minNum};
    }
}