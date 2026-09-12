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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int listLength=0;
        ListNode dummy=new ListNode(0,head);
        ListNode currentNode=head;
        while (currentNode!=null){
            currentNode=currentNode.next;
            listLength++;
        }
        int nodeIndex=listLength-n;
        int i=0;
        currentNode=head;
        ListNode prev=dummy;
        while(currentNode!=null){
            if(i==nodeIndex){
                prev.next=currentNode.next;
                return dummy.next;
            }
            i++;
            ListNode temp=currentNode.next;
            prev=currentNode;
            currentNode=temp;
        }
        return dummy.next;
    }
}
