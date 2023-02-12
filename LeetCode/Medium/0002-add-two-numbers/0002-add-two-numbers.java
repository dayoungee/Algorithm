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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = null;
        int temp = 0;
        while(l1 != null || l2 != null || temp > 0){
            int value1 = l1 != null ? l1.val : 0;
            int value2 = l2 != null ? l2.val : 0;
            int val = value1 + value2 + temp;
            temp = val/10;
            ListNode node = new ListNode(val%10);
            if(answer == null) answer = node;
            else{
                ListNode tempNode = answer;
                while(tempNode.next != null){
                    tempNode = tempNode.next;
                }
                tempNode.next = node;
            }
            if(l1 != null && l1.next != null) l1 = l1.next;
            else l1 = null;
            if(l2 != null && l2.next != null) l2 = l2.next;
            else l2 = null;
        }

        return answer;
    }
    
}