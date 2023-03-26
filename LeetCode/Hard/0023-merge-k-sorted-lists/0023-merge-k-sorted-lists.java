/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(ListNode node : lists) {
            while (node != null) {
                q.add(node.val);
                node = node.next;
            }
        }
        ListNode answer = null;
        ListNode temp = null;
        while(!q.isEmpty()){
            if(answer == null){
                temp = new ListNode(q.poll());
                answer = temp;
            }
            else{
                temp.next = new ListNode(q.poll());
                temp = temp.next;
            }
        }

        return answer;
    }
}