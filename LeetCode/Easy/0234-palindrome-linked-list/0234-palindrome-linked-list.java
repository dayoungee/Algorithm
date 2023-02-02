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
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();
        ListNode tempNode = head;
        while(tempNode != null){
            deque.add(tempNode.val);
            tempNode = tempNode.next;
        }
        while(deque.size()>1){
            if(deque.pollFirst() != deque.pollLast()) return false;
        }
        return true;
    }
}